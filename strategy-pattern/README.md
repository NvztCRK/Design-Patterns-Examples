# STRATEGY DESIGN PATTERN

Define a family of algorithms, encapsulate each one, and make them
interchangeable. Strategy lets the algorithm vary independently from clients
that use it.


## Usage
Use the Strategy pattern when

* many related classes differ only in their behavior. Strategies provide a way to configure a class either one of many behaviors
* you need different variants of an algorithm. for example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
* an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures
* a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class

## Resources 
* [Strategy Pattern Lesson](https://www.youtube.com/watch?v=v9ejT8FO-7I&t=696s)
* [Strategy Pattern Book](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124/ref=sr_1_2?s=books&ie=UTF8&qid=1540421340&sr=1-2&keywords=headfirst)
