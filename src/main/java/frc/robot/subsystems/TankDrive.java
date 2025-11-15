package frc.robot.subsystems;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;


public class TankDrive {
    private SparkMax leftLeader;
  private SparkMax leftFollower;
  private SparkMaxConfig motorConfig;
  private SparkMax rightLeader;
  private SparkMax rightFollower;
    public TankDrive(){
        leftLeader = new SparkMax(Constants.DriveConstants.LEFT_LEADER_ID, MotorType.kBrushless);
        leftFollower = new SparkMax(Constants.DriveConstants.LEFT_FOLLOWER_ID, MotorType.kBrushless);
        rightLeader = new SparkMax(Constants.DriveConstants.RIGHT_LEADER_ID, MotorType.kBrushless);
        rightFollower = new SparkMax(Constants.DriveConstants.RIGHT_FOLLOWER_ID, MotorType.kBrushless);
        
    }
    public void move(double speed){
      leftLeader.set(speed);
      leftFollower.set(speed);
      rightLeader.set(-speed);
      rightFollower.set(-speed);
    }
    public void turn(double speed){
      leftLeader.set(speed);
      leftFollower.set(speed);
      rightLeader.set(speed);
      rightFollower.set(speed);
    }
}
