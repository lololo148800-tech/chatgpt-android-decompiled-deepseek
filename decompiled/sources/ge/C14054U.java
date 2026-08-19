package ge;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;

/* JADX INFO: renamed from: ge.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C14054U {

    /* JADX INFO: renamed from: a */
    public final float f44176a;

    /* JADX INFO: renamed from: b */
    public final float f44177b;

    /* JADX INFO: renamed from: c */
    public final boolean f44178c;

    public C14054U(float f10, float f11, boolean z6) {
        this.f44176a = f10;
        this.f44177b = f11;
        this.f44178c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14054U)) {
            return false;
        }
        C14054U c14054u = (C14054U) obj;
        return C7540e.m7873a(this.f44176a, c14054u.f44176a) && C7540e.m7873a(this.f44177b, c14054u.f44177b) && this.f44178c == c14054u.f44178c;
    }

    public final int hashCode() {
        return AbstractC12107L1.m13819j(this.f44177b, Float.floatToIntBits(this.f44176a) * 31, 31) + (this.f44178c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
