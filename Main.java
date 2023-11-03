import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner (System.in);

        System.out.print("Masukkan nama anggota keluarga : ");
        String rootName = scanner.nextLine();
        System.out.print("Masukkan umur anggota keluarga : ");
        int rootAge = scanner.nextInt();
        scanner.nextLine();

        FamilyMember root = new FamilyMember(rootName, rootAge);

        System.out.print("masukkan nomer ki " + rootName + ": ");
        int numChildren = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numChildren; i++) {
            System.out.print("Masukkan nama anak " + (i + 1) + ": ");
            String childName = scanner.nextLine();
            System.out.print("Maukkan umur anak" + (i + 1) + ": ");
            int childAge = scanner.nextInt();
            scanner.nextLine();

            FamilyMember child = new FamilyMember(childName, childAge);
            root.addChild(child);
        }

        FamilyTree familyTree = new FamilyTree(root);

        LinkedList<FamilyMember> children = familyTree.getRoot().getChildren();
        for (FamilyMember child : children) {
            System.out.println("Nama anak: " + child.getName());
            System.out.println("Umur anak: " + child.getAge());


    }
 }
}