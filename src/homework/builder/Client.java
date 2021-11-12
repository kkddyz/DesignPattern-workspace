package homework.builder;

import homework.builder.components.Panel;

import javax.swing.*;

/**
 * @author kkddyz
 * @date 2021/11/12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new ConcreteBuilder1());
        Director director2 = new Director(new ConcreteBuilder2());

        Panel panel1 = director1.constructProduct();
        Panel panel2 = director2.constructProduct();


        panel1.display();
        panel2.display();


    }
}


