# Singly Linked List
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->
Create singly linked list with three methods.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
###Big O:
Firstly, I wrote the methods with int.
Then, I changed to accept Object, and modified some of the methods ie == has to be .equals.
I included a size property, so I could include it in test, and a few getters.
I had to write a constructor, vs using default, so I could refresh size to 0 every time a new linked list
is instantiated (which is what I want, instead of a shared size for all instances created).

**insert** time O(1) - constant amount steps, impervious to data size; 
space O(1) - one new node created each time;

**includes** time O(N) worst-case : has to search until the end of the linked list;
space O(1) - no additional data structures used.

**print()** time and space are O(N) : iterates through list one time, every time, and uses
additional data structure with N elements (array list).

## API
    *Insert()*
     Takes any value as an argument
     and adds a new node with that value
     to the head of the list with an O(1) Time performance
     @param data int value to insert in new node
     
    *Includes(searchValue)*
     Takes any value as an argument
     and returns a boolean result depending
     on whether that value exists
     as a Node’s value somewhere within the list.
     @param searchValue int to search for
     @return boolean true if value is found, else false
     
    *print()*
     Takes in no arguments
     and returns an ArrayList
     of the current Node values in the Linked List.
     @return list of all values in linked list
