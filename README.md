=> In this program, I created a solution that prints statistics for course points. The program reads integers between 0 and 100 as input, and based on these points, it calculates statistics about grades. The input process stops when the user enters -1, and any numbers outside the valid range (0-100) are ignored when calculating the statistics.

=> To handle user input, I used the Integer.valueOf method to convert strings to integers. For example, if the user enters a string like "3", it’s converted to an integer like this:

String numberAsString = "3";
int number = Integer.valueOf(numberAsString);


=> Now, onto the functionality I implemented:

1. Point Averages
The program first reads point totals, and it only considers numbers between 0 and 100. The reading stops when the user enters -1. Once that happens, the program calculates and prints the average of all valid points entered.

2. Point Average for Passing Grades
Next, I extended the program to calculate the average of points that would give a passing grade. A passing grade is any score of 50 or higher. If no passing grades were entered, the program prints a dash (-) instead of a passing grade average.

3. Pass Percentage
I added functionality to calculate the percentage of passing grades. This is done by dividing the number of passing grades by the total number of valid entries and multiplying by 100.

4. Grade Distribution
Finally, I included a grade distribution feature. The program converts each point total into a grade based on a predefined scale (e.g., 0 for points below 50, 5 for points above 90). The results are displayed as a series of stars for each grade.
