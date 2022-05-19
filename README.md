# Design patterns

## What's a design pattern?
In my own words it is like recipy, a plan, a description of a problem with a way to solve that problem. Also we can say that a design pattern is a reusable element used to solve common problems. 

Commonly a design pattern is represented using UML diagrams.

Additionally we can split design patterns into different categories: creational patterns, structural patterns and behavioural patterns.

### Creational patterns
 This solve problems related with the creation of objects it's target is provide a solution in order to allow create instances of objects. Let's give an example: Imagine that you're developing a videogame you have a lot of different enemies and all of them appear randomly and you want that the enemy type and the position is decided in execution time. All the enemies inherit from *Enemy class* and as we already mentioned you want to creare in execution time the enemies but maybe you have a lot of pieces of code that do this so if you want to add a new enemy it will be really complex, because you need to modify a lot of code to make it work. To solve this we use a creational pattern. For this specific example we can use a Factory pattern. Or imagine that you have a really complex object to create following the videogame example the map maybe has a ton of really complex properties and behaviours but we can use the builder design pattern to solve this problem.

### Structural design patterns
This patterns help us to configure relationships between objects. Following the videogame example, we already known that we have a set of enemies, NPC's and why not powerups. But let's assume that exist an specific enemy type that can create more enemies but if the enemy that creates those new enemies dies the enemies created also will die, it is a really complex task but the composite design pattern can help to solve this case it allow us to organize the entities assuming that every entity can have entities inside of it using recursion.

### Behavioural design patterns
This category allow us to create interactions between classes and objects. Again let's take the videogame example and imagine that every enemy atacks in a different way. You can define inside every enemy how they can attack but now let's make even more complex this, maybe we want to create a new enemy that is harder to defeat but it has the same behaviour to attack that one of the other enemies you can assume that we can copy and paste the code of that behaviour but we can avoid to do that using the strategy design pattern. This design pattern allow us to uncople the behaviour attacks and the enemies and we can reuse those behaviour in the future if we want