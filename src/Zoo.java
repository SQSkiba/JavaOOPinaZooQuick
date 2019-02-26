public class Zoo {
    String favoriteFood = "bacon";

    public static void main(String[] args) {
//        Zoo z = new Zoo();
//        z.sleep("Tigger");
//
//        z.eat("Tigger", "meat");
//        z.eat("Tigger", "bacon");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Animal[] animals = {gemma, stinger, rarity};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,  "meat");
    }




    public void sleep(String name) {
        System.out.print(name + " sleeps for 8 hours");
    }

    public void eat(String name, String food) {
        System.out.print(name + " eats " + food);
        if (food.equals(favoriteFood)) { System.out.print(" YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }

}
