import java.util.Scanner;

public class dilux extends pizza {
  public dilux(boolean veg) {
    super(veg);
  }

  @Override
  public void addExtrachees() {
    this.price += extraChess;
  }

  @Override
  public void addExtratoping() {
    this.price += extraToping;
  }
}
