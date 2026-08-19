package p1071w0;

import androidx.compose.p650ui.input.key.AbstractC10865a;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p080D0.C1766B0;
import p080D0.C1837w0;
import p225Im.InterfaceC3759g;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p870le.C16863U;

/* JADX INFO: renamed from: w0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20782w0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20750g0 f66016Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1837w0 f66017Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6045C f66018o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f66019p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f66020q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC6073v f66021r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C20724N0 f66022s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C20709G f66023t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f66024u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20782w0(C20750g0 c20750g0, C1837w0 c1837w0, C6045C c6045c, boolean z6, boolean z10, InterfaceC6073v interfaceC6073v, C20724N0 c20724n0, C20709G c20709g, int i10) {
        super(3);
        this.f66016Y = c20750g0;
        this.f66017Z = c1837w0;
        this.f66018o0 = c6045c;
        this.f66019p0 = z6;
        this.f66020q0 = z10;
        this.f66021r0 = interfaceC6073v;
        this.f66022s0 = c20724n0;
        this.f66023t0 = c20709g;
        this.f66024u0 = i10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(851809892);
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = new C1766B0();
            c6021p.m6537c0(objM6514H);
        }
        C1766B0 c1766b0 = (C1766B0) objM6514H;
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == c5975s) {
            objM6514H2 = new C20728Q();
            c6021p.m6537c0(objM6514H2);
        }
        C20750g0 c20750g0 = this.f66016Y;
        C1837w0 c1837w0 = this.f66017Z;
        InterfaceC6073v interfaceC6073v = this.f66021r0;
        C20724N0 c20724n0 = this.f66022s0;
        C20780v0 c20780v0 = new C20780v0(c20750g0, c1837w0, this.f66018o0, this.f66019p0, this.f66020q0, c1766b0, interfaceC6073v, c20724n0, (C20728Q) objM6514H2, this.f66023t0, this.f66024u0);
        C10456n c10456n = C10456n.f30959Y;
        boolean zM6545h = c6021p.m6545h(c20780v0);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6545h || objM6514H3 == c5975s) {
            objM6514H3 = new C16863U(1, c20780v0, C20780v0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 17);
            c6021p.m6537c0(objM6514H3);
        }
        InterfaceC10459q interfaceC10459qM11311a = AbstractC10865a.m11311a(c10456n, (InterfaceC1436k) ((InterfaceC3759g) objM6514H3));
        c6021p.m6553p(false);
        return interfaceC10459qM11311a;
    }
}
