# Spring Boot 

This project implements a Spring Boot application with RESTful APIs for Category and Product CRUD operations, 
along with additional features such as one-to-many relationship between categories and products,
server-side pagination, and fetching single product details with respective category details.

## Requirements

- Spring Boot
- Rest Controller
- DB Configuration using RDB
- Annotation-based configuration
- JPA & Hibernate

## API Endpoints

### Category

1. **GET all categories**
   - URL: `http://localhost:8080/api/categories?page=3`
   
2. **POST - create a new category**
   - URL: `http://localhost:8080/api/categories`
   
3. **GET category by Id**
   - URL: `http://localhost:8080/api/categories/{id}`
   
4. **PUT - update category by id**
   - URL: `http://localhost:8080/api/categories/{id}`
   
5. **DELETE - Delete category by id**
   - URL: `http://localhost:8080/api/categories/{id}`

### Product

1. **GET all products**
   - URL: `http://localhost:8080/api/products?page=2`
   
2. **POST - create a new product**
   - URL: `http://localhost:8080/api/products`
   
3. **GET product by Id**
   - URL: `http://localhost:8080/api/products/{id}`
   
4. **PUT - update product by id**
   - URL: `http://localhost:8080/api/products/{id}`
   
5. **DELETE - Delete product by id**
   - URL: `http://localhost:8080/api/products/{id}`

## Additional Features

- One-to-many relationship between Category and Products
- Server-side pagination
- Fetching single product details with respective category details

## Running the Application

1. Clone the repository.
2. Navigate to the project directory.
3. Configure your database properties in `application.properties`.
4. Run the application using Maven or your IDE.
5. Access the APIs using the provided URLs.

