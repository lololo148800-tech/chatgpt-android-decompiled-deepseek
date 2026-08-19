package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C20521A implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final C20541V f65148a;

    public C20521A(C20541V historyItem) {
        AbstractC16544l.m18094g(historyItem, "historyItem");
        this.f65148a = historyItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20521A) && AbstractC16544l.m18089b(this.f65148a, ((C20521A) obj).f65148a);
    }

    public final int hashCode() {
        return this.f65148a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
