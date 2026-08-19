package p773h0;

import p492U1.C7540e;
import p774h1.C14341T;

/* JADX INFO: renamed from: h0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C14311u {

    /* JADX INFO: renamed from: a */
    public final float f44928a;

    /* JADX INFO: renamed from: b */
    public final C14341T f44929b;

    public C14311u(float f10, C14341T c14341t) {
        this.f44928a = f10;
        this.f44929b = c14341t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14311u)) {
            return false;
        }
        C14311u c14311u = (C14311u) obj;
        return C7540e.m7873a(this.f44928a, c14311u.f44928a) && this.f44929b.equals(c14311u.f44929b);
    }

    public final int hashCode() {
        return this.f44929b.hashCode() + (Float.floatToIntBits(this.f44928a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) C7540e.m7874b(this.f44928a)) + ", brush=" + this.f44929b + ')';
    }
}
