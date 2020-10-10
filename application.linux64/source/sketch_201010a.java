import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_201010a extends PApplet {

public void setup() {
  
}

float rotationAngle = 0.0f;
float r = 0.0f;
float b = 0.0f;
float g = 0.0f;


public void draw() {

  if (keyPressed == false) {
    r = random(0, 255);
    g = random(0, 255);
    b = random(0, 255);
  }

  lights();
  background(0);
  translate(width/2, height / 2);
  rotateX(rotationAngle);
  rotateY(rotationAngle);
  rotateZ(rotationAngle);
  rotationAngle = rotationAngle + 0.01f;
  fill(r, g, b);
  box(100);
}
  public void settings() {  size(800, 800, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_201010a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
