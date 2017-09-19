package conjugation

trait Verb {
  def toInfinitive: String
  def toPresent: Persons
}

class RegularArVerb(val stem: String) extends Verb {

  def toInfinitive: String = stem + "ar"

  def toPresent: Persons = {
    Persons(stem + "o", stem + "as", stem + "a", stem + "amos", stem + "áis", stem + "an")
  }

}

class RegularErVerb(val stem: String) extends Verb {

  def toInfinitive: String = stem + "er"

  def toPresent: Persons = {
    Persons(stem + "o", stem + "es", stem + "e", stem + "emos", stem + "éis", stem + "en")
  }

}

class IrregularFirstPersonSingularErVerb(override val stem: String) extends RegularErVerb(stem) {

  override def toPresent: Persons = {
    val regularPersons = super.toPresent
    val newLastLetter = stem.last match {
      case 'c' => 'z'
      case 'g' => 'j'
      case x => x
    }
    val firstPersonSingular = stem.init + newLastLetter + "o"
    regularPersons.copy(s1 = firstPersonSingular)
  }

}

