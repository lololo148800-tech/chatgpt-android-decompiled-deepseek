package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20241E;

/* JADX INFO: renamed from: sh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C19618e {

    /* JADX INFO: renamed from: a */
    public final String f62242a;

    /* JADX INFO: renamed from: b */
    public final C20241E f62243b;

    public C19618e(String str, C20241E c20241e) {
        this.f62242a = str;
        this.f62243b = c20241e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19618e)) {
            return false;
        }
        C19618e c19618e = (C19618e) obj;
        return AbstractC16544l.m18089b(this.f62242a, c19618e.f62242a) && AbstractC16544l.m18089b(this.f62243b, c19618e.f62243b);
    }

    public final int hashCode() {
        return this.f62243b.hashCode() + (this.f62242a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
