package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0480k;
import p049Bm.InterfaceC1440o;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p349O0.C6021p;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3973R0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C3973R0 f12425Z = new C3973R0(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3973R0 f12426o0 = new C3973R0(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3973R0 f12427p0 = new C3973R0(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C3973R0 f12428q0 = new C3973R0(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C3973R0 f12429r0 = new C3973R0(3, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C3973R0 f12430s0 = new C3973R0(3, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12431Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3973R0(int i10, int i11) {
        super(i10);
        this.f12431Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12431Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                return C17296C.f55119a;
            case 1:
                C6021p c6021p2 = (C6021p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                }
                return C17296C.f55119a;
            case 2:
                C6021p c6021p3 = (C6021p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                }
                return C17296C.f55119a;
            case 3:
                C3952M3 c3952m3 = (C3952M3) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p4.m6542f(c3952m3) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3984T1.m4699r(c3952m3, null, null, c6021p4, iIntValue & 14, 6);
                }
                return C17296C.f55119a;
            case 4:
                C3934J3 c3934j3 = (C3934J3) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p5.m6542f(c3934j3) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC3996V3.m4713b(c3934j3, null, false, null, 0L, 0L, 0L, 0L, 0L, c6021p5, iIntValue2 & 14);
                }
                return C17296C.f55119a;
            default:
                InterfaceC21059M interfaceC21059M = (InterfaceC21059M) obj;
                long j10 = ((C7536a) obj3).f23888a;
                int iMo7866k0 = interfaceC21059M.mo7866k0(AbstractC3980S2.f12470a);
                int i10 = iMo7866k0 * 2;
                AbstractC21069X abstractC21069XMo21533p = ((InterfaceC21056J) obj2).mo21533p(AbstractC9388w4.m9969l(j10, 0, i10));
                return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z - i10, C17690x.f56481Y, new C0480k(iMo7866k0, 1, abstractC21069XMo21533p));
        }
    }
}
