/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import universitas.com.model.Organisasi;

/**
 *
 * @author WINDOWS 8
 */
@Repository
public class OrganisasiDaoImpl implements IOrganisasi{

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public void Save(Organisasi organisasi) {
    sessionFactory.getCurrentSession().saveOrUpdate(organisasi);
    }

    @Override
    public void Update(Organisasi organisasi) {
    sessionFactory.getCurrentSession().update(organisasi);
    }

    @Override
    public void Delete(Organisasi organisasi) {
    sessionFactory.getCurrentSession().delete(organisasi);
    }

    @Override
    public List<Organisasi> getAllOrganisasi() {
    List<Organisasi> list = null;
        try {
            list = sessionFactory.getCurrentSession()
                    .createSQLQuery("Select id_organisasi,unitas,nama_ketua,fakultas,jumlah_anggota from organisasi")
                    .addEntity(Organisasi.class).list();
            
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
            return list;
    }

    @Override
    public Organisasi getSingleOrganisasi(Long id_organisasi) {
    Organisasi organisasi = (Organisasi) sessionFactory.getCurrentSession()
              .load(Organisasi.class, id_organisasi);
              return organisasi;
    }

    @Override
    public List<Organisasi> getSearch(String search) {
    Query query = sessionFactory.getCurrentSession().createQuery(" FROM "
            +Organisasi.class.getName()+" WHERE lower(nama_ketua) LIKE lower(:search)")
            .setParameter("search", "%"+search+"%");
    List<Organisasi> listSearch = query.list();
    return listSearch;
    }
    
    
}
