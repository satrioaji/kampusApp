<%-- 
    Document   : UpdateDosen
    Created on : 04-Feb-2017, 08:46:35
    Author     : WINDOWS 8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jstlInclude.jsp" %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Dosen</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">


    </head>
    <body>
        <div class="jumbroton text-center">
	<h1 class="heading-ws"> Kampus Aplication </h1>
        <h5 class="heading-ws"> Mengganti data </h5>
        </div>
        <form:form method="POST" action="/Kampus/addDosen.do" modelAttribute="dosen" >   
                    
                      
      <form:input type="hidden" path="id_dosen" id="id_dosen"/>
                                              
        
      <table>
			<tr>
				<td><label for="nik_dosen">NIK Dosen :</label></td>
				<td><form:input path="nik_dosen" id="nik_dosen" /></td>
				<td><form:errors path="nik_dosen"></form:errors></td>
			</tr>          
			<tr>
				<td><label for="nama_dosen">Nama Dosen:</label></td>
				<td><form:input path="nama_dosen" id="nama_dosen" /></td>
				<td><form:errors path="nama_dosen"></form:errors></td>
			</tr>
                        
                        <tr>
				<td><label for="matakuliah">Matakuliah:</label></td>
				<td><form:input path="matakuliah" id="matakuliah" /></td>
				<td><form:errors path="matakuliah"></form:errors></td>
			</tr>
			
                        <tr>
				<td><label for="sks">SKS:</label></td>
				<td><form:input path="sks" id="sks" /></td>
				<td><form:errors path="sks"></form:errors></td>
			</tr>
			

			
                        
		</table>

                        <input type="submit" value="Simpan"  />  
                    
              </form:form>
        
        
        
      
    </body>
</html>
