package homework.adapter;

/**
 * 救护车适配器，充当适配器
 * @author kkddyz
 */
public class AmbulanceCarAdapter extends CarController {
    /**
     * 定义适配者AmbulanceSound对象
     */
    private AmbulanceSound sound;
    /**
     * 定义适配者AmbulanceLamp对象
     */
    private AmbulanceLamp lamp;

    public AmbulanceCarAdapter() {
        sound = new AmbulanceSound();
        lamp = new AmbulanceLamp();
    }

    //发出救护车声音
    @Override
    public void phonate() {
        //调用适配者类AmbulanceSound的方法
        sound.alarmSound();
    }

    //呈现救护车灯闪烁
    @Override
    public void twinkle() {
        //调用适配者类AmbulanceLamp的方法
        lamp.alarmLamp();
    }
}