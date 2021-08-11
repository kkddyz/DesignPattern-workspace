package builder.robotPlan;

/**
 * defines all the methods a robot must have
 *
 * @author kkddyz
 */
public interface RobotPlan {

    void setRobotHead(String head);

    /**
     * @param torso 躯干
     */
    void setRobotTorso(String torso);

    void setRobotArms(String arms);

    void setRobotLegs(String legs);


}
