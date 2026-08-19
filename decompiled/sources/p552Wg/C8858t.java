package p552Wg;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6604J;

/* JADX INFO: renamed from: Wg.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C8858t implements InterfaceC8862x {

    /* JADX INFO: renamed from: a */
    public final C6604J f27122a;

    public C8858t(C6604J c6604j) {
        this.f27122a = c6604j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8858t) && AbstractC16544l.m18089b(this.f27122a, ((C8858t) obj).f27122a);
    }

    public final int hashCode() {
        C6604J c6604j = this.f27122a;
        if (c6604j == null) {
            return 0;
        }
        return c6604j.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
