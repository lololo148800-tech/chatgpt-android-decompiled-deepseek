package p328N1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: N1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C5581H {

    /* JADX INFO: renamed from: a */
    public final AbstractC5599o f18084a;

    /* JADX INFO: renamed from: b */
    public final C5609y f18085b;

    /* JADX INFO: renamed from: c */
    public final int f18086c;

    /* JADX INFO: renamed from: d */
    public final int f18087d;

    /* JADX INFO: renamed from: e */
    public final Object f18088e;

    public C5581H(AbstractC5599o abstractC5599o, C5609y c5609y, int i10, int i11, Object obj) {
        this.f18084a = abstractC5599o;
        this.f18085b = c5609y;
        this.f18086c = i10;
        this.f18087d = i11;
        this.f18088e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5581H)) {
            return false;
        }
        C5581H c5581h = (C5581H) obj;
        return AbstractC16544l.m18089b(this.f18084a, c5581h.f18084a) && AbstractC16544l.m18089b(this.f18085b, c5581h.f18085b) && C5605u.m5992a(this.f18086c, c5581h.f18086c) && C5606v.m5994a(this.f18087d, c5581h.f18087d) && AbstractC16544l.m18089b(this.f18088e, c5581h.f18088e);
    }

    public final int hashCode() {
        AbstractC5599o abstractC5599o = this.f18084a;
        int iHashCode = (((((((abstractC5599o == null ? 0 : abstractC5599o.hashCode()) * 31) + this.f18085b.f18160Y) * 31) + this.f18086c) * 31) + this.f18087d) * 31;
        Object obj = this.f18088e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f18084a + ", fontWeight=" + this.f18085b + ", fontStyle=" + ((Object) C5605u.m5993b(this.f18086c)) + ", fontSynthesis=" + ((Object) C5606v.m5995b(this.f18087d)) + ", resourceLoaderCacheKey=" + this.f18088e + ')';
    }
}
