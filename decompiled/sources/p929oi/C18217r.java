package p929oi;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: oi.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C18217r {

    /* JADX INFO: renamed from: a */
    public final String f58054a;

    /* JADX INFO: renamed from: b */
    public final boolean f58055b;

    public C18217r(String value, boolean z6) {
        AbstractC16544l.m18094g(value, "value");
        this.f58054a = value;
        this.f58055b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18217r)) {
            return false;
        }
        C18217r c18217r = (C18217r) obj;
        return AbstractC16544l.m18089b(this.f58054a, c18217r.f58054a) && this.f58055b == c18217r.f58055b;
    }

    public final int hashCode() {
        return (this.f58054a.hashCode() * 31) + (this.f58055b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
