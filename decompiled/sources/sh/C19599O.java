package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C19599O {

    /* JADX INFO: renamed from: a */
    public final String f62210a;

    public C19599O(String str) {
        this.f62210a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19599O) && AbstractC16544l.m18089b(this.f62210a, ((C19599O) obj).f62210a);
    }

    public final int hashCode() {
        String str = this.f62210a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
