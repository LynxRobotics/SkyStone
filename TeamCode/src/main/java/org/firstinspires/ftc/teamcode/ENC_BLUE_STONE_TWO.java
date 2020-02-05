package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "ENC_BLUE_STONE_TWO")
public class ENC_BLUE_STONE_TWO extends autoBaseV2 {
    int side = 1;

        boolean spotLeftSensor = false, spotRightSensor = false;

        boolean parkWall = true;


        public void runOpMode() throws InterruptedException {
            chart.init(hardwareMap);

            waitForStart();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
            goToPosition(chart.elevMotor, 360, 1.0);
            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNewFullVolt(27.0), 1.0);

            rest();
            sleep(450);

            goToPosition(chart.BR, chart.TL, distance2encoderNew(0.3), 1.0, false);

            sleep(450);

            //strafe left
            chart.runtime.reset();
            strafe(0.50);
            while(opModeIsActive() && (!SkyStoneReBornRight(chart.colorSensorRight))){

            }
            rest();
            goToPositionDown(chart.elevMotor, 5, -1.0);
            goToPositionStrafeRight(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(2.5), 0.50);

            //go forward
            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(4), 0.45);

            //grab
            dropDL();

            sleep(500);
            //raise elevMotor
            goToPosition(chart.elevMotor, 13, 1.0);
            //go back
            goToPositionAnti(chart.BR, chart.TL, distance2encoderNew(2), -0.4, false);
            goToPositionBack(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(13), -7);
            rest();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            //goToPosition(chart.BL,chart.TR,distance2encoder(38),0.4,false);
            goToPositionStrafeBackLeft( chart.TL,chart.TR, distance2encoderNew(32), 0.40);
            rest();
            goToPositionAnti(chart.BR, chart.TL, distance2encoderNew(2), -0.6, false);
            goToPositionStrafeLeft(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(4), -0.6);

//            goToPositionBack(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(1), -7);
//            rest();
//            goToPositionStrafeLeft(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(2), -0.6);
//            rest();
            goToPositionAnti(chart.BR, chart.TL, distance2encoderNew(4), -0.6, false);
            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(10), 1);
            rest();
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            goForward(0.45);
            while(opModeIsActive() && (!bottomTapeSensorDetectedBlueReborn(chart.bottomColorSensor))){

            }
            rest();

            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(7), 1);

            rest();

            raiseDL();
            goToPosition(chart.elevMotor, 14, 1.0);
            goToPositionStrafeLeft(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(2.5), -0.5);
            goToPositionAnti(chart.BR, chart.TL, distance2encoderNew(2), -0.6, false);
            sleep(200);
           // sleep(450);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            //goToPosition(chart.elevMotor, 10, 1.0);

//            goForward(-0.45);
//            while(opModeIsActive() && (!bottomTapeSensorDetectedBlueReborn(chart.bottomColorSensor))){
//
//            }

            goToPositionBack(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(80), -1.0);
            rest();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            goToPositionStrafeBackLeft( chart.TR,chart.TL, distance2encoderNew(30), 0.45);
            rest();
            goToPosition(chart.elevMotor, 360, 1.0);
            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNewFullVolt(7), 1);
            rest();
          //  goToPosition(chart.BR, chart.TL, distance2encoderNew(0.3), 1.0, false);
            sleep(450);
            goToPositionAnti(chart.BR, chart.TL, distance2encoderNew(4), -0.6, false);
            //strafe left
            chart.runtime.reset();
            strafe(-0.50);
            while(opModeIsActive() && (!SkyStoneReBornRight(chart.colorSensorRight))){

            }
            rest();
            goToPositionDown(chart.elevMotor, 5, -1.0);
            goToPositionStrafeRight(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(4), 0.30);
           //go forward
            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(4), 0.4);
            //grab
            dropDL();
            sleep(1500);
            //raise elevMotor
            goToPosition(chart.elevMotor, 13, 1.0);
            //go back
            goToPositionBack(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(13), -7);
            rest();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            goToPosition(chart.BL,chart.TR,distance2encoder(39),0.4,false);
            rest();
            goToPositionBack(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(1), -7);
            rest();
            goToPositionStrafeLeft(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(1), -0.3);
            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(20), 1);
            rest();
            goToPositionStrafeLeft(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(2), -0.3);
            rest();

            goToPosition(chart.TL, chart.TR, chart.BL, chart.BR, distance2encoderNew(40), 1);
            raiseDL();
            sleep(450);

            goToPosition(chart.elevMotor, 10, 1.0);

            goForward(-0.4);
            while(opModeIsActive() && (!bottomTapeSensorDetectedBlueReborn(chart.bottomColorSensor)));
            rest();

        }
}
