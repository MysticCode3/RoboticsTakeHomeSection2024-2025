package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Robot extends TimedRobot {

    @Override
    public void robotInit() {
        RobotContainer = new RobotContainer();
    }

    @Override
    public void teleopPeriodic() {
    }
}
