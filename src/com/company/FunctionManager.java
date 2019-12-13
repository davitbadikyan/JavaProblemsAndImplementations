package com.company;

public class FunctionManager {
    public int sum(int x, int y) {
        return x + y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public void comparing(float x, float y) {
        System.out.println(x > y ? "Yes" : "No");
    }

    public void theBiggestOne(long x, long y, long z) {
        System.out.println((x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z));
    }

    public void maleOrFemale(Human human) {
        if (human.getGender().equals("male")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public String oldestLastName(Human[] human) {
        Human oldest = human[0];
        for (int i = 1; i < human.length; i++) {
            if (oldest.getYear() > human[i].getYear()) {
                oldest = human[i];
            }
        }
        return oldest.getLastName();
    }

    public void printFullName(Human human1, Human human2) {
        System.out.println(human1.getFirstName() + " " + human1.getLastName());
        System.out.println(human2.getFirstName() + " " + human2.getLastName());
    }

    public void trueFalseNameSurname(boolean x, Human human) {
        System.out.println(x ? human.getFirstName() : human.getLastName());
    }

    public int maxValueOfArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int indexOfMinValue(float[] arr) {
        int index = 0;
        float min = arr[index];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public void sortByAscendingOrder(Human[] humans) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (humans[j].getYear() > humans[j + 1].getYear()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
            System.out.println(humans[i].getFirstName() + " " + humans[i].getLastName());
        }
    }

}
