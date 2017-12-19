# Kotlin-udemy
Repo for the kotlin course from Udemy

## Before starting

Install the following

- Java JDK
- IntelliJ IDEA
- Kotlin library

## Chapter 1.

In IntelliJ there is a playground to test your Kotlin code. It's called Kotlin REPL (Command line compiler)

To open this playground go to:
tools -> kotlin -> kotlin REPL

We can run the compiler without parameters to have an interactive shell. We can type any valid Kotlin code and see the results. An example:

var kotlin = "kotlin rocks!"
kotlin (command + enter) will output the string.

### Variables

There are two ways to store values.

- var
- val

Variables created using val are immutable, meaning that they cannot be reassigned a different value after their first assignment.

val name = "peter"
name = "patrick"
error: val cannot be reassigned

### Primitive types

Kotlin will determine the data type by itself. 

val b = 4

b will be an int even though it might be a Byte. To store values explicitly we do the following

val b: Byte = 4

Now b will be stored as a value with data type Byte.
To cast certain types to each other we need to use a method on the value. 

var float2: Float = 3.4f
var double2: Double = 0.0

double2 = float2
error: type mismatch: inferred type is Float but Double was expected

To make this work:

double2 = float2.toDouble()

double2 - 3.4000000953674316

As you see float is not that precise as double is. So this could be dangerous.

More information here: https://kotlinlang.org/docs/reference/basic-types.html

### Expression vs Statements

The main difference is that expressions do have a value and statements don't

"Expression" -> this return a String value

val statement = "statement" -> this returns nothing, it assigns

### Nullable

It's not possible to reference null value in kotlin.

To create a nullable value our self we need to add a questionmark

var string: String? = null

To perform a method on a nullable value we also need to add a questionmark

string?.length

To enforce kotlin to run nullable code

string!!.length -> the only way to get a nullpointer exception

More information here: https://kotlinlang.org/docs/reference/null-safety.html

## Chapter 2.
Code for this chapter is in package chapter_2. 

### Conditional Statements

if-statements and when-statements are useful but you can also use them as expressions. Just retrieve a val of it and make sure every flow has an expression at the end.

More information here: https://kotlinlang.org/docs/reference/control-flow.html

## Chapter 3.
Code for this chapter is in package chapter_3.

### Array vs List

use Array if you know how many elements you need in advance and it is not going to change.
use List when you want to add or remove elements in the array.

More information here: https://kotlinlang.org/docs/reference/collections.html

## Chapter 4.
Code for this chapter is in package chapter_4.

### Loops

You have two kind of loops:

- For loop
- While loop

Use while loop when you don't know how many iterations you should make. Otherwise use the for loop.

More information here: https://kotlinlang.org/docs/reference/control-flow.html

### Returns

This allows jumps in the codes.

break is used when you don't want to loop when you met your condition.
continue is used when you want to skip certain values. Like a list of users and only work with users with an condition.
return by default returns from the nearest enclosing function or anonymous function.

naming loops is handy for nested loops.

More information here: https://kotlinlang.org/docs/reference/returns.html

## Chapter 5.

Code for this chapter is in package chapter_5.

More information here: https://kotlinlang.org/docs/reference/coding-conventions.html

## Chapter 6.

Code for this chapter is in package chapter_6.

### Functions

Functions in Kotlin are declared using the fun keyword
A function can hold parameters and return values.

More information here: https://kotlinlang.org/docs/reference/functions.html

## Chapter 7.

Code for this chapter is in package chapter_7.

### Classes
A class is a blueprint for objects.

- Properties are the data of a class
- Method are the functionality in the class

### Parameters

Naming parameters helps us to understand wat each value in the constructors and functions mean.
Default values allow us to do overloading of constructors and functions in a very concise way.

### Inheritance

If you don't specify the keyword "open" in front of the class/property/functions, then it wont be possible to inherent them.

### Abstract

Abstract classes are used to encapsulate similarities between different classes and gather them all in one place to avoid code duplication.

For abstract classes you don't need to specify "open" anymore.
You cannot make an instance of a abstract class. It's usually used as a parent class for inheritance.
You can also abstract functions to enforce the child classes to override the function.

Abstract is enforcing you to make child classes, because you are unable to create to instantiate an abstract class.
Open classes can be instantiated.

More information here: https://kotlinlang.org/docs/reference/classes.html

### Interfaces

Interfaces define a contract that different classes may choose to follow. 
To do that, they have to override each method and property defined in the interface.

We can implement multiple interfaces, whereas we can have only one parent class.

Everything inside an interface is implicitly abstract.

More information here: https://kotlinlang.org/docs/reference/interfaces.html

## Chapter 8.

Code for this chapter is in package chapter_8.

### Data classes

We frequently create classes whose main purpose is to hold data. 
In such a class some standard functionality and utility functions are often mechanically derivable from the data.
In Kotlin, this is called a data class and is marked as data

More information here: https://kotlinlang.org/docs/reference/data-classes.html

### Objects/Singleton

This is called an object declaration, and it always has a name following the object keyword. 
Just like a variable declaration, an object declaration is not an expression, and cannot be used on the right hand side of an assignment statement.

More information here: https://kotlinlang.org/docs/reference/object-declarations.html

### Enum

The most basic usage of enum classes is implementing type-safe enums
Each enum constant is an object. Enum constants are separated with commas.

More information here: https://kotlinlang.org/docs/reference/enum-classes.html

## Chapter 9.

Code for this chapter is in package chapter_9.

### Binary and Hexadecimal numbers

- Decimals 
    - 0..9
- Hexadecimals
    - 0..9
    - A..F
    - prefix 0x
- Binary
    - 0..1
    - prefix 0b
    
## Chapter 10.

Code for this chapter is in package chapter_10.

### Access modifiers

In kotlin you have the following access modifiers:

- private
- protected
- internal
- public

More information here: 

- https://kotlinlang.org/docs/reference/properties.html
- https://kotlinlang.org/docs/reference/visibility-modifiers.html

### Generics



More information here: 