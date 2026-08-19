package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17837E;

/* JADX INFO: renamed from: sh.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C19642t implements InterfaceC17837E {

    /* JADX INFO: renamed from: a */
    public final Boolean f62290a;

    public C19642t(Boolean bool) {
        this.f62290a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19642t) && AbstractC16544l.m18089b(this.f62290a, ((C19642t) obj).f62290a);
    }

    public final int hashCode() {
        Boolean bool = this.f62290a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
