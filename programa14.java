
/* Adiciona um metodo parametrizado que calcula combustível necessario para cobrir

uma determinada distância. */


class Vehicle {

int passengers; // número de passageiros
int fuelcap; // capacidade de armazenamento de combustível em galões
int mpg; // consumo de combustível em milhas por galão

// retorna a autonomia. 

int range()  {

return mpg * fuelcap;

}

// calcula o combustível necessário para cobrir uma determinada distância

// distancia.

double fuelneeded(int miles) {

return (double) miles / mpg; 

} 

}


class CompFuel {

public static void main(String args[]) {

Vehicle minivan = new Vehicle();

Vehicle sportscar = new Vehicle();

double gallons;

int dist = 252;

// Atribui valores a campos de minivan

minivan.passengers = 7;
minivan.fuelcap = 16;
minivan.mpg = 21;

// Atribui valores a campos de sportscar

sportscar.passengers = 2;
sportscar.fuelcap = 14;
sportscar.mpg = 12;

gallons = minivan.fuelneeded(dist);

System.out.println("To go " + dist + "miles minivan needs" + gallons + "gallons of fuel.");

gallons = sportscar.fuelneeded(dist);

System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");



}


}