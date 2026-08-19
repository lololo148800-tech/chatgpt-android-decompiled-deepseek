package p820j0;

import android.view.DragEvent;
import p003A1.C0166F0;
import p003A1.C0169G0;
import p693d1.C12989b;
import p693d1.InterfaceC12993f;
import p749fd.C13628m;
import p796i0.C14898e;

/* JADX INFO: renamed from: j0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16035f implements InterfaceC12993f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16031b f49472Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13628m f49473Z;

    public C16035f(C16031b c16031b, C13628m c13628m) {
        this.f49472Y = c16031b;
        this.f49473Z = c13628m;
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: A */
    public final void mo14722A(C12989b c12989b) {
        this.f49472Y.f49468b.mo9533c();
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: Q */
    public final boolean mo14723Q(C12989b c12989b) {
        this.f49473Z.invoke(c12989b);
        DragEvent dragEvent = c12989b.f41241a;
        C14898e c14898e = new C14898e(new C0166F0(dragEvent.getClipData()), new C0169G0(dragEvent.getClipDescription()), 1, null);
        return !c14898e.equals(this.f49472Y.f49468b.mo9531a(c14898e));
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: e0 */
    public final void mo14724e0(C12989b c12989b) {
        this.f49472Y.f49468b.mo9532b();
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: n */
    public final void mo14725n(C12989b c12989b) {
        this.f49472Y.f49468b.mo9534d();
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void mo14726n0(C12989b c12989b) {
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: w0 */
    public final void mo14728w0(C12989b c12989b) {
        this.f49472Y.f49468b.mo9535e();
    }
}
