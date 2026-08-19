package p080D0;

import com.google.protobuf.AbstractC12107L1;
import mm.C17321x;
import p774h1.C14365u;

/* JADX INFO: renamed from: D0.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1768C0 {

    /* JADX INFO: renamed from: a */
    public final long f5045a;

    /* JADX INFO: renamed from: b */
    public final long f5046b;

    public C1768C0(long j10, long j11) {
        this.f5045a = j10;
        this.f5046b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1768C0)) {
            return false;
        }
        C1768C0 c1768c0 = (C1768C0) obj;
        return C14365u.m15775c(this.f5045a, c1768c0.f5045a) && C14365u.m15775c(this.f5046b, c1768c0.f5046b);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f5046b) + (C17321x.m18981a(this.f5045a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC12107L1.m13828s(this.f5045a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) C14365u.m15781i(this.f5046b));
        sb2.append(')');
        return sb2.toString();
    }
}
