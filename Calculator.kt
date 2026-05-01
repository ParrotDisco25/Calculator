fun calculate(number1: Double, number2: Double, operator: String): Double {
    var result: Double = 0.0; 

    if (operator == "+") {
        result = number1 + number2;
    } else if (operator == "-") {
        result = number1 - number2;
    } else if (operator == "*") {
        result = number1 * number2;
    } else if (operator == "/") {
        result = number1 / number2;
    }

    return result;
}

fun main() {
    var run = true;
    var result: Double = 0.0; 

    print("Input a number: ");
    var number1: Double = readLine()!!.toDouble();
    print("Choose an operator (+, -, *, /): \n> ");
    var choice: String = readLine()!!
    print("Input an another number: ");
    var number2: Double = readLine()!!.toDouble();

    result = calculate(number1, number2, choice);

    while (run == true) {
        print("Choose an operator (+, -, *, /, =): \n> ");
        var choice: String = readLine()!!

        if (choice == "=") {
            run = false;
        } else {
            number1 = result;

            print("Input an another number: ");
            number2 = readLine()!!.toDouble();

            result = calculate(number1, number2, choice);
        }
    }

    println("Result: " + result);
    print("Press enter to close. ")
    var wait = readLine();
}