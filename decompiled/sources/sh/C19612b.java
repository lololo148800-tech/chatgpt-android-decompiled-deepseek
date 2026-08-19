package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;

/* JADX INFO: renamed from: sh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19612b {

    /* JADX INFO: renamed from: a */
    public final String f62232a;

    /* JADX INFO: renamed from: b */
    public final C20263a0 f62233b;

    public C19612b(String str, C20263a0 c20263a0) {
        this.f62232a = str;
        this.f62233b = c20263a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19612b)) {
            return false;
        }
        C19612b c19612b = (C19612b) obj;
        return AbstractC16544l.m18089b(this.f62232a, c19612b.f62232a) && AbstractC16544l.m18089b(this.f62233b, c19612b.f62233b);
    }

    public final int hashCode() {
        return this.f62233b.hashCode() + (this.f62232a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
