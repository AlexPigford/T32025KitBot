package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.spark.SparkBase.ResetMode;


public class Shooter extends SubsystemBase{
    private SparkMaxConfig motorConfig;
  
  private  SparkMax shootMotor; 
  
    public Shooter(){
        shootMotor = new SparkMax(Constants.ShootConstants.SHOOT_MOTOR_ID, MotorType.kBrushless);
        motorConfig = new SparkMaxConfig();
       motorConfig.smartCurrentLimit(50)
       .idleMode(IdleMode.kCoast)
       .inverted(false);
      shootMotor.configure(motorConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }
    public void setShooterSpeed(double speed){
        shootMotor.set(speed);
        //can be replaced with follower and leader
       

    }
    public void stopShooter(){
      shootMotor.stopMotor();
      
    }
    
      
    
}