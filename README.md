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




