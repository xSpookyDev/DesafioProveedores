<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Proveedores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<div class="container">
    <h1>Listado de Proveedores</h1>
    <table class="table" id="tblProveedor">
        <thead class="table-dark">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>RUT</th>
                <th>Dirección</th>
                <th>Correo</th>
                <th>Teléfono</th>
                <th>Contacto</th>
                <th>Teléfono de Contacto</th>
               
            </tr>
        </thead>
        <tbody>
            <c:forEach var="p" items="${proveedores}">
                <tr>
                    <td><c:out value="${p.getId()}"></c:out></td>
                    <td><c:out value="${p.getNombre()}"></c:out></td>
                    <td><c:out value="${p.getRut()}"></c:out></td>
                    <td><c:out value="${p.getDireccion()}"></c:out></td>
                    <td><c:out value="${p.getCorreo()}"></c:out></td>
                    <td><c:out value="${p.getTelefono()}"></c:out></td>
                    <td><c:out value="${p.getContacto()}"></c:out></td>
                    <td><c:out value="${p.getFono_contacto()}"></c:out></td>
                   
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
<script>
$(document).ready(function() {
    $('#tblProveedor').DataTable();
});
</script>
<script src="https://kit.fontawesome.com/74feac1d02.js" crossorigin="anonymous"></script>
</body>
</html>
