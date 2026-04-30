fun calculate(number1: Double, number2: Double, choice: Int): Double {
    var result: Double = 0.0; 

    if (choice == 1) {
        result = number1 + number2;
    } else if (choice == 2) {
        result = number1 - number2;
    } else if (choice == 3) {
        result = number1 * number2;
    } else if (choice == 4) {
        result = number1 / number2;
    }

    return result;
}

fun main() {
    var run = true;
    var result: Double = 0.0; 

    println("Input a number:");
    var number1: Double = readLine()!!.toDouble();
    print("Choose: \n1. Addition 2. Deduction 3. Multiplication 4. Division \n> ");
    var choice: Int = readLine()!!.toInt();
    println("Input an another number:");
    var number2: Double = readLine()!!.toDouble();

    result = calculate(number1, number2, choice);

    while (run == true) {
        print("Choose: \n1. Addition 2. Deduction 3. Multiplication 4. Division 5. End \n> ");
        var choice: Int = readLine()!!.toInt();

        if (choice == 5) {
            run = false;
        } else {
            number1 = result;

            println("Input an another number:");
            number2 = readLine()!!.toDouble();

            result = calculate(number1, number2, choice);
        }
    }

    println("Result: " + result);
}