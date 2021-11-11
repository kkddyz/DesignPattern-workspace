package headfirst_design_pattern.ProxyPattern.staticProxy.src;

public class Test {
    public static void main(String[] args) {
        // Aa情趣公司
        ManToolsFactory factory = new AaFactory();
        // lison代购
        LiSon liSon =  new LiSon(factory);
        liSon.saleManTools("D");
    }
}
