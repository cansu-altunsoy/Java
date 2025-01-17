package c16_inheritance;

public class C07_Parent extends C06_GP{


    C07_Parent(){
        // super();
        System.out.println("P parametresiz constructor calisti");
    }

    C07_Parent(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C07_Parent(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
    }
}