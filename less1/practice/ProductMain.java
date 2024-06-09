package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinkVM;
import less1.practice.impl.WaterVendingMachine;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        // Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        // Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
        //         true, EPackage.GLASS.getMaterial(), 0.5F);

        // VendingMachine vm = new WaterVendingMachine();

        // VendingMachine vm1 = new HotDrinkVM();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        // vm1.addProducts(new ArrayList<>());

        // System.out.println(vm.getProducts());

        // vm.getProduct("Родники");

        // System.out.println(vm.getProducts());

        Product mag1  = new HotDrink("tea", 1, 35);
        Product mag2  = new HotDrink("coffee", 2, 60);
        
        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm1.getProducts());

        vm1.addProducts(List.of(mag1, mag1, mag1, mag2, mag2, mag2));

        System.out.println(vm1.getProducts());
        
        vm1.getProduct("tea", 1, 35);

        System.out.println(vm1.getProducts());



    }
}
