<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Update the Product Details</h1>
				<form action="${pageContext.request.contextPath }/handle-product" method="post">
					<input type="hidden" value="${productById.id }" name="id">
					<div class="form-group">
						<label for="name">Product Name</label>
						<input type="text" class="form-control" id="name" aria-describedby="emailHelp" 
						name="name" value="${productById.name }" placeholder="Enter the product name here"/>
					</div>
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" name="description" id="description"
						rows="5" cols="" placeholder="Enter the product description here">${productById.description }</textarea>
					</div>
					<div class="form-group">
						<label for="name">Product Price</label>
						<input type="text" class="form-control" id="price" aria-describedby="emailHelp" 
						name="price" value="${productById.price }" placeholder="Enter the product price here"/>
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>