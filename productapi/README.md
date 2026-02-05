🛒 Product Management REST API

A Spring Boot RESTful API for managing products, built using Java, Spring Boot, and Maven.
This project demonstrates backend development skills including REST APIs, CRUD operations, layered architecture, and deployment readiness.

📌 Features

Create a new product

Retrieve all products

Retrieve product by ID

Update product details

Delete a product

RESTful API design

Clean controller–service–repository structure

🛠️ Tech Stack

Java 21

Spring Boot

Spring Web

Spring Data JPA

H2 / MySQL (based on your config)

Maven

Thunder Client (API testing)

Railway (for deployment)

📂 Project Structure
productapi
│
├── controller
│   └── ProductController.java
├── service
│   └── ProductService.java
├── repository
│   └── ProductRepository.java
├── model
│   └── Product.java
├── ProductapiApplication.java
└── resources
    └── application.properties

🚀 Getting Started (Local Setup)
Prerequisites

Java 21+

Maven

IDE (IntelliJ / VS Code / Eclipse)

🔧 Run Locally

Clone the repository

git clone https://github.com/your-username/product-management-api.git


Navigate to project directory

cd product-management-api


Run the application

mvn spring-boot:run


Server will start at:

http://localhost:8080

🔗 API Endpoints
➕ Create Product
POST /api/products


Request Body

{
  "name": "Laptop",
  "price": 75000,
  "quantity": 5
}

📄 Get All Products
GET /api/products

🔍 Get Product by ID
GET /api/products/{id}

✏️ Update Product
PUT /api/products/{id}

❌ Delete Product
DELETE /api/products/{id}

🧪 Testing

APIs tested using Thunder Client

Application successfully tested locally on port 8080

🌍 Live Deployment

👩‍💻 Author

Sanjana Agarwal

Computer Science Engineering Graduate

Aspiring Backend / Data Professional

Skilled in Java, Spring Boot, SQL, Python

📌 Open to backend / software developer opportunities

⭐ Why This Project?

This project was built to:

Strengthen backend fundamentals

Understand REST API development

Practice real-world project structure

Prepare for software developer interviews

📜 License

This project is open-source and free to use for learning purposes.