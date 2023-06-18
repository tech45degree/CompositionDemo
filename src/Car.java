public class Car {
    private String name;
    private String color;
    private Engine engine;

    public Car(String name, String color,String engineType,int horsePower) {
        this.name = name;
        this.color = color;
        this.engine = new Engine(engineType,horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
