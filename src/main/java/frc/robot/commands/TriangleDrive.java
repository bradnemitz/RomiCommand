package frc.robot.commands;

import frc.robot.subsystems.Wheel;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class TriangleDrive extends SequentialCommandGroup{
  
  public TriangleDrive(Wheel rightWheel, Wheel leftWheel) {
    
    new SequentialCommandGroup(
      new ParallelCommandGroup(
          new MoveWheel(rightWheel, 0.25, 2),
          new MoveWheel(leftWheel, 0.25, 2)
      ), 
      new MoveWheel(rightWheel, 0.25, 2),
      new ParallelCommandGroup(
          new MoveWheel(rightWheel, 0.25, 2),
          new MoveWheel(leftWheel, 0.25, 2)
      ), 
      new MoveWheel(rightWheel, 0.25, 2),
      new ParallelCommandGroup(
          new MoveWheel(rightWheel, 0.25, 2),
          new MoveWheel(leftWheel, 0.25, 2)
      ), 
      new MoveWheel(rightWheel, 0.25, 2)
    );
  }
  /*
  public TriangleDrive(Wheel rightWheel, Wheel leftWheel, double speed) {
    
    new SequentialCommandGroup(
        new ParallelCommandGroup(
            new MoveWheel(rightWheel, speed, 2),
            new MoveWheel(leftWheel, speed, 2)
        ), 
        new MoveWheel(rightWheel, speed, 0.5),
        new ParallelCommandGroup(
            new MoveWheel(rightWheel, speed, 2),
            new MoveWheel(leftWheel, speed, 2)
        ), 
        new MoveWheel(rightWheel, speed, 0.5),
        new ParallelCommandGroup(
            new MoveWheel(rightWheel, speed, 2),
            new MoveWheel(leftWheel, speed, 2)
        ), 
        new MoveWheel(rightWheel, speed, 0.5)
    );
  }*/
}
