package StructuralPattern;

/**
 * Author: Sweetie77
 * Created: 2019/5/30
 */
//原有的接口, 不符合客户要求
interface IOrigin {
    public void deal();
}

//定义一个符合客户要求的新接口
interface ITarget {
    public void newDeal(int type);
}

class Target implements ITarget {
    private IOrigin origin;

    public void newDeal(int type) {
        if (type == 0) {
            origin.deal();
        } else {
            //somethings else
        }
    }
}

public class Adapter {
    public void test() {
        //原来是IOrigin接口但是不符合我要求, 所以用ITarget适配一下
        ITarget target = new Target();
        target.newDeal(1);
    }
}
