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
import universitas.com.dao.IDosen;
import universitas.com.model.Dosen;

/**
 *
 * @author WINDOWS 8
 */
@Service
@Transactional
public class DosenSrvcImpl implements IDosenSrvc{
    @Autowired
    IDosen dosenDAO;

    @Override
    public void Save(Dosen dosen) {
        dosenDAO.Save(dosen);
    }

    @Override
    public void Update(Dosen dosen) {
        dosenDAO.Update(dosen);
    }

    @Override
    public void Delete(Dosen id_dosen) {
        dosenDAO.Delete(id_dosen);
    }

    @Override
    public List<Dosen> getAllDosen() {
        return dosenDAO.getAllDosen();
    }

    @Override
    public Dosen getSingleDosen(Long id_dosen) {
        return dosenDAO.getSingleDosen(id_dosen);
    }

    @Override
    public List<Dosen> getSearch(String search) {
        return dosenDAO.getSearch(search);
    }
    
    
}
