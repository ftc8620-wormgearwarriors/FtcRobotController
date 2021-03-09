package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;


@Autonomous(name = "coach_dashboard")
public class coach_Autonomous_Odo_Test extends chewy_AutonomousMethods {


    @Override
    public void runOpMode() {

        //Initialize hardware map values
        //initializing odometry hardware
        Init();
        initOdometryHardware(0, 0, 0);
        ystart = robot.frontRange.getDistance(DistanceUnit.INCH);
        xstart = robot.leftRange.getDistance(DistanceUnit.INCH);


        odomVSrange();


        /** Wait for the game to begin */
        telemetry.addData(">", "Press Play to start op mode");
        telemetry.update();

        // wait for start of opmode
        waitForStart();

        while (opModeIsActive()) {
            odomVSrange();
        }

        //Display raw values
        telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
        telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
        telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());

        telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate());
        telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate());
        telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation());


        //Update values
        telemetry.update();

        // set robot speed
        double dRobotPower = 0.9;



        //Update values
        telemetry.update();


        for(int i = 0; i<3; i++) {


            //drive forword
            //goToPostion(55 * robot.COUNTS_PER_INCH, 81 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);

            //drive left  to start spot
            goToPostion(7 * robot.COUNTS_PER_INCH, 9 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);

            // display location
//            telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//            telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//            telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());

            telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate() / robot.COUNTS_PER_INCH);
            telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate() / robot.COUNTS_PER_INCH);
            telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation() / robot.COUNTS_PER_INCH);
            telemetry.update();

            // sleep so you can see the numbers
            sleep(5000);


            //drive backword to start spot
            goToPostion(55 * robot.COUNTS_PER_INCH, 9 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);

            // display location
//            telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//            telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//            telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());

            telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate() / robot.COUNTS_PER_INCH);
            telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate() / robot.COUNTS_PER_INCH);
            telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation() / robot.COUNTS_PER_INCH);
            telemetry.update();

            // sleep so you can see the numbers
            sleep(5000);



        }





//
//        //drive in diamond to test heading
////        goToPostion(31 * robot.COUNTS_PER_INCH, 33 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);
//        //Display raw values
//        telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//        telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//        telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());
//
//        telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate());
//        telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate());
//        telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation());
//
//        //Update values
//        telemetry.update();
//
//        sleep(3000);
//
//
//        //2nd pos
////        goToPostion(55 * robot.COUNTS_PER_INCH, 57 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);
//        //Display raw values
//        telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//        telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//        telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());
//
//        telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate());
//        telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate());
//        telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation());
//
//        //Update values
//        telemetry.update();
//
//        sleep(3000);
//
//
//
//        //3rd pos
////        goToPostion(79 * robot.COUNTS_PER_INCH, 33 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);
//        //Display raw values
//        telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//        telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//        telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());
//
//        telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate());
//        telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate());
//        telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation());
//
//        //Update values
//        telemetry.update();
//
//        sleep(3000);
//
//
//        //4th pos
////        goToPostion(55 * robot.COUNTS_PER_INCH, 9 * robot.COUNTS_PER_INCH, dRobotPower, 0, 3 * robot.COUNTS_PER_INCH, false);
//        //Display raw values
//        telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//        telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//        telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());
//
//        telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate());
//        telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate());
//        telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation());
//
//        //Update values
//        telemetry.update();
//
//        sleep(3000);
//
//
//
//        // test pretending drop 1st wobble
////        goToPostion(48 * robot.COUNTS_PER_INCH, 115 * robot.COUNTS_PER_INCH, dRobotPower,  0, 3 * robot.COUNTS_PER_INCH, false);
//
//        //Drive to lanch line
////        goToPostion(39 * robot.COUNTS_PER_INCH,65 * robot.COUNTS_PER_INCH, dRobotPower,0,3 * robot.COUNTS_PER_INCH, false);
//
//        telemetry.addData("Vertical Left Position", robot.verticalLeft.getCurrentPosition());
//        telemetry.addData("Vertical Right Position", robot.verticalRight.getCurrentPosition());
//        telemetry.addData("Horizontal Position", robot.horizontal.getCurrentPosition());
//
//        telemetry.addData("X Position", robot.globalPositionUpdate.returnXCoordinate());
//        telemetry.addData("Y Position", robot.globalPositionUpdate.returnYCoordinate());
//        telemetry.addData("Heading", robot.globalPositionUpdate.returnOrientation());
//
//        //           telemetry.addData("Vertical Encoder Offset", verticalEncoderTickOffsetPerDegree);
//
//        //Update values
//        telemetry.update();
//         sleep(8000);
//
//            //shoot powershot targets
//            //rapidFireDisks();
//
//            //goes to pickup position and grabs goal
//            goToPostion(21.5 * robot.COUNTS_PER_INCH, 37 * robot.COUNTS_PER_INCH, dRobotPower, 0, 1 * robot.COUNTS_PER_INCH, false);





        //Stop the thread
        robot.globalPositionUpdate.stop();
    }



}