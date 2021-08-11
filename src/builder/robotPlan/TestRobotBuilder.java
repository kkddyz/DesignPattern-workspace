package builder.robotPlan;

/**
 * @author kkddyz
 */
public class TestRobotBuilder {

    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        Robot robot = oldStyleRobot.build();
        System.out.println("Robot built");
        System.out.println(robot);
    }
}
