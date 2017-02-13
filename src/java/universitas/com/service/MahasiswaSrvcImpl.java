/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import universitas.com.dao.IMahasiswa;
import universitas.com.dao.MahasiswaDaoImpl;
import universitas.com.model.Mahasiswa;

/**
 *
 * @author WINDOWS 8
 */
@Service
@Transactional
public class MahasiswaSrvcImpl implements IMahasiswaSrvc{

    @Autowired
    IMahasiswa mahasiswaDAO;
    
    @Override
    public void Save(Mahasiswa mahasiswa) {
     mahasiswaDAO.Save(mahasiswa);
    }

    @Override
    public void Update(Mahasiswa mahasiswa) {
    mahasiswaDAO.Update(mahasiswa);
    }

    @Override
    public void Delete(Mahasiswa id) {
    mahasiswaDAO.Delete(id);
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
    return  mahasiswaDAO.getAllMahasiswa();
    }

    @Override
    public Mahasiswa getSingleMahasiswa(Long id) {
    return mahasiswaDAO.getSingleMahasiswa(id);
    }

    @Override
    public List<Mahasiswa> getSearch(String search) {
    return mahasiswaDAO.getSearch(search);
    }
    
}
