import math.{ sqrt, pow }
case class Point(a:Int, b:Int) {
  def x: Int = a
  def y: Int = b

  override def toString = "(" +x + "," +y + ")"
  def add (p:Point)= Point (x+p.x,y+p.y)

  def move (dx:Int, dy:Int)= Point(x+dx,y+dy)

  def distance (other: Point) : Double =
    sqrt(pow(x-other.x,2)+pow(y-other.y,2))

  def invert = new Point (y,x)

}
case object Point extends App{
  val p1 = Point(1,2)
  val p2 = Point(4,5)
  println(p1.add(p2))
  println(p1.move(5,5))
  println(p1.distance(p2))
  println(p1.invert)
}
