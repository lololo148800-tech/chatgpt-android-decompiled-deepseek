package p990rg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rg.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18984k {

    /* JADX INFO: renamed from: a */
    public final String f60551a;

    /* JADX INFO: renamed from: b */
    public final boolean f60552b;

    public C18984k(String text, boolean z6) {
        AbstractC16544l.m18094g(text, "text");
        this.f60551a = text;
        this.f60552b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18984k)) {
            return false;
        }
        C18984k c18984k = (C18984k) obj;
        return AbstractC16544l.m18089b(this.f60551a, c18984k.f60551a) && this.f60552b == c18984k.f60552b;
    }

    public final int hashCode() {
        return (this.f60551a.hashCode() * 31) + (this.f60552b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
