def partial1[A,B,C] (a: A, f: (A,B) => C): B => C = (b: B) => f(a,b)
def partial1[A,B,C] (a: A, f: (A,B) => C): B => C = b => f(a,b)

// partial1 takes in 2 arguments, a value a of type A and a function f that takes in 2 arguments and returns a value of type C
// the return type of partial1 is another function that takes in a value of type B as a parameter and returns a value of type C
// since we already know A, and the function f needs both A and B to return C, we return a function that only accepts B in order to return C
//the inner functions know about the outer function. It closes over it (closures)


