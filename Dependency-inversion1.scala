class BackEndDeveloper {
  def writeJava() {}
}

class FrontEndDeveloper {
  def writeJavascript() {}
}

class Project {
  private val backEndDeveloper: BackEndDeveloper = new BackEndDeveloper()
  private val frontEndDeveloper: FrontEndDeveloper  = new FrontEndDeveloper()
  def implement() {
    backEndDeveloper.writeJava()
    frontEndDeveloper.writeJavascript()
  }
}
