package com.company;

public class Main {
    public static void main(String[] args) {
        FunctionManager functionManager = new FunctionManager();
        int sum = functionManager.sum(12, 23);
        System.out.println("Sum of the numbers a and b is: " + sum);

        double multiplication = functionManager.multiplication(12.2d, -28.4d);
        System.out.println("Multiplying x and y is: " + multiplication);

        System.out.print("Is the first number greater than the second: ");
        functionManager.comparing(43.2F, -12.3F);

        System.out.print("Print the biggest long number:");
        functionManager.theBiggestOne(125, -346, 3465566);

        Human human = new Human("David", "Badikyan", "male", 1997);
        System.out.print("Is David Badikyan's gender male: ");
        functionManager.maleOrFemale(human);

        Human human1 = new Human("Levon", "Asatryan", "male", 1998);
        Human human2 = new Human("Gayane", "Muradyan", "female", 1960);

        System.out.println("The name of the biggest human is: " + functionManager.oldestLastName(new Human[]{human, human1, human2}));

        System.out.print("Human's names are: ");
        functionManager.printFullName(human1, human2);

        System.out.println();

        System.out.print("FirstName or LastName: ");
        functionManager.trueFalseNameSurname(true, human);

        int[] arr = {10, 56, 25, 48, 669, 854};
        System.out.println("Max value is: " + functionManager.maxValueOfArray(arr));

        float[] array1 = {26.3F, 48.6F, -98.1F, 56.5F};
        System.out.println("Index of Minimal Value is: " + functionManager.indexOfMinValue(array1));

        System.out.print("Sort humans in ascending order by the year of birth: ");
        functionManager.sortByAscendingOrder(new Human[]{human, human1, human2});
    }
}
