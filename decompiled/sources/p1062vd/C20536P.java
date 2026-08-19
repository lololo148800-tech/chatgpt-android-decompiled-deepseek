package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C20536P implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final String f65162a;

    public C20536P(String query) {
        AbstractC16544l.m18094g(query, "query");
        this.f65162a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20536P) && AbstractC16544l.m18089b(this.f65162a, ((C20536P) obj).f65162a);
    }

    public final int hashCode() {
        return this.f65162a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
