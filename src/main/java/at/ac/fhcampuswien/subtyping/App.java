package at.ac.fhcampuswien.subtyping;

public class App {

    public static void main(String[] args) {
        SubTypeC subTypeC = new SubTypeC();
        BaseTypeA baseTypeA = subTypeC;
        BaseTypeA baseTypeA1 = new SubTypeE();
        baseTypeA.method1();
        baseTypeA1.method1();

        SubTypeD subTypeD = new SubTypeD();
        BaseTypeB baseTypeB = subTypeD;
        BaseTypeB baseTypeB1 = new SubTypeF();
        subTypeD.method1();
        baseTypeB.method1();
        baseTypeB1.method1();
    }
}
