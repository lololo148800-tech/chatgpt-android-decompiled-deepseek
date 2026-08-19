package p742f6;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import p764g6.AbstractC13821a;
import p802i6.C14936b;

/* JADX INFO: renamed from: f6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13554f implements InterfaceC13548D {

    /* JADX INFO: renamed from: Z */
    public static final C13554f f42881Z = new C13554f(0);

    /* JADX INFO: renamed from: o0 */
    public static final C13554f f42882o0 = new C13554f(1);

    /* JADX INFO: renamed from: p0 */
    public static final C13554f f42883p0 = new C13554f(2);

    /* JADX INFO: renamed from: q0 */
    public static final C13554f f42884q0 = new C13554f(3);

    /* JADX INFO: renamed from: r0 */
    public static final C13554f f42885r0 = new C13554f(4);

    /* JADX INFO: renamed from: s0 */
    public static final C13554f f42886s0 = new C13554f(5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42887Y;

    public /* synthetic */ C13554f(int i10) {
        this.f42887Y = i10;
    }

    @Override // p742f6.InterfaceC13548D
    /* JADX INFO: renamed from: a */
    public final Object mo3879a(AbstractC13821a abstractC13821a, float f10) {
        switch (this.f42887Y) {
            case 0:
                boolean z6 = abstractC13821a.mo15424P() == 1;
                if (z6) {
                    abstractC13821a.mo15429a();
                }
                double dMo15423O = abstractC13821a.mo15423O();
                double dMo15423O2 = abstractC13821a.mo15423O();
                double dMo15423O3 = abstractC13821a.mo15423O();
                double dMo15423O4 = abstractC13821a.mo15424P() == 7 ? abstractC13821a.mo15423O() : 1.0d;
                if (z6) {
                    abstractC13821a.mo15433k();
                }
                if (dMo15423O <= 1.0d && dMo15423O2 <= 1.0d && dMo15423O3 <= 1.0d) {
                    dMo15423O *= 255.0d;
                    dMo15423O2 *= 255.0d;
                    dMo15423O3 *= 255.0d;
                    if (dMo15423O4 <= 1.0d) {
                        dMo15423O4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dMo15423O4, (int) dMo15423O, (int) dMo15423O2, (int) dMo15423O3));
            case 1:
                return Float.valueOf(AbstractC13562n.m15094d(abstractC13821a) * f10);
            case 2:
                return Integer.valueOf(Math.round(AbstractC13562n.m15094d(abstractC13821a) * f10));
            case 3:
                return AbstractC13562n.m15092b(abstractC13821a, f10);
            case 4:
                int iMo15424P = abstractC13821a.mo15424P();
                if (iMo15424P == 1) {
                    return AbstractC13562n.m15092b(abstractC13821a, f10);
                }
                if (iMo15424P == 3) {
                    return AbstractC13562n.m15092b(abstractC13821a, f10);
                }
                if (iMo15424P != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC12107L1.m13809A(iMo15424P)));
                }
                PointF pointF = new PointF(((float) abstractC13821a.mo15423O()) * f10, ((float) abstractC13821a.mo15423O()) * f10);
                while (abstractC13821a.hasNext()) {
                    abstractC13821a.mo15421D();
                }
                return pointF;
            default:
                boolean z10 = abstractC13821a.mo15424P() == 1;
                if (z10) {
                    abstractC13821a.mo15429a();
                }
                float fMo15423O = (float) abstractC13821a.mo15423O();
                float fMo15423O2 = (float) abstractC13821a.mo15423O();
                while (abstractC13821a.hasNext()) {
                    abstractC13821a.mo15421D();
                }
                if (z10) {
                    abstractC13821a.mo15433k();
                }
                return new C14936b((fMo15423O / 100.0f) * f10, (fMo15423O2 / 100.0f) * f10);
        }
    }
}
