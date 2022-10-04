package ra.ThucHanh1;

import ra.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken : ^^^^^^";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
