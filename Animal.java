public class Animal {
    String name;
    int age;
    String species;
    
    public Animal(String n, int a, String s) {
        name = n;
        age = a;
        species = s;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getSpecies(){
        return species;
    }


    public static void main(String[] args) {
        Animal elephant = new Animal("Jason", 18, "Elephant");

        System.out.println(elephant.getName());
        System.out.println(elephant.getAge());
        System.out.println(elephant.getSpecies());
        

    }
    


}