// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorSubsystem;

public class MotorCommand extends Command {
  MotorSubsystem motorSubsystem;
  DoubleSupplier speed, speed2;

  /** Creates a new MotorCommand. */
  public MotorCommand(MotorSubsystem motorSubsystem, DoubleSupplier speed, DoubleSupplier speed2) {
    this.motorSubsystem = motorSubsystem;
    this.speed = speed;
    this.speed2 = speed2;
    addRequirements(motorSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    motorSubsystem.setPivot(speed2.getAsDouble());
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  } 
}
