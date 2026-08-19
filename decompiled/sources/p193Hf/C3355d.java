package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Hf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3355d implements InterfaceC3364g {

    /* JADX INFO: renamed from: a */
    public final AbstractC3409v f10248a;

    public C3355d(AbstractC3409v message) {
        AbstractC16544l.m18094g(message, "message");
        this.f10248a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3355d) && AbstractC16544l.m18089b(this.f10248a, ((C3355d) obj).f10248a);
    }

    public final int hashCode() {
        return this.f10248a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
