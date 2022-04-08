# Merge Dice 

This is meant to be a pet project for me to practice Scala3 and tagless final, and maybe Scala.js. 

## Rules 

The game consists of a fixed size square grid, initially empty. 
The game will generate randome dices, which the player have to place onto an empty position on the grid. 
Once a dice is placed it cannot be moved. 

When 3 or more dices of the same number are placed at locations connected orthogonally, 
they would disappear and be replaced by a single dice of number one higher than original (1 -> 2, 2 -> 3, etc.) 
The combined dice would be located at the same position as the last placed dice. 

Example: 
```
 - -      - -      - - 
|3| |    |3|3|    | |4|
 - -      - -      _ _ 
| |3| -> | |3| -> | | |
 - -      - -      - - 

  3        -        6  
``` 

Dices of number 6 combines to a "rainbow" dice. When rainbow dices combine, they disappear completely. 

## Motivation 

I did not came up with this game by myself. 
I saw someone else playing it with an app, and I think it seems good as a pet project to try code it. 
Not long ago I picked up another pet project that I abandoned quite some time ago, and finished it in SAcala2 with Cats Effect 3. 
Now I want to try move to Scala3 and try use the tagless final pattern. 
So I came up with this project. 
Later on, I might use this project to try Scala.js. 
If Scala3 and Cats Effect work on Scala Native then I might also give that a try. 

## Design 

Like I said above, this project will use Scala3 and the tagless final pattern. 

This project will have at least 4 parts: 
- data: For data classes representing basic sata, e.g. game state 
- algebra: Tagless final algebra traits 
- interpreter: Tagless final interpreters 
- ui: User interface 

## Contributing 

This is my pet project, my exercise ground. So, sorry, but let me do it myself. 
If you don't like my program design/whatever you are free to fork and do your own version. 

## Reporting bugs 

Open an issue at the GitHub repo. 
If you are so kind that you looked at my code/program design/etc and have suggestions, you can also open an issue. 
But no tell me to "use Zio" or "don't use tagless final" or "use Haskell" etc. 
This project is meant for me to practice Scala3 with Cats using tagless final pattern. 

## License 

This project is licensed under the GNU GPL v3.0 or later. 
You may find a copy of the license in this repository [here](./LICENSE.txt). 

