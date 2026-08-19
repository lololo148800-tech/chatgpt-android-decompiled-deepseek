package p1126yd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: yd.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C21411D implements InterfaceC21409C {

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException f67978a;

    public C21411D(IllegalArgumentException illegalArgumentException) {
        this.f67978a = illegalArgumentException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21411D) && AbstractC16544l.m18089b(this.f67978a, ((C21411D) obj).f67978a);
    }

    public final int hashCode() {
        return this.f67978a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
