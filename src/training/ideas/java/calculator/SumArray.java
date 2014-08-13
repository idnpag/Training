package training.ideas.java.calculator;

/**
 * Created by idnpag on 7/22/2014.
 */
public class SumArray {

    private int sum =0;

    private int[] dataArray = null;

    public SumArray(int[] array){
    this.dataArray = array;
    }

    public int add() {
        for(int i=0; i< dataArray.length; i++){
            sum = sum + dataArray[i];
        }
        return sum;
    }

   /* public static int addArray(int[] array){
        int sumArray =0;
        for(int i=0; i< array.length; i++){
            sumArray = sumArray + array[i];
        }
        return sumArray;

    }

    public static int addArray(int[] array){
        int sumArray =0;
        for(int i=0; i< array.length; i++){
            sumArray = sumArray + array[i];
        }
        return sumArray;
*/








    public static int[] SortAscendingOrder( int numbers[])
    {
        int temp;

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 1; j < (numbers.length -i); j++)
            {
                //if numbers[j-1] > numbers[j], swap the elements
                if(numbers[j-1] > numbers[j])
                {
                    temp = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }

        return numbers;

    }

}



