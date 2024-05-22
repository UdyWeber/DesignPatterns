# Abstract Factory Pattern
Abstract factories are very similar to the factory pattern, the only difference is that you have a factory of factories.
So for each subclass you'll have a factory class that implements the abstract factory interface or abstract class, and a
super class that will have a static method to get a new computer, accepting from the dev a Abstract factory as parameter 
and returning the desired object from the factory class withtin the super class. This pattern seems a little confusing 
at first glance, but it actually allows for another level customization when creating a specific object, mangling its 
attributes in a dedicated class also creating new fields and implementations, removing branching caused by if-else or 
switch blocks like in the original factory pattern.