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
/* 
public class Move extends Command{
    private TankDrive tankDrive;
    private double speed;
    private double turn;
    public Move(TankDrive tankDrive, double speed, double turn){
        this.tankDrive = tankDrive;
        this.speed = speed;
        this.turn = turn;
                
            }
            
            @Override
            public void initialize() {
             
            }
          
            // Called every time the scheduler runs while the command is scheduled.
            @Override
            public void execute() {
              tankDrive.move(speed, turn); 
            }
          
            // Called once the command ends or is interrupted.
            @Override
            public void end(boolean interrupted) {
              tankDrive.stop();
            }
          
            // Returns true when the command should end.
            @Override
            public boolean isFinished() {
              return false;
            }
          
          
}
            */