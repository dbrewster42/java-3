1. Open Intellij

2. Create a class called NameCleanerList with the following features:

Allows user to add individual names to the list
Accepts multiple lambdas that will transform a string
When a name is added, execute the lambdas, in the order they were added
Accepts a lambda that performs sorting (with an existing, default alphabetic sort algorithm if a custom one isn't provided)
Returns a sorted list
3. Create an instance of the NameCleanerList, and add a few different transform lambdas, such as:

Change "firstname lastname" to "lastname, firstname"
Capitalize the first letter of the first and last names
Make everything but the first letter lowercase
If the last name starts with "Mc", capitalize the third letter
Other transforms, at your discretion
4. Add multiple names to the list, so that each transform will be used at least once

5. Run the method to retrieve the sorted list, once for the default sorter, and with at least one custom sorter

6. Use a regular expression in at least one transform, and one sorter