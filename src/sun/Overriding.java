package sun;

// 메서드 재정의 override
// 객체지향 3대 개념중 다형성에 해당
// 상속관계에 있는 상위클래스의 메서드를
// 하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미
// 즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말함
public class Overriding {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        System.out.println( ani.cry() );
        System.out.println( c.cry() );
        System.out.println( d.cry() );
    }
}


class Animal {
    protected String cry(){ return "동물이 웁니다"; }
}

class Cat extends Animal{
    @Override //원래는 부모클래스에 정의되있는 cry 이지만, 자식클래스에서 재작성하였다 라는 표시의 일종[컴파일러가 판별하기위한 주석]
    protected String cry() { return "야옹~ 야옹~"; }
}
class Dog extends Animal{
    @Override
    protected String cry() { return "멍~ 멍~"; }
}