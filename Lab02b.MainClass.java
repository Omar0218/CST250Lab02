
package lab02b;

import java.util.Arrays;

public class MainClass {
    
    public static void main(String[] args){
        
        int[] array = {5,4,3,2,1};
        mySort(array);
        
        System.out.println(Arrays.toString(array));
        
    }
    
    public static void mySort(int[] inputArray){
        
        int arraySize = inputArray.length;
        for (int i = 0; i < arraySize - 1; i++){
            
            int index = i;
            for (int j = i + 1; j < arraySize; j++){
                if (inputArray[j] < inputArray[index]){
                    index = j;
                }
            }
            
            int temp = inputArray[i];
            inputArray[i] = inputArray[index];
            inputArray[index] = temp;
        }
    } 
    
}
