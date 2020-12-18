def findFirst(ss: Array[String], key: String): Int = {
  @annotation.tailrec
  def loop(n: Int): Int = {
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n+1)
  }
  loop(0)
}
//findFirst will return the index of the first element in the string array ss that matches the key string
val myArray = Array("Hello", "Cruel", "World")
findFirst(myArray, "Cruel")