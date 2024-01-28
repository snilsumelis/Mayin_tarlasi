# MineSweeper Game

## Overview
This Java program implements a simple console-based Minesweeper game. Players can input coordinates to reveal cells on the grid, avoiding mines. The game ends if a mine is revealed.

## Features
- Random placement of mines on the grid.
- Input validation for user coordinates.
- Display of the minefield and the player's progress.
- Game over when a mine is revealed.
- Counting and displaying adjacent mines for each revealed cell.

## How to Play
1. Initialize the game by providing the number of rows and columns for the minefield.
2. Mines are randomly placed on the grid.
3. Players input coordinates to reveal cells.
4. The game ends if a mine is revealed.
5. The player wins by revealing all non-mine cells.

## Usage
1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/snilsumelis/Mayin_tarlasi
    ```
2. Navigate to the project directory:
    ```bash
    cd your-repository
    ```
3. Compile and run the `Main` class in the `src` directory.

## Example Output
```bash
Mayınların Konumu :
 -  -  -  *  - 
 *  -  *  -  * 
 -  *  -  *  - 
 *  -  *  *  * 
 -  *  *  -  - 
Mayın Tarlası Oyuna Hoşgeldiniz !
 -  -  -  -  - 
 -  -  -  -  - 
 -  -  -  -  - 
 -  -  -  -  - 
 -  -  -  -  - 
Satır Giriniz : 2
Sütun Giriniz : 3
 -  -  -  -  - 
 -  -  -  -  - 
 -  -  2  -  - 
 -  -  -  -  - 
 -  -  -  -  - 
Satır Giriniz : 0
Sütun Giriniz : 0
Game Over!! ===========================
