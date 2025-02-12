package Assignment4;

/**
 * The class Motorsailer.
 */
public class Motorsailer extends Boat {
  int depth;
  int horsePower;

  public Motorsailer() {}

  /**
   * The Constructor.
   *
   * @param name  Name.
   * @param typeOfBoat Type of.
   * @param length  Length of.
   * @param depth  Depth of.
   * @param horsePower  The boats horse power
   */
  public Motorsailer(String name, String typeOfBoat, int length, int depth, int horsePower) {
    super(name, typeOfBoat, length);
    this.depth = depth;
    this.horsePower = horsePower;
  }

  @Override
  String fileToString() {
    return "\nBOAT:" + name + ":motorsailor:" + length + ":" + depth + ":" + horsePower;
  }
  
  @Override
  String detailedToString() {
    return "\nMotorsailor: " + name + ", length: " + length + " meter"
      + ", depth: " + depth + " meter" + ", horse power: " + horsePower;
  }

 
}