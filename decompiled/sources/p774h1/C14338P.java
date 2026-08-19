package p774h1;

import com.google.protobuf.AbstractC12107L1;
import mm.C17321x;
import p759g1.C13800b;

/* JADX INFO: renamed from: h1.P */
/* JADX INFO: loaded from: classes.dex */
public final class C14338P {

    /* JADX INFO: renamed from: d */
    public static final C14338P f45000d = new C14338P(0.0f, 7, 0L);

    /* JADX INFO: renamed from: a */
    public final long f45001a;

    /* JADX INFO: renamed from: b */
    public final long f45002b;

    /* JADX INFO: renamed from: c */
    public final float f45003c;

    public C14338P(float f10, long j10, long j11) {
        this.f45001a = j10;
        this.f45002b = j11;
        this.f45003c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14338P)) {
            return false;
        }
        C14338P c14338p = (C14338P) obj;
        return C14365u.m15775c(this.f45001a, c14338p.f45001a) && C13800b.m15303d(this.f45002b, c14338p.f45002b) && this.f45003c == c14338p.f45003c;
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return Float.floatToIntBits(this.f45003c) + ((C13800b.m15308i(this.f45002b) + (C17321x.m18981a(this.f45001a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        AbstractC12107L1.m13828s(this.f45001a, ", offset=", sb2);
        sb2.append((Object) C13800b.m15313n(this.f45002b));
        sb2.append(", blurRadius=");
        return AbstractC12107L1.m13825p(sb2, this.f45003c, ')');
    }

    public /* synthetic */ C14338P(float f10, int i10, long j10) {
        this((i10 & 4) != 0 ? 0.0f : f10, (i10 & 1) != 0 ? AbstractC14334L.m15626d(4278190080L) : j10, 0L);
    }
}
