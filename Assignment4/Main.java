package Assignment4;

import java.util.Scanner;

/**
 * The class Main.
 */
public class Main {
  Registry registry = new Registry();
 
  /**
   * The main method.
   */
  public void boatClubMenu() {
    Scanner scan = new Scanner(System.in, "utf-8");
    registry.readFromFileAndAddToArray();
    actionMenu(scan);
    scan.close();
  }

  /**
   * Main menu.
   *
   * @param scan - Scans input.
   *
   * @return - Returns an integer.
   */
  public String mainMenu(Scanner scan) {
    System.out.println("\n"
        + "---------------------------\n"
        + "WELCOME TO THE BOAT CLUB!\n"
        + "---------------------------\n"
        + "Choose by picking a number.\n"
        + "\n1. List all members\n"
        + "2. Add a member\n"
        + "3. Save & exit the application.\n");

    System.out.print("Choose a number: ");
    String input = scan.nextLine();
    System.out.print("---------------------------\n");
    // scan.nextLine();

    return input;
  }

  /**
   * Displays part of the menu.
   *
   * @param scan - Input as integer.
   */
  public void actionMenu(Scanner scan) {
    String input = mainMenu(scan);

    switch (input) {
      case "1":
        System.out.println("1. List all members\n");
        registry.getMembers();

        System.out.println("\n"
                          + "|---------------------------|\n"
                          + "PICK A MEMBER!\n"
                          + "|---------------------------|\n"
                          + "Pick a member by user id.\n");
    
        System.out.print("Choose an id: ");
        String pickedId = scan.nextLine();
        
        if (registry.getSpecificMember(pickedId) != null) {
          System.out.println(registry.getSpecificMember(pickedId).getName());
        } else {
          System.out.println("There is no member with that user id.");
          actionMenu(scan);
        }

        Member pickedMember = registry.getSpecificMember(pickedId);

        if (pickedMember == null) {
          actionMenu(scan);
        }

        System.out.print("---------------------------\n");

        System.out.println("\n"
                          + "|---------------------------|\n"
                          + "THIS SPECIFIC MEMBER!\n"
                          + "|---------------------------|\n"
                          + "1.List all boats\n"
                          + "2.Add boat\n"
                          + "3.Delete member\n"
                          + "4.Return to main menu\n");

        System.out.print("Choose a number: ");
        String chooseAlt = scan.nextLine();

        if (chooseAlt.equals("1")) {
          System.out.println(pickedMember.getBoats());

          if (pickedMember.getBoats().equals("\"Member has no boats.\"")) {
            actionMenu(scan);
          }

          System.out.print("\nChoose a boat by name: ");
          String nameOfBoat = scan.next();

          pickedMember.getSpecificBoatInfo(nameOfBoat);
          
          System.out.println("\na. Delete boat");
          System.out.println("b. Return to menu");

          System.out.print("\nChoose a or b: ");
          scan.nextLine();
          String alt = scan.next();
          
          if (alt.equals("a")) {
            pickedMember.deleteBoat(nameOfBoat);
            System.out.println(pickedMember.getBoats());
          } else {
            actionMenu(scan);
          }
        }
        
        if (chooseAlt.equals("2")) {
          System.out.println("2. Add boat");
          System.out.println("\na. Canoe"
                            + "\nb. MotorBoat"
                            + "\nc. MotorSailor"
                            + "\nd. SailBoat\n");
          System.out.print("Type of boat (choose an opition between letter, a & d): ");
          String typeOfBoat = scan.next();
          scan.nextLine();
          System.out.print("Name of boat: ");
          String nameOfBoat = scan.nextLine();
          System.out.print("Length of boat: ");
          int length = scan.nextInt();
          if (typeOfBoat.equals("a")) {
            Boat canoe = new Canoe(nameOfBoat, "Canoe", length);
            pickedMember.addBoat(canoe);
            System.out.println("\n---------------------------");
            System.out.println(pickedMember.getName());
            System.out.println(pickedMember.getBoats());
            System.out.println("---------------------------");

          } else if (typeOfBoat.equals("b")) {

            System.out.print("Horsepower of boat: ");
            int horsePower = scan.nextInt();
            scan.nextLine();

            Boat motorboat = new Motorboat(nameOfBoat, "Motorboat", length, horsePower);
            pickedMember.addBoat(motorboat);

            System.out.println("\n---------------------------");
            System.out.println(pickedMember.getName());
            System.out.println(pickedMember.getBoats());
            System.out.println("---------------------------");

          } else if (typeOfBoat.equals("c")) {
            
            System.out.print("Depth of boat: ");
            int depth = scan.nextInt();
            scan.nextLine();

            System.out.print("Horsepower of boat: ");
            int horsePower = scan.nextInt();
            scan.nextLine();

            Boat motorsailor = new Motorsailer(nameOfBoat, "Motorsailor", length, depth, horsePower);
            pickedMember.addBoat(motorsailor);

            System.out.println("\n---------------------------");
            System.out.println(pickedMember.getName());
            System.out.println(pickedMember.getBoats());
            System.out.println("---------------------------");

          } else if (typeOfBoat.equals("d")) {
            System.out.print("Depth of boat: ");
            int depth = scan.nextInt();
            scan.nextLine();

            Boat sailboat = new Sailboat(nameOfBoat, "Sailboat", length, depth);
            pickedMember.addBoat(sailboat);

            System.out.println("\n---------------------------");
            System.out.println(pickedMember.getName());
            System.out.println(pickedMember.getBoats());
            System.out.println("---------------------------");

          } else {
            System.out.println("You have to choose an option.");
          }

          System.out.println();
        }

        if (chooseAlt.equals("3")) {
          registry.deleteSpecificMember(pickedMember);
          actionMenu(scan);
        }

        if (chooseAlt.equals("4")) {
          actionMenu(scan);
        } else {
          System.out.println("Pick a number between 1 - 4.");
          actionMenu(scan);
        }

        break;
      case "2":
        System.out.println("2. Add a member\n");
        System.out.print("Name: ");
        String name = scan.nextLine();
        Member member = new Member();
        member.setName(name);
        System.out.print("Email: ");
        String email = scan.nextLine();
        if (registry.isEmailused(email)) {
          System.out.println("Email already used!");
        } else {
          member.setEmail(email);
          member.setUserId(registry.getAlphanumericalString(6));
          registry.addMember(member);
        }
        System.out.println();
        actionMenu(scan);
        break;
      case "3":
        System.out.println("3. Save & exit the application.");
        registry.writeToFile();
        System.exit(0);
        break;
      default:
        System.out.println("\n Enter a valid number between 1-3!");
        System.out.println();
        actionMenu(scan);
        break;
    }
  }
  
  
}