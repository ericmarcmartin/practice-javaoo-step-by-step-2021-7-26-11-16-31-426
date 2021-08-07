package practice09;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(classes ==null){
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce()) ;
        }
        else if(classes.size()>1){
            String klasses ="";
            for(Klass klass : classes){
                if(classes.getFirst().equals(klass)){
                    klasses = String.format("%s",klass.getNumber());
                }
                else{
                    klasses = String.format("%s, %s",klasses,klass.getNumber());
                }
            }
            return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), klasses);

        }
        return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), classes.getFirst().getNumber());
    }

}
