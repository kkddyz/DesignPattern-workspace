package headfirst_design_pattern.ProxyPattern.staticProxy.src;

public class AaFactory implements  ManToolsFactory {
    @Override
    public void saleManTools(String size) {
        System.out.println("根据您的需求，为您定制了一个size为:"+size+"的女模特");
    }
}
