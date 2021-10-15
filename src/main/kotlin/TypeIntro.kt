/* Shortcut = If you write "main" than press "Tab" Key will
 automatically add the basic element for the "main" function to you  */

/* How definition
 var = variable keyword, experiencePoints = variable name,
 :Int = type,  assigned value = assignment operator */

/* You declare a variable that can be modified using the var keyword.
To declare a read-only variable,you use the val keyword. */

// const
const val MAX_EXPERIENCE : Int = 5000
fun main() {

    val playerName : String = "Reem"
    //  playerName = "Assel" / error because once val has been assigned, it can never be reassigned

    //error type is String but Int was expected
    // var experiencePoints :Int = thirty-two
    var experiencePoints :Int = 5  // output = 5
    experiencePoints  += 5 // output = 10

    println(experiencePoints)
    println(playerName)

// Let's try others types
    var Name :String = "Mohamed"
    var Letter :Char = 'X'
    var PI : Double = 3.14
    var isWork : Boolean = true

// For Array / Collections Data Type , should be the same data type,you can name variable as you like
// Collections of elements
    var List = listOf(1,2,3)
    var myColor = listOf("Black", "Red", "Green")
// Collections of unique elements
    var myset = setOf("Reem", "Fawaz", "Alanazi")
// Collections of key-value pairs
    var myMap = mapOf( 1 to "one" , 2 to "Two")
    var Size = mapOf("small" to 5.99, "large" to 10.99)

}