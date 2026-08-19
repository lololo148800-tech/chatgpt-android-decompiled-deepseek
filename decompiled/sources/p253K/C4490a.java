package p253K;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4490a implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final RectF f14645Y;

    /* JADX INFO: renamed from: Z */
    public final Rational f14646Z;

    public C4490a(Rational rational, Rational rational2) {
        this.f14646Z = rational2 == null ? new Rational(4, 3) : rational2;
        this.f14645Y = m5219b(rational);
    }

    /* JADX INFO: renamed from: a */
    public static float m5218a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    /* JADX INFO: renamed from: b */
    public final RectF m5219b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = this.f14646Z;
        if (fFloatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z6 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF rectFM5219b = m5219b(rational);
        RectF rectFM5219b2 = m5219b(rational2);
        RectF rectF = this.f14645Y;
        boolean z10 = rectFM5219b.width() >= rectF.width() && rectFM5219b.height() >= rectF.height();
        if (rectFM5219b2.width() >= rectF.width() && rectFM5219b2.height() >= rectF.height()) {
            z6 = true;
        }
        if (z10 && z6) {
            return (int) Math.signum((rectFM5219b.height() * rectFM5219b.width()) - (rectFM5219b2.height() * rectFM5219b2.width()));
        }
        if (z10) {
            return -1;
        }
        if (z6) {
            return 1;
        }
        return -((int) Math.signum(m5218a(rectFM5219b, rectF) - m5218a(rectFM5219b2, rectF)));
    }
}
