package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;

/* JADX INFO: renamed from: te.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C19851B implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final C20263a0 f62942a;

    public C19851B(C20263a0 c20263a0) {
        this.f62942a = c20263a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19851B) && AbstractC16544l.m18089b(this.f62942a, ((C19851B) obj).f62942a);
    }

    public final int hashCode() {
        C20263a0 c20263a0 = this.f62942a;
        if (c20263a0 == null) {
            return 0;
        }
        return c20263a0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
