package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C19648z implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19585A f62299a;

    public C19648z(C19585A c19585a) {
        this.f62299a = c19585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19648z) && AbstractC16544l.m18089b(this.f62299a, ((C19648z) obj).f62299a);
    }

    public final int hashCode() {
        C19585A c19585a = this.f62299a;
        if (c19585a == null) {
            return 0;
        }
        return c19585a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
