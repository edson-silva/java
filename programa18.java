
// Adiciona um construtor.

class Vehicle { 

int passengers; // número de passageiros
int fuelcap; // capacidade de armazenamento de combustíveis em galões
int mpg; // consumo de combustível em milhas por galão

// esse é um construtor para Vehicle

Vehicle(int p, int f, int m) {

passengers = p;
fuelcap = f;
mpg = m;

}


// retorna a autonomia

int range() {

return mpg * fuelcap; 

}

// calcula o combustível necessário para cobrir uma determinada distância

double fuelneeded(int miles) {

return (double) miles / mpg;

}

}

class VenhConsDemo {

    public static void main(String args[]) {

    // constroi veículo completos

   Vehicle minivan = new Vehicle(7, 16, 21);

   Vehicle sportscar = new Vehicle(2, 14, 12);

   double gallons; 

   int dist = 252;

   gallons = minivan.fuelneeded(dist);

   System.out.println("To go " + dist + "miles minivan needs" + gallons + " gallons of fuel.");

   gallons = sportscar.fuelneeded(dist);

   System.out.println("To go " + dist + "miles sportscar needs" + gallons + "gallons of fuel.");



}


}