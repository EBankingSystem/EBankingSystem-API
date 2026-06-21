# Finix Bank — API (Backend)

**आपका बैंक, आपके साथ.**

This repository contains the backend API for **Finix Bank**, an e-banking system built to automate bank processing and facilitate secure online banking. It handles account management, authentication, transactions, and database operations.

## Overview

The Finix Bank API is a .NET Web API that provides:

- Secure authentication and authorization for customers and staff
- Account creation, update, and deletion (CRUD operations)
- Transaction processing and history management
- Integration with MySQL database for efficient data management

## Tech Stack

- **Framework:** .NET (ASP.NET Core Web API)
- **Database:** MySQL
- **ORM:** Entity Framework Core (or specify if different)
- **Authentication:** JWT-based authentication (update as applicable)

## Project Structure

```
finix-bank-api/
├── Controllers/         # API endpoints
├── Models/              # Data models / entities
├── Services/            # Business logic
├── Repositories/        # Database access layer
├── DTOs/                # Data transfer objects
├── Migrations/          # EF Core migrations (if used)
├── appsettings.json
├── Program.cs
└── README.md
```

## Prerequisites

- .NET SDK (6.0+ recommended)
- MySQL Server
- Visual Studio / VS Code (optional, for development)

## Getting Started

1. Clone the repository
   ```bash
   git clone https://github.com/your-org/finix-bank-api.git
   cd finix-bank-api
   ```

2. Configure database connection
   Update `appsettings.json` with your MySQL connection string:
   ```json
   "ConnectionStrings": {
     "DefaultConnection": "Server=localhost;Database=finixbank;User=root;Password=yourpassword;"
   }
   ```

3. Restore dependencies
   ```bash
   dotnet restore
   ```

4. Run database migrations (if using EF Core)
   ```bash
   dotnet ef database update
   ```

5. Run the application
   ```bash
   dotnet run
   ```

   The API will be available at `https://localhost:5000` (or as configured)

## API Endpoints (Sample)

| Method | Endpoint                  | Description                     |
|--------|----------------------------|----------------------------------|
| POST   | `/api/auth/login`          | Authenticate user                |
| POST   | `/api/accounts`             | Create a new account             |
| GET    | `/api/accounts/{id}`        | Get account details              |
| PUT    | `/api/accounts/{id}`        | Update account information       |
| DELETE | `/api/accounts/{id}`        | Delete an account                |
| GET    | `/api/transactions/{id}`    | Get transaction history          |

> Update this table to reflect actual implemented endpoints.

## Features

- Secure user authentication and role-based access (customer/staff)
- Full account lifecycle management (create, update, delete)
- Transaction processing and logging
- Efficient database operations with MySQL
- RESTful API design for easy frontend integration

## Related Repositories

- **UI (Frontend):** [finix-bank-ui](#)
- **Database scripts:** [finix-bank-db](#)

## Contributing

Contributions are welcome. Please open an issue or submit a pull request for any improvements.

## License

This project is licensed under the MIT License.
