package p364Oh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Oh.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6223B extends AbstractC6224C {

    /* JADX INFO: renamed from: a */
    public final Object f20258a;

    public C6223B(Object obj) {
        this.f20258a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6223B) && AbstractC16544l.m18089b(this.f20258a, ((C6223B) obj).f20258a);
    }

    public final int hashCode() {
        Object obj = this.f20258a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
