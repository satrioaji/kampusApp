/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WINDOWS 8
 */
@Entity
@Table(name = "organisasi")
@XmlRootElement
public class Organisasi implements Serializable{
    private static final Long serialVersionUID =1L; 
   
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)

    @Column (name ="id_organisasi")
    private Long id_organisasi;    
    @Column (name ="unitas")
    private String unitas;
    @Column (name ="nama_ketua")
    private String nama_ketua;    
    @Column (name ="fakultas")
    private String fakultas;
    @Column (name ="jumlah_anggota")
    private String jumlah_anggota;
    
    public Organisasi(){
    }
    
    public Organisasi(Long id_organisasi) {
        this.id_organisasi = id_organisasi;
    }

    public Long getId_organisasi() {
        return id_organisasi;
    }

    public void setId_organisasi(Long id_organisasi) {
        this.id_organisasi = id_organisasi;
    }

    public String getUnitas() {
        return unitas;
    }

    public void setUnitas(String unitas) {
        this.unitas = unitas;
    }

    public String getNama_ketua() {
        return nama_ketua;
    }

    public void setNama_ketua(String nama_ketua) {
        this.nama_ketua = nama_ketua;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJumlah_anggota() {
        return jumlah_anggota;
    }

    public void setJumlah_anggota(String jumlah_anggota) {
        this.jumlah_anggota = jumlah_anggota;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.id_organisasi ^ (this.id_organisasi >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Organisasi other = (Organisasi) obj;
        if (this.unitas != other.unitas) {
            return false;
        }
        return true;
        
        
    }
    
     @Override
    public String toString() {
        return "universitas.com.model.Organisasi[ unitas=" + unitas + " ]";
    }
}
