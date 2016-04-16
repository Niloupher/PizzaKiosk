import java.util.List;

/**
 * Created by voona01 on 4/16/2016.
 */
public class Pizza {
    public TOC typeOfCrust = TOC.getThinCrust();
    public Pizza(TOC typeOfCrust){
//        orderPizza(typeOfCrust);
    }

    public void show(){
        System.out.println("Pizza is ready with size : Type Of Crust is :"+typeOfCrust.toString());
    }

}
