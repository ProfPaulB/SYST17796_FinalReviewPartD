package pizzashop;

/**
 * A class to model pizzas that have cheese and pepperoni Note that the following source was
 * used as a reference in creating this example: Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). 
 * Head First Design patterns. Sebastopol, CA: O'Reilly.
 *
 * @author dancye
 * @author Paul Bonenfant, May 2021
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        super.addTopping("cheese");
        super.addTopping("pepperoni");
    }

    public void bake(int temperature) {
        super.bakeTemp = temperature;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
}
