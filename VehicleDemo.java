
/* Um programa que usa a classe veiculo. 

chame este arquivo de VehicleDemo.java */

class Vehicle {

int passengers; // número de passageiros
int fuelcap; // capacidade de armazenamento de combustíveis em galões
int mpg; // consumo de combustível em milhas por galão 

}


// Esta classe declara um objeto do tipo Vehicle.

class VehicleDemo { 

public static void main(String args[]) {

Vehicle minivan = new Vehicle();
int range; 

// atribui valores a campo de minivan

minivan.passengers = 7;
minivan.fuelcap = 16;
minivan.mpg = 21;

// calcula a autonomia presumindo um tanque de gazolina 

range = minivan.fuelcap * minivan.mpg;

System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);


}


}







