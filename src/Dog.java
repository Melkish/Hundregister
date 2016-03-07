


public class Dog {

    private String name;
    private String race;
    private int age;
    private int weight;

    public Dog (String name, String race, int age, int weight) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }


    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return name + " " + race + " " + age + " years old "
                + weight + " kg tail=";
    }

}


