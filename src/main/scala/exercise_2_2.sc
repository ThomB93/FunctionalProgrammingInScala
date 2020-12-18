def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  def loop(n: Int) : Boolean = {
    if(n >= as.length-1) true
    else if(ordered(as(n), as(n+1))) false
    else loop(n+1)
  }
  loop(0)
}

val mySortedArray = Array(2,1,1,1,1)
isSorted(mySortedArray, (a: Int, b: Int) => a < b)
//we check for the negative case in each iteration of the loop, if it becomes true, we return false