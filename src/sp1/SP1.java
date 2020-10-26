package sp1;

public class SP1 {
    public static void main(String[] args) {
        Garage garage = new Garage("Peters Garage");
        
        // Benzin Biler
        Benzinbil bb1 = new Benzinbil(2004,4,"1234-abc","Volvo","1",11,3);
        Benzinbil bb2 = new Benzinbil(2004,4,"2134-bac","Volvo","2",5,7);
        Benzinbil bb3 = new Benzinbil(2004,4,"4321-cba","Volvo","3",11,11);
        System.out.println("B:");
        bb3.toString();
        System.out.println("Ba:");
//        Benzinbil bb4 = new Benzinbil(2004,4,"4321-cba","Volvo","4",11,18);
//        Benzinbil bb5 = new Benzinbil(2004,4,"4321-cba","Volvo","5",11,30);

        // Diesel biler
        Dieselbil db1 = new Dieselbil(2004,4,"1122-dfg","Toyota","Diesel1",true,3);
        Dieselbil db2 = new Dieselbil(2004,4,"3344-dfg","Toyota","Diesel2",false,7);
        Dieselbil db3 = new Dieselbil(2004,4,"5566-dfg","Toyota","Diesel3",false,11);
//        Dieselbil db4 = new Dieselbil(2004,4,"5566-dfg","Toyota","Diesel4",false,18);
//        Dieselbil db5 = new Dieselbil(2004,4,"5566-dfg","Toyota","Diesel5",false,30);
        
        // El bil
        Elbil eb1 = new Elbil(2004,4,"1122-dfg","Tesla","A",40000,280,200);
        Elbil eb2 = new Elbil(2004,4,"1122-dfg","Tesla","B",40000,280,500);
        Elbil eb3 = new Elbil(2004,4,"1122-dfg","Tesla","C",40000,280,750);
//        Elbil eb4 = new Elbil(2004,4,"1122-dfg","Tesla","D",40000,280,1000);
//        Elbil eb5 = new Elbil(2004,4,"1122-dfg","Tesla","E",40000,280,2000);
        
        garage.tilføjBil(bb1);
        garage.tilføjBil(bb2);
        garage.tilføjBil(bb3);
//        garage.tilføjBil(bb4);
//        garage.tilføjBil(bb5);
        
        garage.tilføjBil(db1);
        garage.tilføjBil(db2);
        garage.tilføjBil(db3);
//        garage.tilføjBil(db4);
//        garage.tilføjBil(db5);
        
        garage.tilføjBil(eb1);
        garage.tilføjBil(eb2);
        garage.tilføjBil(eb3);
//        garage.tilføjBil(eb4);
//        garage.tilføjBil(eb5);

        System.out.println(garage);
        System.out.println("Afgift for alle biler i garagen: " + garage.beregnGrønAfgiftForBilpark());
    }

}
