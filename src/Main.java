public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.setNumber(12);
//        System.out.println(parent.getNumber());

        Child child = new Child();
        child.setNumber(1488);
        child.name = "child";
//        System.out.println(child.getName());
//        System.out.println(child.getNumber());

        Grandchild grandchild = new Grandchild("Ivanov");
        grandchild.name = "Petr";
        grandchild.setNumber(17);

//        System.out.println(grandchild.getName());
//        System.out.println(grandchild.getLastName());
//        System.out.println(grandchild.getNumber());
        GrangGrandChild ggs = new GrangGrandChild("Ass", "Ssa");
        ggs.setNumber(123);
        Parent[] ps = {parent, child, grandchild, ggs};

        for (Parent p : ps) {
            System.out.println(p.whoAmI());
        }

//        System.out.println(parent.whoAmI());
//        System.out.println(child.whoAmI());
//        System.out.println(grandchild.whoAmI());






    }

}
