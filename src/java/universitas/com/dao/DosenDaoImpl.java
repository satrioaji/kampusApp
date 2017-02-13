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
import universitas.com.model.Dosen;


/**
 *
 * @author WINDOWS 8
 */
@Repository
public class DosenDaoImpl implements IDosen {
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void Save(Dosen dosen) {
     sessionFactory.getCurrentSession().saveOrUpdate(dosen);
    }

    @Override
    public void Update(Dosen dosen) {
    sessionFactory.getCurrentSession().update(dosen);
    }

    @Override
    public void Delete(Dosen dosen) {
    sessionFactory.getCurrentSession().delete(dosen);
    }

    @Override
    public List<Dosen> getAllDosen() {
    List<Dosen> list = null;
        try {
            list = sessionFactory.getCurrentSession()
                    .createSQLQuery("Select id_dosen,nik_dosen,nama_dosen,matakuliah,sks from dosen")
                    .addEntity(Dosen.class).list();
            
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
            return list;
    }

    @Override
    public Dosen getSingleDosen(Long id_dosen) {
        Dosen dosen = (Dosen) sessionFactory.getCurrentSession()
              .load(Dosen.class, id_dosen);
              return dosen;
    }

    @Override
    public List<Dosen> getSearch(String search) {
        Query query = sessionFactory.getCurrentSession().createQuery(" FROM "
            +Dosen.class.getName()+" WHERE lower(nama_dosen) LIKE lower(:search)")
            .setParameter("search", "%"+search+"%");
    List<Dosen> listSearch = query.list();
    return listSearch;
    }
    
}
