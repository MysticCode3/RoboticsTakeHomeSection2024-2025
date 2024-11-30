package IntakeSubsystem;

public interface IntakeIO {
    public static class IntakeIOInputs {
        public boolean pieceDetected = false;
        public double speed = 0;
    }

    public void updateInputs(IntakeIOInputs inputs);
    public void setIntakeSpeed(double speed);
}
