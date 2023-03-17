//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

/* the question isn't clear but im assuming its asking me to answer this so that if a given number is multiplied
by eight it is an even number if not multiply by nine. the first line was given to me */

//THREE WAYS TO WRITE THIS

// fun simpleMultiplication(n: Int): Int {
//     if (n % 2 == 0) {
//         return n * 8
//     } else {
//         return n * 9
//     }
// }

//     fun simpleMultiplication(n: Int): Int {
//     return if (n % 2 == 0) n * 8 else n * 9
// }

// fun simpleMultiplication(n: Int) = if (n % 2 == 0) {
//     n * 8
// } else {
//     n * 9
// }

/* All three functions simpleMultiplication() achieve the same result of multiplying the input n by either 8 or 9,
depending on whether n is even or odd. The main difference between them is the syntax used to write them.

The first function uses an if-else statement to determine which multiplication operation to perform and then returns
 the result using the return keyword.

The second function uses a shortened version of the if-else statement known as the ternary operator ?:.
This allows the function to return the result of the if expression directly, without the need for a
separate return statement.

The third function uses a combination of the ternary operator and expression-body syntax to make the function
even more concise. Instead of enclosing the if and else blocks in curly braces and using the return keyword,
the function simply returns the result of the expression after the = sign.

All three functions will work equally well for the given task, so the choice of which to use comes down to personal
preference and coding style.*/


