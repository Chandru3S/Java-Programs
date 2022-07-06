import java.util.*;

public class LargeNoSet {
    
    static void largest(Vector<String>arr)
    {

        Collections.sort(arr, new Comparator<String>()
        {
            public int compare(String x, String y)
            {
                String XY =x+y;

                String YX =y+x;

                return XY.compareTo(YX)>0?-1:1;
            }
        });
        Iterator it = arr.iterator();
        while(it.hasNext())
            System.out.print(it.next());
    }

    public static void main(String[] args) {
        
        Vector<String> arr;
        arr=new Vector<>();

        arr.add("54");
        arr.add("546"); 
        arr.add("548");
        arr.add("60");

        largest(arr);

    }

}
