// CS 3354 M/W 12:30-1:50
// 1-23-25
// Wyatt Churchman, Madeline Pope, Eathen Whittle, Brenden Lheureux
package myUtil;

public class myPackageMain {
    
    //Main function
    public static void main(String[] args) {
        
        //Array Declaration
        int[] myArray = {20, 1, 12, 79, 40, 63, 4};
        int length = myArray.length;

        //Printing Array
        System.out.print("Array: ");
        for(int i = 0; i < length - 1; i++){
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(myArray[length - 1]);

        //Calling functions in statistics: getAverage
        System.out.print("Average of array: ");
        System.out.println(statistics.getAverage(myArray));

        //Calling functions in statistics: getMedian
        System.out.print("Median of array: ");
        System.out.println(statistics.getMedian(myArray));
    }

}
