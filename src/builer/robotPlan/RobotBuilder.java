package builer.robotPlan;

/**
 * defines what every robot has
 *
 * @author kkddyz
 */
public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotTorso();

    void buildRobotArms();

    void buildRobotLegs();

    Robot getRobot();
}
