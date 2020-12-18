def curry[A,B,C] (f: (A,B) => C): A => (B => C) = {
  (a: A) => ((b: B) => f(a, b))
}

def add(x: Int, y: Int) = x + y
val curried = curry(add)
curried(2)(3)
//we can pass a function like add to the curry function, for the function to be split