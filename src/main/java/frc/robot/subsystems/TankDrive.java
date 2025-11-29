package frc.robot.subsystems;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import java.util.function.Supplier;

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
  private SparkMaxConfig globalConfig;
  private SparkMaxConfig leftLeaderConfig;
  private SparkMaxConfig leftFollowerConfig;
  private SparkMaxConfig rightLeaderConfig;
  private SparkMaxConfig rightFollowerConfig;
  private SparkMax rightLeader;
  private SparkMax rightFollower;
  private Supplier<Double> leftAxis;
  private Supplier<Double> rotationAxis;
    public TankDrive(Supplier<Double> forward, Supplier<Double> rotate){
      leftAxis = forward;
      rotationAxis = rotate;
      globalConfig.smartCurrentLimit(50)
      .idleMode(IdleMode.kBrake);
      leftLeaderConfig.apply(globalConfig)
      .inverted(false);
      leftFollowerConfig.apply(globalConfig)
      .follow(leftLeader);
      rightLeaderConfig.apply(globalConfig)
      .inverted(true);
      rightFollowerConfig.apply(globalConfig)
      .follow(rightLeader);
        leftLeader = new SparkMax(Constants.DriveConstants.LEFT_LEADER_ID, MotorType.kBrushless);
        leftFollower = new SparkMax(Constants.DriveConstants.LEFT_FOLLOWER_ID, MotorType.kBrushless);
        rightLeader = new SparkMax(Constants.DriveConstants.RIGHT_LEADER_ID, MotorType.kBrushless);
        rightFollower = new SparkMax(Constants.DriveConstants.RIGHT_FOLLOWER_ID, MotorType.kBrushless);
        leftLeader.configure(leftLeaderConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    leftFollower.configure(leftFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    rightLeader.configure(rightLeaderConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    rightFollower.configure(rightFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }
    public void periodic(){
      double forwardVal = leftAxis.get();
      double rotateVal = rotationAxis.get();

      if(forwardVal>rotateVal){
        leftLeader.set(forwardVal);
        rightLeader.set(forwardVal);
      }
      else{
        leftLeader.set(rotateVal);
        rightLeader.set(-rotateVal);
      }
    }
    /* 
    public void move(double speed, double turn){
      leftLeader.set(speed+ turn);
      leftFollower.set(speed + turn);
      rightLeader.set(speed-turn);
      rightFollower.set(speed-turn);
    }
    
    public void stop(){
      leftLeader.set(0);
      leftFollower.set(0);
      rightLeader.set(0);
      rightFollower.set(0);
    }
      */
}
