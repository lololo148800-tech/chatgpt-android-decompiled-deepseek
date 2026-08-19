package p380Pd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Pd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6387d extends AbstractC6389f {

    /* JADX INFO: renamed from: b */
    public final String f20804b;

    public C6387d(String str) {
        this.f20804b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6387d) && AbstractC16544l.m18089b(this.f20804b, ((C6387d) obj).f20804b);
    }

    public final int hashCode() {
        String str = this.f20804b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
