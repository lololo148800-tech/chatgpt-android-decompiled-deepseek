package p1106xf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p269Kh.C4684k;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC10008z3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: xf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C21201i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67407Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4684k f67408Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21201i(C4684k c4684k, int i10) {
        super(2);
        this.f67407Y = i10;
        this.f67408Z = c4684k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67407Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
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
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.change_model, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                    AbstractC4124r4.m4768b(this.f67408Z.f15237b, null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
                    c6021p.m6553p(true);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str = this.f67408Z.f15247l;
                    if (str != null) {
                        AbstractC10008z3.m10646a(str, c6021p2, 0);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
