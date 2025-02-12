package Assignment2.solarsysten;

import java.util.ArrayList;
import java.util.List;

/**
 * SubClass Planet.
 */
public class Planet extends HeavenlyBody {

  private double avgOrbitRadiusInKm;
  private ArrayList<Moon> moons = new ArrayList<Moon>();

  protected Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    setAvgOrbitRadiusInKm(avgOrbitRadiusInKm);

  }

  /**
   * Adds Moon.
   *
   * @param name name.
   * @param avgRadiusInKm avgradius.
   * @param avgOrbitRadiusInKm avgOrbitRadius.
   * @return Moon.
   */
  public Moon addMoon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    Moon moon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm);
    if (moon.getAvgRadiusInKm() <= getAvgRadiusInKm() / 2 && moon.getAvgOrbitRadiusInKm() >= 60) {
      moons.add(moon);
      return moon;
    } else {
      throw new IllegalArgumentException("Moon is too large or has invalid orbit radius");
    }
  }

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Checks the orbit of Planets.
   *
   * @param avgOrbitRadiusInKm average orbit radius.
   */
  private void setAvgOrbitRadiusInKm(double avgOrbitRadiusInKm) {
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Invalid orbit radius");
    } else {
      this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    }
  }

  /**
   * Returns a copie of array objects.
   *
   * @return adds to the arraylist.
   */
  public HeavenlyBody[] getHeavenlyBodies() {
    ArrayList<HeavenlyBody> list = new ArrayList<>();

    list.add(this);
    for (Moon m : moons) {
      list.add(m);
    }

    HeavenlyBody[] result = new HeavenlyBody[moons.size() + 1];

    int counter = 0;
    for (HeavenlyBody h : list) {
      if (h instanceof Planet) {
        Planet pl = new Planet(getName(), getAvgRadiusInKm(), getAvgOrbitRadiusInKm());
        result[counter] = pl;
      } else if (h instanceof Moon) {
        double avg = ((Moon) h).getAvgOrbitRadiusInKm();
        Moon mo = new Moon(h.getName(), h.getAvgRadiusInKm(), avg);
        result[counter] = mo;
      }
      counter++;
    }
    return result;
  }

  public List<Moon> getMoons() {
    return this.moons;
  }

  @Override
  protected void checkAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm > 200000 || avgRadiusInKm < 2000) {
      throw new IllegalArgumentException("invalid radius value");
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
    StringBuilder sb = new StringBuilder();
    sb.append(getName()).append(", average radius ").append(getAvgRadiusInKm()).append("km, average orbit radius ")
        .append(getAvgOrbitRadiusInKm()).append("km\n");
    for (HeavenlyBody moon : moons) {
      sb.append("  ").append(moon.toString()).append("\n");
    }
    return sb.toString();
  }
}
