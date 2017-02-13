<%-- 
    Document   : InputOrganisasi
    Created on : 05-Feb-2017, 08:17:11
    Author     : WINDOWS 8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Organisasi</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">
        

    </head>
    <body>
        <div class="demo-content content mdl-cell mdl-cell--6-col mdl-cell--12-col-tablet banner-ws">
	<h1 class="heading-ws"> Kampus Aplication </h1>
        <h5 class="heading-ws"> Silahkan Masukkan Data </h5>
        </div>
        
          <form:form method="POST" action="/Kampus/addOrganisasi.do" modelAttribute="organisasi">   
                    
                      
        <table> 
            
          <tr>
                            <td>Unitas</td>
                            <td>:</td>
                            <td><form:input path="unitas"  placeholder="Nama Unitas"/></td>                          
          </tr>            
          <tr>
                            <td>Ketua</td>
                            <td>:</td>
                            <td><form:input path="nama_ketua"  placeholder="Ketua"/></td>                          
          </tr>
                             
          
          <tr>
                            <td>Fakultas</td>
                            <td>:</td>
                            <td><form:input path="fakultas"  placeholder="Nama Fakultas"/></td>
          </tr>
            
          <tr>
                            <td>Jumlah Anggota</td>
                            <td>:</td>
                            <td><form:input path="jumlah_anggota"  placeholder="Jumlah Anggota"/></td>                          
          </tr>
        </table>
                    
          <input type="submit" value="Simpan"  />  
                    
              </form:form>
        
        
        
      
    </body>
</html>
