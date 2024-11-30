package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.io.IntakeIO;

public class IntakeSubsystem extends SubsystemBase {
    private boolean pieceDetected = false;
    private double speed;
    private final IntakeIO io;

    public IntakeSubsystem(IntakeIO intakeIO) {
        io = intakeIO;
    }

    public void forward(double speed) {
        io.setSpeed(speed);
    }

    public void backward(double speed) {
        io.setSpeed(-speed);
    }

    @Override
    public void periodic() {
        pieceDetected = io.isPieceDetected();
        speed = io.speed();

        // Update AdvantageKit
        io.updateInputs(pieceDetected, speed);
        Logger.processInputs("GamePieceDetected", pieceDetected);
        Logger.processInputs("Speed", speed);
    }

    public boolean isPieceDetected() {
        return pieceDetected;
    }
}
