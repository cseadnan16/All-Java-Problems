package abstract_demo;

abstract class Abstract_Class {
   abstract void demo();
}

class help_class extends Abstract_Class{
    @Override
    void demo()
    {
        System.out.println("Adnan Al Nowshad");
    }
}
