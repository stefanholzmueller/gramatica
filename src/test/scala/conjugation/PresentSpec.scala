package conjugation

import conjugation.Vocabulary._
import org.scalatest._

class PresentSpec extends ConjugationSpec {

  def testAllPersons = testAllPersonsForTense(Present) _

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

  describe("cerrar diphtongized") {
    testAllPersons(CERRAR, "cierro", "cierras", "cierra", "cerramos", "cerráis", "cierran")
    assert(CERRAR.toInfinitive === "cerrar")
  }

  describe("querer diphtongized") {
    testAllPersons(QUERER, "quiero", "quieres", "quiere", "queremos", "queréis", "quieren")
    assert(QUERER.toInfinitive === "querer")
  }

  describe("preferir diphtongized") {
    testAllPersons(PREFERIR, "prefiero", "prefieres", "prefiere", "preferimos", "preferís", "prefieren")
    assert(PREFERIR.toInfinitive === "preferir")
  }

  describe("adquirir diphtongized") {
    testAllPersons(ADQUIRIR, "adquiero", "adquieres", "adquiere", "adquirimos", "adquirís", "adquieren")
    assert(ADQUIRIR.toInfinitive === "adquirir")
  }

  describe("contar diphtongized") {
    testAllPersons(CONTAR, "cuento", "cuentas", "cuenta", "contamos", "contáis", "cuentan")
    assert(CONTAR.toInfinitive === "contar")
  }

  describe("poder diphtongized") {
    testAllPersons(PODER, "puedo", "puedes", "puede", "podemos", "podéis", "pueden")
    assert(PODER.toInfinitive === "poder")
  }

  describe("dormir diphtongized") {
    testAllPersons(DORMIR, "duermo", "duermes", "duerme", "dormimos", "dormís", "duermen")
    assert(DORMIR.toInfinitive === "dormir")
  }

  describe("jugar diphtongized") {
    testAllPersons(JUGAR, "juego", "juegas", "juega", "jugamos", "jugáis", "juegan")
    assert(JUGAR.toInfinitive === "jugar")
  }

  describe("servir diphtongized") {
    testAllPersons(SERVIR, "sirvo", "sirves", "sirve", "servimos", "servís", "sirven")
    assert(SERVIR.toInfinitive === "servir")
  }

  describe("cambiar is regular") {
    testAllPersons(CAMBIAR, "cambio", "cambias", "cambia", "cambiamos", "cambiáis", "cambian")
    assert(CAMBIAR.toInfinitive === "cambiar")
  }

  describe("evacuar is regular") {
    testAllPersons(EVACUAR, "evacuo", "evacuas", "evacua", "evacuamos", "evacuáis", "evacuan")
    assert(EVACUAR.toInfinitive === "evacuar")
  }

  describe("enviar has irregular stressed stem") {
    testAllPersons(ENVIAR, "envío", "envías", "envía", "enviamos", "enviáis", "envían")
    assert(ENVIAR.toInfinitive === "enviar")
  }

  describe("continuar has irregular stressed stem") {
    testAllPersons(CONTINUAR, "continúo", "continúas", "continúa", "continuamos", "continuáis", "continúan")
    assert(CONTINUAR.toInfinitive === "continuar")
  }

  describe("ser is irregular") {
    testAllPersons(SER, "soy", "eres", "es", "somos", "sois", "son")
    assert(SER.toInfinitive === "ser")
  }

  describe("estar is irregular") {
    testAllPersons(ESTAR, "estoy", "estás", "está", "estamos", "estáis", "están")
    assert(ESTAR.toInfinitive === "estar")
  }

  describe("ir is irregular") {
    testAllPersons(IR, "voy", "vas", "va", "vamos", "vais", "van")
    assert(IR.toInfinitive === "ir")
  }

}