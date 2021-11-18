package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Wheel;


public class MoveWheel extends CommandBase{
    /** Creates a new Turn. */
  private double speed;
  private Wheel wheelToMove;
  private double m_duration;
  private long m_startTime;

  public MoveWheel(Wheel wheelToMove, double speed, double time) {
    this.speed = speed;
    this.wheelToMove = wheelToMove;
    m_duration = 1000*time;
    addRequirements(wheelToMove);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  @Override
  public void initialize() {
    m_startTime = System.currentTimeMillis();
  }

  @Override
  public void execute() {
  //drive.arcadeDrive(0, this.speed);
  wheelToMove.moveWheel(speed);
  }

  @Override
  public void end(boolean interrupted){
  wheelToMove.moveWheel(0.0);
  }
    @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) >= m_duration;
  }
}




