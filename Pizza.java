import java.util.Scanner;

public class pizza {
  protected int price;
  private boolean veg;

  protected int extraChess = 100;
  protected int extraToping = 150;
  protected int packing = 20;

  protected int basepizzaprice;

  private boolean isExtrachess = false;
  private boolean isExtratoping = false;
  private boolean ispacking = false;

  Scanner in = new Scanner(System.in);

  public pizza(boolean veg) {
    this.veg = veg;

    if (this.veg) {
      this.price = 300;
    } else {
      this.price = 400;
    }
    basepizzaprice = this.price;
  }

  public void addExtrachees() {
    System.out.println("Extra Cheese (Y/N) ?");
    char ch = in.next().charAt(0);
    switch (ch) {
      case ('y'):
        isExtrachess = true;
        this.price += extraChess;
        break;
      case ('n'):
        isExtrachess = false;
        break;
    }
  }

  public void addExtratoping() {
    System.out.println("Extra Topping (Y/N) ?");
    char ch = in.next().charAt(0);
    switch (ch) {
      case ('y'):
        isExtratoping = true;
        this.price += extraToping;
        break;
      case ('n'):
        isExtratoping = false;
        break;
    }
  }

  public void addpacking() {
    System.out.println("Packing (Y/N) ?");
    char ch = in.next().charAt(0);
    switch (ch) {
      case ('y'):
        ispacking = true;
        this.price += packing;
        break;
      case ('n'):
        ispacking = false;
        break;
    }
  }

  public void getBill() {
    String bill = " ";
    System.out.print("Pizza: " + basepizzaprice + "\n");
    if (isExtrachess) {
      bill += "Extra Cheese: " + extraChess + "\n";
    }
    if (isExtratoping) {
      bill += "Extra Topping: " + extraToping + "\n";
    }
    if (ispacking) {
      bill += "Paking: " + packing + "\n";
    }
    bill += "Total: " + price;
    System.out.println(bill);
    System.out.println("Thank You For Visting Pizzamenia");
  }

}
