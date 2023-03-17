//QUESTION: Write a function that removes the spaces from the string, then return the resultant string
//first line is given to you


fun noSpace(x: String): String {
    // code here
    return x.replace(" ", "")
}


/* This code defines a function named noSpace that takes a string x
as input and returns a new string with all spaces removed*/

/*The function achieves this by using the replace method of the String class,
which replaces all occurrences of a specified character or substring with another character or substring.
In this case, the function replaces all spaces (represented by the string " ")
with an empty string (represented by "")*/

//.replace is replacing the frist aru=gument with the second argument so
//if you had : x= "hello" and you were told to replace o with i. you would do..

// x.replace("o", "i") then println(result) to print the result of what you replaced. ("helli")