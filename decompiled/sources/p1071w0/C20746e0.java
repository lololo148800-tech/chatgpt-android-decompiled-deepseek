package p1071w0;

import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: w0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20746e0 {

    /* JADX INFO: renamed from: g */
    public static final C20746e0 f65772g = new C20746e0(null, null, 63);

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f65773a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f65774b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f65775c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1436k f65776d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f65777e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1436k f65778f;

    public C20746e0(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10) {
        interfaceC1436k = (i10 & 16) != 0 ? null : interfaceC1436k;
        interfaceC1436k2 = (i10 & 32) != 0 ? null : interfaceC1436k2;
        this.f65773a = null;
        this.f65774b = null;
        this.f65775c = null;
        this.f65776d = null;
        this.f65777e = interfaceC1436k;
        this.f65778f = interfaceC1436k2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20746e0)) {
            return false;
        }
        C20746e0 c20746e0 = (C20746e0) obj;
        return this.f65773a == c20746e0.f65773a && this.f65774b == c20746e0.f65774b && this.f65775c == c20746e0.f65775c && this.f65776d == c20746e0.f65776d && this.f65777e == c20746e0.f65777e && this.f65778f == c20746e0.f65778f;
    }

    public final int hashCode() {
        InterfaceC1436k interfaceC1436k = this.f65773a;
        int iHashCode = (interfaceC1436k != null ? interfaceC1436k.hashCode() : 0) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f65774b;
        int iHashCode2 = (iHashCode + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k3 = this.f65775c;
        int iHashCode3 = (iHashCode2 + (interfaceC1436k3 != null ? interfaceC1436k3.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k4 = this.f65776d;
        int iHashCode4 = (iHashCode3 + (interfaceC1436k4 != null ? interfaceC1436k4.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k5 = this.f65777e;
        int iHashCode5 = (iHashCode4 + (interfaceC1436k5 != null ? interfaceC1436k5.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k6 = this.f65778f;
        return iHashCode5 + (interfaceC1436k6 != null ? interfaceC1436k6.hashCode() : 0);
    }
}
