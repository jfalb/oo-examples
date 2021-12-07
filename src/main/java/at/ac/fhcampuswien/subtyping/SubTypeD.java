package at.ac.fhcampuswien.subtyping;

import java.io.Serializable;

public class SubTypeD implements BaseTypeB, Serializable {
    @Override
    public void method1() {
        System.out.println("Method implementation / Variante 1");
    }
}
