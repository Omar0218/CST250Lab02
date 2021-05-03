
package lab02a;

public class MainClass {
    
    public static void main(String[] args){
        
        int[] array = {1,2,3,4,5};
        
        System.out.println(mySearch(array, 1));
        System.out.println(mySearch(array, 2));
        System.out.println(mySearch(array, 3));
        System.out.println(mySearch(array, 4));
        System.out.println(mySearch(array, 5));
        
    }
    
    public static int mySearch(int[] inputArray, int key){
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] == key){
                return i;
            }
        }
        return -1;
    }
}
