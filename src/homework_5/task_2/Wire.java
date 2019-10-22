package homework_5.task_2;

public class Wire {

  private int length;
  private double crossSection;

  public Wire(int length, double crossSection) {
    this.length = length;
    this.crossSection = crossSection;
  }

  @Override
  public String toString() {
    return "Wire{" +
            "length=" + length +
            ", crossSection=" + crossSection +
            '}';
  }
}