# Employee Management System - Spring Boot Backend

This is a Spring Boot-based backend system for managing employee records. It connects to a MySQL database and provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on employee data.

## Features
- **Create Employee**: Add a new employee to the database.
- **Read Employee**: Retrieve employee details by ID or fetch all employees.
- **Update Employee**: Modify existing employee records.
- **Delete Employee**: Remove an employee from the database.

## Technologies Used
- **Spring Boot**: Framework for building the backend application.
- **MySQL**: Database for storing employee records.
- **Spring Data JPA**: For database operations and object-relational mapping.
- **RESTful APIs**: Exposed endpoints for CRUD operations.
- **Maven**: Build and dependency management tool.

## Prerequisites
Before running the application, ensure you have the following installed:
- Java Development Kit (JDK) 17 or higher
- MySQL Server
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system
```

### 2. Configure MySQL Database
1. Create a MySQL database named `employee_management`.
2. Update the database connection details in the `application.properties` file:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
  spring.datasource.username=your-mysql-username
  spring.datasource.password=your-mysql-password
  spring.jpa.hibernate.ddl-auto=update
  ```

### 3. Build and Run the Application
1. Build the project using Maven:
  ```bash
  mvn clean install
  ```
2. Run the application:
  ```bash
  mvn spring-boot:run
  ```
  The application will start on `http://localhost:8080`.

## API Endpoints

### 1. Create Employee
- **Endpoint**: `POST /api/employees`
- **Request Body**:
 ```json
 {
   "firstName": "John",
   "lastName": "Doe",
   "email": "john.doe@example.com"
 }
 ```
- **Response**:
 ```json
 {
   "id": 1,
   "firstName": "John",
   "lastName": "Doe",
   "email": "john.doe@example.com"
 }
 ```

### 2. Get All Employees
- **Endpoint**: `GET /api/employees`
- **Response**:
 ```json
 [
   {
     "id": 1,
     "firstName": "John",
     "lastName": "Doe",
     "email": "john.doe@example.com"
   }
 ]
 ```

### 3. Get Employee by ID
- **Endpoint**: `GET /api/employees/{id}`
- **Response**:
 ```json
 {
   "id": 1,
   "firstName": "John",
   "lastName": "Doe",
   "email": "john.doe@example.com"
 }
 ```

### 4. Update Employee
- **Endpoint**: `PUT /api/employees/{id}`
- **Request Body**:
 ```json
 {
   "firstName": "Jane",
   "lastName": "Doe",
   "email": "jane.doe@example.com"
 }
 ```
- **Response**:
 ```json
 {
   "id": 1,
   "firstName": "Jane",
   "lastName": "Doe",
   "email": "jane.doe@example.com"
 }
 ```

### 5. Delete Employee
- **Endpoint**: `DELETE /api/employees/{id}`
- **Response**: HTTP Status `204 No Content`

## Contributing
Contributions are welcome! If you find any issues or want to enhance the project, feel free to open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
