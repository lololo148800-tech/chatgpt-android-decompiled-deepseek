package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19617d0 implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19619e0 f62241a;

    public C19617d0(C19619e0 c19619e0) {
        this.f62241a = c19619e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19617d0) && AbstractC16544l.m18089b(this.f62241a, ((C19617d0) obj).f62241a);
    }

    public final int hashCode() {
        C19619e0 c19619e0 = this.f62241a;
        if (c19619e0 == null) {
            return 0;
        }
        return c19619e0.f62244a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
