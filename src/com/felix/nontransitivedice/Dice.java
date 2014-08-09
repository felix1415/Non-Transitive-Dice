/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felix.nontransitivedice;



/**
 *
 * @author alexgray
 */
public class Dice
{

    public static int getGreen()
    {
        double r = Math.random();
        if (r > 0.5)
        {
            return 4;
        } else if (r == 0.5) //if dead centre, try again
        {
            return getGreen();
        } else
        {
            return 1;
        }
    }

    public static int getRed()
    {
        double r = Math.random();
        if (r > 4.0/6.0)
        {
            return 6;
        } else if (r == (4.0/6.0)) //if dead centre, try again
        {
            return getRed();
        } else
        {
            return 2;
        }
    }

    public static int getYellow()
    {
        return 3;
    }

    public static int getPurple()
    {
        double r = Math.random();
        if (r > 4.0/6.0)
        {
            return 0;
        } else if (r == 4.0/6.0) //if dead centre, try again
        {
            return getPurple();
        } else
        {
            return 4;
        }
    }
}
