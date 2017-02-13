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
import universitas.com.model.Mahasiswa;

/**
 *
 * @author WINDOWS 8
 */
@Repository
public class MahasiswaDaoImpl implements IMahasiswa{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void Save(Mahasiswa mahasiswa) {
        sessionFactory.getCurrentSession().saveOrUpdate(mahasiswa);
    }

    @Override
    public void Update(Mahasiswa mahasiswa) {
        sessionFactory.getCurrentSession().update(mahasiswa);
    }

    @Override
    public void Delete(Mahasiswa mhs) {
        sessionFactory.getCurrentSession().delete(mhs);
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> list = null;
        try {
            list = sessionFactory.getCurrentSession()
                    .createSQLQuery("Select id,npm,nama,alamat,jurusan from mahasiswa")
                    .addEntity(Mahasiswa.class).list();
            
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
            return list;
    }

    @Override
    public Mahasiswa getSingleMahasiswa(Long id) {
      Mahasiswa mahasiswa = (Mahasiswa) sessionFactory.getCurrentSession()
              .load(Mahasiswa.class, id);
              return mahasiswa;
    }

    @Override
    public List<Mahasiswa> getSearch(String search) {
    Query query = sessionFactory.getCurrentSession().createQuery(" FROM "
            +Mahasiswa.class.getName()+" WHERE lower(nama) LIKE lower(:search)")
            .setParameter("search", "%"+search+"%");
    List<Mahasiswa> listSearch = query.list();
    return listSearch;
    }
    
   
    
    
}
