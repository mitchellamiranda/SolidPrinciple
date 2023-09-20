# Single Responsibility Principle
This principle states that “a class should have only one reason to change” which means every class should have a single responsibility, job or purpose.

Why is following the Single Responsibility so important?
* It is important because, many different teams can work on the same project and edit the same class for different reasons, which could lead to incompatible modules.

* Second, it makes version control easier. For example, say we have a persistence class that handles database operations, and we see a change in that file in the commits. By following the SRP, we will know that it is related to storage or database-related stuff.

* Merge conflicts are another example. They appear when different teams change the same file. But if the SRP is followed, fewer conflicts will appear – files will have a single reason to change, and conflicts that do exist will be easier to resolve.