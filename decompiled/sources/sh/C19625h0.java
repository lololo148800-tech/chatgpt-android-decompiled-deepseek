package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19625h0 implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19629j0 f62251a;

    public C19625h0(C19629j0 c19629j0) {
        this.f62251a = c19629j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19625h0) && AbstractC16544l.m18089b(this.f62251a, ((C19625h0) obj).f62251a);
    }

    public final int hashCode() {
        C19629j0 c19629j0 = this.f62251a;
        if (c19629j0 == null) {
            return 0;
        }
        return c19629j0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
