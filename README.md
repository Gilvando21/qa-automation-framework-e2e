
# QA Automation Framework E2E (BigTech Architecture)

Enterprise-grade **QA Automation Framework** demonstrating modern **SDET / QA Engineering practices** used by high-scale engineering teams.

This project simulates a **complete E2E purchase flow** while showcasing scalable automation architecture including UI, API, contract testing, CI/CD pipelines and observability.

---

# Badges

![CI](https://img.shields.io/badge/CI-GitHubActions-green)
![Java](https://img.shields.io/badge/Java-25-orange)
![Automation](https://img.shields.io/badge/Test-Automation-blue)
![Docker](https://img.shields.io/badge/Docker-enabled-blue)
![Parallel](https://img.shields.io/badge/Parallel-Execution-purple)
![Reports](https://img.shields.io/badge/Reports-Allure-red)

---

# Tech Stack

Java  
Playwright  
Selenium Grid  
JUnit5  
REST Assured  
Testcontainers  
Mutation Testing (PIT)  
Docker  
GitHub Actions CI/CD  
Allure Reporting  

---

# Framework Architecture

The framework follows a **hexagonal-inspired architecture** focused on scalability and maintainability.

```
src
 ├── main
 │   └── core
 │       ├── driver
 │       ├── utils
 │       ├── observability
 │       ├── orchestration
 │       └── data
 │
 └── test
     ├── ui
     │   ├── pages
     │   └── tests
     │
     ├── api
     │   └── tests
     │
     └── contract
```

---

# Architecture Diagram

```
           ┌──────────────┐
           │   Test Runner │
           └───────┬──────┘
                   │
        ┌──────────▼──────────┐
        │   Test Orchestration │
        └───────┬───────┬─────┘
                │       │
        ┌───────▼───┐ ┌─▼─────────┐
        │ UI Tests  │ │ API Tests │
        └───────┬───┘ └──────┬────┘
                │            │
        ┌───────▼────────────▼─────┐
        │      Automation Core     │
        │  Drivers | Utils | Data  │
        └──────────┬───────────────┘
                   │
             ┌─────▼─────┐
             │  Browsers │
             │ Selenium  │
             │ Playwright│
             └───────────┘
```

---

# Capabilities

Hexagonal automation architecture  
Parallel execution support (50+ tests)  
UI automation with Playwright  
API automation with REST Assured  
Contract testing structure  
Mutation testing with PIT  
Visual test evidence (screenshots)  
Dockerized execution  
Selenium Grid scalability  
CI/CD automation pipeline  
Allure test reporting  

---

# End-to-End Purchase Flow Simulation

The framework automates a **complete e-commerce purchase flow**.

```
Login
 ↓
Select Product
 ↓
Add to Cart
 ↓
Open Cart
 ↓
Checkout
 ↓
Payment
 ↓
Order Confirmation
```

The repository includes **10 automated scenarios validating the entire user journey**.

---

# Example Automated Test Cases

Login validation  
Add product to cart  
Cart validation  
Checkout form validation  
Payment processing  
End-to-end purchase completion  

These scenarios simulate a **real-world online store interaction**.

---

# Visual Test Evidence

Screenshots are automatically captured during execution.

Example output:

```
screenshots/

01_login.png
02_add_product.png
03_cart.png
04_checkout.png
05_checkout_data.png
06_payment.png
```

These images act as **visual test evidence**.

---

# Parallel Test Execution

The framework supports **high-scale parallel execution**.

Example configuration:

```
JUnit Parallel Execution
Thread Pools
Distributed Selenium Grid
```

This allows running **50+ tests simultaneously**.

---

# Allure Test Reporting

The framework integrates **Allure Reports** for rich visualization of test results.

Run tests:

```
mvn clean test
```

Generate report:

```
allure serve target/allure-results
```

Allure provides:

Test execution history  
Failure analysis  
Visual reporting dashboards  

---

# Quality Dashboard

The architecture allows integration with monitoring dashboards such as:

Allure Dashboard  
Grafana  
Test trend analytics  
Quality metrics tracking  

These dashboards provide **visibility into automation reliability and product quality**.

---

# Running the Tests

Execute locally:

```
mvn clean test
```

Artifacts generated:

Screenshots  
Execution logs  
Allure reports  

---

# Running with Docker

```
docker build -t qa-framework .
docker run qa-framework
```

This ensures **portable and reproducible test execution**.

---

# Selenium Grid Execution

```
docker-compose up
```

Grid enables distributed execution across multiple browsers and machines.

---

# CI/CD Pipeline

GitHub Actions automatically runs the automation suite on every push.

Pipeline includes:

Repository checkout  
Java environment setup  
Playwright browser installation  
Automated test execution  
Artifact generation  

This ensures **continuous validation of the project**.

---

# Mutation Testing

Mutation testing is implemented using **PIT**.

This technique evaluates how effective the automated tests are at detecting faults.

---

# Observability

The framework provides visibility into execution through:

Execution logs  
Metrics  
Screenshot evidence  
Test reports  

This improves **debugging and automation reliability**.

---

# Future Improvements

Advanced test orchestration  
Contract testing implementation  
Self-healing tests  
Visual regression testing  
AI-assisted test maintenance  

---

# Goal

Demonstrate **enterprise-level QA automation engineering** and scalable test architecture similar to frameworks used by modern QA teams in high-scale environments.

---

# Author

Gilvando Sena Matos  
QA Engineer | Test Automation | QA Architecture
