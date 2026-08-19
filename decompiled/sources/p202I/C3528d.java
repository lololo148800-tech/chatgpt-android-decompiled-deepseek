package p202I;

import p178H.InterfaceC3127U;

/* JADX INFO: renamed from: I.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3528d {

    /* JADX INFO: renamed from: a */
    public final C3535k f10668a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3127U f10669b;

    public C3528d(C3535k c3535k, InterfaceC3127U interfaceC3127U) {
        if (c3535k == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f10668a = c3535k;
        this.f10669b = interfaceC3127U;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3528d)) {
            return false;
        }
        C3528d c3528d = (C3528d) obj;
        return this.f10668a.equals(c3528d.f10668a) && this.f10669b.equals(c3528d.f10669b);
    }

    public final int hashCode() {
        return ((this.f10668a.hashCode() ^ 1000003) * 1000003) ^ this.f10669b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f10668a + ", imageProxy=" + this.f10669b + "}";
    }
}
