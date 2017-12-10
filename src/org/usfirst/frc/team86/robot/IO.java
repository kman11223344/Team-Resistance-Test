package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.joystick.Joystick;
import edu.wpi.first.wpilibj.victor.Victor;

public class IO {
	public static Victor Shooter = new Victor(0)
	public static Victor Conveyor = new Victor(1)
	public static Victor Agitator = new Victor(2)
	public static Victor Vibrator = new Victor(3)
	public static Victor Snorfler = new Victor(4)
	public static Victor Left Front Drive = new Victor(5)
	public static Victor Left Rear Drive = new Victor(6)
	public static Victor Right Front Drive = new Victor(7)
	public static Victor Right Rear Drive = new Victor(8)
	
	public static Joystick Left Joystick = new Joystick(0)
	public static Joystick Right Joystick = new Joystick(1)
	public static Joystic Co Joystic = new Joystic(2)
}
