package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Shooter extends SubsystemBase{
    private SparkMaxConfig motorConfig;
  
  private  SparkMax intakePivot; 
  private  SparkMax intakePivotFollower;
    public Shooter(){
        intakePivot = new SparkMax(Constants.IntakePivotConstants.INTAKE_PIVOT_ID, MotorType.kBrushless);
        intakePivotFollower = new SparkMax(Constants.IntakePivotConstants.INTAKE_PIVOT_FOLLOWER_ID, MotorType.kBrushless);
        

    }
    public void setShooterSpeed(double speed){
        intakePivot.set(speed);
        //can be replaced with follower and leader
        intakePivotFollower.set(-speed);

    }
    public void stopShooter(){
      intakePivot.stopMotor();
      intakePivotFollower.stopMotor();
    }
    
      
    
}