package org.usfirst.frc.team86.robot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
public class Drive {
	private Victor lfDrive;
	private Victor rfDrive;
	private Victor lrDrive;
	private Victor rrDrive;
	private Victor RobotDrive drive;
	long prevTime;
	int state = 0;
	long elapsedTime;
	
	public Drive(Victor leftFront, Victor rightFront, Victor leftRear, Victor rightRear) {
		lfDrive = leftFront;
		rfDrive = rightFront;
		lrDrive = leftRear;
		rrDrive = rightRear;
		drive = new RobotDrive(lfDrive, lrDrive, rfDrive, rrDrive);
	}	
	public void init() {
		lfDrive.set(0);
		rfDrive.set(0);
		lrDrive.set(0);
		rrDrive.set(0);
	}
	public void autoUpdate() {
		switch(state) {
		case 0:
			prevTime = System.currentTimeMillis();
			state++;
			break;
		case 1:
			elapsedTime = System.currentTimeMillis();
			if(elapsedTime - prevTime > 3000) {
				prevTime = System.currentTimeMillis();
				state++;
			} else {
				drive.tankDrive(.5, .5);
			}
			break;
		case 2:
			elapsedTime = System.currentTimeMillis();
			if(elapsedTime > 2500) {
				prevTime = System.currentTimeMillis();
				state++;
			} else {
				drive.tankDrive(.25, -.25);
			}
			break;
		case 3:
			elapsedTime = System.currentTimeMillis();
			if(elapsedTime > 3000) {
				prevTime = System.currentTimeMillis();
				state++;
			} else {
				drive.tankDrive(-.5, -.5);
			}
			break;
		default:
			drive.tankDrive(0, 0);
			break;
			
			}
		}
	public void teleopUpdate() {
		double leftY = IO.leftJoystick.getY();
		double rightY = IO.rightJoystick.getY();
		drive.tankDrive(leftY, rightY);
	}

}
