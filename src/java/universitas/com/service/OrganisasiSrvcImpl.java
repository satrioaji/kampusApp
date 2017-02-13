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
import universitas.com.dao.IOrganisasi;
import universitas.com.model.Organisasi;

/**
 *
 * @author WINDOWS 8
 */
@Service
@Transactional
public class OrganisasiSrvcImpl implements IOrganisasiSrvc{
    
    @Autowired
    IOrganisasi organisasiDAO;

    @Override
    public void Save(Organisasi organisasi) {
     organisasiDAO.Save(organisasi);
    }

    @Override
    public void Update(Organisasi organisasi) {
    organisasiDAO.Update(organisasi);
    }

    @Override
    public void Delete(Organisasi id_organisasi) {
    organisasiDAO.Delete(id_organisasi);
    }

    @Override
    public List<Organisasi> getAllOrganisasi() {
    return  organisasiDAO.getAllOrganisasi();
    }

    @Override
    public Organisasi getSingleOrganisasi(Long id_organisasi) {
    return organisasiDAO.getSingleOrganisasi(id_organisasi);
    }

    @Override
    public List<Organisasi> getSearch(String search) {
    return organisasiDAO.getSearch(search);
    }
    
}
