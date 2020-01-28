package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount;
    Random random = new Random();


    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        int num = 1 + random.nextInt(4);
        hitCount = num;


        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.CHEST;
            hitCount = 0;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        //hitCount = hitCount + 1;
        int num = 1 + random.nextInt(4);
        hitCount = num;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defencedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defencedBodyPart = BodyPart.CHEST;
            hitCount = 0;
        }
        return defencedBodyPart;
    }

}
