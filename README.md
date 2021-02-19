# String-Calculator


#4 Support different delimiters

#(1) to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .

#(2) the first line is optional. all existing scenarios should still be supported

————————————————————————————————

#5 Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.

if there are multiple negatives, show all of them in the exception message.

————————————————————————————————

STOP HERE if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.

————————————————————————————————

#6 Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2.

————————————————————————————————

#7 Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6.

————————————————————————————————

#8 Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.

————————————————————————————————

#9 make sure you can also handle multiple delimiters with length longer than one char

———————————————————————————————— 
