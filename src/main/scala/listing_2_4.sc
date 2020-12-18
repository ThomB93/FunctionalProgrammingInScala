def findFirst[A] (as: Array[A], p: A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int = {
    if(n>= as.length) -1
    else if (p(as(n))) n
    else loop(n+1)
  }
  loop(0)
}
//function findFirst takes a type A as a parameter and a function, which will be used to perform the equality check
//p must return a boolean since it determines whether the n element matches the key
