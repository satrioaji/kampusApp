/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.dao;

import java.util.List;
import universitas.com.model.Mahasiswa;

/**
 *
 * @author WINDOWS 8
 */
public interface IMahasiswa {
    
    public void Save (Mahasiswa mahasiswa);
    public void Update(Mahasiswa mahasiswa);
    public void Delete (Mahasiswa mhs);
    public List<Mahasiswa> getAllMahasiswa();
    public Mahasiswa getSingleMahasiswa(Long id);
    public  List<Mahasiswa> getSearch(String search);
    
}
