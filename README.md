# Exercises

This repository contains some exercises to practice algorithms, data structures and design questions. A PR with new exercise must be sent after have a solution for current list.

## Tests

There is a list of folders in test module with some classes and test methods inside. Test content refers to 

- Convert number to string with comma
- Sort numbers (implement two algorithms)
- Implement stack (using an array and linked list, two implementation total)

Main goal is to get all tests passing by implementing the corresponding code. Implementation and design is on your own decision

## Design Exercise

There's another folder in main `com.itisol.refactor` package. This is a design exercise.

### Acceptance Criteria 

Three different transports must be created: One for land travel, water travel and air travel. 

There's one implementation for water travel, `Boat` class implements from `Transport` interface; it contains attributes and other methods, you must refactor this code to achieve the following:

- Make code readable
- Implement necessary code only
- Complete the code for two extra methods: get JSON and XML format

JSON:
```json
{ "name" : "Black Pearl", "maxSpeed" : 180 }
```
XML:
```xml
<boat name="Black Pearl"><maxSpeed>180</maxSpeed></boat>
```

There's an initial class named `Car`, it refers to land travel. Please complete code for this class to implement `Transport`. At least 4 attributes must be used in this class, along with JSON and XML generation methods (JSON and XML formats must be designed)

Implement complete air travel along with JSON, XML and YML output methods.

On Main class, create some transport elements and send all format representations to a file.
