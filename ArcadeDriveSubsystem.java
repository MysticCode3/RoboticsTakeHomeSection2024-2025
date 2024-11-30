package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArcadeDriveSubsystem extends SubsystemBase {
    private final CANSparkMax LeftFrontMotor;
    private final CANSparkMax LeftBackMotor;
    private final CANSparkMax RightFrontMotor;
    private final CANSparkMax RightBackMotor;
    private final DifferentialDrive drive;

    public ArcadeDriveSubsystem() {
        // Initialize motor controllers
        LeftFrontMotor = new CANSparkMax(0, MotorType.kBrushless);
        LeftBackMotor = new CANSparkMax(1, MotorType.kBrushless);
        RightFrontMotor = new CANSparkMax(2, MotorType.kBrushless);
        RightBackMotor = new CANSparkMax(3, MotorType.kBrushless);

        // Make front motors fallow back motor
        LeftFrontMotor.follow(LeftBackMotor);
        RightFrontMotor.follow(RightBackMotor);

        // Create DifferentialDrive
        drive = new DifferentialDrive(LeftFrontMotor, RightFrontMotor);
    }

    // Method to drive
    public void arcadeDrive(double speed, double rotation) {
        drive.arcadeDrive(speed, rotation);
    }
}
