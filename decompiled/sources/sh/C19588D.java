package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C19588D implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19589E f62196a;

    public C19588D(C19589E c19589e) {
        this.f62196a = c19589e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19588D) && AbstractC16544l.m18089b(this.f62196a, ((C19588D) obj).f62196a);
    }

    public final int hashCode() {
        C19589E c19589e = this.f62196a;
        if (c19589e == null) {
            return 0;
        }
        return c19589e.f62197a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
