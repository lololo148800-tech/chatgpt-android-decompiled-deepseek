package p706df;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: df.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C13091k implements InterfaceC13096p {

    /* JADX INFO: renamed from: a */
    public final String f41585a;

    public C13091k(String cursor) {
        AbstractC16544l.m18094g(cursor, "cursor");
        this.f41585a = cursor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13091k) && AbstractC16544l.m18089b(this.f41585a, ((C13091k) obj).f41585a);
    }

    public final int hashCode() {
        return this.f41585a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
