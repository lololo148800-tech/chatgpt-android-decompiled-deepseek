package p842k0;

import com.google.protobuf.AbstractC12107L1;
import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: k0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16293b {

    /* JADX INFO: renamed from: a */
    public final long f50474a;

    /* JADX INFO: renamed from: b */
    public final long f50475b;

    /* JADX INFO: renamed from: c */
    public final long f50476c;

    /* JADX INFO: renamed from: d */
    public final long f50477d;

    /* JADX INFO: renamed from: e */
    public final long f50478e;

    public C16293b(long j10, long j11, long j12, long j13, long j14) {
        this.f50474a = j10;
        this.f50475b = j11;
        this.f50476c = j12;
        this.f50477d = j13;
        this.f50478e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16293b)) {
            return false;
        }
        C16293b c16293b = (C16293b) obj;
        return C14365u.m15775c(this.f50474a, c16293b.f50474a) && C14365u.m15775c(this.f50475b, c16293b.f50475b) && C14365u.m15775c(this.f50476c, c16293b.f50476c) && C14365u.m15775c(this.f50477d, c16293b.f50477d) && C14365u.m15775c(this.f50478e, c16293b.f50478e);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f50478e) + AbstractC14376f.m15857w(this.f50477d, AbstractC14376f.m15857w(this.f50476c, AbstractC14376f.m15857w(this.f50475b, C17321x.m18981a(this.f50474a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC12107L1.m13828s(this.f50474a, ", textColor=", sb2);
        AbstractC12107L1.m13828s(this.f50475b, ", iconColor=", sb2);
        AbstractC12107L1.m13828s(this.f50476c, ", disabledTextColor=", sb2);
        AbstractC12107L1.m13828s(this.f50477d, ", disabledIconColor=", sb2);
        sb2.append((Object) C14365u.m15781i(this.f50478e));
        sb2.append(')');
        return sb2.toString();
    }
}
