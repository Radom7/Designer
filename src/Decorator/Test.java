package Decorator;

/**
 * @Title: Test
 * @Description: 装饰器模式
 *               意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 *
 *               主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 *
 *               何时使用：在不想增加很多子类的情况下扩展类。
 *
 *               如何解决：将具体功能职责划分，同时继承装饰者模式。
 *
 *               优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 *
 *               缺点：多层装饰比较复杂。
 *
 *               使用场景： 1、扩展一个类的功能。
 *                        2、动态增加功能，动态撤销。
 *
 *               注意事项：可代替继承。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 9:36
 */
public class Test {

    public static void main(String[] args) {
        Person american = new American();

        Person whiteAmerican = new WhitePersonDecorator(new American());

        Person whiteEnglish = new WhitePersonDecorator(new English());

        american.speak();
        System.out.println();
        whiteAmerican.speak();
        System.out.println();
        whiteEnglish.speak();

    }

}
