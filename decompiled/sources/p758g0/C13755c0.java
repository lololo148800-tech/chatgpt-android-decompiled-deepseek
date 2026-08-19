package p758g0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p492U1.C7540e;
import p492U1.C7541f;
import p492U1.C7543h;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9400y4;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;

/* JADX INFO: renamed from: g0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13755c0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43408Y;

    /* JADX INFO: renamed from: Z */
    public static final C13755c0 f43395Z = new C13755c0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13755c0 f43396o0 = new C13755c0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13755c0 f43397p0 = new C13755c0(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13755c0 f43398q0 = new C13755c0(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13755c0 f43399r0 = new C13755c0(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C13755c0 f43400s0 = new C13755c0(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C13755c0 f43401t0 = new C13755c0(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C13755c0 f43402u0 = new C13755c0(1, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C13755c0 f43403v0 = new C13755c0(1, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C13755c0 f43404w0 = new C13755c0(1, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C13755c0 f43405x0 = new C13755c0(1, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C13755c0 f43406y0 = new C13755c0(1, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C13755c0 f43407z0 = new C13755c0(1, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C13755c0 f43388A0 = new C13755c0(1, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C13755c0 f43389B0 = new C13755c0(1, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C13755c0 f43390C0 = new C13755c0(1, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C13755c0 f43391D0 = new C13755c0(1, 16);

    /* JADX INFO: renamed from: E0 */
    public static final C13755c0 f43392E0 = new C13755c0(1, 17);

    /* JADX INFO: renamed from: F0 */
    public static final C13755c0 f43393F0 = new C13755c0(1, 18);

    /* JADX INFO: renamed from: G0 */
    public static final C13755c0 f43394G0 = new C13755c0(1, 19);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13755c0(int i10, int i11) {
        super(i10);
        this.f43408Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f43408Y) {
            case 0:
                return C17296C.f55119a;
            case 1:
                ((InterfaceC1426a) obj).invoke();
                return C17296C.f55119a;
            case 2:
                long j10 = ((C7541f) obj).f23895a;
                return new C13778o(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            case 3:
                C13778o c13778o = (C13778o) obj;
                return new C7541f(AbstractC9400y4.m9978a(c13778o.f43513a, c13778o.f43514b));
            case 4:
                return new C13776n(((C7540e) obj).f23894Y);
            case 5:
                return new C7540e(((C13776n) obj).f43510a);
            case 6:
                return new C13776n(((Number) obj).floatValue());
            case 7:
                return Float.valueOf(((C13776n) obj).f43510a);
            case 8:
                long j11 = ((C7543h) obj).f23897a;
                return new C13778o((int) (j11 >> 32), (int) (j11 & 4294967295L));
            case 9:
                C13778o c13778o2 = (C13778o) obj;
                return new C7543h(AbstractC9101A4.m9631a(Math.round(c13778o2.f43513a), Math.round(c13778o2.f43514b)));
            case 10:
                long j12 = ((C7545j) obj).f23903a;
                return new C13778o((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 11:
                C13778o c13778o3 = (C13778o) obj;
                int iRound = Math.round(c13778o3.f43513a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c13778o3.f43514b);
                return new C7545j(AbstractC9113C4.m9643a(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 12:
                return new C13776n(((Number) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((C13776n) obj).f43510a);
            case 14:
                long j13 = ((C13800b) obj).f43584a;
                return new C13778o(C13800b.m15306g(j13), C13800b.m15307h(j13));
            case 15:
                C13778o c13778o4 = (C13778o) obj;
                return new C13800b(AbstractC8088f6.m8536b(c13778o4.f43513a, c13778o4.f43514b));
            case 16:
                C13801c c13801c = (C13801c) obj;
                return new C13782q(c13801c.f43586a, c13801c.f43587b, c13801c.f43588c, c13801c.f43589d);
            case 17:
                C13782q c13782q = (C13782q) obj;
                return new C13801c(c13782q.f43522a, c13782q.f43523b, c13782q.f43524c, c13782q.f43525d);
            case 18:
                long j14 = ((C13803e) obj).f43598a;
                return new C13778o(C13803e.m15333e(j14), C13803e.m15331c(j14));
            default:
                C13778o c13778o5 = (C13778o) obj;
                return new C13803e(AbstractC8112i6.m8603a(c13778o5.f43513a, c13778o5.f43514b));
        }
    }
}
