
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int [] combo = new int [arr1.length+arr2.length];

        for(int i =0;i<arr1.length;i++){
            combo[i]=arr1[i];
        }
        for(int j =0;j+arr1.length<combo.length;j++){
            combo[j+arr1.length]=arr2[j];

        }
        return combo;
    }
}
