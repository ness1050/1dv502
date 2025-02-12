package Assignment4;


/**
 * The class Motorboat.
 */
public class Motorboat extends Boat {
  int horsePower;

  public Motorboat() {}

  /**
   * Constructor.
   *
   * @param name Name.
   * @param typeOfBoat Type of boat.
   * @param length Length of boat.
   * @param horsePower  The boats horse power
   */
  public Motorboat(String name, String typeOfBoat, int length, int horsePower) {
    super(name, typeOfBoat, length);
    this.horsePower = horsePower;
  }

  public int getHorsepower() {
    return horsePower;
  }

  public void setHorsepower(int horsePower) {
    this.horsePower = horsePower;
  }

  public String typeOfBoat() {
    return typeOfBoat;
  }

  public void setTypeOfBoat(String typeOfBoat) {
    this.typeOfBoat = typeOfBoat;
  }

  @Override
  String detailedToString() {
    return "\nMotorboat: " + name + ", length: " + length + " meter" + ", horse power: " + horsePower;
  }

  @Override
  String fileToString() {
    return "\nBOAT:" + name + ":motorboat:" + length + ":" + horsePower;
  }
  
}