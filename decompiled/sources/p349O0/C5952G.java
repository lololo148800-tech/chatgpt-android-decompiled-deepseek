package p349O0;

/* JADX INFO: renamed from: O0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C5952G implements InterfaceC5988Y0 {

    /* JADX INFO: renamed from: a */
    public final C6002f0 f19390a;

    public C5952G(C6002f0 c6002f0) {
        this.f19390a = c6002f0;
    }

    @Override // p349O0.InterfaceC5988Y0
    /* JADX INFO: renamed from: a */
    public final Object mo6389a(InterfaceC6008i0 interfaceC6008i0) {
        return this.f19390a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5952G) && this.f19390a.equals(((C5952G) obj).f19390a);
    }

    public final int hashCode() {
        return this.f19390a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f19390a + ')';
    }
}
