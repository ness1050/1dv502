package Assignment2.solitares;

/**
 * Class Moon.
 */
public class Moon {
  private String name;
  private int avgRadiusInKm;

  public Moon(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("The name cannot be empty or null");
    } else {
      this.name = name;
    }
  }

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  private void setAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("The radius is invalid");
    } else {
      this.avgRadiusInKm = avgRadiusInKm;
    }
  }

  @Override
  public String toString() {
    return ("Moon: " + name + ", Average Radius is " + avgRadiusInKm + " Km");
  }

}
