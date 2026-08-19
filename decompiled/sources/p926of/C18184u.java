package p926of;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18184u implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57998a;

    public C18184u(String code) {
        AbstractC16544l.m18094g(code, "code");
        this.f57998a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18184u) && AbstractC16544l.m18089b(this.f57998a, ((C18184u) obj).f57998a);
    }

    public final int hashCode() {
        return this.f57998a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
