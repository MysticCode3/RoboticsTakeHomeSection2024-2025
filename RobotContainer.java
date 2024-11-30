package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.commands.OpenClawCommand;
import frc.robot.commands.CloseClawCommand;
import frc.robot.subsystems.ArcadeDriveSubsystem;
import frc.robot.subsystems.PneumaticsClawSubsystem;


public class RobotContainer {
    private final ArcadeDriveSubsystem driveSubsystem = new ArcadeDriveSubsystem();
    private final PneumaticsClawSubsystem clawSubsystem = new PneumaticsClawSubsystem();
    private final Joystick joystick = new Joystick(0);

    public RobotContainer() {
        driveSubsystem.setDefaultCommand(new RunCommand(() -> driveSubsystem.arcadeDrive(-joystick.getY(), joystick.getZ()));
        joystickButton = joystick.getButton(1);
        joystickButton.whenPressed(OpenClawCommand(clawSubsystem));
        joystickButton.whenReleased(CloseClawCommand(clawSubsystem));
    }
}
