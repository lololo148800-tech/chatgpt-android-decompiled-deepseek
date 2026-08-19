package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;

/* JADX INFO: renamed from: sh.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19631k0 {

    /* JADX INFO: renamed from: a */
    public final String f62265a;

    /* JADX INFO: renamed from: b */
    public final C20263a0 f62266b;

    public C19631k0(String str, C20263a0 c20263a0) {
        this.f62265a = str;
        this.f62266b = c20263a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19631k0)) {
            return false;
        }
        C19631k0 c19631k0 = (C19631k0) obj;
        return AbstractC16544l.m18089b(this.f62265a, c19631k0.f62265a) && AbstractC16544l.m18089b(this.f62266b, c19631k0.f62266b);
    }

    public final int hashCode() {
        return this.f62266b.hashCode() + (this.f62265a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
