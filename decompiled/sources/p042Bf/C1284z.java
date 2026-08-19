package p042Bf;

import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C0893B;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Bf.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C1284z implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final C0893B f3416a;

    public C1284z(C0893B c0893b) {
        this.f3416a = c0893b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1284z) && AbstractC16544l.m18089b(this.f3416a, ((C1284z) obj).f3416a);
    }

    public final int hashCode() {
        C0893B c0893b = this.f3416a;
        if (c0893b == null) {
            return 0;
        }
        return c0893b.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
