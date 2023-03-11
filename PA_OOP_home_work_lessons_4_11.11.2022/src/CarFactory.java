public class CarFactory {
    public static void returnCarList() {
        Engine[] arrayEngines = new Engine[9];
        arrayEngines[0] = new BenzineEngine("Type engine - benzine/gas.", 1600, 123454321, 400_000);
        arrayEngines[1] = new BenzineEngine("Type engine - benzine/gas.", 1600, 123454322, 400_000);
        arrayEngines[2] = new BenzineEngine("Type engine - benzine/gas.", 1600, 123454323, 400_000);
        arrayEngines[3] = new DieselEngine("Type engine - diesel.", 1500, 127777721, 400_000);
        arrayEngines[4] = new DieselEngine("Type engine - diesel.", 1500, 127777722, 400_000);
        arrayEngines[5] = new DieselEngine("Type engine - diesel.", 1500, 127777723, 400_000);
        arrayEngines[6] = new HybridEngine("Type engine - benzine.", 1500, 10000001, 400_000);
        arrayEngines[7] = new HybridEngine("Type engine - benzine.", 1500, 10000002, 400_000);
        arrayEngines[8] = new HybridEngine("Type engine - benzine.", 1500, 10000003, 400_000);

        Cars[] arrayCars = new Cars[9];
        for (int i = 0; i < arrayCars.length; i++) {
            arrayCars[0] = new Sedan("Sedan Luxury", 220, 2021, Colors.RED, 4.45, TireBrands.NOKIAN, (BenzineEngine) arrayEngines[0]);
            arrayCars[1] = new Hatchback("Hatchback Luxury", 240, 2022, Colors.GREEN, 4.22, TireBrands.MICHELIN, (BenzineEngine) arrayEngines[1]);
            arrayCars[2] = new StationWagon("StationWagon Luxury", 200, 2022, Colors.WHITE, 4.65, TireBrands.GOODYEAR, (BenzineEngine) arrayEngines[2]);
            arrayCars[3] = new Sedan("Sedan Standard", 220, 2021, Colors.YELLOW, 4.45, TireBrands.GOODYEAR, (DieselEngine) arrayEngines[3]);
            arrayCars[4] = new Hatchback("Hatchback Standard", 240, 2022, Colors.BLACK, 4.22, TireBrands.NEXEN, (DieselEngine) arrayEngines[4]);
            arrayCars[5] = new StationWagon("StationWagon Standard", 200, 2022, Colors.BLUE, 4.65, TireBrands.DEBICA, (DieselEngine) arrayEngines[5]);
            arrayCars[6] = new Sedan("Sedan Economy", 220, 2021, Colors.RED, 4.45, TireBrands.MICHELIN, (HybridEngine) arrayEngines[6]);
            arrayCars[7] = new Hatchback("Hatchback Economy", 240, 2022, Colors.BLUE, 4.22, TireBrands.DEBICA, (HybridEngine) arrayEngines[7]);
            arrayCars[8] = new StationWagon("StationWagon Economy", 200, 2022, Colors.WHITE, 4.65, TireBrands.NOKIAN, (HybridEngine) arrayEngines[8]);
        }
        
        for (Cars elementOfArrayCars : arrayCars) {
            System.out.println(elementOfArrayCars);
        }
    }
}
