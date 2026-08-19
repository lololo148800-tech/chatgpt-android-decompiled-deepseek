package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C20531K implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final C20541V f65156a;

    public C20531K(C20541V historyItem) {
        AbstractC16544l.m18094g(historyItem, "historyItem");
        this.f65156a = historyItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20531K) && AbstractC16544l.m18089b(this.f65156a, ((C20531K) obj).f65156a);
    }

    public final int hashCode() {
        return this.f65156a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
