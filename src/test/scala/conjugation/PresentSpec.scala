package conjugation

import Conjugation._
import org.scalatest._

class PresentSpec extends FunSpec {

  def testAllPersons(verb: Verb, s1: String, s2: String, s3: String, p1: String, p2: String, p3: String) {
    it("in first person singular") {
      assert(conjugate(verb, FirstSingular) === s1)
    }
    it("in second person singular") {
      assert(conjugate(verb, SecondSingular) === s2)
    }
    it("in third person singular") {
      assert(conjugate(verb, ThirdSingular) === s3)
    }
    it("in first person plural") {
      assert(conjugate(verb, FirstPlural) === p1)
    }
    it("in second person plural") {
      assert(conjugate(verb, SecondPlural) === p2)
    }
    it("in third person plural") {
      assert(conjugate(verb, ThirdPlural) === p3)
    }
  }

  describe("Regular -ar verbs") {
    testAllPersons(Verb("tom"), "tomo", "tomas", "toma", "tomamos", "tomáis", "toman")
  }

  /*
    describe("Regular -er verbs") {
      testAllPersons("como", "comes", "come", "comemos", "coméis", "comen")
    }
  */

}