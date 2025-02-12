package Assignment2.solitares;

/**
 * Class Planet.
 */
public class Planet {

  private String name;
  private int avgRadiusInKm;

  public Planet(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  public String getName() {
    return this.name;
  }

  private void setName(String name) {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name cannot be empty or null");
    } else {
      this.name = name;
    }
  }

  public int getAvgRadiusInKm() {
    return this.avgRadiusInKm;
  }

  private void setAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm > 200000 || avgRadiusInKm < 2000) {
      throw new IllegalArgumentException("invalid radius value");
    } else {
      this.avgRadiusInKm = avgRadiusInKm;
    }
  }

  @Override
  public String toString() {
    return ("Planet: " + name + ", Average radius " + avgRadiusInKm + "Km");

  }

}

