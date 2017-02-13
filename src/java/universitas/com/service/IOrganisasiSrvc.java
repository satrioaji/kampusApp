/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.service;

import java.util.List;
import universitas.com.model.Organisasi;

/**
 *
 * @author WINDOWS 8
 */
public interface IOrganisasiSrvc {
    public void Save (Organisasi organisasi);
    public void Update(Organisasi organisasi);
    public void Delete (Organisasi organisasi);
    public List<Organisasi> getAllOrganisasi();
    public Organisasi getSingleOrganisasi(Long id_organisasi);
    public  List<Organisasi> getSearch(String search);
    
}
