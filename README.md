# FitByBeat Automation Testing - Katalon Studio

This repository contains the automation tests for the **FitByBeat** website, developed using **Katalon Studio**. The tests focus on validating core functionalities such as the **Calculate Your BMI** feature and the **Schedule Booking** process, covering both positive and negative scenarios.

## Test Scenarios

### 1. Calculate Your BMI
- **Positive Case**: Ensure that the BMI calculation works as expected when valid inputs (e.g., height and weight) are provided. Verify that the correct BMI result is displayed.
- **Negative Case**: Test the behavior when invalid or empty inputs are entered (e.g., missing height/weight). Ensure the system handles errors appropriately and does not crash.

### 2. Schedule Booking
- **Positive Case**: Validate that users can successfully book a schedule through the 'Book Now' button on the homepage. Verify the booking confirmation message.
- **Negative Case**: Test various scenarios where booking should fail, such as attempting to book without selecting a time slot or when the user is not eligible for booking.

## Tools & Technologies
- **Katalon Studio**: For test automation development.
- **WebDriver**: Used to simulate user interactions with the website.
- **Test Case Management**: Organized within Katalon Studio.

## Getting Started
To run the tests, follow these steps:
1. Clone the repository.
2. Open the project in **Katalon Studio**.
3. Configure your WebDriver as needed.
4. Run the test cases individually or as part of a test suite.

## Contribution
Feel free to contribute by adding more test cases, enhancing the existing ones, or optimizing the scripts.

