package edu.wpi.team3;

public class Main {

  public static void main(String[] args) {

    App.launch(App.class, args);

    System.out.println("Gabrielle Acquista");
    System.out.println("Alex Sun");
    System.out.println("Aidan Burns");
    System.out.println("Randy Huang");
    System.out.println("Ethan Schrim");
    System.out.println("Samay Govani");
    System.out.println("Eli Hoffberg");
    System.out.println("Robbie Eskridge");
    System.out.println("Grace Liu");

    aidanFunction();
    eliFunction();
    printEthan();

  }

  private static void aidanFunction(){
    System.out.println("Branch - Aidan Burns");
  }

  private static void graceFunction(){
    System.out.println("Branch - Grace Liu");
  }

  private static void printEthan() {
    System.out.println("Printing Ethan from Branch");
  }
  private static void eliFunction(){
    System.out.println("Branch - Eli Hoffberg");
  }


}


