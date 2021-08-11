package builer.robotPlan;

/**
 * @author kkddyz
 */
public class TestRobotBuilder {

    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot robot = robotEngineer.getRobot();

        System.out.println("Robot built");
        System.out.println(robot);
    }
}
