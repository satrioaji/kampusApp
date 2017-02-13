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
@Table(name = "dosen")
public class Dosen implements Serializable{
    
  private static final Long serialVersionUID =1L; 
   
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  
  @Column (name ="id_dosen")
  private Long id_dosen;    
  @Column (name ="nik_dosen")
  private String nik_dosen;
  @Column (name ="nama_dosen")
  private String nama_dosen;    
  @Column (name ="matakuliah")
  private String matakuliah;
  @Column (name ="sks")
  private String sks;
  
  public Dosen (){
  }
  
  public Dosen (Long id_dosen){
  this.id_dosen = id_dosen;
  }

    public Long getId_dosen() {
        return id_dosen;
    }

    public void setId_dosen(Long id_dosen) {
        this.id_dosen = id_dosen;
    }

    public String getNik_dosen() {
        return nik_dosen;
    }

    public void setNik_dosen(String nik_dosen) {
        this.nik_dosen = nik_dosen;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }
  
  @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.id_dosen ^ (this.id_dosen >>> 32));
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
        final Dosen other = (Dosen) obj;
        if (this.nik_dosen != other.nik_dosen) {
            return false;
        }
        return true;
        
        
    }
    
     @Override
    public String toString() {
        return "universitas.com.model.Dosen[ nik_dosen=" + nik_dosen + " ]";
    }
    
}
