package exercise10;

public class Fox {

  private String name;
  private String type;
  private String color;

  public Fox(String name, String color, String type) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }
}
