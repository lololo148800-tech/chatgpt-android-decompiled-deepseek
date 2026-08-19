package p991rh;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rh.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19011t {
    public static final C19007p Companion = new C19007p();

    /* JADX INFO: renamed from: a */
    public final C19010s f60589a;

    public /* synthetic */ C19011t(int i10, C19010s c19010s) {
        if ((i10 & 1) == 0) {
            this.f60589a = null;
        } else {
            this.f60589a = c19010s;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19011t) && AbstractC16544l.m18089b(this.f60589a, ((C19011t) obj).f60589a);
    }

    public final int hashCode() {
        C19010s c19010s = this.f60589a;
        if (c19010s == null) {
            return 0;
        }
        return c19010s.f60588a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
