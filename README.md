# Mobile Search Application
**Overview**

The Mobile Search Application is a RESTful API built with Spring Boot that allows users to search for mobile phones based on various criteria such as brand, color, and storage capacity. The application supports both AND and OR search logic, enabling flexible and dynamic filtering.

------------------

## Features

- Search for mobile phones by:
  * Brand: Apple, Samsung, Xiaomi, Huawei
  * Color: Black, White, Silver, Golden
  * Storage: 32GB, 64GB, 128GB, 256GB, 512GB
- Boolean Logic:
  * AND logic to find mobiles that match all specified criteria.
  * OR logic to find mobiles that match any of the specified criteria.
- Lightweight and easy to run with a simple configuration.

-------------------

## Technologies Used
- Java 17
- Spring Boot 2.7+
- Maven (Dependency Management & Build Tool)
- IntelliJ IDEA (Development Environment)

---

## Getting Started
- Prerequisites
- Java 17 or later installed.
- Maven installed.
- An IDE like IntelliJ IDEA (recommended).

-------

## Installation and Running Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/mobile-search-app.git

2. Navigate to the project directory:
   ```bash
   cd mobile-search-app

3. Build the project:
   ```bash
   mvn clean install

4. Run the application:
   ```bash
   mvn spring-boot:run

5. Access the API: The application will be available at:
   ```bash
   http://localhost:8080

-------------

## Example Request:

```bash
GET http://localhost:8080/search?brand=Apple,Samsung&color=White,Silver&storage=128,256,512&useOr=false
```

-----------------------
## Example Response:

```bash
[
  {
    "brand": "Samsung",
    "color": "White",
    "storage": 256
  },
  {
    "brand": "Apple",
    "color": "Silver",
    "storage": 256
  }
]
```

------------------

## Project Structure

```bash
src
└── main
    ├── java
    │   └── com.example.mobileapp
    │       ├── MobileAppApplication.java     (Main Spring Boot Application)
    │       ├── controller
    │       │   └── MobileController.java     (REST Controller for handling API requests)
    │       └── model
    │           └── Mobile.java               (Data model representing a mobile phone)
    └── resources
        └── application.properties            (Application configuration file)
```

------------------------

## Contributing

Contributions are welcome! If you have any suggestions or improvements, please feel free to fork the repository and submit a pull request. You can also open an issue to report any bugs or request new features.

-------------

## Contact

For any questions or feedback, feel free to reach out:

- GitHub:saharzakersoltani




