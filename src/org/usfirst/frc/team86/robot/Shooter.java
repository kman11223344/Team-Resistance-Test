package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Victor;

public class Shooter {
	private Victor shooter;
	private Victor conveyer;
	private Victor agitator;
	private Victor vibrator;
	private Victor snorfler;
	
	public shooter(Victor shoot, Victor convey, Victor ag, Victor vb, Victor snorf) {
		shooter = shoot;
		conveyer = convey;
		agitator = ag;
		vibrator = vb;
		snorfler = snorf;
	}
	public void init() {
		shooter.set(0);
		conveyer.set(0);
		agitator.set(0);
		vibrator.set(0);
		snorfler.set(0);
	}
	public void update() {
		if(IO.coJoystick.getRawButton(1) && IO.coJoystick.getRawButton(3))
			shooter.set(.65);
			conveyer.set(1)
			agitator.set(.3);
			vibrator.set(.5);
	} else if (IO.coJoystick.getRawButton(1) && !IO.coJoystick.getRawButton(3)) {
		shooter.set(.65);
		conveyer.set(1);
		agitator.set(0);
		vibrator.set(0);
	} else {
		shooter.set(0);
		conveyer.set(0);
		agitator.set(0);
		vibrator.set(0);
	}
	if (IO.coJoystick.getRawButton(5)) {
		snorfler.set(.25);
	} else {
		snorfler.set(0);
	}
}
