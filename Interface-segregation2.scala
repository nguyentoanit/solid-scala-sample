trait Animal {
  def eat()
}

trait RunnableAnimal extends Animal {
  def run()
}

trait FlyableAnimal extends Animal {
  def fly()
}