# Liskov Substitution Principle
This principle states that “Derived or child classes must be substitutable for their base or parent classes”. In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.

This is the expected behavior, because when we use inheritance we assume that the child class inherits everything that the superclass has. The child class extends the behavior but never narrows it down.

Therefore, when a class does not obey this principle, it leads to some nasty bugs that are hard to detect.

Liskov's principle is easy to understand but hard to detect in code.