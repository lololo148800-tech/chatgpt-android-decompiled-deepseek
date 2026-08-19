package p193Hf;

import ai.AbstractC10620k;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.material3.MinimumInteractiveModifier;
import com.openai.chatgpt.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0136m;
import p003A1.AbstractC0168G;
import p003A1.C0201R0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1811j0;
import p102Dm.AbstractC2119a;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21943N;
import p1155zi.C21947O;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4150w0;
import p229J0.C3941K4;
import p291Lf.AbstractC5028y;
import p291Lf.C5026w;
import p324Mn.C5551u;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8136l6;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p550We.C8829j;
import p550We.EnumC8820a;
import p621Zd.C10282c;
import p622Ze.C10289g;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import ye.C21522k;

/* JADX INFO: renamed from: Hf.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C3313J extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10093Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f10094Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f10095o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f10096p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3313J(C8829j c8829j, InterfaceC1436k interfaceC1436k, boolean z6) {
        super(2);
        this.f10093Y = 2;
        this.f10095o0 = c8829j;
        this.f10096p0 = interfaceC1436k;
        this.f10094Z = z6;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21522k c21522k;
        InterfaceC1436k interfaceC1436k;
        C5975S c5975s = C6013l.f19514a;
        C10456n c10456n = C10456n.f30959Y;
        boolean z6 = this.f10094Z;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f10096p0;
        Object obj4 = this.f10095o0;
        boolean z10 = true;
        switch (this.f10093Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    if (!z6 && ((c21522k = (C21522k) obj3) == null || !c21522k.f68153b)) {
                        z10 = false;
                    }
                    AbstractC8136l6.m8660a((String) obj4, z10, false, AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23199d), c6021p, 384);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else if (!z6) {
                    C10282c c10282c = (C10282c) obj4;
                    String strM8676d = c10282c != null ? c10282c.f30530a : null;
                    c6021p2.m6524S(1301285446);
                    if (strM8676d == null) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.anonymous_user, c6021p2);
                    }
                    c6021p2.m6553p(false);
                    C5551u c5551u = (C5551u) obj3;
                    String strM10985a = c5551u != null ? AbstractC10620k.m10985a(c5551u) : null;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.share_screen_subtitle_format, new Object[]{strM8676d, strM10985a != null ? strM10985a : ""}, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C8829j c8829j = (C8829j) obj4;
                    boolean z11 = c8829j.f27016b == EnumC8820a.f27003Y;
                    c6021p3.m6524S(-1836535144);
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj3;
                    boolean zM6544g = c6021p3.m6544g(z11) | c6021p3.m6542f(interfaceC1436k2) | c6021p3.m6542f(c8829j);
                    Object objM6514H = c6021p3.m6514H();
                    if (zM6544g || objM6514H == c5975s) {
                        objM6514H = new C0201R0(z11, interfaceC1436k2, c8829j, 2);
                        c6021p3.m6537c0(objM6514H);
                    }
                    c6021p3.m6553p(false);
                    AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H, null, z11, null, null, null, null, null, null, AbstractC8411c.m8969c(-2108561020, c6021p3, new C10289g(z6, z11)), c6021p3, 805306368, 506);
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    C0136m c0136m = AbstractC17770m.f56729f;
                    C10450h c10450h = C10444b.f30944w0;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c0136m, c10450h, c6021p4, 54);
                    int i10 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11244d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p4, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p4, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d);
                    String str = (String) obj4;
                    AbstractC4124r4.m4768b(str == null ? "" : str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p4, 0, 0, 131070);
                    c6021p4.m6524S(-75954351);
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj3;
                    if (interfaceC1426a == null) {
                        interfaceC1436k = null;
                    } else {
                        c6021p4.m6524S(1888227464);
                        boolean zM6542f = c6021p4.m6542f(interfaceC1426a);
                        Object objM6514H2 = c6021p4.m6514H();
                        if (zM6542f || objM6514H2 == c5975s) {
                            objM6514H2 = new C1811j0(14, interfaceC1426a);
                            c6021p4.m6537c0(objM6514H2);
                        }
                        c6021p4.m6553p(false);
                        interfaceC1436k = (InterfaceC1436k) objM6514H2;
                    }
                    c6021p4.m6553p(false);
                    C5984W0 c5984w0 = AbstractC3884B1.f11770a;
                    AbstractC4150w0.m4775a(this.f10094Z, interfaceC1436k, AbstractC8071d5.m8483b(MinimumInteractiveModifier.f32651Y, interfaceC1426a == null ? 0.38f : 1.0f), false, null, null, c6021p4, 0, 56);
                    c6021p4.m6553p(true);
                }
                break;
            default:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    boolean z12 = ((C5026w) c6021p5.m6548k(AbstractC5028y.f16440a)).f16435c;
                    C17756f c17756f = AbstractC17770m.f56724a;
                    float f10 = AbstractC7313q.f23198c;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
                    C10450h c10450h2 = C10444b.f30944w0;
                    InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o((InterfaceC10459q) obj4, 0.0f, f10, z12 ? AbstractC7313q.f23200e : 0, 0.0f, 9);
                    C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(c17764jM19500g, c10450h2, c6021p5, 48);
                    int i11 = c6021p5.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p5.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p5, interfaceC10459qM11237o);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p5.m6528W();
                    if (c6021p5.f19563O) {
                        c6021p5.m6549l(c21696i2);
                    } else {
                        c6021p5.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p5, c17781r0M19506b2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p5, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p5.f19563O || !AbstractC16544l.m18089b(c6021p5.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p5, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p5, interfaceC10459qM10923d2);
                    c6021p5.m6524S(-2095879282);
                    if (z6) {
                        AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.video_filled, c6021p5, 0), AbstractC8142m4.m8676d(R.string.video_content_description, c6021p5), AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), 0L, c6021p5, 0, 8);
                    }
                    c6021p5.m6553p(false);
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.mic_filled, c6021p5, 0), AbstractC8142m4.m8676d(R.string.audio_content_description, c6021p5), AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), 0L, c6021p5, 0, 8);
                    C21947O c21947o = (C21947O) obj3;
                    C21943N c21943n = c21947o != null ? c21947o.f69504d : null;
                    c6021p5.m6524S(-2095854831);
                    if (c21943n != null) {
                        float f11 = c21943n.f69495b - c21943n.f69494a;
                        float f12 = 60;
                        AbstractC4124r4.m4768b(String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC2119a.m3195i(f11 / f12)), Integer.valueOf(AbstractC2119a.m3195i(f11 % f12))}, 2)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p5.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p5, 0, 0, 65534);
                    }
                    c6021p5.m6553p(false);
                    c6021p5.m6553p(true);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3313J(Object obj, boolean z6, Object obj2, int i10) {
        super(2);
        this.f10093Y = i10;
        this.f10095o0 = obj;
        this.f10094Z = z6;
        this.f10096p0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3313J(boolean z6, C10282c c10282c, C5551u c5551u) {
        super(2);
        this.f10093Y = 1;
        this.f10094Z = z6;
        this.f10095o0 = c10282c;
        this.f10096p0 = c5551u;
    }
}
