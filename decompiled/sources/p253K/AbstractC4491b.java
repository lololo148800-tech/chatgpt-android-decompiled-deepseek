package p253K;

import android.util.Rational;
import android.util.Size;
import p283L5.AbstractC4941g;
import p391Q.AbstractC6542b;

/* JADX INFO: renamed from: K.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4491b {

    /* JADX INFO: renamed from: a */
    public static final Rational f14647a = new Rational(4, 3);

    /* JADX INFO: renamed from: b */
    public static final Rational f14648b = new Rational(3, 4);

    /* JADX INFO: renamed from: c */
    public static final Rational f14649c = new Rational(16, 9);

    /* JADX INFO: renamed from: d */
    public static final Rational f14650d = new Rational(9, 16);

    /* JADX INFO: renamed from: a */
    public static boolean m5220a(Rational rational, Size size) {
        Size size2 = AbstractC6542b.f21171b;
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            if (size.getHeight() * size.getWidth() < AbstractC6542b.m7097a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i10 = width % 16;
            if (i10 != 0 || height % 16 != 0) {
                if (i10 == 0) {
                    return m5221b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return m5221b(width, height, rational2);
                }
                return false;
            }
            if (!m5221b(Math.max(0, height - 16), width, rational) && !m5221b(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5221b(int i10, int i11, Rational rational) {
        AbstractC4941g.m5555N(i11 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i10)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }
}
