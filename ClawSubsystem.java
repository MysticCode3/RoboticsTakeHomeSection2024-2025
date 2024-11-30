package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClawSubsystem extends SubsystemBase {
    private final Compressor compressor;
    private final DoubleSolenoid clawSolenoid;

    public ClawSubsystem() {
        // Initialize the compressor
        compressor = new Compressor(PneumaticsModuleType.CTREPCM);
        compressor.enableDigital();

        // Initialize the solenoid
        clawSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM);
    }

    // Method to open the claw
    public void openClaw() {
        clawSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    // Method to close the claw
    public void closeClaw() {
        clawSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}
