
# QA Automation Framework E2E

![CI](https://github.com/Gilvando21/qa-automation-framework-e2e/actions/workflows/ci.yml/badge.svg)

Enterprise-grade QA Automation Framework demonstrating modern SDET practices.

---

## Tech Stack

Java  
Playwright  
JUnit5  
REST Assured  
Docker  
GitHub Actions CI/CD  

---

## Architecture

src
 ├── main
 │   └── java
 │       ├── core
 │       │   ├── data
 │       │   ├── observability
 │       │   └── utils
 │       │
 │       └── ui
 │           ├── pages
 │           ├── components
 │           └── flows

---

## E2E Purchase Flow

Login → Select Product → Cart → Checkout → Payment → Confirmation

---

## Run Tests

mvn clean test

---

## CI/CD

Tests run automatically via GitHub Actions on every push.
Artifacts and screenshots are uploaded to the workflow run.

---

Author: Gilvando Matos
Linkedin: https://www.linkedin.com/in/gilvando-matos-3a259821/