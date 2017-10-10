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
  val ADQUIRIR = new Diphthongized(new IrVerb("adquir"), "adquier")
  val CONTAR = new Diphthongized(new ArVerb("cont"), "cuent")
  val PODER = new Diphthongized(new ErVerb("pod"), "pued")
  val DORMIR = new Diphthongized(new IrVerb("dorm"), "duerm")
  val JUGAR = new Diphthongized(new ArVerb("jug"), "jueg")
}
