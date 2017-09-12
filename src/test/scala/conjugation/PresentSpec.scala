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
  }

  /*
    describe("Regular -er verbs") {
      testAllPersons("como", "comes", "come", "comemos", "coméis", "comen")
    }
  */

}