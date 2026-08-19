package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import p350O1.C6045C;

/* JADX INFO: renamed from: te.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19860K implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final C6045C f62952a;

    public C19860K(C6045C value) {
        AbstractC16544l.m18094g(value, "value");
        this.f62952a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19860K) && AbstractC16544l.m18089b(this.f62952a, ((C19860K) obj).f62952a);
    }

    public final int hashCode() {
        return this.f62952a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
