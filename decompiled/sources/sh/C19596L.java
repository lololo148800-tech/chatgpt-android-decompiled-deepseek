package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C19596L {

    /* JADX INFO: renamed from: a */
    public final Integer f62207a;

    public C19596L(Integer num) {
        this.f62207a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19596L) && AbstractC16544l.m18089b(this.f62207a, ((C19596L) obj).f62207a);
    }

    public final int hashCode() {
        Integer num = this.f62207a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
