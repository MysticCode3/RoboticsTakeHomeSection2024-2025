package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PneumaticsClawSubsystem;

public class OpenClawCommand extends CommandBase {
    private final PneumaticsClawSubsystem clawSubsystem;

    public OpenClawCommand(ClawSubsystem _clawSubsystem) {
        clawSubsystem = _clawSubsystem;
        addRequirements(clawSubsystem);
    }

    @Override
    public void initialize() {
        clawSubsystem.openClaw();
    }

    @Override
    public boolean isFinished() {
        return true; // The action is instantaneous
    }
}
