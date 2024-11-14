public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String n, int a, String b){
        name = n;
        age = a;
        breed = b;
    }
void isOld(){
    if(this.age > 8){
        System.out.println(this.name + " is a lil old");
    
    }else{
        System.out.println(this.name + " is a young buck here");
    }
}

void favBreed(){
    if(this.breed =="Puggle"){
        System.out.println(this.name + " is my favorite");

    }else {
        System.out.println(this.name + " is not my favorite dog");
    }
}

    
    
    
    
    
    
    }

