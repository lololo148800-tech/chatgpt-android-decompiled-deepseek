package p703db;

/* JADX INFO: renamed from: db.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13057b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f41486a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14799a(double d10) {
        if (Math.getExponent(d10) > 1023) {
            return false;
        }
        if (d10 != 0.0d) {
            if (!(Math.getExponent(d10) <= 1023)) {
                throw new IllegalArgumentException("not a normal value");
            }
            int exponent = Math.getExponent(d10);
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) > Math.getExponent(d10)) {
                return false;
            }
        }
        return true;
    }
}
