<%-- 
    Document   : InputDosen
    Created on : 04-Feb-2017, 08:38:41
    Author     : WINDOWS 8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Dosen</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">
        

    </head>
    <body>
        <div class="demo-content content mdl-cell mdl-cell--6-col mdl-cell--12-col-tablet banner-ws">
	<h1 class="heading-ws"> Kampus Aplication </h1>
        <h5 class="heading-ws"> Silahkan Masukkan Data </h5>
        </div>
        
          <form:form method="POST" action="/Kampus/addDosen.do" modelAttribute="dosen">   
                    
                      
        <table> 
            
          <tr>
                            <td>NIK Dosen</td>
                            <td>:</td>
                            <td><form:input path="nik_dosen"  placeholder="NIK anda"/></td>                          
          </tr>            
          <tr>
                            <td>Nama Dosen</td>
                            <td>:</td>
                            <td><form:input path="nama_dosen"  placeholder="Nama anda"/></td>                          
          </tr>
                             
          
          <tr>
                            <td>Matakuliah</td>
                            <td>:</td>
                            <td><form:input path="matakuliah"  placeholder="Matakuliah anda"/></td>
          </tr>
            
          <tr>
                            <td>SKS</td>
                            <td>:</td>
                            <td><form:input path="sks"  placeholder="Jumlah SKS"/></td>                          
          </tr>
        </table>
                    
          <input type="submit" value="Simpan"  />  
                    
              </form:form>
        
        
        
      
    </body>
</html>
