# Factory Pattern
- Widely used in the JDK and frameworks such as Spring.
- Is used when we have a super-class with multiple subclasses.
- The supre-class is responsible for instanciating all it's subclasses.
- The super-class can be a normal class, an abstract class or an interface.

## Implementation
We have to first create our abstract object to be the base of our implementation, then we have to extend the base object
in subclasses in order to have more of itself, and then we have to create the factory class, that will take as argument
the name of the subclass and the factory will retrieve with a supreclass instance.
