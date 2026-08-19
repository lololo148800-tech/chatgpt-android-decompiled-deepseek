package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C19637o {

    /* JADX INFO: renamed from: a */
    public final String f62280a;

    /* JADX INFO: renamed from: b */
    public final String f62281b;

    public C19637o(String str, String str2) {
        this.f62280a = str;
        this.f62281b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19637o)) {
            return false;
        }
        C19637o c19637o = (C19637o) obj;
        return AbstractC16544l.m18089b(this.f62280a, c19637o.f62280a) && AbstractC16544l.m18089b(this.f62281b, c19637o.f62281b);
    }

    public final int hashCode() {
        return this.f62281b.hashCode() + (this.f62280a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
