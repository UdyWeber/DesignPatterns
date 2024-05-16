# Singletons
- The singleton pattern is designed to keep the instantion of objects of a single class reduced to >> ONE << instance.
- Aims to have a global access point to a class instance
- Is used widely for loggin, chaching and thread pooling.
- Singletons are used also to compose another design patterns such as `Abstract Factories`, `Builders`, `Prototypes`and `Facades`.

## Eager Initialization Singleton
The eager initialization singleton is created at class loading time, the drawback on using this style of singleton is 
that you can have it instanciated even if you're not using the class, and you don't have any chance to exception handling.
In cenarios where your class don't use a lot of resources, you could certanly use this pattern, although is not commonly 
seen on industry standarts for singleton patterns.

## Static Block Singleton
The Static Block Singleton is very similar to the Eager Initialization one, actually it covers one of the weaknecess of 
the Eager Initialization Singleton, it gives you an oportunity to error handling by writting a try catch statement on 
the static block. 

## Lazy Initialization Singleton
The Lazy Initialization Singleton is the one commonly used for single threaded environment, that I've personaly seen on
lots of aplications. The idea behind it is to only instanciate the instance of the class when the `getInstance()` static
method is called, enabling you to only use resources when the time comes to that. This method although very popular, doesn't work fine in multithreaded environments, because if multiple threads try to instanciate the singleton at once
you'll still have multiple instances of the class.

## Thread Safe Singleton
To create a Thread Safe Singleton, you just have to wrap the instanciation of the class on a syncronized statement, and 
make a double-checking if one outside the syncronized block and one inside block, to guarantee that all thread acessing 
the block at the same time will not have separated instances of the class. Well this pattern also have some drawbacks 
this method can fail when you have a lot of threads calling it at once, also this method is very performance intensive, 
because the syncronized keyword has to deal with all locking and unlocking of the block of code.

## Bill Pugh Singleton
This Patter was created by Bill Pugh to deal with the Thread Safe fails when syncronizing and to reduce the performance 
cost of the class utilization. It consists of creating an inner private class holding the static instance of the outer 
class, since the inner class  is just loaded when it is called by the outer class, ensuring thread safe mechanism by 
class loading abuse, so when the method is called for the first time, the inner class is loaded into memory, and being 
acessed by the other ones. This patter is one of the most used patterns when it comes to Singletons.
