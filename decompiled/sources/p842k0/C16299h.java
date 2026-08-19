package p842k0;

import androidx.compose.animation.AbstractC10832b;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import bf.AbstractC11372a0;
import cd.C11709i;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p080D0.C1837w0;
import p1042uh.C20263a0;
import p1051v0.AbstractC20417e;
import p1071w0.C20750g0;
import p1071w0.EnumC20730T;
import p1082wd.C20909b;
import p1113xn.AbstractC21322p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p121Ef.C2424a;
import p124Ei.C2446D;
import p124Ei.C2506f;
import p204I1.C3581L;
import p204I1.C3590f;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3890C1;
import p229J0.C3941K4;
import p269Kh.C4684k;
import p328N1.C5609y;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p478Tc.AbstractC7313q;
import p478Tc.C7299c;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8079e5;
import p527Ve.C8276m;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8676n;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p773h0.InterfaceC14267W;
import p870le.C16852I;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;

/* JADX INFO: renamed from: k0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16299h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50490Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f50491Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f50492o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f50493p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f50494q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f50495r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16299h(C2446D c2446d, boolean z6, InterfaceC10459q interfaceC10459q, InterfaceC1440o interfaceC1440o, InterfaceC1426a interfaceC1426a) {
        super(3);
        this.f50493p0 = c2446d;
        this.f50492o0 = z6;
        this.f50491Z = interfaceC10459q;
        this.f50494q0 = interfaceC1440o;
        this.f50495r0 = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Type inference failed for: r14v3, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i10 = 7;
        C5975S c5975s = C6013l.f19514a;
        C17296C c17296c = C17296C.f55119a;
        boolean z6 = true;
        boolean z10 = this.f50492o0;
        Object obj4 = this.f50495r0;
        Object obj5 = this.f50494q0;
        Object obj6 = this.f50491Z;
        Object obj7 = this.f50493p0;
        switch (this.f50490Y) {
            case 0:
                C16293b c16293b = (C16293b) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(c16293b) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String str2 = (String) ((C2446D) obj7).invoke(c6021p, 0);
                    if (AbstractC21322p.m21681O(str2)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    AbstractC16306o.m17828b(str2, this.f50492o0, c16293b, (InterfaceC10459q) obj6, (InterfaceC1440o) obj5, (AbstractC16546n) obj4, c6021p, (iIntValue << 6) & 896);
                }
                return c17296c;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                InterfaceC10459q interfaceC10459qM11257q = AbstractC10844c.m11257q(AbstractC8079e5.m8501a((InterfaceC10459q) obj6, AbstractC20417e.f64539a), AbstractC7313q.f23204i, 0.0f, 2);
                c6021p2.m6524S(-649615956);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj7;
                boolean zM6542f = c6021p2.m6542f(interfaceC1436k) | c6021p2.m6544g(z10);
                Object objM6514H = c6021p2.m6514H();
                if (zM6542f || objM6514H == c5975s) {
                    objM6514H = new C2506f(interfaceC1436k, z10, 3);
                    c6021p2.m6537c0(objM6514H);
                }
                c6021p2.m6553p(false);
                InterfaceC10459q interfaceC10459qM11205a = AbstractC10832b.m11205a(AbstractC10833a.m11209d(interfaceC10459qM11257q, false, null, (InterfaceC1426a) objM6514H, 7), null, 3);
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56728e, C10444b.f30944w0, c6021p2, 54);
                int i11 = c6021p2.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11205a);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p2.m6528W();
                if (c6021p2.f19563O) {
                    c6021p2.m6549l(c21696i);
                } else {
                    c6021p2.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p2, c17781r0M19506b);
                C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                    AbstractC0168G.m537z(i11, c6021p2, i11, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                C20909b c20909b = (C20909b) obj4;
                C4684k c4684kM5397d = ((C14111x0) obj5).f44402d.m5397d(c20909b.m21453a().f15253b);
                if (c4684kM5397d == null || (str = c4684kM5397d.f15238c) == null) {
                    str = c20909b.m21453a().f15254c;
                }
                c6021p2.m6524S(-1397480406);
                if (str != null) {
                    AbstractC4124r4.m4768b(str, AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC7313q.f23199d, 0.0f, 2), 0L, 0L, null, C5609y.f18158u0, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p2, 196608, 3120, 55260);
                }
                c6021p2.m6553p(false);
                c6021p2.m6553p(true);
                return c17296c;
            case 2:
                InterfaceC13499q AnimatedVisibility2 = (InterfaceC13499q) obj;
                C6021p c6021p3 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility2, "$this$AnimatedVisibility");
                C3890C1 c3890c1M8469l = AbstractC8063c5.m8469l(z10, c6021p3);
                C10456n c10456n = C10456n.f30959Y;
                InterfaceC14267W interfaceC14267W = (InterfaceC14267W) c6021p3.m6548k(AbstractC10839g.f32446a);
                c6021p3.m6524S(295605888);
                C11709i c11709i = (C11709i) obj6;
                boolean zM6545h = c6021p3.m6545h(c11709i);
                Object objM6514H2 = c6021p3.m6514H();
                if (zM6545h || objM6514H2 == c5975s) {
                    objM6514H2 = new C2424a((C7299c) obj7, c11709i, 3);
                    c6021p3.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                c6021p3.m6553p(false);
                c6021p3.m6524S(295610522);
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj5;
                C20263a0 c20263a0 = (C20263a0) obj4;
                boolean zM6542f2 = c6021p3.m6542f(interfaceC1436k2) | c6021p3.m6545h(c20263a0);
                Object objM6514H3 = c6021p3.m6514H();
                if (zM6542f2 || objM6514H3 == c5975s) {
                    objM6514H3 = new C16852I(interfaceC1436k2, c20263a0, 1);
                    c6021p3.m6537c0(objM6514H3);
                }
                c6021p3.m6553p(false);
                InterfaceC10459q interfaceC10459qM11210e = AbstractC10833a.m11210e(c10456n, (C7299c) obj7, interfaceC14267W, false, interfaceC1426a, (InterfaceC1426a) objM6514H3, 188);
                if (!AbstractC11372a0.m12783b(c20263a0)) {
                    interfaceC10459qM11210e = AbstractC8071d5.m8483b(interfaceC10459qM11210e, 0.5f);
                }
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-470152565, c6021p3, new C8276m(c20263a0, i10)), interfaceC10459qM11210e, null, null, AbstractC8411c.m8969c(2067043471, c6021p3, new C8276m(c20263a0, 8)), null, c3890c1M8469l, 0.0f, 0.0f, c6021p3, 24582, 428);
                return c17296c;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                InterfaceC6073v interfaceC6073v = (InterfaceC6073v) obj7;
                if (!zBooleanValue) {
                    iIntValue2 = interfaceC6073v.mo1765a(iIntValue2);
                }
                if (!zBooleanValue) {
                    iIntValue3 = interfaceC6073v.mo1765a(iIntValue3);
                }
                if (z10) {
                    C6045C c6045c = (C6045C) obj6;
                    long j10 = c6045c.f19683b;
                    int i12 = C3581L.f10907c;
                    if (iIntValue2 == ((int) (j10 >> 32)) && iIntValue3 == ((int) (j10 & 4294967295L))) {
                        z6 = false;
                    } else {
                        int iMin = Math.min(iIntValue2, iIntValue3);
                        C1837w0 c1837w0 = (C1837w0) obj5;
                        EnumC20730T enumC20730T = EnumC20730T.f65728Y;
                        if (iMin >= 0) {
                            int iMax = Math.max(iIntValue2, iIntValue3);
                            C3590f c3590f = c6045c.f19682a;
                            if (iMax <= c3590f.f10934Y.length()) {
                                if (zBooleanValue || iIntValue2 == iIntValue3) {
                                    c1837w0.m2692p(false);
                                    c1837w0.m2690n(enumC20730T);
                                } else {
                                    c1837w0.m2682f(true);
                                }
                                ((C20750g0) obj4).f65829t.invoke(new C6045C(c3590f, AbstractC8676n.m9365b(iIntValue2, iIntValue3), (C3581L) null));
                            }
                        }
                        c1837w0.m2692p(false);
                        c1837w0.m2690n(enumC20730T);
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16299h(InterfaceC6073v interfaceC6073v, boolean z6, C6045C c6045c, C1837w0 c1837w0, C20750g0 c20750g0) {
        super(3);
        this.f50493p0 = interfaceC6073v;
        this.f50492o0 = z6;
        this.f50491Z = c6045c;
        this.f50494q0 = c1837w0;
        this.f50495r0 = c20750g0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16299h(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, boolean z6, C14111x0 c14111x0, C20909b c20909b) {
        super(3);
        this.f50491Z = interfaceC10459q;
        this.f50493p0 = interfaceC1436k;
        this.f50492o0 = z6;
        this.f50494q0 = c14111x0;
        this.f50495r0 = c20909b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16299h(boolean z6, C7299c c7299c, C11709i c11709i, InterfaceC1436k interfaceC1436k, C20263a0 c20263a0) {
        super(3);
        this.f50492o0 = z6;
        this.f50493p0 = c7299c;
        this.f50491Z = c11709i;
        this.f50494q0 = interfaceC1436k;
        this.f50495r0 = c20263a0;
    }
}
