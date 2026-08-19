package sg;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p174Gk.uSfJ.HpucjswO;
import p229J0.AbstractC3984T1;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8086f4;
import p571X9.AbstractC9393x3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: sg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C19561c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C19561c f62133Z = new C19561c(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19561c f62134o0 = new C19561c(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62135Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19561c(int i10, int i11) {
        super(i10);
        this.f62135Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        C10456n c10456n = C10456n.f30959Y;
        switch (this.f62135Y) {
            case 0:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    AbstractC8086f4.m8519f(6, c6021p);
                    AbstractC3984T1.m4692k(null, 0.0f, 0L, c6021p, 0, 7);
                    C19575q c19575q = new C19575q("gizmoId", (String) null, (String) null, 6);
                    C17689w c17689w = C17689w.f56480Y;
                    AbstractC8086f4.m8522i(c19575q, new C19581w("Header", "Header explanation text", AbstractC9393x3.m9974d(new C19578t(ParameterNames.f31999ID, HpucjswO.WANepBw, "explanation", "details placeholder", "linkExplanation", "linkAttachment", null, c17689w, 256))), C19560b.f62128Z, c6021p, 3078);
                    AbstractC3984T1.m4692k(null, 0.0f, 0L, c6021p, 0, 7);
                    AbstractC8086f4.m8521h(new C19575q("gizmoId", (String) null, (String) null, 6), new C19578t(ParameterNames.f31999ID, "cta", "explanation", "detailsPlaceholder", "linkExplanation", "linkAttachment", null, AbstractC9393x3.m9974d(new C19569k(EnumC19568j.f62151o0, "Single Line Text placeholder")), 256), new C19540D(new C19581w("header", "headerExplanation", c17689w), 21), C19560b.f62129o0, c6021p, 27654);
                    c6021p.m6553p(true);
                }
                break;
            default:
                InterfaceC17763i0 paddings2 = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings2, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j2 = AbstractC10842a.m11232j(c10456n, paddings2);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p2, 0);
                    int i11 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11232j2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i2);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p2, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d2);
                    AbstractC8086f4.m8521h(new C19575q("gizmoId", (String) null, (String) null, 6), new C19578t(ParameterNames.f31999ID, "cta", "explanation", "detailsPlaceholder", null, null, "this is a subtext", AbstractC17681o.m19382k(new C19569k(EnumC19568j.f62151o0, "Single Line Text placeholder"), new C19569k(EnumC19568j.f62150Z, "Multi Line Text placeholder"), new C19569k(EnumC19568j.f62152p0, "Email placeholder"), new C19569k(EnumC19568j.f62149Y, "URL placeholder")), 64), new C19540D(new C19581w("header", "headerExplanation", C17689w.f56480Y), 21), C19560b.f62130p0, c6021p2, 27654);
                    c6021p2.m6553p(true);
                }
                break;
        }
        return c17296c;
    }
}
