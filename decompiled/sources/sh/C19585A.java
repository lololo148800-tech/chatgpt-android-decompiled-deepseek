package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20270f;

/* JADX INFO: renamed from: sh.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C19585A {

    /* JADX INFO: renamed from: a */
    public final String f62188a;

    /* JADX INFO: renamed from: b */
    public final C20270f f62189b;

    public C19585A(String str, C20270f c20270f) {
        this.f62188a = str;
        this.f62189b = c20270f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19585A)) {
            return false;
        }
        C19585A c19585a = (C19585A) obj;
        return AbstractC16544l.m18089b(this.f62188a, c19585a.f62188a) && AbstractC16544l.m18089b(this.f62189b, c19585a.f62189b);
    }

    public final int hashCode() {
        return this.f62189b.hashCode() + (this.f62188a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
