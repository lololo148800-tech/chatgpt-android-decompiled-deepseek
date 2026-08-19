package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C19598N implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19599O f62209a;

    public C19598N(C19599O c19599o) {
        this.f62209a = c19599o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19598N) && AbstractC16544l.m18089b(this.f62209a, ((C19598N) obj).f62209a);
    }

    public final int hashCode() {
        C19599O c19599o = this.f62209a;
        if (c19599o == null) {
            return 0;
        }
        return c19599o.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
