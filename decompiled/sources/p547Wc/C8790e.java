package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Wc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8790e {

    /* JADX INFO: renamed from: a */
    public final long f26886a;

    /* JADX INFO: renamed from: b */
    public final long f26887b;

    /* JADX INFO: renamed from: c */
    public final long f26888c;

    /* JADX INFO: renamed from: d */
    public final C14365u f26889d;

    public C8790e(long j10, long j11, long j12, C14365u c14365u) {
        this.f26886a = j10;
        this.f26887b = j11;
        this.f26888c = j12;
        this.f26889d = c14365u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8790e)) {
            return false;
        }
        C8790e c8790e = (C8790e) obj;
        return C14365u.m15775c(this.f26886a, c8790e.f26886a) && C14365u.m15775c(this.f26887b, c8790e.f26887b) && C14365u.m15775c(this.f26888c, c8790e.f26888c) && AbstractC16544l.m18089b(this.f26889d, c8790e.f26889d);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        int iM15857w = AbstractC14376f.m15857w(this.f26888c, AbstractC14376f.m15857w(this.f26887b, C17321x.m18981a(this.f26886a) * 31, 31), 31);
        C14365u c14365u = this.f26889d;
        return iM15857w + (c14365u == null ? 0 : C17321x.m18981a(c14365u.f45062a));
    }

    public final String toString() {
        return "█";
    }
}
