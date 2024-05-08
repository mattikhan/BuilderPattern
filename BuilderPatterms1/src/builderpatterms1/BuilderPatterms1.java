package builderpatterms1;
/**
 *
 * @author sp21-bse-030
 */
public class BuilderPatterms1 {

    public static void main(String[] args) {
        
        Director director = new Director();

        CarBuilder Cbuild = new CarBuilder();
        director.constructSportsCar(Cbuild);
        
        

        Manual car = Cbuild.getResult();
        System.out.println("Car built:\n" + car.getType());
        
        

        CarManualBuilder manualBuilder = new CarManualBuilder();                                                                              
        director.constructSportsCar(manualBuilder);
        
        
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
