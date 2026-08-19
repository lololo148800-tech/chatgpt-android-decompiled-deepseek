package p380Pd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Pd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6388e extends AbstractC6389f {

    /* JADX INFO: renamed from: b */
    public final String f20805b;

    public C6388e(String str) {
        this.f20805b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6388e) && AbstractC16544l.m18089b(this.f20805b, ((C6388e) obj).f20805b);
    }

    public final int hashCode() {
        return this.f20805b.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
