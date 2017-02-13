<%-- 
    Document   : Home
    Created on : 22-Jan-2017, 14:30:52
    Author     : WINDOWS 8
--%>
<%@include file="jstlInclude.jsp" %>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dosen Universitas Indraprasta</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

    </head>
    <body>
        
        <div style ="background: blue;" class="jumbotron text-center">
            
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">Kampus Aplication</a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="tampilMahasiswa.do">Mahasiswa</a></li>
                        <li><a href="tampilDosen.do">Dosen</a></li>
                        <li><a href="tampilOrganisasi.do">Organisasi</a></li>
                    </ul>
                    <form:form class="navbar-form navbar-left" method="GET" action="searchMahasiswa.do">
                        <div class="form-group">
                            
                        </div>
                    </form:form>           
                </div>
                

            </nav>
            

            <form:form method="GET" action="searchDosen.do" class="pull-right">
                <input type="text" name="dosen_nama" class="form-control input-sm" style="width:150px" placeholder="search">
                <div class="input-group pull-right" style="width: 200px;">
                    
                </div>
        </div>
    </form:form>
            

    <div class="container">
        <div class="table-responsive">  
            <table class="table table-striped tab">

                <tr>

                    <th>NIK Dosen</th>
                    <th>Nama Dosen</th>
                    <th>Matakuliah</th>
                    <th>SKS</th>
                </tr>
                <c:forEach items ="${dosenlist}" var="dosen">
                    <tr>

                        <td>${dosen.nik_dosen}</td>
                        <td>${dosen.nama_dosen}</td>
                        <td>${dosen.matakuliah}</td>
                        <td>${dosen.sks}</td>
                        <td> <a href="viewUpdateDosen.do?dosen_id=${dosen.id_dosen}" class="btn btn-info">Update</a>
                            <a href="DeleteDosen.do?dosen_id=${dosen.id_dosen}" class="btn btn-info confirmation">Delete</a>
                    </tr>

                </c:forEach>
            </table>
            </body>
            <img src="img/logo-unitas1.jpg" alt="image"/>
            <a href="/Kampus/InputDosen.do" class="btn btn-default">Input</a>
        </div>
    </div>




    <script type="text/javascript">
        var elems = document.getElementsByClassName('confirmation');
        var confirmIt = function (e) {
            if (!confirm('Are you sure !!!'))
                e.preventDefault();
        };
        for (var i = 0, l = elems.length; i < l; i++) {
            elems[i].addEventListener('click', confirmIt, false);
        }

    </script>
</html>
