# Generator hasła - simple command line app to make **new password**! 
(i do not recommend it though, it will take some time for me to implement algorithms, to actually make a decent password 😁)
## Table of contents
* [General information](#general-information)
* [Updates](#updates)
* [Technologies](#technologies)
* [Setup](#setup)

## General information
It is one of my first projects in Java, I started 3 weeks ago, but I have already had some experience in programming (I was writing code in Python for 2 months).
This project was mainly done, because of my need to learn how to implement classes. 

## Updates
I am planning to add some more usability, some exceptions to methods inside of PasswordOptions class, but that is all for now.
### Version 1.0 
Implemented options for password details, such as: 
* Symbols,
* Upper case letters,
* Lower case letters,
* Numbers,
* Password lenght
### Version 1.1
#### Implemented error handling: 
* In makePasswordLength() method, user now cannot make a password with less than 4 and more than 22 signs and cannot write letters.
* Program will not accept empty ArrayList, it will demand a new parameters for password or User can quit program.\
#### Created methods, that got rid of extra useless code for example: choice(), pauseLine()

## Technologies
#### Language: Java,
#### JDK: 19 Oracle OpenJDK version 19

## Setup
Simply download 3 classes from src file and run code on your IDE. 
