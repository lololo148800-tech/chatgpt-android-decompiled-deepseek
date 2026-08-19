package p1071w0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p080D0.C1831t0;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p156G1.C2971r;
import p204I1.C3581L;
import p225Im.InterfaceC3776x;
import p350O1.C6058g;
import p758g0.C13738N;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: w0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20745e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65771Y;

    /* JADX INFO: renamed from: Z */
    public static final C20745e f65758Z = new C20745e(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C20745e f65759o0 = new C20745e(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C20745e f65760p0 = new C20745e(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C20745e f65761q0 = new C20745e(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C20745e f65762r0 = new C20745e(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C20745e f65763s0 = new C20745e(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C20745e f65764t0 = new C20745e(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C20745e f65765u0 = new C20745e(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C20745e f65766v0 = new C20745e(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C20745e f65767w0 = new C20745e(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C20745e f65768x0 = new C20745e(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C20745e f65769y0 = new C20745e(1, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C20745e f65770z0 = new C20745e(1, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C20745e f65756A0 = new C20745e(1, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C20745e f65757B0 = new C20745e(1, 14);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20745e(int i10, int i11) {
        super(i10);
        this.f65771Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f65771Y) {
            case 0:
                return c17296c;
            case 1:
                return c17296c;
            case 2:
                return Long.valueOf(((Number) obj).longValue());
            case 3:
                return c17296c;
            case 4:
                return c17296c;
            case 5:
                return c17296c;
            case 6:
                C13738N c13738n = (C13738N) obj;
                c13738n.f43326a = 1000;
                c13738n.m15216a(Float.valueOf(1.0f), 0);
                c13738n.m15216a(Float.valueOf(1.0f), 499);
                c13738n.m15216a(Float.valueOf(0.0f), 500);
                c13738n.m15216a(Float.valueOf(0.0f), 999);
                return c17296c;
            case 7:
                C1831t0 c1831t0 = (C1831t0) obj;
                long j10 = c1831t0.f5287f;
                int i10 = C3581L.f10907c;
                return new C6058g(((int) (j10 & 4294967295L)) - AbstractC20740b0.m21281v((int) (4294967295L & j10), c1831t0.f5288g.f10934Y), 0);
            case 8:
                C1831t0 c1831t1 = (C1831t0) obj;
                String str = c1831t1.f5288g.f10934Y;
                long j11 = c1831t1.f5287f;
                int i11 = C3581L.f10907c;
                int iM21278s = AbstractC20740b0.m21278s((int) (j11 & 4294967295L), str);
                if (iM21278s != -1) {
                    return new C6058g(0, iM21278s - ((int) (4294967295L & c1831t1.f5287f)));
                }
                return null;
            case 9:
                C1831t0 c1831t2 = (C1831t0) obj;
                Integer numM2659e = c1831t2.m2659e();
                if (numM2659e == null) {
                    return null;
                }
                int iIntValue = numM2659e.intValue();
                long j12 = c1831t2.f5287f;
                int i12 = C3581L.f10907c;
                return new C6058g(((int) (4294967295L & j12)) - iIntValue, 0);
            case 10:
                C1831t0 c1831t3 = (C1831t0) obj;
                Integer numM2658d = c1831t3.m2658d();
                if (numM2658d == null) {
                    return null;
                }
                int iIntValue2 = numM2658d.intValue();
                long j13 = c1831t3.f5287f;
                int i13 = C3581L.f10907c;
                return new C6058g(0, iIntValue2 - ((int) (4294967295L & j13)));
            case 11:
                C1831t0 c1831t4 = (C1831t0) obj;
                Integer numM2657c = c1831t4.m2657c();
                if (numM2657c == null) {
                    return null;
                }
                int iIntValue3 = numM2657c.intValue();
                long j14 = c1831t4.f5287f;
                int i14 = C3581L.f10907c;
                return new C6058g(((int) (4294967295L & j14)) - iIntValue3, 0);
            case 12:
                C1831t0 c1831t5 = (C1831t0) obj;
                Integer numM2656b = c1831t5.m2656b();
                if (numM2656b == null) {
                    return null;
                }
                int iIntValue4 = numM2656b.intValue();
                long j15 = c1831t5.f5287f;
                int i15 = C3581L.f10907c;
                return new C6058g(0, iIntValue4 - ((int) (4294967295L & j15)));
            case 13:
                List list = (List) obj;
                Object obj2 = list.get(1);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                EnumC16673F0 enumC16673F0 = ((Boolean) obj2).booleanValue() ? EnumC16673F0.f53401Y : EnumC16673F0.f53402Z;
                Object obj3 = list.get(0);
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C20706E0(enumC16673F0, ((Float) obj3).floatValue());
            default:
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                ((C2963j) obj).m3787m(C2971r.f8927m, c17296c);
                return c17296c;
        }
    }
}
