# BinaryCalculator

Design and implement an application that evaluates an arithmetic expression using a binary tree.  
Include support for integer operands and the operators +,-,* ,and %.  First build an expression 
tree from a given expression.

Start at the root of the tree.  
Let current be the current node. 
If current is an integer, return its value. 

Otherwise,
- recurse on current’s  left child to get the left operand and the right child to get the right 
  operand..  

- perform the operation indicated by the node current on the left and right operand s and return 
  the result.  
