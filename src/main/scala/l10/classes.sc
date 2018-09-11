def p(): Unit = {
  1 + 1 // функция которая не возвращается никакого значения (сайдеффект) (процедура)
}

def f(): Int = {
  println(">>")
  1 + 1 // функция, так как возвращает значение
}

def f2(): Int = {
  1 + 1 // стерильная фунцкия, так как не создает сайд еффекта (никогда не ссылается на внешний state)
  // идемпотентность - при одних и тех же входящих параметрах ответ одинаков
}

class Car {
  private val serial = "123456"
  var speed = 0

  def getSerial() = serial

  def changeSpeed(delta: Int): Int = {
    speed += delta
    speed
  }
}

val car = new Car()

car.speed

car.changeSpeed(60)
car.changeSpeed(-60)
car.changeSpeed(30)
car.getSerial()

class Car2(val serial:String) {
  var speed = 0

  def getSerial() = serial

  def changeSpeed(delta: Int): Int = {
    speed += delta
    speed
  }
}

val car_a = new Car2("12345")
car_a.getSerial()