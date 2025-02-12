package Assignment2.solarsysten;

import java.util.ArrayList;

/**
 * Subclass Star.
 */
public class Star extends HeavenlyBody {

  private ArrayList<Planet> planets = new ArrayList<>();

  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Creates an object of planet.
   * Adds it to the arraylist.
   *
   * @param name name.
   * @param avgRadiusInKm Average Radius.
   * @param avgOrbitRadiusInKm Average Orbit radius.
   * @return adds the planet to the list.
   */
  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    // Moon moon = new Moon (name, avgRadiusInKm, avgOrbitRadiusInKm);
    if (planet.getAvgOrbitRadiusInKm() < 18000) {
      throw new IllegalArgumentException("name can not be empty or null");
    }
    planets.add(planet);
    return planet;
  }

  /**
   * Checks the objects of a solarasystem.
   *
   * @return assigns planet to star and moon to planet.
   */
  public HeavenlyBody[] getHeavenlyBodies() {
    ArrayList<HeavenlyBody> list = new ArrayList<>();

    // add the star itself to the list
    list.add(this);

    // loop through all the planet objects associated with the star and add them to
    for (Planet planet : planets) {
      list.add(planet);

      // loop through all the moon objects associated with the current planet and add
      // them to the list
      for (Moon moon : planet.getMoons()) {
        list.add(moon);
      }
    }

    // create an array called "result" that is the same size as the total number of
    // HeavenlyBody objects in the list
    HeavenlyBody[] result = new HeavenlyBody[list.size()];

    // loop through all the HeavenlyBody objects in the "list" ArrayList and copy
    // them into the "result" array
    int counter = 0;
    for (HeavenlyBody body : list) {
      if (body instanceof Star) {
        Star star = new Star(body.getName(), body.getAvgRadiusInKm());
        result[counter] = star;
      } else if (body instanceof Planet) {
        Planet planet = (Planet) body;
        Planet newPlanet = new Planet(planet.getName(), planet.getAvgRadiusInKm(), planet.getAvgOrbitRadiusInKm());
        result[counter] = newPlanet;
      } else if (body instanceof Moon) {
        Moon moon = (Moon) body;
        Moon newMoon = new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
        result[counter] = newMoon;
      }
      counter++;
    }

    return result;
  }

  @Override
  protected void checkAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 16700) {
      throw new IllegalArgumentException("Radius is not valid number");
    }

  }

  @Override
  protected void checkName(String name) throws IllegalArgumentException {
    if (name == null || name.equals("")) {
      throw new IllegalArgumentException("Name cannot be empty or null");
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Star: " + getName()).append(", average radius ").append(getAvgRadiusInKm()).append("km\n");
    for (HeavenlyBody planet : planets) {
      sb.append(" ").append(planet.toString()).append("\n");
    }
    return sb.toString();
  }
}
