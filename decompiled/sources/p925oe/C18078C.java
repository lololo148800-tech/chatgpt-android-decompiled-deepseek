package p925oe;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;

/* JADX INFO: renamed from: oe.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C18078C {

    /* JADX INFO: renamed from: c */
    public static final C18078C f57659c;

    /* JADX INFO: renamed from: a */
    public final int f57660a;

    /* JADX INFO: renamed from: b */
    public final C5551u f57661b;

    static {
        C5551u.Companion.getClass();
        f57659c = new C18078C(0, C5551u.f18001o0);
    }

    public C18078C(int i10, C5551u oldestDate) {
        AbstractC16544l.m18094g(oldestDate, "oldestDate");
        this.f57660a = i10;
        this.f57661b = oldestDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18078C)) {
            return false;
        }
        C18078C c18078c = (C18078C) obj;
        return this.f57660a == c18078c.f57660a && AbstractC16544l.m18089b(this.f57661b, c18078c.f57661b);
    }

    public final int hashCode() {
        return this.f57661b.f18004Y.hashCode() + (this.f57660a * 31);
    }

    public final String toString() {
        return "█";
    }
}
