<%-- 
    Document   : UpdateOrganisasi
    Created on : 05-Feb-2017, 08:40:58
    Author     : WINDOWS 8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jstlInclude.jsp" %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Organisasi</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">


    </head>
    <body>
        <div class="jumbroton text-center">
	<h1 class="heading-ws"> Kampus Aplication </h1>
        <h5 class="heading-ws"> Mengganti data </h5>
        </div>
        <form:form method="POST" action="/Kampus/addOrganisasi.do" modelAttribute="organisasi" >   
                    
                      
      <form:input type="hidden" path="id_organisasi" id="id_organisasi"/>
                                              
        
      <table>
			<tr>
				<td><label for="nik_dosen">Unitas :</label></td>
				<td><form:input path="unitas" id="unitas" /></td>
				<td><form:errors path="unitas"></form:errors></td>
			</tr>          
			<tr>
				<td><label for="nama_dosen">Ketua :</label></td>
				<td><form:input path="nama_ketua" id="nama_ketua" /></td>
				<td><form:errors path="nama_ketua"></form:errors></td>
			</tr>
                        
                        <tr>
				<td><label for="matakuliah">Fakultas:</label></td>
				<td><form:input path="fakultas" id="fakultas" /></td>
				<td><form:errors path="fakultas"></form:errors></td>
			</tr>
			
                        <tr>
				<td><label for="sks">Jumlah Anggota:</label></td>
				<td><form:input path="jumlah_anggota" id="jumlah_anggota" /></td>
				<td><form:errors path="jumlah_anggota"></form:errors></td>
			</tr>
			

			
                        
		</table>

                        <input type="submit" value="Simpan"  />  
                    
              </form:form>
        
        
        
      
    </body>
</html>
