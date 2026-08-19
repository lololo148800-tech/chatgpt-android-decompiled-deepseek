package p773h0;

import android.widget.Magnifier;
import p571X9.AbstractC9113C4;
import p759g1.C13800b;

/* JADX INFO: renamed from: h0.r0 */
/* JADX INFO: loaded from: classes.dex */
public class C14306r0 implements InterfaceC14302p0 {

    /* JADX INFO: renamed from: a */
    public final Magnifier f44913a;

    public C14306r0(Magnifier magnifier) {
        this.f44913a = magnifier;
    }

    @Override // p773h0.InterfaceC14302p0
    /* JADX INFO: renamed from: a */
    public void mo15594a(float f10, long j10, long j11) {
        this.f44913a.show(C13800b.m15306g(j10), C13800b.m15307h(j10));
    }

    /* JADX INFO: renamed from: b */
    public final void m15597b() {
        this.f44913a.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final long m15598c() {
        return AbstractC9113C4.m9643a(this.f44913a.getWidth(), this.f44913a.getHeight());
    }

    /* JADX INFO: renamed from: d */
    public final void m15599d() {
        this.f44913a.update();
    }
}
