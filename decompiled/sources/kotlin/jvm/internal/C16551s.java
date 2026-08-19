package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C16551s implements InterfaceC16536d {

    /* JADX INFO: renamed from: Y */
    public final Class f51284Y;

    public C16551s(Class jClass, String str) {
        AbstractC16544l.m18094g(jClass, "jClass");
        this.f51284Y = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC16536d
    /* JADX INFO: renamed from: d */
    public final Class mo5684d() {
        return this.f51284Y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16551s) {
            if (AbstractC16544l.m18089b(this.f51284Y, ((C16551s) obj).f51284Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51284Y.hashCode();
    }

    public final String toString() {
        return this.f51284Y + " (Kotlin reflection is not available)";
    }
}
