
@echo off
echo ===============================
echo Running QA Automation Framework
echo ===============================

echo Installing Playwright browsers...
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"

echo.
echo Running tests...
mvn clean test

echo.
echo Tests finished
pause
