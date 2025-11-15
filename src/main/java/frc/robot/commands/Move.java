package frc.robot.commands;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TankDrive;

public class Move extends Command{
    private TankDrive drive;
    prive double speed;
    public Move(TankDrive drive, double speed){
        this.drive = drive;
        addRequirments(TankDrive);
        this.speed = speed;
    }
    @Override
    public void execute() {
      drive.move(speed);
    }
}