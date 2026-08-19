package p232J3;

import p133F3.C2658d;

/* JADX INFO: renamed from: J3.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4201A implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13652Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2658d f13653Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f13654o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4244p f13655p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4249u f13656q0;

    public /* synthetic */ RunnableC4201A(C2658d c2658d, InterfaceC4203C interfaceC4203C, C4244p c4244p, C4249u c4249u, int i10) {
        this.f13652Y = i10;
        this.f13653Z = c2658d;
        this.f13654o0 = interfaceC4203C;
        this.f13655p0 = c4244p;
        this.f13656q0 = c4249u;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [J3.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [J3.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [J3.C, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13652Y) {
            case 0:
                C2658d c2658d = this.f13653Z;
                int i10 = c2658d.f8168a;
                this.f13654o0.mo2762j(i10, c2658d.f8169b, this.f13655p0, this.f13656q0);
                break;
            case 1:
                C2658d c2658d2 = this.f13653Z;
                int i11 = c2658d2.f8168a;
                this.f13654o0.mo2770r(i11, c2658d2.f8169b, this.f13655p0, this.f13656q0);
                break;
            default:
                C2658d c2658d3 = this.f13653Z;
                int i12 = c2658d3.f8168a;
                this.f13654o0.mo2752L(i12, c2658d3.f8169b, this.f13655p0, this.f13656q0);
                break;
        }
    }
}
