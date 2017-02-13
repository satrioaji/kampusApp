<%-- 
    Document   : Home_Organisasi
    Created on : 04-Feb-2017, 20:42:34
    Author     : WINDOWS 8
--%>
<%@include file="jstlInclude.jsp" %>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Organisasi Universitas Indraprasta</title>
        <link rel="shortcut icon" href="img/logo-unindra1.jpg">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

    </head>
    <body>
        
        <div style ="background: greenyellow;" class="jumbotron text-center">
            
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
                    <form:form class="navbar-form navbar-left" method="GET" action="searchOrganisasi.do">
                        <div class="form-group">
                            
                        </div>
                    </form:form>           
                </div>
                

            </nav>
            

            <form:form method="GET" action="searchOrganisasi.do" class="pull-right">
                <input type="text" name="organisasi_nama" class="form-control input-sm" style="width:150px" placeholder="search">
                <div class="input-group pull-right" style="width: 200px;">
                    
                </div>
        </div>
    </form:form>
            

    <div class="container">
        <div class="table-responsive">  
            <table class="table table-striped tab">

                <tr>

                    <th>Unitas</th>
                    <th>Nama Ketua</th>
                    <th>Fakultas</th>
                    <th>Jumlah Anggota</th>
                </tr>
                <c:forEach items ="${organisasilist}" var="organisasi">
                    <tr>

                        <td>${organisasi.unitas}</td>
                        <td>${organisasi.nama_ketua}</td>
                        <td>${organisasi.fakultas}</td>
                        <td>${organisasi.jumlah_anggota}</td>
                        <td> <a href="viewUpdateOrganisasi.do?organisasi_id=${organisasi.id_organisasi}" class="btn btn-info">Update</a>
                            <a href="DeleteOrganisasi.do?organisasi_id=${organisasi.id_organisasi}" class="btn btn-info confirmation">Delete</a>
                    </tr>

                </c:forEach>
            </table>
            </body>
            <img src="img/logo-unitas1.jpg" alt="image"/>
            <a href="/Kampus/InputOrganisasi.do" class="btn btn-default">Input</a>
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
