package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import p537W0.C8410b;

/* JADX INFO: renamed from: J0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4061h1 {

    /* JADX INFO: renamed from: a */
    public final C3934J3 f12884a;

    /* JADX INFO: renamed from: b */
    public final C8410b f12885b;

    public C4061h1(C3934J3 c3934j3, C8410b c8410b) {
        this.f12884a = c3934j3;
        this.f12885b = c8410b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4061h1)) {
            return false;
        }
        C4061h1 c4061h1 = (C4061h1) obj;
        return AbstractC16544l.m18089b(this.f12884a, c4061h1.f12884a) && this.f12885b.equals(c4061h1.f12885b);
    }

    public final int hashCode() {
        C3934J3 c3934j3 = this.f12884a;
        return this.f12885b.hashCode() + ((c3934j3 == null ? 0 : c3934j3.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12884a + ", transition=" + this.f12885b + ')';
    }
}
