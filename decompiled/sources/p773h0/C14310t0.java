package p773h0;

import p523V9.AbstractC8088f6;
import p759g1.C13800b;

/* JADX INFO: renamed from: h0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14310t0 extends C14306r0 {
    @Override // p773h0.C14306r0, p773h0.InterfaceC14302p0
    /* JADX INFO: renamed from: a */
    public final void mo15594a(float f10, long j10, long j11) {
        if (!Float.isNaN(f10)) {
            this.f44913a.setZoom(f10);
        }
        if (AbstractC8088f6.m8538d(j11)) {
            this.f44913a.show(C13800b.m15306g(j10), C13800b.m15307h(j10), C13800b.m15306g(j11), C13800b.m15307h(j11));
        } else {
            this.f44913a.show(C13800b.m15306g(j10), C13800b.m15307h(j10));
        }
    }
}
