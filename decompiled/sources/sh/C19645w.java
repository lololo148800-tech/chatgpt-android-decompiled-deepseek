package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;

/* JADX INFO: renamed from: sh.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C19645w {

    /* JADX INFO: renamed from: a */
    public final String f62296a;

    /* JADX INFO: renamed from: b */
    public final C20263a0 f62297b;

    public C19645w(String str, C20263a0 c20263a0) {
        this.f62296a = str;
        this.f62297b = c20263a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19645w)) {
            return false;
        }
        C19645w c19645w = (C19645w) obj;
        return AbstractC16544l.m18089b(this.f62296a, c19645w.f62296a) && AbstractC16544l.m18089b(this.f62297b, c19645w.f62297b);
    }

    public final int hashCode() {
        return this.f62297b.hashCode() + (this.f62296a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
