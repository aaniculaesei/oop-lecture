# Inheritance vs. Composition

This repository contains small Java examples used in a first-year lecture on object-oriented programming.

## Structure
- `inheritance/` – simple class hierarchy using `Vehicle`, `Car`, and `Truck`
- `composition/` – a `Truck` built from components such as `Engine`, `Wheel`, and `Chassis`
- `comparison/` – a configurator example showing why composition can be more flexible than inheritance

## Learning goal
Understand the difference between:
- **Inheritance**: reuse through hierarchy (`is-a` relatioship)
- **Composition**: reuse through building blocks/components (`has-a` relationship)

## Structure

### `inheritance/`
A simple class hierarchy using `Vehicle`, `Car`, and `Truck`.

### `composition/`
A `Truck` built from smaller components such as `Engine`, `DriveTrain`, and `Wheel`.

### `comparison/`
Two configurator examples:
- `inheritance-configurator/` shows how a hierarchy grows quickly
- `composition-configurator/` shows how components can be combined more flexibly

## How to run

Compile and run from inside each folder:

```bash
javac *.java
java Main