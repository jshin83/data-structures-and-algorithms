# Stacks and Queues
<!-- Short summary or background information -->
Implemented Stack and Queue.

## Challenge
<!-- Description of the challenge -->
Stack and Queue structures.
Stack supports FIFO.

Queue supports FILO.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
#### Stack
Has a top tracker, as elements are put in as top of the stack, and pulled off from top of 
the stack.

**O(1) time** to push, pop, peek; constant number of steps, impervious to amount of data.

**O(1) space** constant number of variables used, impervious to amount of data.

#### Queue
Has front and back trackers.
Elements are put in back of line, removed from front of line.

**O(1) time** to enqueue, dequeue, peek; constant number of steps,
impervious to amount of data.

**O(1) space** constant number of variables used, impervious to amount of data.

## API
#### Stack
**`push(value)`**
Adds a node to front of list.

**`pop()`**
Removes first Node and returns data.

**`peek()`**
Loods at the top of the list and returns data of first Node in list.

getters for private properties of instance

#### Queue
**`enqueue(value)`**
Adds a node to end of list.

**`dequeue()`**
Removes a node from end of list and returns its value.

**`peek()`**
Looks at the front of list and return value of first Node.