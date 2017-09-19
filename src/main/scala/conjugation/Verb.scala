package conjugation

trait Verb {
  def toInfinitive: String
  def toPresent: Persons
}

trait IrregularFirstPersonSingular {
  def toPresent1S(stem: String): String = stem.replaceFirst("g$", "j").replaceFirst("gu$", "g").replaceFirst("c$", "z") + "o"
}

class ArVerb(val stem: String) extends Verb with IrregularFirstPersonSingular {
  def toInfinitive = stem + "ar"
  def toPresent = Persons(toPresent1S(stem), stem + "as", stem + "a", stem + "amos", stem + "áis", stem + "an")
}

class ErVerb(val stem: String) extends Verb with IrregularFirstPersonSingular {
  def toInfinitive = stem + "er"
  def toPresent = Persons(toPresent1S(stem), stem + "es", stem + "e", stem + "emos", stem + "éis", stem + "en")
}

class IrVerb(val stem: String) extends Verb with IrregularFirstPersonSingular {
  def toInfinitive = stem + "ir"
  def toPresent = Persons(toPresent1S(stem), stem + "es", stem + "e", stem + "imos", stem + "ís", stem + "en")
}
