package p017Af;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0136m;
import p003A1.AbstractC0168G;
import p040Bd.AbstractC0985Q1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p169Gf.C3048l;
import p204I1.C3582M;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4150w0;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p594Y9.AbstractC9781O3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14365u;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17790w;
import p926of.C18141D;

/* JADX INFO: renamed from: Af.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0471b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1533Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f1534Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f1535o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f1536p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0471b(InterfaceC1436k interfaceC1436k, String str, String str2, int i10) {
        super(2);
        this.f1533Y = i10;
        this.f1534Z = interfaceC1436k;
        this.f1535o0 = str;
        this.f1536p0 = str2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1436k interfaceC1436k = this.f1534Z;
        String str = this.f1536p0;
        String str2 = this.f1535o0;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f1533Y) {
            case 0:
                AbstractC0985Q1 ref = (AbstractC0985Q1) obj;
                AbstractC16544l.m18094g(ref, "ref");
                interfaceC1436k.invoke(new C18141D(str2, str, ref, (Integer) obj2));
                break;
            case 1:
                AbstractC0985Q1 ref2 = (AbstractC0985Q1) obj;
                AbstractC16544l.m18094g(ref2, "ref");
                interfaceC1436k.invoke(new C18141D(str2, str, ref2, (Integer) obj2));
                break;
            case 2:
                AbstractC0985Q1 ref3 = (AbstractC0985Q1) obj;
                AbstractC16544l.m18094g(ref3, "ref");
                interfaceC1436k.invoke(new C18141D(str2, str, ref3, (Integer) obj2));
                break;
            default:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    float f10 = AbstractC7313q.f23199d;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C21694h c21694h = C21698j.f68873f;
                    C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
                    C21694h c21694h2 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h3);
                    }
                    C21694h c21694h4 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                    C0136m c0136m = AbstractC17770m.f56729f;
                    C10450h c10450h = C10444b.f30944w0;
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c0136m, c10450h, c6021p, 54);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d2);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
                    }
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                    AbstractC4124r4.m4768b(this.f1536p0, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                    String str3 = this.f1535o0;
                    boolean z6 = str3 != null;
                    c6021p.m6524S(-1093312428);
                    InterfaceC1436k interfaceC1436k2 = this.f1534Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k2) | c6021p.m6542f(str3);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C3048l(1, str3, interfaceC1436k2);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H;
                    c6021p.m6553p(false);
                    C5984W0 c5984w0 = AbstractC3884B1.f11770a;
                    AbstractC4150w0.m4775a(z6, interfaceC1436k3, MinimumInteractiveModifier.f32651Y, false, null, null, c6021p, 384, 56);
                    c6021p.m6553p(true);
                    c6021p.m6524S(-1999041965);
                    if (str3 != null) {
                        long j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                        AbstractC9781O3.m10394b(str3, interfaceC1436k2, AbstractC10844c.m11247g(AbstractC10842a.m11233k(AbstractC10833a.m11207b(AbstractC10842a.m11237o(AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23200e, 7), 0.0f, 0.0f, f10, 0.0f, 11), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12195I, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c), AbstractC7313q.f23201f), 96, 0.0f, 2), false, false, C3582M.m4274b((C3582M) c6021p.m6548k(AbstractC4124r4.f13310a), j10, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214), null, null, false, 0, 0, null, null, null, new C14341T(j10), null, c6021p, 0, 0, 49112);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471b(String str, String str2, InterfaceC1436k interfaceC1436k) {
        super(2);
        this.f1533Y = 3;
        this.f1535o0 = str;
        this.f1534Z = interfaceC1436k;
        this.f1536p0 = str2;
    }
}
