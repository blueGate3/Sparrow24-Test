package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.RobotContainer;
import frc.robot.subsystems.AmpSubsystem;

public class AmpCommand extends Command{
    
    private AmpSubsystem m_AmpSubsystem = new AmpSubsystem();
    private RobotContainer m_RobotContainer = new RobotContainer();

    public AmpCommand(AmpSubsystem m_AmpSubsystem, int whatToDo){
        m_AmpSubsystem.runAmpMotors(whatToDo);
    }
}
