package p527Ve;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import bf.C11349D;
import bf.C11380h;
import bf.InterfaceC11374b0;
import com.openai.chatgpt.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p328N1.C5609y;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8134l4;
import p523V9.AbstractC8142m4;
import p537W0.C8410b;
import p594Y9.AbstractC9797R2;
import p594Y9.AbstractC9815U2;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p706df.AbstractC13084d;
import p774h1.C14365u;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17786u;
import p911o0.C17790w;
import p911o0.C17794y;

/* JADX INFO: renamed from: Ve.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C8275l extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25799Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC11374b0 f25800Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8275l(InterfaceC11374b0 interfaceC11374b0, int i10) {
        super(3);
        this.f25799Y = i10;
        this.f25800Z = interfaceC11374b0;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10449g c10449g;
        boolean z6;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC11374b0 interfaceC11374b0 = this.f25800Z;
        InterfaceC10459q interfaceC10459qM11233k = C10456n.f30959Y;
        switch (this.f25799Y) {
            case 0:
                C17786u BoxWithConstraints = (C17786u) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    float fM19514a = BoxWithConstraints.m19514a() * 0.25f;
                    boolean z10 = Float.compare(BoxWithConstraints.m19514a(), AbstractC7312p.f23187d) > 0;
                    long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                    C11349D c11349d = (C11349D) interfaceC11374b0;
                    String str = c11349d.f34326i.f34388b;
                    c6021p.m6524S(-1305489501);
                    boolean zM6542f = c6021p.m6542f(str);
                    Object objM6514H = c6021p.m6514H();
                    C11380h c11380h = c11349d.f34326i;
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C14365u(AbstractC9797R2.m10414b(j10, c11380h.f34388b));
                        c6021p.m6537c0(objM6514H);
                    }
                    long j11 = ((C14365u) objM6514H).f45062a;
                    c6021p.m6553p(false);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    String str2 = c11380h.f34387a;
                    if (z10) {
                        interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10833a.m11207b(interfaceC10459qM11233k, C14365u.m15774b(0.1f, j11), AbstractC20417e.f64539a), fM19514a);
                    }
                    AbstractC9815U2.m10446e(c11349d.f34319b, str2, interfaceC10459qM11233k, j11, R.drawable.folder, c6021p, 0, 0);
                    c6021p.m6553p(true);
                }
                break;
            case 1:
                C10845a item = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    float f10 = AbstractC7313q.f23201f;
                    float f11 = AbstractC7313q.f23199d;
                    AbstractC9815U2.m10448g(interfaceC11374b0, AbstractC10844c.m11252l(AbstractC10842a.m11234l(interfaceC10459qM11233k, f10, f11), AbstractC7312p.f23189f), c6021p2, 0);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11252l(interfaceC10459qM11233k, f11));
                }
                break;
            case 2:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(((C11349D) interfaceC11374b0).f34319b, AbstractC10842a.m11235m(interfaceC10459qM11233k, AbstractC7313q.f23201f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12149e, c6021p3, 0, 3120, 55292);
                    AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11252l(interfaceC10459qM11233k, AbstractC7313q.f23199d));
                }
                break;
            default:
                C17794y Card = (C17794y) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Card, "$this$Card");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11229g = AbstractC10842a.m11229g(AbstractC10844c.m11244d(interfaceC10459qM11233k, 1.0f), 1);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p4, 0);
                    int i11 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11229g);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i2);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C21694h c21694h2 = C21698j.f68873f;
                    C5997d.m6439Z(c21694h2, c6021p4, c17781r0M19506b);
                    C21694h c21694h3 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m2);
                    C21694h c21694h4 = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p4, i11, c21694h4);
                    }
                    C21694h c21694h5 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h5, c6021p4, interfaceC10459qM10923d2);
                    C17785t0 c17785t0 = C17785t0.f56761a;
                    c6021p4.m6524S(510343550);
                    C11349D c11349d2 = (C11349D) interfaceC11374b0;
                    String str3 = c11349d2.f34322e;
                    C10449g c10449g2 = C10444b.f30946y0;
                    String str4 = c11349d2.f34322e;
                    if (str3 == null || AbstractC21322p.m21681O(str3)) {
                        c10449g = c10449g2;
                    } else {
                        InterfaceC10459q interfaceC10459qM11233k2 = AbstractC10842a.m11233k(c17785t0.m19513a(interfaceC10459qM11233k, 1.0f, true), AbstractC7313q.f23201f);
                        C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g2, c6021p4, 0);
                        int i12 = c6021p4.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p4.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11233k2);
                        c6021p4.m6528W();
                        if (c6021p4.f19563O) {
                            c6021p4.m6549l(c21696i2);
                        } else {
                            c6021p4.m6543f0();
                        }
                        C5997d.m6439Z(c21694h2, c6021p4, c17790wM19515a);
                        C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m3);
                        if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i12))) {
                            AbstractC0168G.m537z(i12, c6021p4, i12, c21694h4);
                        }
                        C5997d.m6439Z(c21694h5, c6021p4, interfaceC10459qM10923d3);
                        String strM8676d = AbstractC8142m4.m8676d(R.string.gizmo_instructions, c6021p4);
                        C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                        c10449g = c10449g2;
                        AbstractC4124r4.m4768b(strM8676d, null, 0L, 0L, null, C5609y.f18157t0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p4.m6548k(c5984w0)).f12156l, c6021p4, 196608, 0, 65502);
                        AbstractC4124r4.m4768b(str4 == null ? "" : str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, ((C3941K4) c6021p4.m6548k(c5984w0)).f12156l, c6021p4, 0, 3120, 55294);
                        c6021p4.m6553p(true);
                    }
                    c6021p4.m6553p(false);
                    c6021p4.m6524S(510368116);
                    List list = c11349d2.f34316C;
                    if (str4 != null && !AbstractC21322p.m21681O(str4) && !list.isEmpty()) {
                        AbstractC3984T1.m4701t(AbstractC10844c.m11243c(interfaceC10459qM11233k, 1.0f), 0.0f, ((C3949M0) c6021p4.m6548k(AbstractC3959O0.f12302a)).f12236r, c6021p4, 54, 0);
                    }
                    c6021p4.m6553p(false);
                    c6021p4.m6524S(510379227);
                    if (list.isEmpty()) {
                        z6 = true;
                    } else {
                        InterfaceC10459q interfaceC10459qM11233k3 = AbstractC10842a.m11233k(c17785t0.m19513a(interfaceC10459qM11233k, 1.0f, true), AbstractC7313q.f23201f);
                        C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p4, 0);
                        int i13 = c6021p4.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p4.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11233k3);
                        c6021p4.m6528W();
                        if (c6021p4.f19563O) {
                            c6021p4.m6549l(c21696i2);
                        } else {
                            c6021p4.m6543f0();
                        }
                        C5997d.m6439Z(c21694h2, c6021p4, c17790wM19515a2);
                        C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m4);
                        if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i13))) {
                            AbstractC0168G.m537z(i13, c6021p4, i13, c21694h4);
                        }
                        C5997d.m6439Z(c21694h5, c6021p4, interfaceC10459qM10923d4);
                        String strM8676d2 = AbstractC8142m4.m8676d(R.string.gizmo_files, c6021p4);
                        C5984W0 c5984w1 = AbstractC3947L4.f12183a;
                        AbstractC4124r4.m4768b(strM8676d2, null, 0L, 0L, null, C5609y.f18157t0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p4.m6548k(c5984w1)).f12156l, c6021p4, 196608, 0, 65502);
                        AbstractC4124r4.m4768b(AbstractC8134l4.m8653c(c6021p4).getQuantityString(R.plurals.gizmo_files_count, list.size(), Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p4.m6548k(c5984w1)).f12156l, c6021p4, 0, 0, 65534);
                        C8410b c8410b = AbstractC13084d.f41572a;
                        AbstractC8047a5.m8429b(c11349d2.f34316C, null, 0.0f, 0, c6021p4, 24576);
                        z6 = true;
                        c6021p4.m6553p(true);
                    }
                    c6021p4.m6553p(false);
                    c6021p4.m6553p(z6);
                }
                break;
        }
        return c17296c;
    }
}
