package Chapter07.Ex07;

public class PointTest {
}

class Point{
    int x, y;

    Point() {

    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation(){
        return x + y+"" + z;
    }

}
