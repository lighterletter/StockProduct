package c4q.lighterletter;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-john on 11/16/15.
 */
public class NumProduct  {

    public static void main(String[] args) {

        int[] array = {1,7,3,4};

        System.out.println(get_products_of_all_ints_except_at_index(array).toString());

    }
    public static List<Integer> get_products_of_all_ints_except_at_index(int[] array){
        int product = 1;
        List<Integer> products = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (i!=k){
                    product *= array[k];
                }
            }
            products.add(product);
            product = 1;
        }
        return products;
    }
}

/* Like the sea and the sand are continents. So are the blankets above my feet that cover me. Aware upon a single happenstance,
aware among a single goal. Survival. What are the goals that cover me? My thoughts and the keys they hold within. I feel that knowing them
can lead me to make the right choice.
 */
