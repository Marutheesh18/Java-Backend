
class MemberInnerClass {
    String greet="Hi" ;

    class Inner {

        void msg(){
            System.out.println(greet);
        }
    }

    public static void main(String[] args) {
        
        MemberInnerClass outer=new MemberInnerClass();
        MemberInnerClass.Inner in=outer.new Inner();

        in.msg();
    }
}
