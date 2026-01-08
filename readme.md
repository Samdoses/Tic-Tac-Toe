# Java Console Tic-Tac-Toe

A robust, console-based implementation of the classic Tic-Tac-Toe game. This project demonstrates core Object-Oriented Programming (OOP) principles, custom exception handling, and modular design patterns in Java.

## Project Overview

This application allows users to play Tic-Tac-Toe via a Text User Interface (TUI). It supports two game modes:

* **Single Player:** Human vs. Random Computer AI.
* **Two Player:** Human vs. Human (Hot-seat).

## Technical Highlights

This project was designed with a focus on clean code, extensibility, and robustness. Below are the key programming techniques and data structures employed:

### 1. Object-Oriented Design (OOP)

* **Polymorphism & Interfaces:** The project utilizes the `Playable` interface to define a common contract for making moves (`selectCell`). This allows the game loop to treat human players (`Player`, `Player2`) and AI players (`RandomComputer`) interchangeably, effectively applying the **Strategy Pattern**.
* **Encapsulation:** The `Grid` class encapsulates the game state. It protects the integrity of the board by keeping the `grid` array package-private (or private with accessors) and managing modifications strictly through the `selectCell` method.

### 2. Data Structures

* **2D Arrays:** The game board is modeled using a 2D integer array (`int[][] grid`). This provides O(1) access time for checking cell status and writing moves, offering high performance for the fixed-size game board.

### 3. Exception Handling & Robustness

* **Custom Exceptions:** A custom runtime exception, `OccupationException`, is defined to handle cases where a player attempts to move into an already occupied cell.
* **Fault Tolerance:** The game loop in `TUI.java` wraps move execution in `try-catch` blocks. It gracefully catches `OccupationException` and `ArrayIndexOutOfBoundsException`, ensuring the program doesn't crash on invalid user input and instead prompts the user to try again.

### 4. Game Logic & Algorithms

* **Win Detection:** The `Grid` class contains optimized logic to check for winning conditions (rows, columns, and diagonals) dynamically based on the entity (Player or Opponent).
* **AI Implementation:** The `RandomComputer` class demonstrates the use of `java.util.Random` to generate non-deterministic moves within the grid bounds.

## Classes Structure

* `Main`: Entry point of the application.
* `TUI`: Manages the game loop, user input, and display logic.
* `Grid`: Represents the 3x3 board and contains logic for win/draw detection.
* `Playable` (Interface): Defines the `selectCell()` behavior.
* `Player` / `Player2`: Human player implementations using `Scanner` for input.
* `RandomComputer`: AI implementation using RNG.
* `OccupationException`: Custom error for invalid moves.

## How to Run

1. Compile the source code:
```bash
javac main/*.java

```


2. Run the application:
```bash
java main.Main

```


3. Follow the on-screen prompts to select a game mode and enter coordinates (Row/Column) to play.
