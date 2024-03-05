package dsa_01_AlgorithmAnalysis;

public class BigOSingleLoop {

    public static void main(String[] args) {

        long numberOfOperations = 0;
        int n = 10000;// size of  Data
        int m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);


        // Task 1 Single Loop................... O(n)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Single Loop Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        numberOfOperations = 0;
        // Task 2 Nested Loops...................
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Nested Loop Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " miliseconds");

    }

}
