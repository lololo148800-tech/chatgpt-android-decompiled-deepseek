package p103Dn;

import p025An.C0624m;
import p129En.AbstractC2591b;
import p129En.AbstractC2593d;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Dn.E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2129E0 extends AbstractC2593d {

    /* JADX INFO: renamed from: a */
    public long f6522a;

    /* JADX INFO: renamed from: b */
    public C0624m f6523b;

    @Override // p129En.AbstractC2593d
    /* JADX INFO: renamed from: a */
    public final boolean mo3246a(AbstractC2591b abstractC2591b) {
        C2127D0 c2127d0 = (C2127D0) abstractC2591b;
        if (this.f6522a >= 0) {
            return false;
        }
        long j10 = c2127d0.f6513u0;
        if (j10 < c2127d0.f6514v0) {
            c2127d0.f6514v0 = j10;
        }
        this.f6522a = j10;
        return true;
    }

    @Override // p129En.AbstractC2593d
    /* JADX INFO: renamed from: b */
    public final InterfaceC18770c[] mo3247b(AbstractC2591b abstractC2591b) {
        long j10 = this.f6522a;
        this.f6522a = -1L;
        this.f6523b = null;
        return ((C2127D0) abstractC2591b).m3245w(j10);
    }
}
