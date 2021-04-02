fun main(){
    var car = Car("Subaru", "Legacy", "White",5)
    println(car.carry(7))
    println(car.identity())
    println(car.calculateParkingFees(13))

    var bus = Bus("Subaru", "Legacy","White",12)
    println(bus.maxTripFare(70.00.toDouble()))
    println(bus.calculateParkingFees(3))
}
open class Vehicles(var make: String, var model : String, var color: String, var capacity: Int){
    fun carry(people: Int){
        if(capacity<=people){
            println("Carrying $people passengers")
        }
        else if (capacity>=people){
            var exceed = people-capacity
            println("Over capacity $exceed")
        }
}
        open fun calculateParkingFees(hours: Int): Int {
            var parkFees = hours * 20
            return parkFees
        }
    }
class Car (make: String, model: String, color: String, capacity: Int):Vehicles(make, model, color,capacity){
    fun identity(){
        println("I am a $color $make $model")
    }
}
    class Bus (make: String, model : String, color: String, capacity: Int): Vehicles(make, model, color,capacity){
            fun maxTripFare(fare : Double): Double{
                return fare * capacity
            }
    override fun calculateParkingFees(hours: Int): Int{
        return hours * capacity
    }
        }

