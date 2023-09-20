# Open Closed Principle
This principle states that “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification” which means we should be able to extend a class behavior, without modifying it

So what this principle wants to say is: We should be able to add new functionality without touching the existing code for the class. This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching the tested and reliable (mostly) production code if possible.