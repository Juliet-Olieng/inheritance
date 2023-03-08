import java.awt.Color
import kotlin.contracts.Returns
import kotlin.math.max

fun main() {
var car=Car("subaru","legacy","white",5)
 car.carry(7)
 car.identity()
 car.calculateParkingFee(2)

 var bus=Bus("nissan","toyota","grey",14)
 bus.carry(14)
 bus.carry(17)
 bus.identity()
 println(bus.maxTripFare(arrayOf(100.50,150.0,200.50,50.0)))
 println(bus.calculateParkingFee(3))

4}
// question one
// parent class car
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
 //part one
 //printing carry capacity
 fun carry(people:Int){
  if(people==capacity){
   println("carrying $capacity passengers")
  }
  else{
   var x=people-capacity
   println("overcapacity by $x people")
  }
 }
 //part two
 //identity of the car
 fun identity(){
  println("I am a $color $make $model")
 }
 //part three
 //calculating and returning parking fee
 open fun calculateParkingFee(hours:Int):Int{
  var parkingFee=(hours * 20)
  println(parkingFee)
  return parkingFee
 }
}
// question two
//child class bus
class Bus(make: String,model: String,color: String,capacity:Int):Car(make,model,color,capacity){
 //part one
 //identifying the max fare
  fun maxTripFare(fare:Array<Double>):Double{
  return fare.max()
  }
 //part two

 override fun calculateParkingFee(hours: Int): Int {
  return hours*capacity
 }
}
