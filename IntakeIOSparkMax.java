package IntakeSubsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DigitalInput;

public class IntakeIOSparkMax implements IntakeIO{

    private final CANSparkMax intakeMotor;
    private final DigitalInput colorSensor;

    public IntakeIOSparkMax() {
        intakeMotor = new CANSparkMax(0, MotorType.kBrushless);
        colorSensor = new DigitalInput(0);
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
