package conjugation

trait Verb {
  def toInfinitive: String
  def toPresent(n: Number, p: Person): String
}

trait RegularVerb extends Verb {
  def stem: String
  def suffixPresent(n: Number, p: Person): String
  def toPresent(n: Number, p: Person) = (if (n == SINGULAR && p == FIRST) stem.replaceFirst("g$", "j").replaceFirst("gu$", "g").replaceFirst("c$", "z") else stem) + suffixPresent(n, p)
}

class ArVerb(val stem: String) extends RegularVerb {
  def toInfinitive = stem + "ar"
  def suffixPresent(n: Number, p: Person): String = (n, p) match {
    case (SINGULAR, FIRST) => "o"
    case (SINGULAR, SECOND) => "as"
    case (SINGULAR, THIRD) => "a"
    case (PLURAL, FIRST) => "amos"
    case (PLURAL, SECOND) => "áis"
    case (PLURAL, THIRD) => "an"
  }
}

class ErVerb(val stem: String) extends RegularVerb {
  def toInfinitive = stem + "er"
  def suffixPresent(n: Number, p: Person): String = (n, p) match {
    case (SINGULAR, FIRST) => "o"
    case (SINGULAR, SECOND) => "es"
    case (SINGULAR, THIRD) => "e"
    case (PLURAL, FIRST) => "emos"
    case (PLURAL, SECOND) => "éis"
    case (PLURAL, THIRD) => "en"
  }
}

class IrVerb(val stem: String) extends RegularVerb {
  def toInfinitive = stem + "ir"
  def suffixPresent(n: Number, p: Person): String = (n, p) match {
    case (SINGULAR, FIRST) => "o"
    case (SINGULAR, SECOND) => "es"
    case (SINGULAR, THIRD) => "e"
    case (PLURAL, FIRST) => "imos"
    case (PLURAL, SECOND) => "ís"
    case (PLURAL, THIRD) => "en"
  }
}
/*
class Diphthongized(val verb: RegularVerb, val diphthongizedStem: String) extends Verb {
  def toInfinitive = verb.toInfinitive
  def toPresent =
}
*/