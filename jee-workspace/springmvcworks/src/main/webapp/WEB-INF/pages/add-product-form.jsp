<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Add Product Form </h2>
<hr>


<sf:form modelAttribute="product" action="save-product" method="POST">


		<div class="form-group row">
			<label class="col-md-4" for="productId">Product Id</label>
			<div class="col-md-8">
				<sf:input path="productId" cssClass="form-control" />
				<sf:errors path="productId" cssClass="text-danger" />
			</div>
		</div>

		<div class="form-group row">
			<label class="col-md-4" for="productName">Product Name</label>
			<div class="col-md-8">
				<sf:input path="productName" cssClass="form-control" />
				<sf:errors path="productName" cssClass="text-danger" />

			</div>
		</div>

		<div class="form-group row">
			<label class="col-md-4" for="productPrice">Product Price</label>
			<div class="col-md-8">
				<sf:input path="productPrice" cssClass="form-control" />
				<sf:errors path="productPrice" cssClass="text-danger" />

			</div>
		</div>
	

		<div class="form-group row">
			<label class="col-md-4"></label>
			<div class="col-md-8">
				<button class="btn btn-primary">Submit</button>
			</div>
		</div>

	</sf:form>


</body>
</html>