<%-- 
    Document   : InputMahasiswa
    Created on : Aug 21, 2016, 5:17:18 PM
    Author     : roy
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
        <title>Input Mahasiswa</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">
        

    </head>
    <body>
        <div class="demo-content content mdl-cell mdl-cell--6-col mdl-cell--12-col-tablet banner-ws">
	<h1 class="heading-ws"> Kampus Aplication </h1>
        <h5 class="heading-ws"> Silahkan Masukkan Data </h5>
        </div>
        
          <form:form method="POST" action="/Kampus/addMahasiswa.do" modelAttribute="mahasiswa">   
                    
                      
        <table> 
            
          <tr>
                            <td>NPM</td>
                            <td>:</td>
                            <td><form:input path="npm"  placeholder="NPM anda"/></td>                          
          </tr>            
          <tr>
                            <td>Nama</td>
                            <td>:</td>
                            <td><form:input path="nama"  placeholder="Nama anda"/></td>                          
          </tr>
                             
          
          <tr>
                            <td>Jurusan</td>
                            <td>:</td>
                            <td><form:input path="jurusan"  placeholder="Jurusan anda"/></td>
          </tr>
            
          <tr>
                            <td>Alamat</td>
                            <td>:</td>
                            <td><form:input path="alamat"  placeholder="Alamat anda"/></td>                          
          </tr>
        </table>
                    
          <input type="submit" value="Simpan"  />  
                    
              </form:form>
        
        
        
      
    </body>
</html>









