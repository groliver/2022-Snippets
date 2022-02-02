package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.MOTOR_ID;

public class DriveTrain extends SubsystemBase {



    WPI_TalonFX motor = new WPI_TalonFX(MOTOR_ID);

    // With eager singleton initialization, any static variables/fields used in the 
    // constructor must appear before the "INSTANCE" variable so that they are initialized 
    // before the constructor is called when the "INSTANCE" variable initializes.

    /**
     * The Singleton instance of this DriveTrainSubsystem. Code should use
     * the {@link #getInstance()} method to get the single instance (rather
     * than trying to construct an instance of this class.)
     */
    private final static DriveTrain INSTANCE = new DriveTrain();

    @SuppressWarnings("WeakerAccess")
    public static DriveTrain getInstance() {
        return INSTANCE;
    }

    /**
     * Creates a new instance of this DriveTrainSubsystem. This constructor
     * is private since this class is a Singleton. Code should use
     * the {@link #getInstance()} method to get the singleton instance.
     */

    public void motorSpin(double ammount){
        motor.set(ammount);
    }

    public void rumble(){

    }

    public DriveTrain() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.


    }
}

