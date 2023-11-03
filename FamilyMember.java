
import java.util.LinkedList;

public class FamilyMember {
    private String name;
    private int age;
    private LinkedList<FamilyMember>children;

    public FamilyMember(String name, int age){
        this.name = name;
        this.age = age;
        this.children = new LinkedList<>();
    }
    public void addChild(FamilyMember child){
        this.children.add(child);
    }
    public LinkedList<FamilyMember>getChildren(){
        return this.children;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
