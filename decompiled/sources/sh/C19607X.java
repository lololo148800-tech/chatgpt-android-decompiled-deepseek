package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17837E;

/* JADX INFO: renamed from: sh.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C19607X implements InterfaceC17837E {

    /* JADX INFO: renamed from: a */
    public final Boolean f62226a;

    public C19607X(Boolean bool) {
        this.f62226a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19607X) && AbstractC16544l.m18089b(this.f62226a, ((C19607X) obj).f62226a);
    }

    public final int hashCode() {
        Boolean bool = this.f62226a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
