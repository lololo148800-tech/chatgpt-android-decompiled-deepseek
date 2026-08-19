package p363Og;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.focus.AbstractC10862a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.C0280q;
import p017Af.C0468O;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1071w0.C20748f0;
import p1117y1.C21368h;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p244Jg.C4339c;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p478Tc.AbstractC7314r;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8484G4;
import p594Y9.AbstractC9781O3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p737f1.C13522n;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Og.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6211o extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20217Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6213q f20218Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f20219o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6211o(C6213q c6213q, InterfaceC3759g interfaceC3759g, int i10) {
        super(3);
        this.f20217Y = i10;
        this.f20218Z = c6213q;
        this.f20219o0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        InterfaceC3759g interfaceC3759g = this.f20219o0;
        C5975S c5975s = C6013l.f19514a;
        C6213q c6213q = this.f20218Z;
        C10456n c10456n = C10456n.f30959Y;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f20217Y) {
            case 0:
                InterfaceC17783s0 TopAppBar = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TopAppBar, "$this$TopAppBar");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else if (c6213q.f20224d) {
                    c6021p.m6524S(-1780458171);
                    AbstractC3980S2.m4668b(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c), 0L, AbstractC7314r.f23208a, 0L, 0, c6021p, 0, 26);
                    AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23201f));
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-1780145722);
                    c6021p.m6524S(-473063912);
                    boolean zM6542f = c6021p.m6542f(interfaceC3759g);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C6209m(interfaceC3759g, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, null, c6213q.m6732f(), null, null, null, null, null, null, AbstractC6199c.f20194c, c6021p, 805306368, 506);
                    c6021p.m6553p(false);
                }
                return c17296c;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                    C21368h c21368h = AbstractC17724E0.f56585a;
                    InterfaceC10459q interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM11232j, C0280q.f1030t0, new C0468O(paddings, 29));
                    float f10 = AbstractC7313q.f23201f;
                    InterfaceC10459q interfaceC10459qM19488j = AbstractC17758g.m19488j(AbstractC10842a.m11235m(interfaceC10459qM10921b, f10, 0.0f, 2));
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f10), C10444b.f30946y0, c6021p2, 0);
                    int i11 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM19488j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p2, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    C17794y c17794y = C17794y.f56777a;
                    int iOrdinal = c6213q.f20221a.ordinal();
                    if (iOrdinal == 0) {
                        i10 = R.string.custom_instructions_user_message;
                    } else {
                        if (iOrdinal != 1) {
                            throw new C0644w();
                        }
                        i10 = R.string.custom_instructions_model_message;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12151g, c6021p2, 0, 0, 65534);
                    c6021p2.m6524S(-473027354);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (objM6514H2 == c5975s) {
                        objM6514H2 = new C13522n();
                        c6021p2.m6537c0(objM6514H2);
                    }
                    C13522n c13522n = (C13522n) objM6514H2;
                    c6021p2.m6553p(false);
                    c6021p2.m6524S(-473023234);
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC3759g);
                    Object objM6514H3 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H3 == c5975s) {
                        objM6514H3 = new C4339c(interfaceC3759g, 1);
                        c6021p2.m6537c0(objM6514H3);
                    }
                    c6021p2.m6553p(false);
                    AbstractC9781O3.m10393a(c6213q.f20223c, (InterfaceC1436k) objM6514H3, AbstractC10862a.m11299a(AbstractC10844c.m11244d(c17794y.m19544b(c10456n, true), 1.0f), c13522n), false, false, null, C20748f0.m21288a(3, 0, 126), null, false, 0, 0, null, null, null, null, null, c6021p2, 0, 0, 65464);
                    c6021p2.m6524S(-473010006);
                    Object objM6514H4 = c6021p2.m6514H();
                    if (objM6514H4 == c5975s) {
                        objM6514H4 = new C6212p(c13522n, null);
                        c6021p2.m6537c0(objM6514H4);
                    }
                    c6021p2.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p2, c17296c);
                    AbstractC8484G4.m9134a(c6213q.f20221a, c6213q.f20223c.f19682a.f10934Y, AbstractC10844c.m11244d(c10456n, 1.0f), c6021p2, 384);
                    c6021p2.m6553p(true);
                }
                return c17296c;
        }
    }
}
