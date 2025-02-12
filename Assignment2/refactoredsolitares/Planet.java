package Assignment2.refactoredsolitares;


/**
 * Subclass Planet.
 */
public class Planet extends HeavenlyBody {

  /**
   * Constructor.
   *
   * @param name name.
   * @param avgRadiusInKm avgRadius.
   */
  public Planet(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    checkAvgRadiusInKm(avgRadiusInKm);
  }

  @Override
  protected void checkAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 2000 || avgRadiusInKm > 200000) {
      throw new IllegalArgumentException("Invalid Raidus");
    }
  }

  @Override
  protected void checkName(String name) {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name is cannot be empyt or null");
    } else {
      toString();
    }
  }

  @Override
  public String toString() {
    return (" Planet: " + getName() + ", Average radius is " + getAvgRadiusInKm() + "Km");
  }

}
