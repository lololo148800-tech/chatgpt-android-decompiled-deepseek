package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17837E;

/* JADX INFO: renamed from: sh.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C19609Z implements InterfaceC17837E {

    /* JADX INFO: renamed from: a */
    public final C19611a0 f62229a;

    public C19609Z(C19611a0 c19611a0) {
        this.f62229a = c19611a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19609Z) && AbstractC16544l.m18089b(this.f62229a, ((C19609Z) obj).f62229a);
    }

    public final int hashCode() {
        return this.f62229a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
