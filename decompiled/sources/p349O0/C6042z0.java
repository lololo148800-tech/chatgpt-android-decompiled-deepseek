package p349O0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: O0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6042z0 {

    /* JADX INFO: renamed from: a */
    public final C6021p f19677a;

    public /* synthetic */ C6042z0(C6021p c6021p) {
        this.f19677a = c6021p;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6042z0) {
            return AbstractC16544l.m18089b(this.f19677a, ((C6042z0) obj).f19677a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19677a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f19677a + ')';
    }
}
