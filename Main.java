import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    System.out.println(" --------------Welcome to Pizzamenia!--------------");
    System.out.println("Which Pizza would you like to order?\n" + "1. Veg Pizza              $300/- \n"
        + "2. Non-Veg Pizza          $400/- \n" + "3. Delux Veg Pizza        $550/- \n" + "4. Delux Non-Veg Pizza    $650/- \n");
    int ch = in.nextInt();
    switch (ch){
      case 1:
        pizza vegpizza = new pizza(true);
        vegpizza.addExtratoping();
        vegpizza.addExtrachees();
        vegpizza.addpacking();
        vegpizza.getBill();
        break;

        case 2:
        pizza nonvegpizza = new pizza(false);
        nonvegpizza.addExtratoping();
        nonvegpizza.addExtrachees();
        nonvegpizza.addpacking();
        nonvegpizza.getBill();
        break;

      case 3:
        dilux veg = new dilux(true);
        veg.basepizzaprice = 550;
        veg.addExtratoping();
        veg.addExtrachees();
        veg.addpacking();
        veg.getBill();
        break;

      case 4:
        dilux nonveg = new dilux(false);
        nonveg.basepizzaprice = 650;
        nonveg.addExtratoping();
        nonveg.addExtrachees();
        nonveg.addpacking();
        nonveg.getBill();
        break;
      

        
      default:
        System.out.println("Invalid Input"); 
    }

  }
}
