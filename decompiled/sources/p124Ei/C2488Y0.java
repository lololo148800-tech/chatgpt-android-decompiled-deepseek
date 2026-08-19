package p124Ei;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.voice.VoiceModeViewModel;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0130g;
import p003A1.AbstractC0168G;
import p006A4.C0350k;
import p006A4.C0364y;
import p017Af.C0459F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1000s0.AbstractC19402K;
import p1000s0.C19408d;
import p1014t1.AbstractC19744u;
import p1025te.C19866Q;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p365Oi.C6256d;
import p387Pl.C6501u;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17718B0;
import p911o0.C17756f;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Ei.Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2488Y0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2532n1 f7747Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC2444C f7748Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7749o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f7750p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f7751q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1426a f7752r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ VoiceModeViewModel f7753s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C6256d f7754t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C6501u f7755u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ InputViewModel f7756v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C19866Q f7757w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488Y0(C2532n1 c2532n1, EnumC2444C enumC2444C, InterfaceC1436k interfaceC1436k, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, VoiceModeViewModel voiceModeViewModel, C6256d c6256d, C6501u c6501u, InputViewModel inputViewModel, C19866Q c19866q) {
        super(3);
        this.f7747Y = c2532n1;
        this.f7748Z = enumC2444C;
        this.f7749o0 = interfaceC1436k;
        this.f7750p0 = z6;
        this.f7751q0 = interfaceC1426a;
        this.f7752r0 = interfaceC1426a2;
        this.f7753s0 = voiceModeViewModel;
        this.f7754t0 = c6256d;
        this.f7755u0 = c6501u;
        this.f7756v0 = inputViewModel;
        this.f7757w0 = c19866q;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z6;
        InterfaceC10459q interfaceC10459qM20694b;
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
        }
        int i10 = iIntValue & 19;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-642878940);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
            WeakHashMap weakHashMap = C17718B0.f56555v;
            InterfaceC10459q interfaceC10459qM19459a = AbstractC17724E0.m19459a(interfaceC10459qM11232j, C17756f.m19480f(c6021p).f56566k);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19459a);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            C10449g c10449g = C10444b.f30947z0;
            c6021p.m6524S(1634713313);
            C2532n1 c2532n1 = this.f7747Y;
            boolean z10 = c2532n1.f7891W;
            InterfaceC1436k interfaceC1436k = this.f7749o0;
            if (z10) {
                c6021p.m6524S(1056398567);
                boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == c5975s) {
                    objM6514H2 = new C0459F(8, interfaceC1436k);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H2, 7);
                c6021p.m6524S(1056401997);
                boolean zM6542f2 = c6021p.m6542f(interfaceC1436k);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f2 || objM6514H3 == c5975s) {
                    objM6514H3 = new C2480U0(interfaceC1436k, interfaceC5985X, null);
                    c6021p.m6537c0(objM6514H3);
                }
                z6 = false;
                c6021p.m6553p(false);
                interfaceC10459qM20694b = AbstractC19744u.m20694b(c10456n, c17296c, (InterfaceC1439n) objM6514H3);
            } else {
                z6 = false;
                interfaceC10459qM20694b = c10456n;
            }
            c6021p.m6553p(z6);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM20694b);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C17794y c17794y = C17794y.f56777a;
            c6021p.m6524S(1056430549);
            boolean zM6542f3 = c6021p.m6542f(c2532n1);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == c5975s) {
                objM6514H4 = new C0130g(c2532n1, 20);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C19408d c19408dM20508b = AbstractC19402K.m20508b(0, (InterfaceC1426a) objM6514H4, c6021p, 3);
            VoiceModeViewModel voiceModeViewModel = this.f7753s0;
            C8410b c8410bM8969c = AbstractC8411c.m8969c(-70880521, c6021p, new C0350k(c19408dM20508b, voiceModeViewModel, c2532n1, this.f7754t0, interfaceC1436k, 3));
            InputViewModel inputViewModel = this.f7756v0;
            EnumC2444C enumC2444C = this.f7748Z;
            C8410b c8410bM8969c2 = AbstractC8411c.m8969c(377235064, c6021p, new C2486X0(enumC2444C, c2532n1, voiceModeViewModel, this.f7755u0, interfaceC1436k, inputViewModel, this.f7757w0, 0));
            InterfaceC10459q interfaceC10459qM19544b = c17794y.m19544b(AbstractC10844c.m11244d(c10456n, 1.0f), true);
            EnumC2444C enumC2444C2 = EnumC2444C.f7593Y;
            AbstractC2511g1.m3602n(enumC2444C, this.f7750p0, c8410bM8969c, c8410bM8969c2, enumC2444C == enumC2444C2 ? AbstractC10842a.m11237o(interfaceC10459qM19544b, 0.0f, AbstractC7313q.f23198c, 0.0f, 0.0f, 13) : interfaceC10459qM19544b, c6021p, 3456);
            c6021p.m6524S(1056665613);
            boolean z11 = c2532n1.f7873E;
            if (enumC2444C == enumC2444C2) {
                AbstractC8223w5.m8850b(Boolean.valueOf(z11), null, C2527m.f7856x0, C10444b.f30938q0, "AttachmentAndHint", null, AbstractC8411c.m8969c(1420400531, c6021p, new C0364y(c2532n1, 4, interfaceC1436k)), c6021p, 1600896, 34);
            }
            c6021p.m6553p(false);
            InterfaceC1426a interfaceC1426a = this.f7751q0;
            InterfaceC1426a interfaceC1426a2 = this.f7752r0;
            AbstractC2511g1.m3595g(r1, enumC2444C, interfaceC1436k, interfaceC1426a, interfaceC1426a2, null, c6021p, 0);
            c6021p.m6553p(true);
            c6021p.m6524S(1635030041);
            if (enumC2444C == EnumC2444C.f7594Z) {
                AbstractC8223w5.m8850b(Boolean.valueOf(!z11), c10843b.m11240a(c10456n, C10444b.f30939r0), C2527m.f7857y0, null, "button-column", null, AbstractC8411c.m8969c(1967751241, c6021p, new C2456I(c2532n1, interfaceC1436k, interfaceC1426a, interfaceC1426a2)), c6021p, 1597824, 40);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        return c17296c;
    }
}
