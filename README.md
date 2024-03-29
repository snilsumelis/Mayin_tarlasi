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
Satır Giriniz : 1
Sütun Giriniz : 1
 -  -  -  -  - 
 -  3  -  -  - 
 -  -  2  -  - 
 -  -  -  -  - 
 -  -  -  -  -
Satır Giriniz : 0
Sütun Giriniz : 2
 -  -  -  -  - 
 -  3  -  -  - 
 3  -  2  -  - 
 -  -  -  -  - 
 -  -  -  -  -
Satır Giriniz : 4
Sütun Giriniz : 4
 -  -  -  -  - 
 -  3  -  -  - 
 3  -  2  -  - 
 -  -  -  -  - 
 -  -  -  -  1
Satır Giriniz : 0
Sütun Giriniz : 1
Game Over!! ===========================
