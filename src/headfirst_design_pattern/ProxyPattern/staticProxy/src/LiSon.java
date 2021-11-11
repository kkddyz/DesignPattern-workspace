package headfirst_design_pattern.ProxyPattern.staticProxy.src;
// 代理
public class LiSon implements ManToolsFactory{

    private ManToolsFactory factory;

    public LiSon(ManToolsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void saleManTools(String size) {
        doSomethingBefore(); // 前置增强
        factory.saleManTools(size); // 转发
        doSomethingEnd();    // 后置增强
    }

    private void doSomethingEnd() {
        System.out.println("doSomethingEnd.....");
    }

    private void doSomethingBefore() {
        System.out.println("doSomethingBefore.......");
    }
}
