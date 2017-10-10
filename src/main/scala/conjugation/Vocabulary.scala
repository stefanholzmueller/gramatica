package conjugation

object Vocabulary {
  val FUMAR = new ArVerb("fum")
  val TOMAR = new ArVerb("tom")
  val COMER = new ErVerb("com")
  val ACOGER = new ErVerb("acog")
  val VENCER = new ErVerb("venc")
  val ESCRIBIR = new IrVerb("escrib")
  val DISTINGUIR = new IrVerb("distingu")
  val FINGIR = new IrVerb("fing")
  val CERRAR = new Diphthongized(new ArVerb("cerr"), "cierr")
  val QUERER = new Diphthongized(new ErVerb("quer"), "quier")
  val PREFERIR = new Diphthongized(new IrVerb("prefer"), "prefier")
}
