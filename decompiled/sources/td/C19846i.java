package td;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: td.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19846i implements InterfaceC19848k {

    /* JADX INFO: renamed from: a */
    public final String f62934a;

    public C19846i(String cursor) {
        AbstractC16544l.m18094g(cursor, "cursor");
        this.f62934a = cursor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19846i) && AbstractC16544l.m18089b(this.f62934a, ((C19846i) obj).f62934a);
    }

    public final int hashCode() {
        return this.f62934a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
