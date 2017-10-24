package conjugation

trait Verb {
  def toInfinitive: String
  def toPresent(n: Number, p: Person): String
  def conjugate(n: Number, p: Person, t: Tense): String
}

trait RegularVerb extends Verb {
  def stem: String
  def suffixPresent(n: Number, p: Person): String
  def toPresent(n: Number, p: Person) = (if (n == SINGULAR && p == FIRST) stem.replaceFirst("g$", "j").replaceFirst("gu$", "g").replaceFirst("c$", "z") else stem) + suffixPresent(n, p)
  def conjugate(n: Number, p: Person, t: Tense) = t match {
    case Present => (if (n == SINGULAR && p == FIRST) stem.replaceFirst ("g$", "j").replaceFirst ("gu$", "g").replaceFirst ("c$", "z") else stem) + suffixPresent (n, p)
    case PresentProgressive => Vocabulary.ESTAR.conjugate(n, p, Present) + " " + gerund
  }
  def gerund: String
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
  def gerund = stem + "ando"
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
  def gerund = stem + "iendo"
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
  def gerund = stem + "iendo"
}

class StressedIrregularStem(val verb: RegularVerb, val irregularStem: String) extends Verb {
  def toInfinitive = verb.toInfinitive
  def toPresent(n: Number, p: Person): String = (n, p) match {
    case (SINGULAR, FIRST) => irregularStem + verb.suffixPresent(n, p)
    case (SINGULAR, SECOND) => irregularStem + verb.suffixPresent(n, p)
    case (SINGULAR, THIRD) => irregularStem + verb.suffixPresent(n, p)
    case (PLURAL, FIRST) => verb.stem + verb.suffixPresent(n, p)
    case (PLURAL, SECOND) => verb.stem + verb.suffixPresent(n, p)
    case (PLURAL, THIRD) => irregularStem + verb.suffixPresent(n, p)
  }
  override def conjugate(n: Number, p: Person, t: Tense) = t match {
    case Present => toPresent(n, p)
    case PresentProgressive => verb.conjugate(n, p, t)
  }
}
class Diphthongized(override val verb: RegularVerb, val diphthongizedStem: String) extends StressedIrregularStem(verb, diphthongizedStem) {}
class StressedIrregularArVerb(val regularStem: String, override val irregularStem: String) extends StressedIrregularStem(new ArVerb(regularStem), irregularStem) {}

class IrregularVerb(val infinitive: String, val present: Persons) extends Verb {
  def toInfinitive = infinitive
  def toPresent(n: Number, p: Person) = (n, p) match {
    case (SINGULAR, FIRST) => present.s1
    case (SINGULAR, SECOND) => present.s2
    case (SINGULAR, THIRD) => present.s3
    case (PLURAL, FIRST) => present.p1
    case (PLURAL, SECOND) => present.p2
    case (PLURAL, THIRD) => present.p3
  }
  override def conjugate(n: Number, p: Person, t: Tense) = t match {
    case Present => toPresent(n, p)
    case PresentProgressive => throw new RuntimeException
  }
}
