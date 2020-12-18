val x = List(1,2,3,4,5) match {
  case List(x, List(2, List(4, _))) => x
  case Nil => 42
  case List(x, List(y, List(3, List(4, _)))) => x + y
  case List(h, t) => h + t
  case _ => 101
}

//the matching result will be 3
println(x)