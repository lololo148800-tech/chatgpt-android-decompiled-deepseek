package p216Id;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21933K1;

/* JADX INFO: renamed from: Id.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696d implements InterfaceC3702j {

    /* JADX INFO: renamed from: a */
    public final AbstractC21933K1 f11230a;

    public C3696d(AbstractC21933K1 error) {
        AbstractC16544l.m18094g(error, "error");
        this.f11230a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3696d) && AbstractC16544l.m18089b(this.f11230a, ((C3696d) obj).f11230a);
    }

    public final int hashCode() {
        return this.f11230a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
