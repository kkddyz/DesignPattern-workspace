package homework.proportyoe;

import javax.swing.*;

public class Picture extends JPanel {

    private String path;


    public Picture() {
    }

    public Picture(String path) {
        this.path = path;
        ImageIcon imageIcon = new ImageIcon(path);
        JLabel l1 = new JLabel(imageIcon);
        this.add(l1);
    }

    /**
     * 修改状态
     */
    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
