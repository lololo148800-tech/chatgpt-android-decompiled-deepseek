package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20241E;

/* JADX INFO: renamed from: sh.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C19604U {

    /* JADX INFO: renamed from: a */
    public final String f62219a;

    /* JADX INFO: renamed from: b */
    public final C20241E f62220b;

    public C19604U(String str, C20241E c20241e) {
        this.f62219a = str;
        this.f62220b = c20241e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19604U)) {
            return false;
        }
        C19604U c19604u = (C19604U) obj;
        return AbstractC16544l.m18089b(this.f62219a, c19604u.f62219a) && AbstractC16544l.m18089b(this.f62220b, c19604u.f62220b);
    }

    public final int hashCode() {
        return this.f62220b.hashCode() + (this.f62219a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
