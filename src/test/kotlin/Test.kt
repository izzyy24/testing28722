import atomictest.eq

fun main() {
    // this is where the testing code goes
    // we want a function that takes 2 parameters and divides the first number by the second number
    // We want to write a series of statements to test if the code is working properly
    val ans1 = divide(8, 4)
    ans1 eq 2.0
    (ans1 is Double) eq true
    val ans2 = divide(9,2)
    ans2 eq 4.5
    (ans2 is Double) eq true
    // in case 3 we want to ensure that if zero is the second parameter, the function will throw
    // an illegal argument exception

//    capture {
//        val ans3 = divide(5, 0)
//    } eq "IllegalArgumentException: Second argument cannot be zero"
    // Write at least 3 more test cases for the divide function,
    // make sure you test what happens when one or both of the
    // numbers are negative.
    // Create a test for divide that takes Doubles as parameters instead
    // Then implement an overload in the main.kt file so that the test passes
val ans4 = divide(-5,-1)
    ans4 eq 4.5
    (ans4 is Double) eq true

    val ans5 = divide(60,6)
    ans5 eq 10.0
    (ans5 is Double) eq true

    val ans6 = divide(-25,5)
    ans6 eq -5.0
    (ans6 is Double) eq true

var test = divide(5.5, 1.1) eq 5.0
}

