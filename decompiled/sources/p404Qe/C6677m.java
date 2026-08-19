package p404Qe;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p039Bc.C0885s;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3980S2;
import p283L5.AbstractC4941g;
import p292Lg.C5034f;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9147I2;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17781r0;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;
import p968qi.C18737t;
import p968qi.C18739v;
import p968qi.C18742y;

/* JADX INFO: renamed from: Qe.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6677m extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21471Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6682r f21472Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f21473o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ConversationSpreadsheetViewModel f21474p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6677m(C6682r c6682r, InterfaceC5985X interfaceC5985X, ConversationSpreadsheetViewModel conversationSpreadsheetViewModel) {
        super(3);
        this.f21472Z = c6682r;
        this.f21473o0 = interfaceC5985X;
        this.f21474p0 = conversationSpreadsheetViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? arrayList;
        List list;
        switch (this.f21471Y) {
            case 0:
                InterfaceC17783s0 TopAppBar = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TopAppBar, "$this$TopAppBar");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
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
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    C6682r c6682r = this.f21472Z;
                    C18737t c18737t = c6682r.f21488d;
                    if (c18737t == null || (list = c18737t.f59597a) == null) {
                        arrayList = 0;
                    } else {
                        List list2 = list;
                        arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C18742y) it.next()).f59615a);
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = C17689w.f56480Y;
                    }
                    c6021p.m6524S(1629637443);
                    ConversationSpreadsheetViewModel conversationSpreadsheetViewModel = this.f21474p0;
                    boolean zM6545h = c6021p.m6545h(conversationSpreadsheetViewModel);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C5034f(conversationSpreadsheetViewModel, 20, this.f21473o0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9147I2.m9695d(arrayList, c6682r.f21489e, (InterfaceC1436k) objM6514H, c6021p, 0);
                    AbstractC9147I2.m9693b(c6682r.f21487c, c6021p, 0);
                    c6021p.m6553p(true);
                }
                break;
            default:
                InterfaceC17763i0 paddingValues = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddingValues, "paddingValues");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddingValues) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C10456n c10456n2 = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(c10456n2, paddingValues).mo428M(AbstractC10844c.f32512c);
                    boolean z6 = false;
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i11 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qMo428M);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i2);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p2, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d2);
                    C10843b c10843b = C10843b.f32509a;
                    C6682r c6682r2 = this.f21472Z;
                    C18737t c18737t2 = c6682r2.f21488d;
                    InterfaceC5985X interfaceC5985X = this.f21473o0;
                    if (c18737t2 == null) {
                        c6021p2.m6524S(468904894);
                        AbstractC3980S2.m4668b(c10843b.m11240a(c10456n2, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p2, 0, 30);
                        c6021p2.m6553p(false);
                    } else {
                        c6021p2.m6524S(468910839);
                        C18742y c18742y = (C18742y) AbstractC17680n.m19344T(c6682r2.f21489e, c18737t2.f59597a);
                        if (c18742y != null) {
                            C18739v c18739v = (C18739v) interfaceC5985X.getValue();
                            c6021p2.m6524S(1629677601);
                            boolean zM6542f = c6021p2.m6542f(c6682r2);
                            Object objM6514H2 = c6021p2.m6514H();
                            if (zM6542f || objM6514H2 == C6013l.f19514a) {
                                objM6514H2 = new C5034f(c6682r2, 21, interfaceC5985X);
                                c6021p2.m6537c0(objM6514H2);
                            }
                            c6021p2.m6553p(false);
                            AbstractC4941g.m5549H(c18742y, c18739v, (InterfaceC1436k) objM6514H2, c6021p2, 0);
                        }
                        c6021p2.m6553p(false);
                    }
                    C18739v c18739v2 = (C18739v) interfaceC5985X.getValue();
                    if (c18739v2.f59610b.isEmpty() && c18739v2.f59611c.isEmpty() && c18739v2.f59612d.isEmpty()) {
                        z6 = true;
                    }
                    AbstractC10831a.m11201d(!z6, AbstractC10842a.m11237o(c10843b.m11240a(c10456n2, C10444b.f30941t0), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7), AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), null, AbstractC8411c.m8969c(-643125809, c6021p2, new C0885s(this.f21474p0, interfaceC5985X, 11)), c6021p2, 200064, 16);
                    c6021p2.m6553p(true);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6677m(C6682r c6682r, ConversationSpreadsheetViewModel conversationSpreadsheetViewModel, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f21472Z = c6682r;
        this.f21474p0 = conversationSpreadsheetViewModel;
        this.f21473o0 = interfaceC5985X;
    }
}
