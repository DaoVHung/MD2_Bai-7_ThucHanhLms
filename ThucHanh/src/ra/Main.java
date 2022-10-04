package ra;

import ra.ThucHanh1.Animal;
import ra.ThucHanh1.Chicken;
import ra.ThucHanh1.Tiger;
import ra.edible.IEdible;
import ra.fruit.Apple;
import ra.fruit.Fruit;
import ra.fruit.Organe;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal animal : animals ){
            System.out.println(animal.makeSound());


            if(animal instanceof Chicken){
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit [] fruits = new Fruit[2];
        fruits[0]=new Organe();
        fruits[1]= new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());

        }
    }
}