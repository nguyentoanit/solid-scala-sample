
trait Developer {
  def develop()
}

class BackEndDeveloper extends Developer {
  override def develop() {
    writeJava()
  }

  private def writeJava() {}
}

class FrontEndDeveloper extends Developer {
  override def develop() {
    writeJavascript()
  }
  private def writeJavascript() {}
}

class Project(developers: List[Developer]) {
  private val backEndDeveloper: BackEndDeveloper = new BackEndDeveloper()
  private val frontEndDeveloper: FrontEndDeveloper  = new FrontEndDeveloper()

  def implement() {
    developers.foreach(_.develop())
  }
}
