package p339Nf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Nf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5721c {

    /* JADX INFO: renamed from: a */
    public final String f18530a;

    /* JADX INFO: renamed from: b */
    public final int f18531b;

    /* JADX INFO: renamed from: c */
    public final int f18532c;

    public C5721c(String str, int i10, int i11) {
        this.f18530a = str;
        this.f18531b = i10;
        this.f18532c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5721c)) {
            return false;
        }
        C5721c c5721c = (C5721c) obj;
        return AbstractC16544l.m18089b(this.f18530a, c5721c.f18530a) && this.f18531b == c5721c.f18531b && this.f18532c == c5721c.f18532c;
    }

    public final int hashCode() {
        return (((this.f18530a.hashCode() * 31) + this.f18531b) * 31) + this.f18532c;
    }

    public final String toString() {
        return "█";
    }
}
