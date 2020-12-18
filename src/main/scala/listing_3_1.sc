sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A] (head: A, tail: List[A]) extends List[A]

//companion object, has same name as the trait (abstract class)
object List{
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x,xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x,xs) => x * product(xs)
  }

  def apply[A](as: A*):List[A] =
    if(as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}

val strings: List[String] = Nil
val doubles: List[Double] = Cons(1, Cons(2.5, Nil))
println(strings.toString)
println(doubles.toString)