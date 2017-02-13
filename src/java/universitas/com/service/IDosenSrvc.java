/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.service;

import java.util.List;
import universitas.com.model.Dosen;

/**
 *
 * @author WINDOWS 8
 */
public interface IDosenSrvc {
    public void Save (Dosen dosen);
    public void Update(Dosen dosen);
    public void Delete (Dosen dosen);
    public List<Dosen> getAllDosen();
    public Dosen getSingleDosen(Long id_dosen);
    public List<Dosen> getSearch(String search);
}
