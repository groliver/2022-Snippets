package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

import static frc.robot.RobotContainer.controller;


public class RumbleCommand extends CommandBase {

    public final DriveTrain driveTrain;



    public RumbleCommand(DriveTrain m_driveTrain) {
        this.driveTrain = m_driveTrain;
        // each subsystem used by the command must be passed into the addRequirements() method (which takes a vararg of Subsystem)
        addRequirements(m_driveTrain);

    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        controller.setRumble(GenericHID.RumbleType.kRightRumble, 0.5);
    }


    @Override
    public void end(boolean interrupted) {controller.setRumble(GenericHID.RumbleType.kLeftRumble, 0.5);}
}
