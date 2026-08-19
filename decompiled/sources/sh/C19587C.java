package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20270f;

/* JADX INFO: renamed from: sh.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C19587C {

    /* JADX INFO: renamed from: a */
    public final String f62194a;

    /* JADX INFO: renamed from: b */
    public final C20270f f62195b;

    public C19587C(String str, C20270f c20270f) {
        this.f62194a = str;
        this.f62195b = c20270f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19587C)) {
            return false;
        }
        C19587C c19587c = (C19587C) obj;
        return AbstractC16544l.m18089b(this.f62194a, c19587c.f62194a) && AbstractC16544l.m18089b(this.f62195b, c19587c.f62195b);
    }

    public final int hashCode() {
        return this.f62195b.hashCode() + (this.f62194a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
