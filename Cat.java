package day13;

import java.util.concurrent.Callable;

/**
 * Author: Sweetie77
 * Created: 2019/6/3
 */
abstract class Animal{
    abstract void say();
}
public abstract class Cat  extends Animal{
    public Cat(){
        System.out.println("i am a cat");
    }

    public static void main(String[] args) {
        Cat cat  = new Cat() {
            @Override
            void say() {
                System.out.println("heihei");
            }
        };
    }
}
