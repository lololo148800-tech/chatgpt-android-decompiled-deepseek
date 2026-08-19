package p350O1;

import kotlin.jvm.internal.AbstractC16544l;
import p371P1.C6306b;

/* JADX INFO: renamed from: O1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6065n {

    /* JADX INFO: renamed from: g */
    public static final C6065n f19755g = new C6065n(false, 0, true, 1, 1, C6306b.f20437o0);

    /* JADX INFO: renamed from: a */
    public final boolean f19756a;

    /* JADX INFO: renamed from: b */
    public final int f19757b;

    /* JADX INFO: renamed from: c */
    public final boolean f19758c;

    /* JADX INFO: renamed from: d */
    public final int f19759d;

    /* JADX INFO: renamed from: e */
    public final int f19760e;

    /* JADX INFO: renamed from: f */
    public final C6306b f19761f;

    public C6065n(boolean z6, int i10, boolean z10, int i11, int i12, C6306b c6306b) {
        this.f19756a = z6;
        this.f19757b = i10;
        this.f19758c = z10;
        this.f19759d = i11;
        this.f19760e = i12;
        this.f19761f = c6306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6065n)) {
            return false;
        }
        C6065n c6065n = (C6065n) obj;
        return this.f19756a == c6065n.f19756a && C6066o.m6641a(this.f19757b, c6065n.f19757b) && this.f19758c == c6065n.f19758c && C6067p.m6643a(this.f19759d, c6065n.f19759d) && C6064m.m6639a(this.f19760e, c6065n.f19760e) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f19761f, c6065n.f19761f);
    }

    public final int hashCode() {
        return this.f19761f.f20438Y.hashCode() + ((((((((((this.f19756a ? 1231 : 1237) * 31) + this.f19757b) * 31) + (this.f19758c ? 1231 : 1237)) * 31) + this.f19759d) * 31) + this.f19760e) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f19756a + ", capitalization=" + ((Object) C6066o.m6642b(this.f19757b)) + ", autoCorrect=" + this.f19758c + ", keyboardType=" + ((Object) C6067p.m6644b(this.f19759d)) + ", imeAction=" + ((Object) C6064m.m6640b(this.f19760e)) + ", platformImeOptions=null, hintLocales=" + this.f19761f + ')';
    }
}
