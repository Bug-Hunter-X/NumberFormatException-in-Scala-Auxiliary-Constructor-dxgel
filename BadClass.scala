```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val obj = new MyClass()
println(obj.x) //prints 0

class AnotherClass(val x: Int) {
  def this(s: String) = this(s.length)
}

val obj2 = new AnotherClass("hello")
println(obj2.x) //prints 5

class BadClass(val x: Int) {
  def this(s: String) = this(s.toInt) //this can throw NumberFormatException
}

val obj3 = new BadClass("hello") //this will throw NumberFormatException
println(obj3.x) 
```