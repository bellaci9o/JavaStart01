package com.company;

public class Main {

    public static void main(String[] args) {


                float earthWeightRadchenko = 70.0f;
                float marsGravityRatioRadchenko = 0.38f;

                float marsWeight = earthWeightRadchenko * marsGravityRatioRadchenko;


                double marsWeightDouble = marsWeight;

              //  System.out.printf("Twoja waga na Marsie (typ double): %.4f kg\n", marsWeightDouble);


                int marsWeightInt = (int)marsWeightDouble;

              //  System.out.println("Twoja waga na Marsie po rzutowaniu na int: " + marsWeightInt + " kg");


                char marsWeightChar = (char)marsWeightInt;

              //  System.out.println("Twoja waga na Marsie po rzutowaniu na char: " + (int) marsWeightChar);

                int newIntValue = marsWeightChar + 10;


              //  System.out.println("Wynik działania matematycznego na char: " + newIntValue);
            }
        }
