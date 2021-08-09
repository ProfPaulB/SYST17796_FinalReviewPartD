package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 *
 * @author dancye
 * @author Paul Bonenfant, Aug 2021
 */
public abstract class Pizza {

    public int bakeTemp = 500;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();

    public void bake(int temperature) {
        bakeTemp = temperature;
        // do some baking here, code not implemented yet
        // not necessary for the review...
    }

    /**
     * A method to add toppings to the ingredients list
     *
     * @param topping
     */
    public void addTopping(String topping) {
        ingredients.add(topping);
    }
}
