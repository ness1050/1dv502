package Assignment2;

 import Assignment2.solitares.Moon;
 import Assignment2.solitares.Planet;
 import Assignment2.solitares.Star;
 import java.util.Arrays;
 
 /**
  * This is the generated Hello World Greeting App.
  */
 public class App {
 
   private void sunPlanetPlanet() {
     System.out.println("SolarSystem: " + "\n");
     Assignment2.solitares.Star s = new Star("Sun", 696342);
     Assignment2.solitares.Planet [] listPlanet = new Planet [8];
     
     System.out.println(s + "\n");
     listPlanet[0] = new Planet("Mercury", 2000);
     listPlanet[1] = new Planet("Vencus", 6051);
     listPlanet[2] = new Planet("Earth", 6371);
     listPlanet[3] = new Planet("Mars", 3389);
     listPlanet[4] =  new Planet("Jupiter", 6991);
     listPlanet[5] = new Planet("Satur", 58232);
     listPlanet[6] = new Planet("Uranus", 25362);
     listPlanet[7] = new Planet("Neptune", 24622);
     for (Planet p : listPlanet) {
       System.out.println(p.toString());
     }
 
     Assignment2.solitares.Moon [] newmoon = new Moon [12];
     System.out.println("\n");
 
     newmoon [0] = new Moon("Moon", 1737);
     newmoon [1] = new Moon("Phobos", 12);
     newmoon [2] = new Moon("Io", 1821);
     newmoon [3] = new Moon("Europa", 1560);
     newmoon [4] = new Moon("Ganymede", 2634);
     newmoon [5] = new Moon("Callisto", 2410);
     newmoon [6] = new Moon("Mimas", 198);
     newmoon [7] = new Moon("Enceladus", 252);
     newmoon [8] = new Moon("Tetyhs", 533);
     newmoon [9] = new Moon("Dione", 561);
     newmoon [10] = new Moon("Rhea", 764);
     newmoon [11] = new Moon("Titan", 2575);
 
     for (Moon mo : newmoon) {
       System.out.println(mo.toString());
     }
   }
 
 
   private void heavenlyBody() {
 
     Assignment2.refactoredsolitares.Star sun = new Assignment2.refactoredsolitares.Star("Sun", 696342);
     System.out.println("SolarSystem: ");
     System.out.println(sun.toString());
 
 
     Assignment2.refactoredsolitares.Planet [] newPlanet = {
       new Assignment2.refactoredsolitares.Planet("Mercury", 2439),
       new Assignment2.refactoredsolitares.Planet("Vencus", 6051),
       new Assignment2.refactoredsolitares.Planet("Eart", 6371),
       new Assignment2.refactoredsolitares.Planet("Mars", 3389),
       new Assignment2.refactoredsolitares.Planet("Jupiter", 6991),
       new Assignment2.refactoredsolitares.Planet("Satur", 58232),
       new Assignment2.refactoredsolitares.Planet("Uranus", 25362),
       new Assignment2.refactoredsolitares.Planet("Neptune", 24622),
       };
     
     System.out.println("Planets: ");
     for (Assignment2.refactoredsolitares.Planet pla : newPlanet) {
       System.out.println(pla.toString());
     }
     
     Assignment2.refactoredsolitares.Moon [] listMoon = new Assignment2.refactoredsolitares.Moon[12];
     listMoon[0] = new Assignment2.refactoredsolitares.Moon("Moon", 1737);
     listMoon[1] = new Assignment2.refactoredsolitares.Moon("Phobos", 12);
     listMoon[2] = new Assignment2.refactoredsolitares.Moon("Io", 1821);
     listMoon[3] = new Assignment2.refactoredsolitares.Moon("Europa", 1560);
     listMoon[4] = new Assignment2.refactoredsolitares.Moon("Ganymede", 2634);
     listMoon[5] = new Assignment2.refactoredsolitares.Moon("Callisto", 2410);
     listMoon[6] = new Assignment2.refactoredsolitares.Moon("Mimas", 198);
     listMoon[7] = new Assignment2.refactoredsolitares.Moon("Enceladus", 252);
     listMoon[8] = new Assignment2.refactoredsolitares.Moon("Tethys", 533);
     listMoon[9] = new Assignment2.refactoredsolitares.Moon("Dione", 561);
     listMoon[10] = new Assignment2.refactoredsolitares.Moon("Rhea", 764);
     listMoon[11] = new Assignment2.refactoredsolitares.Moon("Titan", 2575);
     
     System.out.println("Some Moons: ");
     for (Assignment2.refactoredsolitares.Moon moon : listMoon) {
       System.out.println(moon.toString());
     }
   }
 
   private void solarSytem() {
     Assignment2.solarsysten.Star listOfSun = new Assignment2.solarsysten.Star("Sun", 696342);
     Assignment2.solarsysten.Planet earth = listOfSun.addPlanet("Earth", 6371, 63710);
     earth.addMoon("Moon", 1737, 17370);
 
     Assignment2.solarsystem.Planet mars = listOfSun.addPlanet("mars", 3389, 33890);
     mars.addMoon("phobos", 12, 120);
     mars.addMoon("deimos", 6, 60);
 
     Assignment2.solarsystem.Planet jupiter = listOfSun.addPlanet("jupiter", 69911, 699110);
     jupiter.addMoon("io", 1821, 18210);
     jupiter.addMoon("europa", 1560, 15600);
     jupiter.addMoon("ganymede", 2634, 263340);
     jupiter.addMoon("callisto", 2410, 24100);
 
     Assignment2.solarsystem.Planet saturn = listOfSun.addPlanet("saturn", 58232, 582320);
     saturn.addMoon("mimas", 198, 1980);
     saturn.addMoon("enceladus", 252, 2520);
     saturn.addMoon("tethys", 533, 5330);
     saturn.addMoon("dione", 561, 5610);
     saturn.addMoon("rhea", 764, 7640);
     saturn.addMoon("titan", 2575, 25750);
     System.out.println(listOfSun);
   }
 
   private void orderInHeaven() {
     Assignment2.solarsystem.Star newStar = new Assignment2.solarsystem.Star("Sun", 69634);
 
     Assignment2.solarsystem.Planet newEarth = newStar.addPlanet("Earth", 6371, 63710);
     newEarth.addMoon("Moon", 1737, 17370);
 
     Assignment2.solarsystem.Planet mars = newStar.addPlanet("mars", 3389, 33890);
     mars.addMoon("phobos", 12, 120);
     mars.addMoon("deimos", 6, 60);
 
     Assignment2.solarsystem.Planet jupiter = newStar.addPlanet("jupiter", 69911, 699110);
     jupiter.addMoon("io", 1821, 18210);
     jupiter.addMoon("europa", 1560, 15600);
     jupiter.addMoon("ganymede", 2634, 263340);
     jupiter.addMoon("callisto", 2410, 24100);
 
     Assignment2.solarsystem.Planet saturn = newStar.addPlanet("saturn", 58232, 582320);
     saturn.addMoon("mimas", 198, 1980);
     saturn.addMoon("enceladus", 252, 2520);
     saturn.addMoon("tethys", 533, 5330);
     saturn.addMoon("dione", 561, 5610);
     saturn.addMoon("rhea", 764, 7640);
     saturn.addMoon("titan", 2575, 25750);
 
     Assignment2.solarsystem.HeavenlyBody[] array = newStar.getHeavenlyBodies();
     Arrays.sort(array);
     int i = 0;
     while (i < array.length) {
       Assignment2.solarsystem.HeavenlyBody heavenlyBody = array[i];
       System.out.println("Heavenly body: " + heavenlyBody.getName() + "," 
         + " average radius " + heavenlyBody.getAvgRadiusInKm() + "km");
       i++;
     }   
   }
 
   /**
    * The App starting point.
    *
    * @throws Exception
    *
    * @paramArray args Unused programArray arguments.
    */
   public static void main(String[] args) throws Exception {
     App theApp = new App();
     //theApp.sunPlanetPlanet();
     //theApp.heavenlyBody();
     //theApp.solarSytem();
     theApp.orderInHeaven();
   }
 }
 