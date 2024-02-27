// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {
  TalonFX fMotor; // working
  TalonFX lMotor; // not

  /** Creates a new MotorSubsystem. */
  public MotorSubsystem() {
    fMotor = new TalonFX(6); // the one thats working
    lMotor = new TalonFX(4); // the one thats not
  }

  public void setPivot(double speed) {
    SmartDashboard.putNumber("sped", speed);
    lMotor.set(speed); // not working
    fMotor.set(-speed); // working
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
