package p1155zi;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zi.P1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21952P1 extends AbstractC21955Q1 {

    /* JADX INFO: renamed from: a */
    public final Object f69511a;

    public C21952P1(Object obj) {
        this.f69511a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21952P1) && AbstractC16544l.m18089b(this.f69511a, ((C21952P1) obj).f69511a);
    }

    public final int hashCode() {
        Object obj = this.f69511a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
