public class extended extends newInheritance {
    int show(){
        System.out.println("This is "+ super.a);
        return super.a;
    }
    int function2(){
        int w = super.a * super.a;
        return w;
    }
    int showmeb(){
        System.out.println("This is b" + newInheritance.b);
        return 1;
    }


    public static void main(String[] args) {
        extended obj1 = new extended();
        int xyz = obj1.show();
        System.out.println(obj1.function2());
        System.out.println(newInheritance.b);
    }
    
}
