public class ArrayOps {
    public static void main(String[] args) {
    
        System.out.println(findMissingInt(new int[] {0, 1, 2, 3, 4, 6}));  
        System.out.println(secondMaxValue(new int[] {6, 9, 4, 13, 3, 4})); 
        System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}));
        System.out.println(isSorted(new int[] {1, 0, -1, 0, -3}));
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int expectedSum = (n * (n+1))/2;
        int actualSum = 0;
        int missingNumber = 0;
        for(int i = 0; i < array.length; i++){
                actualSum = actualSum + array[i];
                 }
            missingNumber = expectedSum - actualSum;
        return missingNumber;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                secondMax = max;
                max = array[i];
            }else if((array[i] > secondMax) && (array[i] < max)){
                secondMax = array[i];
            }
       }
        return secondMax;
    }
   // System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}));
  
   public static boolean containsTheSameElements(int [] array1,int [] array2) {
        return containsOneWay(array1, array2) && containsOneWay(array2, array1);
    }




    public static boolean containsOneWay(int[] arr1, int[] arr2) {
        boolean sameElement = false;

        for(int i = 0; i < arr1.length; i++){
            sameElement = false;
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    sameElement = true;
                    break;
                }
            }
            if(sameElement == false){
                return sameElement;
            }
        }

        return true;
    }
    public static boolean isSorted(int [] array){
        int i = 0;
        while ((i < array.length - 1) && (array[i] == array[i+1])){
            i++;
        }
        boolean checkIfGoingUp = array[i]-array[i+1] < 0;
        boolean isSorted = false;

        
        for( int j = i ; j < array.length - 1; j++){
            if (checkIfGoingUp){
                if(array[j] > array[j+1]){
                    isSorted = false;
                    return isSorted;
                }
            }else{
                 if(array[j] < array[j+1]){
                   isSorted = false;
                   return isSorted;
               }
            }

         }
         isSorted = true;
         return isSorted;
    } 
}   

