public class MaxMinArray {
    
    public int max(int[] array)
    {
        int max=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }

    public int min(int[] array)
    {
        int min=array[0];

        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        

        int[] myArray ={45,5,19,3,22};

        MaxMinArray MxMiAr = new MaxMinArray();
        System.out.println(MxMiAr.max(myArray)+"  "+MxMiAr.min(myArray));

    }
}
