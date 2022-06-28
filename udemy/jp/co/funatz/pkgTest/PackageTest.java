package jp.co.funatz.pkgTest;
import jp.co.funatz.pkgTest.a.PackageA;
import jp.co.funatz.pkgTest.b.PackageB;

public class PackageTest {
    public static void main(String[] args) {
        jp.co.funatz.pkgTest.a.PackageA.a();
        PackageA.a();
        PackageB.b();
    }
}
