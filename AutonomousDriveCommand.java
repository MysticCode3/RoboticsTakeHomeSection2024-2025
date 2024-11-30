package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.Timer;

import frc.robot.subsystems.ArcadeDriveSubsystem;

public class AutonomousDriveCommand extends CommandBase {

    private final ArcadeDriveSubsystem driveSubsystem = new ArcadeDriveSubsystem();
    private final double duration;
    private final double speed;
    private boolean isTurning = false;
    private double startTime;
    private final Timer timer = new Timer();

    public AutonomousDriveCommand() {
        duration = 15;
        speed = 1;
        addRequiements(driveSubsystem);
    }

    @Override
    public void initialize() {
        timer.reset();
        timer.start();
        isTurning = false;
    }

    @Override
    public void execute() {
        // Moves straight for 15 seconds
        if (!isTurning) {
            if (timer.get() < 15) {
                driveSubsystem.arcadeDrive(speed, 0);
            } else {
                isTurning = true;
                startTime = timer.get();
            }
        // Once 15 seconds is over, turns for 1.5 seconds(could be more or less depending on speed of rotation)
        } else {
            if (timer.get() - startTime < 1.5) {
                driveSubsystem.arcadeDrive(0, 0.5);
            } else {
                driveSubsystem.arcadeDrive(0, 0);
            }
        }
    }
}
