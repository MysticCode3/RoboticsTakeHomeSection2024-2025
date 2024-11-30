package IntakeSubsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;

public class IntakeIOTalon implements IntakeIO{
    private final WPI_TalonSRX intakeMotor;
    private final DigitalInput colorSensor;

    public IntakeIOTalon() {
        intakeMotor = new WPI_TalonSRX(0);
        colorSensor = new DigitalInput(1);
    }

    @Override
    public void updateInputs(IntakeIOInputs inputs) {
        inputs.speed = intakeMotor.get();
        inputs.pieceDetected = colorSensor.get();
    }

    @Override
    public void setIntakeSpeed(double speed) {
        intakeMotor.set(speed);
    }
    
}
