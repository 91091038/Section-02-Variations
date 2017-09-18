package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Oranges;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class Houses4
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(0);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    ColorWheel.addColor(Greens.Aquamarine);
    ColorWheel.addColor(Reds.IndianRed);
    ColorWheel.addColor(Blues.CadetBlue);
    ColorWheel.addColor(Oranges.Coral);
    drawRoundHouse(height);
    //end roof shape
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(40);
    Tortoise.turn(-90);
  }
  private static void drawRoundHouse(int height)
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.move(height); //23 are the shape of the roof of the house
    for (int i = 0; i < 360; i++)
    {
      Tortoise.turn(.5);
      Tortoise.move(1);
    }
  }
}
