package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17975h0 {

    /* JADX INFO: renamed from: a */
    public final String f57379a;

    /* JADX INFO: renamed from: b */
    public final boolean f57380b;

    /* JADX INFO: renamed from: c */
    public final String f57381c;

    /* JADX INFO: renamed from: d */
    public final String f57382d;

    public C17975h0(String str, String stack, boolean z6, String str2) {
        AbstractC16544l.m18094g(stack, "stack");
        this.f57379a = str;
        this.f57380b = z6;
        this.f57381c = stack;
        this.f57382d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17975h0)) {
            return false;
        }
        C17975h0 c17975h0 = (C17975h0) obj;
        return AbstractC16544l.m18089b(this.f57379a, c17975h0.f57379a) && this.f57380b == c17975h0.f57380b && AbstractC16544l.m18089b(this.f57381c, c17975h0.f57381c) && AbstractC16544l.m18089b(this.f57382d, c17975h0.f57382d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(((this.f57379a.hashCode() * 31) + (this.f57380b ? 1231 : 1237)) * 31, 31, this.f57381c);
        String str = this.f57382d;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread(name=");
        sb2.append(this.f57379a);
        sb2.append(", crashed=");
        sb2.append(this.f57380b);
        sb2.append(", stack=");
        sb2.append(this.f57381c);
        sb2.append(", state=");
        return AbstractC9306j0.m9891j(this.f57382d, Separators.RPAREN, sb2);
    }
}
