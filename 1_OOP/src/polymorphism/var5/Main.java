package polymorphism.var5;
/*
Родительский метод полностью перекрыт.
В этом ключевая особенность полиморфизма –
наследники могут изменить родительское поведение,
даже если обращение к ним производиться по ссылке родительского типа.
Хотя старый метод снаружи недоступен,
внутри класса-наследника к нему можно обратиться с помощью super.
Статические методы, подобно статическим полям принадлежат
классу и появление наследников на них не сказывается.
Статические методы не могут перекрывать обычные методы и наоборот.
 */
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.getValue()); // результатом будет 1
        System.out.println(((Parent) c).getValue()); // результатом будет 1
    }
}

