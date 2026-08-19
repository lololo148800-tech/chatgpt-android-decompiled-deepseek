package p041Be;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Be.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C1238j.class)
public final class C1236h {
    public static final C1235g Companion = new C1235g();

    /* JADX INFO: renamed from: a */
    public final Object f3252a;

    /* JADX INFO: renamed from: b */
    public final int f3253b;

    /* JADX INFO: renamed from: c */
    public final String f3254c;

    public C1236h(String str, int i10, List list) {
        this.f3252a = list;
        this.f3253b = i10;
        this.f3254c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1236h)) {
            return false;
        }
        C1236h c1236h = (C1236h) obj;
        return this.f3252a.equals(c1236h.f3252a) && this.f3253b == c1236h.f3253b && AbstractC16544l.m18089b(this.f3254c, c1236h.f3254c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f3252a.hashCode() * 31) + this.f3253b) * 31;
        String str = this.f3254c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
