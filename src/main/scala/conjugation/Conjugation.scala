package conjugation

object Conjugation {

  sealed trait Person
  case object FirstSingular extends Person
  case object SecondSingular extends Person
  case object ThirdSingular extends Person
  case object FirstPlural extends Person
  case object SecondPlural extends Person
  case object ThirdPlural extends Person

  trait Classification
  case object RegularAr extends Classification

  case class Verb(stem: String, classification: Classification = RegularAr)

  def conjugate(verb: Verb, person: Person) = person match {
    case FirstSingular => verb.stem + "o"
    case SecondSingular => verb.stem + "as"
    case ThirdSingular => verb.stem + "a"
    case FirstPlural => verb.stem + "amos"
    case SecondPlural => verb.stem + "áis"
    case ThirdPlural => verb.stem + "an"
  }

}
