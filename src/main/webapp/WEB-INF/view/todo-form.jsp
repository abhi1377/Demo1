<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>Save Todo</title>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>

    <style>
        .datepicker{

        }
    </style>

    <script>
        $(function() {
            $( ".datepicker" ).datepicker();
        });
    </script>

    <link type="text/css"
          rel="stylesheet"
          href="css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="css/add-todo.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<h3>Save Todo</h3>
<%--@elvariable id="todo" type="comm"--%>
<form:form action="saveTodo" modelAttribute="todo" method="POST">
    <form:hidden path="id"/>
        <div>
            <label>Date:</label>
            <form:input path="date" class="datepicker"/>

        </div>
        <br/>
    <div>
        <label>Description:</label>
        <form:input path="description"/>

    </div>
    <br/>
        <input type="submit" value="Save" class="save"/>
</form:form>


</body>
</html>