package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;
import frc.robot.commands.RumbleCommand;

import static frc.robot.RobotContainer.controller;


public class DriveCommand extends CommandBase {

    private final DriveTrain drivetrain;

    double speed;


    public DriveCommand(DriveTrain m_drivetrain, double speed) {
        // each subsystem used by the command must be passed into the addRequirements() method (which takes a vararg of Subsystem)
        drivetrain = m_drivetrain;
        addRequirements(m_drivetrain);

        this.speed = speed;




    }


    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        drivetrain.motorSpin(speed);
        controller.setRumble(GenericHID.RumbleType.kLeftRumble, 0.5);

    }

    @Override
    public boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.motorSpin(0);
        controller.setRumble(GenericHID.RumbleType.kLeftRumble, 0.0);
    }
}
