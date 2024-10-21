# CSCD210-Lab8
# Clock Class and CSCD210Lab8

## What is this

This project contains a `Clock` class implementation that represents a 24-hour clock with hours, minutes, and seconds. It includes functionality for setting and getting the time, as well as formatting the time as a string.

### Features of the Clock Class
- Default constructor (DVC) that initializes the time to 12:00:00.
- Explicit Value Constructor (EVC) that allows setting a specific time.
- Getter methods for hours, minutes, and seconds.
- Setter methods for hours and minutes with overflow handling.
- A `toString` method that formats the time in HH:MM:SS.

## How to use this

1. **Compile the Code**: Ensure both the `Clock` class and `CSCD210Lab8` class are in the same package (`cscd210classes`).
2. **Run the Main Class**: Execute the `CSCD210Lab8` class. This will demonstrate various operations on `Clock` objects.
3. **Observe Output**: The output will show how to create `Clock` instances, retrieve their values, and set new times, including handling overflow when exceeding normal hour or minute limits.
