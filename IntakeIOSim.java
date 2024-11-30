package IntakeSubsystem;

public class IntakeIOSim implements IntakeIO {
    private boolean simulationPieceDetected = false;
    private double simulationSpeed = 0;
    
    @Override
    public void updateInputs(IntakeIOInputs inputs) {
        inputs.pieceDetected = simulationPieceDetected;
        inputs.speed = simulationSpeed;
    }

    @Override
    public void setIntakeSpeed(double speed) {
        simulationSpeed = speed;
    }
    
    public void setPieceDetected(boolean detected) {
        simulationPieceDetected = detected;
    }
}
