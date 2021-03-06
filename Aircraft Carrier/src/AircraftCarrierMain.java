public class AircraftCarrierMain {
  public static void main(String[] args) {

    F16 myF16 = new F16();
    F35 myF35 = new F35();
    Carriers myCarrier = new Carriers(300,300);

    Carriers enemyCarrier = new Carriers(100,1000);

    myCarrier.addAircraft(myF16);
    myCarrier.addAircraft(myF35);

    myCarrier.fill();

    myCarrier.fight(enemyCarrier);

    myCarrier.fill();

    myCarrier.fight(enemyCarrier);

    myCarrier.getStatus();
    System.out.println();
    enemyCarrier.getStatus();
  }
}
