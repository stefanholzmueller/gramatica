package conjugation

import org.scalatest.FunSpec

trait ConjugationSpec extends FunSpec {

  def toPersons(verb: Verb, tense: Tense) = Persons(
    verb.conjugate(SINGULAR, FIRST, tense),
    verb.conjugate(SINGULAR, SECOND, tense),
    verb.conjugate(SINGULAR, THIRD, tense),
    verb.conjugate(PLURAL, FIRST, tense),
    verb.conjugate(PLURAL, SECOND, tense),
    verb.conjugate(PLURAL, THIRD, tense)
  )

  def testAllPersonsForTense(tense: Tense)(verb: Verb, s1: String, s2: String, s3: String, p1: String, p2: String, p3: String) {
    it("in first person singular") {
      assert(toPersons(verb, tense).s1 === s1)
    }
    it("in second person singular") {
      assert(toPersons(verb, tense).s2 === s2)
    }
    it("in third person singular") {
      assert(toPersons(verb, tense).s3 === s3)
    }
    it("in first person plural") {
      assert(toPersons(verb, tense).p1 === p1)
    }
    it("in second person plural") {
      assert(toPersons(verb, tense).p2 === p2)
    }
    it("in third person plural") {
      assert(toPersons(verb, tense).p3 === p3)
    }
  }

}
