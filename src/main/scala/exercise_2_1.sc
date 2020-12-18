def fib(n: Int): Int = {
  def go(n: Int, a: Int, b: Int): Int = {
    if(n <= 1) b
    else {
      go(n-1, b, a+b)
    }
  }
  go(n, 0, 1) //the last statement in the fib function is a call to go
}

fib(8)

//fibonacci sequence using tail recursion