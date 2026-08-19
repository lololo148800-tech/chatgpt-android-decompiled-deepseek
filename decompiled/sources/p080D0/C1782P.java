package p080D0;

import com.google.protobuf.AbstractC12107L1;
import p1071w0.EnumC20729S;
import p228J.AbstractC3794B0;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1782P {

    /* JADX INFO: renamed from: a */
    public final EnumC20729S f5100a;

    /* JADX INFO: renamed from: b */
    public final long f5101b;

    /* JADX INFO: renamed from: c */
    public final int f5102c;

    /* JADX INFO: renamed from: d */
    public final boolean f5103d;

    public C1782P(EnumC20729S enumC20729S, long j10, int i10, boolean z6) {
        this.f5100a = enumC20729S;
        this.f5101b = j10;
        this.f5102c = i10;
        this.f5103d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782P)) {
            return false;
        }
        C1782P c1782p = (C1782P) obj;
        return this.f5100a == c1782p.f5100a && C13800b.m15303d(this.f5101b, c1782p.f5101b) && this.f5102c == c1782p.f5102c && this.f5103d == c1782p.f5103d;
    }

    public final int hashCode() {
        return AbstractC12107L1.m13820k(this.f5102c, (C13800b.m15308i(this.f5101b) + (this.f5100a.hashCode() * 31)) * 31, 31) + (this.f5103d ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f5100a);
        sb2.append(", position=");
        sb2.append((Object) C13800b.m15313n(this.f5101b));
        sb2.append(", anchor=");
        int i10 = this.f5102c;
        if (i10 == 1) {
            str = "Left";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "Right";
        } else {
            str = "Middle";
        }
        sb2.append(str);
        sb2.append(", visible=");
        return AbstractC3794B0.m4499x(sb2, this.f5103d, ')');
    }
}
