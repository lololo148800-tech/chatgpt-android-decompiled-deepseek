package p1139z0;

import android.view.DragEvent;
import p003A1.C0166F0;
import p003A1.C0169G0;
import p049Bm.InterfaceC1436k;
import p1062vd.C20567q;
import p523V9.AbstractC8088f6;
import p693d1.C12989b;
import p693d1.InterfaceC12993f;
import p759g1.C13800b;

/* JADX INFO: renamed from: z0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21642t0 implements InterfaceC12993f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21618h0 f68570Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20567q f68571Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f68572o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f68573p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f68574q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f68575r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f68576s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f68577t0;

    public C21642t0(C21618h0 c21618h0, C20567q c20567q, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, InterfaceC1436k interfaceC1436k5, InterfaceC1436k interfaceC1436k6) {
        this.f68570Y = c21618h0;
        this.f68571Z = c20567q;
        this.f68572o0 = interfaceC1436k;
        this.f68573p0 = interfaceC1436k2;
        this.f68574q0 = interfaceC1436k3;
        this.f68575r0 = interfaceC1436k4;
        this.f68576s0 = interfaceC1436k5;
        this.f68577t0 = interfaceC1436k6;
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: A */
    public final void mo14722A(C12989b c12989b) {
        InterfaceC1436k interfaceC1436k = this.f68575r0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(c12989b);
        }
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: Q */
    public final boolean mo14723Q(C12989b c12989b) {
        this.f68570Y.invoke(c12989b);
        DragEvent dragEvent = c12989b.f41241a;
        this.f68571Z.invoke(new C0166F0(dragEvent.getClipData()), new C0169G0(dragEvent.getClipDescription()));
        return Boolean.TRUE.booleanValue();
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: e0 */
    public final void mo14724e0(C12989b c12989b) {
        InterfaceC1436k interfaceC1436k = this.f68572o0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(c12989b);
        }
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: n */
    public final void mo14725n(C12989b c12989b) {
        InterfaceC1436k interfaceC1436k = this.f68573p0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(c12989b);
        }
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: n0 */
    public final void mo14726n0(C12989b c12989b) {
        InterfaceC1436k interfaceC1436k = this.f68574q0;
        if (interfaceC1436k != null) {
            DragEvent dragEvent = c12989b.f41241a;
            interfaceC1436k.invoke(new C13800b(AbstractC8088f6.m8536b(dragEvent.getX(), dragEvent.getY())));
        }
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: w0 */
    public final void mo14728w0(C12989b c12989b) {
        InterfaceC1436k interfaceC1436k = this.f68577t0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(c12989b);
        }
    }
}
