# Matrix
Calculation of square matrix determinants and Inverse with Java
This program calculates the determinants and inverses of square matrices.

The program consists of 7 methods, three of which are for calculating determinants and the other three are for calculating inverse matrices.
Finally,
the main method in which the first number of rows and columns of the matrix (n) is taken and then based on this number is divided into three parts n=2, n=3 and from three up.

The method for calculating the 2-by-2 determinants is quite clear. For 3 and above,
the method of Kahad and the neighbor is used. Calculate the use of the det2 determinant method.
For 3 and above, you use a four-dimensional four-dimensional array to do this in two sets of nested loops, and then again with two more sets using the det2 method,
you calculate the determinants of these matrices.

For the inverse matrix, a method for n=2, a method for n=3 and a method for more than 3 is the same thing that happens for the calculation or matrix,
which opens in the determinant calculation step for the first level doors for all components.
The main matrix is that this is done using a general loop in the methods of this work,
and finally by destroying the matrix and dividing its doors in the determinants obtained from the methods of determinants, it becomes a contemporary matrix

Examples of matrices for program testing:

10 x 10:

0 0 0 0 3 0 0 2 0 3
3 0 0 1 0 2 0 0 2 1
3 1 0 3 0 0 2 1 4 0
3 0 0 2 0 1 0 3 0 4
3 2 1 1 0 3 0 2 0 1
0 2 0 0 0 3 4 5 2 6
2 0 0 1 0 0 2 4 8 0
0 2 3 1 0 3 0 0 0 0 
3 0 1 2 9 0 0 1 0 0
9 0 0 3 4 1 2 5 0 3

8 x 8:

0 0 0 2 0 0 1 1
1 0 0 2 0 0 3 4
1 2 0 4 0 0 5 0
0 0 1 2 4 4 0 0 
0 0 0 0 1 2 0 5
0 0 2 0 3 5 1 0
1 4 2 0 4 2 1 3
0 0 2 0 0 3 1 4

7 x 7:

0 0 0 2 0 3 9
2 0 0 2 3 1 4
7 9 2 3 0 4 1
0 2 0 0 3 0 1 
9 8 0 0 0 0 1 
1 3 2 4 1 4 5
0 0 1 2 3 4 1

This program is in Java and contains 415 lines of code and almost the total time spent writing it is 25 hours.
