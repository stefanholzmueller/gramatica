package conjugation

import conjugation.Vocabulary._
import org.scalatest._

class PresentSpec extends FunSpec {

  def testAllPersons(verb: Verb, s1: String, s2: String, s3: String, p1: String, p2: String, p3: String) {
    it("in first person singular") {
      assert(verb.toPresent.s1 === s1)
    }
    it("in second person singular") {
      assert(verb.toPresent.s2 === s2)
    }
    it("in third person singular") {
      assert(verb.toPresent.s3 === s3)
    }
    it("in first person plural") {
      assert(verb.toPresent.p1 === p1)
    }
    it("in second person plural") {
      assert(verb.toPresent.p2 === p2)
    }
    it("in third person plural") {
      assert(verb.toPresent.p3 === p3)
    }
  }

  describe("Regular -ar verbs") {
    testAllPersons(TOMAR, "tomo", "tomas", "toma", "tomamos", "tomáis", "toman")
    assert(TOMAR.toInfinitive === "tomar")
  }

  describe("Regular -er verbs") {
    testAllPersons(COMER, "como", "comes", "come", "comemos", "coméis", "comen")
    assert(COMER.toInfinitive === "comer")
  }

  describe("acoger g->j in first person singular") {
    testAllPersons(ACOGER, "acojo", "acoges", "acoge", "acogemos", "acogéis", "acogen")
    assert(ACOGER.toInfinitive === "acoger")
  }

  describe("vencer c->z in first person singular") {
    testAllPersons(VENCER, "venzo", "vences", "vence", "vencemos", "vencéis", "vencen")
    assert(VENCER.toInfinitive === "vencer")
  }

  describe("Regular -ir verbs") {
    testAllPersons(ESCRIBIR, "escribo", "escribes", "escribe", "escribimos", "escribís", "escriben")
    assert(ESCRIBIR.toInfinitive === "escribir")
  }

  describe("distinguir gu->g in first person singular") {
    testAllPersons(DISTINGUIR, "distingo", "distingues", "distingue", "distinguimos", "distinguís", "distinguen")
    assert(DISTINGUIR.toInfinitive === "distinguir")
  }

  describe("fingir g->j in first person singular") {
    testAllPersons(FINGIR, "finjo", "finges", "finge", "fingimos", "fingís", "fingen")
    assert(FINGIR.toInfinitive === "fingir")
  }

}