public class main {
    public static void main(String[] args) throws Exception {

Dog dg1 = new Dog("Buddy", 9, "Puggle");

Dog dg2 = new Dog("Princess", 3, "Pitbull");

Dog dg3 = new Dog("Jake", 12, "German Shorthair");



System.out.println(dg1.age);
System.out.println(dg3.breed);
System.out.println(dg2.name);

dg1.isOld();
dg2.isOld();
dg3.isOld();

dg2.favBreed();
dg3.favBreed();
dg1.favBreed();












    }
}
