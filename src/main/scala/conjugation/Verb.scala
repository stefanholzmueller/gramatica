package conjugation

abstract class Verb {
  def toInfinitive: String
  def toPresent: Persons
}

class RegularArVerb(val stem: String) extends Verb {

  def toInfinitive: String = stem + "ar"

  def toPresent: Persons = {
    Persons(stem + "o", stem + "as", stem + "a", stem + "amos", stem + "áis", stem + "an")
  }

}
