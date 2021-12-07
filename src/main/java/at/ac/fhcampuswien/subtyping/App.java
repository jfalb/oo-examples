package at.ac.fhcampuswien.subtyping;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

    public static void main(String[] args) {
        SubTypeC subTypeC = new SubTypeC();
        BaseTypeA baseTypeA = subTypeC;
        BaseTypeA baseTypeA1 = new SubTypeE();
        baseTypeA.method1();
        baseTypeA1.method1();

        System.out.println("Results of interfaces:");
        
        SubTypeD subTypeD = new SubTypeD();
        BaseTypeB baseTypeB = subTypeD;
        BaseTypeB baseTypeB1 = new SubTypeF();
        baseTypeB.method1();
        baseTypeB1.method1();

        subTypeC.method1();
        subTypeD.method1();

        try {
            FileOutputStream fos = new FileOutputStream("objects.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(subTypeC);
            oos.writeObject(subTypeD);
            oos.close();

            System.out.println("objects written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
