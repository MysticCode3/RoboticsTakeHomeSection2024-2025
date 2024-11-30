package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClawSubsystem extends SubsystemBase {
    private final Compressor compressor;
    private final DoubleSolenoid clawSolenoid;

    public ClawSubsystem() {
        compressor = new Compressor(PneumaticsModuleType.CTREPCM);
        compressor.enableDigital();

        clawSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM);
    }

    public void openClaw() {
        clawSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void closeClaw() {
        clawSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}
