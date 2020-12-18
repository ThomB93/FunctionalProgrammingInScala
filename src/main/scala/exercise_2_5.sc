def compose[A,B,C](f: B => C, g: A => B): A => C = {
  a: A => f(g(a))
}

val add=(a: Int)=> {
  a + 1
}

val mul=(a: Int)=> {
  a * 2
}

compose(add, mul)(2)

//the value a of type A is our initial parameter (2)
//the parameter is first applied to the function g (mul)
//the return value of the g is then passed to the function f (add)
//we pass a of type A to the return function of compose
