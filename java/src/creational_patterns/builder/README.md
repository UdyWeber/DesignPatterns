# Builder Pattern
Builder pattern is a fancy way to compound the final object in a readable manner, it was design to solve major issues 
when creating object using Factories or Abstract factories, in cases that the object had lots of attributes.  

- The first problem relates to the order of the attributes being passed, in the client code it was very hard to keep the
promise of sending all the right attributes in the right order

- The second problem is given due to optional parameters, in case of optional parameters you were forced to send them as
`null` to the factory, leading to smelly code.

- The third issue is the complexity over on single factory, if the object to be created was very complex and full of 
rules, the factory code would be huge and much more complex than it needed to be.

## Implementation
First we create a Java class that represent our final object to be created and let it constructor private, inside of 
that object we create a static class called OurClassNameBuilder and give it the same parameters as our Object class, 
then we create setter methods for the builder class and a method build, that when called creates an Object class from 
our builder options.