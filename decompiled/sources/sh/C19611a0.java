package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19611a0 {

    /* JADX INFO: renamed from: a */
    public final Integer f62231a;

    public C19611a0(Integer num) {
        this.f62231a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19611a0) && AbstractC16544l.m18089b(this.f62231a, ((C19611a0) obj).f62231a);
    }

    public final int hashCode() {
        Integer num = this.f62231a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
