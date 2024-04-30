package Cloning;

class Person implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int [] {5, 3, 6, 1, 4, 2};
    }

    public Person(Person old) {
        this.age = old.age;
        this.name = old.name;
    }

//    @Override
//    public Person clone() {
//        try {
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return (Person) super.clone(); // Shallow Copy of Person Object
//        } catch (CloneNotSupportedException e) { // Gives Exception if Cloneable interface is not implemented;
//            throw new AssertionError("Implement Cloneable interface in Parent Class");
//        }
//    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();  // Shallow Copy till here
            int[] temp = new int[arr.length];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            clone.arr =  temp;
            return clone; // Deep Copy of Person Object (i.e. creating new object so that change in original
            // array object doesn't reflect in cloned object and vice versa.
        } catch (CloneNotSupportedException e) { // Gives Exception if Cloneable interface is not implemented;
            throw new AssertionError("Implement Cloneable interface in Parent Class");
        }
    }
}
