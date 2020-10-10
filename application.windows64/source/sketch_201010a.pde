void setup() {
  size(800, 800, P3D);
}

float rotationAngle = 0.0;
float r = 0.0;
float b = 0.0;
float g = 0.0;


void draw() {

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
  rotationAngle = rotationAngle + 0.01;
  fill(r, g, b);
  box(100);
}
