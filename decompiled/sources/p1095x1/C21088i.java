package p1095x1;

import p759g1.C13803e;

/* JADX INFO: renamed from: x1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21088i implements InterfaceC21090k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67010a;

    @Override // p1095x1.InterfaceC21090k
    /* JADX INFO: renamed from: a */
    public final long mo21575a(long j10, long j11) {
        switch (this.f67010a) {
            case 0:
                float fMax = Math.max(C13803e.m15333e(j11) / C13803e.m15333e(j10), C13803e.m15331c(j11) / C13803e.m15331c(j10));
                return AbstractC21075b0.m21561b(fMax, fMax);
            case 1:
                float fMin = Math.min(C13803e.m15333e(j11) / C13803e.m15333e(j10), C13803e.m15331c(j11) / C13803e.m15331c(j10));
                return AbstractC21075b0.m21561b(fMin, fMin);
            default:
                if (C13803e.m15333e(j10) <= C13803e.m15333e(j11) && C13803e.m15331c(j10) <= C13803e.m15331c(j11)) {
                    return AbstractC21075b0.m21561b(1.0f, 1.0f);
                }
                float fMin2 = Math.min(C13803e.m15333e(j11) / C13803e.m15333e(j10), C13803e.m15331c(j11) / C13803e.m15331c(j10));
                return AbstractC21075b0.m21561b(fMin2, fMin2);
        }
    }
}
