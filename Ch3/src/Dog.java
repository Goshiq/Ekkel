public class Dog {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    private String  says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "AAAAF");
        Dog scruffy = new Dog("Scruffy", "Ouuuuuuu");
        Dog kek;

        kek = spot;

        System.out.println(spot.getName());
        System.out.println(spot.getSays());
        System.out.println(scruffy.getSays());
        System.out.println(scruffy.getName());
        System.out.println(kek == spot);
        System.out.println(kek.equals(spot));
    }
}

