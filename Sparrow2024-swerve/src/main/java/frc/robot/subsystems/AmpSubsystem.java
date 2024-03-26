package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AmpSubsystem {

    public int upperAmpMotorInt = 15;
    public int lowerAmpMotorInt = 16;
    

    private CANSparkMax upperAmpMotor = new CANSparkMax(upperAmpMotorInt, MotorType.kBrushless);
    private CANSparkMax lowerAmpMotor = new CANSparkMax(lowerAmpMotorInt, MotorType.kBrushless);

    public void runAmpMotors(int whatToDo) {

        if (whatToDo == 0){
            
        upperAmpMotor.set(1);
        lowerAmpMotor.set(-1);

        }

        if (whatToDo == 0){
            
        upperAmpMotor.set(-1);
        lowerAmpMotor.set(1);

        }

        if (whatToDo == 0){
            
        upperAmpMotor.set(0);
        lowerAmpMotor.set(0);

        }

    }


}
