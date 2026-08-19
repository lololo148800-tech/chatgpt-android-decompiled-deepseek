package p1014t1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: t1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C19743t {

    /* JADX INFO: renamed from: a */
    public final int f62511a;

    public /* synthetic */ C19743t(int i10) {
        this.f62511a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19743t) {
            return this.f62511a == ((C19743t) obj).f62511a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f62511a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("PointerKeyboardModifiers(packedValue="), this.f62511a, ')');
    }
}
