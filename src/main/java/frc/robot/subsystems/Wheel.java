package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Wheel extends SubsystemBase {
  // The Romi has the left and right motors set to
  // PWM channels 0 and 1 respectively
  private final Spark m_Motor;
  private final SpeedController m_WheelDrive;

  /** Creates a new Wheel. */
  public Wheel(String side) {
    int channel = 0;  
    if(side == "left"){
        channel = 0;
    } else if (side == "right"){
        channel = 1;
    }
    
    m_Motor = new Spark(channel);
    m_WheelDrive = m_Motor;
  }

  public void moveWheel(Double speed){
      m_WheelDrive.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
