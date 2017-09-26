package conjugation

case class Persons(val s1: String, val s2: String, val s3: String, val p1: String, val p2: String, val p3: String) {}

sealed trait Person
case object FIRST extends Person
case object SECOND extends Person
case object THIRD extends Person

sealed trait Number
case object SINGULAR extends Number
case object PLURAL extends Number

object Persons {
  val S1 = (FIRST, SINGULAR)
}