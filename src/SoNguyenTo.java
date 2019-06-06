public class SoNguyenTo {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
        } else {
            System.out.println(""+ a + " ko phai so nguyen to");
        }
    }

    public SoNguyenTo() {

    }

    public SoNguyenTo(int a) {
        this.a = a;
    }

    public boolean isSoNguyenTo(int x) {
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= squareRoot; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(int a) {
        int result = a + 1;
        while (true) {
            if (isSoNguyenTo(result)) {
                return result;
            }
            result++;
        }
    }
}
