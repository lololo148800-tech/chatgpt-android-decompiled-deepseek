package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19595K implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19596L f62206a;

    public C19595K(C19596L c19596l) {
        this.f62206a = c19596l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19595K) && AbstractC16544l.m18089b(this.f62206a, ((C19595K) obj).f62206a);
    }

    public final int hashCode() {
        C19596L c19596l = this.f62206a;
        if (c19596l == null) {
            return 0;
        }
        return c19596l.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
