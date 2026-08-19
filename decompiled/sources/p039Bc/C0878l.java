package p039Bc;

import androidx.compose.p650ui.focus.AbstractC10862a;
import com.openai.chatgpt.AbstractC12214a;
import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1071w0.C20746e0;
import p1071w0.C20748f0;
import p124Ei.C2478T0;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p402Qc.C6593i;
import p444S4.AbstractC6993A;
import p537W0.AbstractC8411c;
import p547Wc.C8774S;
import p547Wc.C8777V;
import p553Wh.C8870f;
import p594Y9.AbstractC9781O3;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p737f1.C13522n;
import p737f1.InterfaceC13515g;
import p894n0.InterfaceC17406l;
import ug.AbstractC20236s;

/* JADX INFO: renamed from: Bc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C0878l extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2578Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f2579Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f2580o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f2581p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f2582q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f2583r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f2584s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f2585t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0878l(C8870f c8870f, String str, InterfaceC10459q interfaceC10459q, AbstractC20236s abstractC20236s, RootViewModel rootViewModel, boolean z6, boolean z10) {
        super(2);
        this.f2582q0 = c8870f;
        this.f2581p0 = str;
        this.f2583r0 = interfaceC10459q;
        this.f2584s0 = abstractC20236s;
        this.f2585t0 = rootViewModel;
        this.f2579Z = z6;
        this.f2580o0 = z10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2578Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C8870f c8870f = (C8870f) this.f2582q0;
                    AbstractC12214a.m14225c(c8870f.f27149b, c6021p, 0);
                    C0873g c0873g = C0873g.f2564Z;
                    C0873g c0873g2 = C0873g.f2565o0;
                    c6021p.m6524S(-1781257925);
                    boolean zM6545h = c6021p.m6545h((AbstractC20236s) this.f2584s0) | c6021p.m6545h((RootViewModel) this.f2585t0) | c6021p.m6544g(this.f2579Z) | c6021p.m6545h(c8870f) | c6021p.m6544g(this.f2580o0);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0877k(this.f2579Z, this.f2580o0, (AbstractC20236s) this.f2584s0, (RootViewModel) this.f2585t0, (C8870f) this.f2582q0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    String str = this.f2581p0;
                    AbstractC6993A.m7396b(c8870f.f27149b, str, (InterfaceC10459q) this.f2583r0, null, null, c0873g, c0873g2, null, null, (InterfaceC1436k) objM6514H, c6021p, 1769472);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C8774S.f26763o0, c6021p2, 3072, 6);
                    c6021p2.m6524S(1445422701);
                    Object objM6514H2 = c6021p2.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (objM6514H2 == c5975s) {
                        objM6514H2 = AbstractC0168G.m536y(c6021p2);
                    }
                    InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H2;
                    c6021p2.m6553p(false);
                    InterfaceC13515g interfaceC13515g = (InterfaceC13515g) c6021p2.m6548k(AbstractC0187M0.f705g);
                    InterfaceC10459q interfaceC10459qM11300b = AbstractC10862a.m11300b(AbstractC10862a.m11299a(C10456n.f30959Y, (C13522n) this.f2582q0), (InterfaceC1436k) this.f2583r0);
                    String str2 = (String) interfaceC5985X.getValue();
                    C20748f0 c20748f0 = new C20748f0(0, 3, 119);
                    c6021p2.m6524S(1445442787);
                    boolean zM6545h2 = c6021p2.m6545h(interfaceC13515g);
                    Object objM6514H3 = c6021p2.m6514H();
                    if (zM6545h2 || objM6514H3 == c5975s) {
                        objM6514H3 = new C6593i(interfaceC13515g, 20);
                        c6021p2.m6537c0(objM6514H3);
                    }
                    c6021p2.m6553p(false);
                    C20746e0 c20746e0 = new C20746e0((InterfaceC1436k) objM6514H3, null, 47);
                    c6021p2.m6524S(1445432380);
                    boolean zM6542f = c6021p2.m6542f(interfaceC5985X);
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f2584s0;
                    boolean zM6542f2 = zM6542f | c6021p2.m6542f(interfaceC1436k);
                    Object objM6514H4 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H4 == c5975s) {
                        objM6514H4 = new C2478T0(interfaceC1436k, interfaceC5985X, 2);
                        c6021p2.m6537c0(objM6514H4);
                    }
                    c6021p2.m6553p(false);
                    AbstractC9781O3.m10394b(str2, (InterfaceC1436k) objM6514H4, interfaceC10459qM11300b, this.f2579Z, false, null, c20748f0, c20746e0, false, 1, 0, null, null, null, null, AbstractC8411c.m8969c(-1292749681, c6021p2, new C8777V((InterfaceC1426a) this.f2585t0, this.f2580o0, interfaceC17406l, interfaceC5985X, this.f2581p0, (InterfaceC1436k) this.f2584s0)), c6021p2, 806879232, 196608, 32048);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0878l(C13522n c13522n, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, boolean z6, InterfaceC1426a interfaceC1426a, boolean z10, String str) {
        super(2);
        this.f2582q0 = c13522n;
        this.f2583r0 = interfaceC1436k;
        this.f2584s0 = interfaceC1436k2;
        this.f2579Z = z6;
        this.f2585t0 = interfaceC1426a;
        this.f2580o0 = z10;
        this.f2581p0 = str;
    }
}
