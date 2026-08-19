package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19616d implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19618e f62240a;

    public C19616d(C19618e c19618e) {
        this.f62240a = c19618e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19616d) && AbstractC16544l.m18089b(this.f62240a, ((C19616d) obj).f62240a);
    }

    public final int hashCode() {
        C19618e c19618e = this.f62240a;
        if (c19618e == null) {
            return 0;
        }
        return c19618e.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
