package builer.robotPlan;

/**
 * Set the fields for Robots built using this specific specification(具体规格)
 *
 * @author kkddyz
 */
public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Old Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Old torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Old Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Old Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }


}
