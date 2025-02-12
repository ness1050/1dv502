package Assignment2.refactoredsolitares;

/**
 * Subclass Moon.
 */
public class Moon extends HeavenlyBody {

  /**
   * private String name.
   * private int avgRadiusInKm.
   */
  public Moon(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    checkAvgRadiusInKm(avgRadiusInKm);
  }

  @Override
  protected void checkAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("Invalid radius value");
    }
  }

  @Override
  protected void checkName(String name) {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name cannot be empty or null");
    }
  }

  @Override
  public String toString() {
    return (" Moon: " + getName() + ", Average radius is " + getAvgRadiusInKm() + "Km");
  }

}
