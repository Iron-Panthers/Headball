package main;

import classes.Constants;
import classes.Field;
import classes.KeyListen;
import classes.Score;

public class Main {
	public static Field field;
	public KeyListen keyList;
	public static int scoreright = 0;
	public static int scoreleft = 0;
	public static int somedumnumx = 50;
	public static int somedumnumy = 50;
	public static void main(String[]args) {
		if (Main.field.ball.xPosition > Constants.goal1x - somedumnumx && Main.field.ball.xPosition < Constants.goal1x + somedumnumx && Main.field.ball.yPosition > Constants.goal1y + somedumnumy && Main.field.ball.yPosition < Constants.goal1y + somedumnumy) {
			scoreright++;
			Main.field.ball.setPosition(0,0);
		}
		if (Main.field.ball.xPosition > Constants.goal2x - somedumnumx && Main.field.ball.xPosition < Constants.goal2x + somedumnumx && Main.field.ball.yPosition > Constants.goal2y + somedumnumy && Main.field.ball.yPosition < Constants.goal2y + somedumnumy) {
			scoreleft ++;
			Main.field.ball.setPosition(0,0);

	}
	}}
