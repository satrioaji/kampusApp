<%-- 
    Document   : UpdateMahasiswa
    Created on : 23-Jan-2017, 18:57:55
    Author     : WINDOWS 8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jstlInclude.jsp" %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Mahasiswa</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">


    </head>
    <body>
        <div class="jumbroton text-center">
	<h1 class="heading-ws"> Kampus Aplication </h1>
        <h5 class="heading-ws"> Mengganti data </h5>
        </div>
        <form:form method="POST" action="/Kampus/addMahasiswa.do" modelAttribute="mahasiswa" >   
                    
                      
      <form:input type="hidden" path="id" id="id"/>
                                              
        
      <table>
			<tr>
				<td><label for="npm">NPM :</label></td>
				<td><form:input path="npm" id="npm" /></td>
				<td><form:errors path="npm"></form:errors></td>
			</tr>          
			<tr>
				<td><label for="nama">Nama:</label></td>
				<td><form:input path="nama" id="nama" /></td>
				<td><form:errors path="nama"></form:errors></td>
			</tr>
                        
                        <tr>
				<td><label for="jurusan">Jurusan:</label></td>
				<td><form:input path="jurusan" id="jurusan" /></td>
				<td><form:errors path="jurusan"></form:errors></td>
			</tr>
			
                        <tr>
				<td><label for="alamat">Alamat:</label></td>
				<td><form:input path="alamat" id="alamat" /></td>
				<td><form:errors path="alamat"></form:errors></td>
			</tr>
			

			
                        
		</table>

                        <input type="submit" value="Simpan"  />  
                    
              </form:form>
        
        
        
      
    </body>
</html>
