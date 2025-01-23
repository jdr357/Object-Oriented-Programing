package myUtil;

public class statistics{

    //Average function
    public static double getAverage(int[] _arr){

        if(_arr == null || _arr.length == 0) {
            return 0.0;
        }
        
        int sum = 0;
        for(int num : _arr) {
            sum += num;
        }

        return(double) sum / _arr.length;
    }

    //Sort function
    static void sort(int[] _arr){

        for(int i = 0; i < _arr.length - 1; i++) {
            for(int j = 0; j < _arr.length - i - 1; j++) {
                if(_arr[j] > _arr[j + 1]) {
                    swap(_arr, j, j + 1); // Swap if the element is greater than the next
                }
            }
        }

    }

    //Swap function
    static void swap(int[] _arr, int _pos0, int _pos1){

        int temp = _arr[_pos0];
        _arr[_pos0] = _arr[_pos1];
        _arr[_pos1] = temp;

    }

    //Median function
    public static int getMedian(int[] _arr){

        //Return zero if array is empty
        if(_arr == null || _arr.length == 0) {
            return 0;
        }

        sort(_arr); // Sort the array to calculate the median
    
        int middle = _arr.length / 2;
    
        if(_arr.length % 2 == 0) {
            // If the array length is even, calculate the average of the two middle elements
            return(_arr[middle - 1] + _arr[middle]) / 2;
        } else {
            // If the array length is odd, return the middle element
            return _arr[middle];
        }
    }
}