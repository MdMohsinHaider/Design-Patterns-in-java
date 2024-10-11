# Design Patterns in Java

This repository contains examples of commonly used **Design Patterns** in **Java**. Design patterns are well-proven solutions to recurring design problems. They help to make the software design more flexible, modular, and reusable.

## Table of Contents

- [Introduction](#introduction)
- [Categories of Design Patterns](#categories-of-design-patterns)
    - [Creational Patterns](#creational-patterns)
    - [Structural Patterns](#structural-patterns)
    - [Behavioral Patterns](#behavioral-patterns)
- [Design Patterns Implemented in Java](#design-patterns-implemented-in-java)
    - [Singleton](#singleton)
    - [Factory](#factory)
    - [Builder](#builder)
    - [Adapter](#adapter)
    - [Observer](#observer)
    - [Strategy](#strategy)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Design patterns represent the best practices used by experienced developers to solve common problems in software design. Understanding and implementing design patterns help in creating flexible, scalable, and maintainable code.

## Categories of Design Patterns

1. ### Creational Patterns
    - **Creational patterns** deal with object creation mechanisms, trying to create objects in a manner suitable for the situation.
    - **Examples**: Singleton, Factory, Abstract Factory, Builder, Prototype

2. ### Structural Patterns
    - **Structural patterns** focus on how objects and classes are composed to form larger structures while keeping these structures flexible and efficient.
    - **Examples**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy

3. ### Behavioral Patterns
    - **Behavioral patterns** focus on communication between objects, how they interact and distribute responsibility.
    - **Examples**: Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor

## Design Patterns Implemented in Java

### Singleton
Ensures that a class has only one instance and provides a global point of access to it.
- [Singleton Pattern Example](src/main/java/patterns/creational/singleton/Singleton.java)

### Factory
Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- [Factory Pattern Example](src/main/java/patterns/creational/factory/Factory.java)

### Builder
Allows for the construction of a complex object step by step.
- [Builder Pattern Example](src/main/java/patterns/creational/builder/Builder.java)

### Adapter
Allows objects with incompatible interfaces to collaborate.
- [Adapter Pattern Example](src/main/java/patterns/structural/adapter/Adapter.java)

### Observer
Defines a one-to-many dependency between objects where one object changes state, and all its dependents are notified and updated automatically.
- [Observer Pattern Example](src/main/java/patterns/behavioral/observer/Observer.java)

### Strategy
Enables selecting an algorithm’s behavior at runtime.
- [Strategy Pattern Example](src/main/java/patterns/behavioral/strategy/Strategy.java)

## Contributing

Feel free to fork this repository and contribute by adding more design pattern examples or improving the existing code. You can open a pull request with your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
