package conjugation

import conjugation.Vocabulary._
import org.scalatest._

class PresentProgressiveSpec extends ConjugationSpec {

  def testAllPersons = testAllPersonsForTense(PresentProgressive) _

  describe("Regular -ar verbs") {
    testAllPersons(HABLAR, "estoy hablando", "estás hablando", "está hablando", "estamos hablando", "estáis hablando", "están hablando")
  }

  describe("Regular -er verbs") {
    testAllPersons(COMER, "estoy comiendo", "estás comiendo", "está comiendo", "estamos comiendo", "estáis comiendo", "están comiendo")
  }

  describe("Regular -ir verbs") {
    testAllPersons(ESCRIBIR, "estoy escribiendo", "estás escribiendo", "está escribiendo", "estamos escribiendo", "estáis escribiendo", "están escribiendo")
  }

}