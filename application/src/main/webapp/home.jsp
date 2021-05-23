<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Application</title>
</head>
<body>
Save Book
<form action="savebook">
<input type="number" name="bookId" >
<input type="number" name="quantity" >
<input type="text" name="bookName" >
<input type="text" name="genre" >
<input type="submit" value="Save Book" >
</form>
Update Book
<form action="updatebook">
<input type="number" name="bookId" >
<input type="number" name="quantity" >
<input type="text" name="bookName" >
<input type="text" name="genre" >
<input type="submit" value="Save Book" >
</form>
Delete Book
<form action="deletebook">
<input type="number" name="bookId" >
<input type="submit" value="Delete Book">
</form>
Get All Books
<form action="getallbooks">
<input type="submit" value="Get All Books">
</form>
Get Books By Genre
<form action="getbooksbygenre">
<input type="text" name="genre" >
<input type="submit" value="Get Books By Genre">
</form>
</body>
</html>