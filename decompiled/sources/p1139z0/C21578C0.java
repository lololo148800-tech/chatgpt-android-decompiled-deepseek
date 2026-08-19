package p1139z0;

import kotlin.jvm.internal.AbstractC16544l;
import p1116y0.C21353b;
import p349O0.C5960K;

/* JADX INFO: renamed from: z0.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21578C0 {

    /* JADX INFO: renamed from: a */
    public final C21353b f68331a;

    /* JADX INFO: renamed from: b */
    public final C5960K f68332b;

    public C21578C0(C21353b c21353b, C5960K c5960k) {
        this.f68331a = c21353b;
        this.f68332b = c5960k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21578C0)) {
            return false;
        }
        C21578C0 c21578c0 = (C21578C0) obj;
        return AbstractC16544l.m18089b(this.f68331a, c21578c0.f68331a) && AbstractC16544l.m18089b(this.f68332b, c21578c0.f68332b);
    }

    public final int hashCode() {
        return this.f68332b.hashCode() + (this.f68331a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f68331a) + ", offsetMapping=" + this.f68332b + ')';
    }
}
