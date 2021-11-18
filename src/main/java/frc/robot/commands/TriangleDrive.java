package frc.robot.commands;

import frc.robot.subsystems.Wheel;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class TriangleDrive extends CommandBase{
  
  public TriangleDrive(Wheel rightWheel, Wheel leftWheel, double speed) {
    
    new SequentialCommandGroup(
        new ParallelCommandGroup(
            new MoveWheel(rightWheel, speed, 5),
            new MoveWheel(leftWheel, speed, 5)
        ), 
        new MoveWheel(rightWheel, speed, 1),
        new ParallelCommandGroup(
            new MoveWheel(rightWheel, speed, 5),
            new MoveWheel(leftWheel, speed, 5)
        ), 
        new MoveWheel(rightWheel, speed, 1),
        new ParallelCommandGroup(
            new MoveWheel(rightWheel, speed, 5),
            new MoveWheel(leftWheel, speed, 5)
        ), 
        new MoveWheel(rightWheel, speed, 1)
    );
  }
}
