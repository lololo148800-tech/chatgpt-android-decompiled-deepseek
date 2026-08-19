package p246Ji;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p042Bf.C1278t;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p339Nf.AbstractC5741w;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.C17794y;
import p936p0.C18280t;

/* JADX INFO: renamed from: Ji.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4363c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14190Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f14191Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18280t f14192o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4363c(List list, C18280t c18280t, int i10) {
        super(3);
        this.f14190Y = i10;
        this.f14191Z = list;
        this.f14192o0 = c18280t;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14190Y) {
            case 0:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    List list = this.f14191Z;
                    Integer numValueOf = Integer.valueOf(list.size());
                    c6021p.m6524S(-1947259497);
                    C18280t c18280t = this.f14192o0;
                    boolean zM6542f = c6021p.m6542f(c18280t) | c6021p.m6545h(list);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C4362b(c18280t, list, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, numValueOf);
                    InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23201f);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
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
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(2027090788);
                    boolean zM6545h = c6021p.m6545h(list);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6545h || objM6514H2 == c5975s) {
                        objM6514H2 = new C1278t(4, list);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC9746I4.m10337a(null, this.f14192o0, null, true, null, null, null, false, (InterfaceC1436k) objM6514H2, c6021p, 3072, 245);
                    c6021p.m6553p(true);
                }
                break;
            default:
                C10845a stickyHeader = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(stickyHeader, "$this$stickyHeader");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(1867478694);
                    if (!this.f14191Z.isEmpty()) {
                        AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(AbstractC10844c.m11244d(AbstractC10833a.m11207b(C10456n.f30959Y, AbstractC5741w.m6166i(c6021p2), AbstractC14334L.f44973a), 1.0f), AbstractC7313q.f23201f));
                    }
                    c6021p2.m6553p(false);
                    AbstractC5741w.m6163f(R.string.search_results, this.f14192o0, "sources", c6021p2, 384);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
