// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.List;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import lib.Forge.RobotState.RobotLifeCycle;

public class RobotContainer {

  private final List<RobotLifeCycle> lifecycleSubsystems;

  public RobotContainer() {
    configureBindings();

    lifecycleSubsystems = List.of(RobotState.getInstance());

  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  public List<RobotLifeCycle> getLifeCycle() {
    return lifecycleSubsystems;
  }
}
