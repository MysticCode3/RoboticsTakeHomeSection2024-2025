package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PneumaticsClawSubsystem;

public class CloseClawCommand extends CommandBase {
    private final PneumaticsClawSubsystem clawSubsystem;

    public CloseClawCommand(ClawSubsystem _clawSubsystem) {
        clawSubsystem = _clawSubsystem;
        addRequirements(clawSubsystem);
    }

    @Override
    public void initialize() {
        clawSubsystem.closeClaw();
    }

    @Override
    public boolean isFinished() {
        return true; // The action is instantaneous
    }
}
