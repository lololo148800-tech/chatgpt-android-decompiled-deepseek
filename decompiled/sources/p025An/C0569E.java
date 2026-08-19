package p025An;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p972qm.AbstractC18768a;

/* JADX INFO: renamed from: An.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C0569E extends AbstractC18768a {

    /* JADX INFO: renamed from: Z */
    public static final C0625m0 f1784Z = new C0625m0();

    /* JADX INFO: renamed from: Y */
    public final String f1785Y;

    public C0569E(String str) {
        super(f1784Z);
        this.f1785Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0569E) && AbstractC16544l.m18089b(this.f1785Y, ((C0569E) obj).f1785Y);
    }

    public final int hashCode() {
        return this.f1785Y.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("CoroutineName("), this.f1785Y, ')');
    }
}
