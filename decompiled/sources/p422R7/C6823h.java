package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: R7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6823h {

    /* JADX INFO: renamed from: a */
    public final String f21885a;

    /* JADX INFO: renamed from: b */
    public final boolean f21886b;

    /* JADX INFO: renamed from: c */
    public final String f21887c;

    /* JADX INFO: renamed from: d */
    public final String f21888d;

    public C6823h(String str, String stack, boolean z6, String str2) {
        AbstractC16544l.m18094g(stack, "stack");
        this.f21885a = str;
        this.f21886b = z6;
        this.f21887c = stack;
        this.f21888d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6823h)) {
            return false;
        }
        C6823h c6823h = (C6823h) obj;
        return AbstractC16544l.m18089b(this.f21885a, c6823h.f21885a) && this.f21886b == c6823h.f21886b && AbstractC16544l.m18089b(this.f21887c, c6823h.f21887c) && AbstractC16544l.m18089b(this.f21888d, c6823h.f21888d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(((this.f21885a.hashCode() * 31) + (this.f21886b ? 1231 : 1237)) * 31, 31, this.f21887c);
        String str = this.f21888d;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread(name=");
        sb2.append(this.f21885a);
        sb2.append(", crashed=");
        sb2.append(this.f21886b);
        sb2.append(", stack=");
        sb2.append(this.f21887c);
        sb2.append(", state=");
        return AbstractC9306j0.m9891j(this.f21888d, Separators.RPAREN, sb2);
    }
}
