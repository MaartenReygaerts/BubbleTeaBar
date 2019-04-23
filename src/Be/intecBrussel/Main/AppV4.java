package Be.intecBrussel.Main;

import Be.intecBrussel.BubbleTea.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AppV4 {
    public static void main(String[] args) {
        BubbleTeaIngredients ingred1 = new Apple();
        BubbleTeaIngredients ingred2 = new Bubble(Taste.SOURAPPLE);
        BubbleTeaIngredients ingred3 = new Strawberry();

        System.out.println(ingred1);
        System.out.println(ingred2);
        System.out.println(ingred3);
        //opdracht 1


        List<BubbleTeaIngredients> test = new ArrayList<>();
        test.add(ingred1);
        test.add(ingred2);
        test.add(ingred3);

        //opdracht 2

        //stream sum
       double sum2 = test.stream()
                .mapToDouble(i->i.getPrice())
                .sum();

        System.out.println("\n forEach : " + sum2);

        System.out.println("Boiling water");
        for(BubbleTeaIngredients ing : test){
            if(ing instanceof Boilable){
                ((Boilable)ing).Boil();
            }else{

            }
        }


    }
}
