# Trees
<!-- Short summary or background information -->
#### Binary Tree and Binary Search Tree (BST)
## Challenge
<!-- Description of the challenge -->
Implement Tree and Binary Search Tree.
Used generic data type.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Used generics.
Tree is parent class.
BST extends from Tree.
FizzBuzzTree extends from BST.

Tree class traversals:
inorder, 
preorder,
postorder

**`add(value)`**
Time O(logN) - chooses subtree based on value comparison.
Space O(1)

**`contains(value)`**

Time O(logN) - chooses subtree based on value comparison.
Space O(1)

**`fizzbuzztree(Tree)`**

Time O(N) - must evaluate each Node data.
Space O(1) - in-place change so no extra data structures are used.

![code](../401-code-challenges/assets/fizzbuzz.jpg)

## API
#### Tree
**`contains(value)`**

#### BST
**`contains(value)`**

#### FizzBuzzTree
**`fizzbuzztree(Tree)`**
