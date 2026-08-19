package p1155zi;

/* JADX INFO: renamed from: zi.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21988b1 extends AbstractC21996d1 {

    /* JADX INFO: renamed from: a */
    public final EnumC22000e1 f69615a;

    public C21988b1(EnumC22000e1 enumC22000e1) {
        this.f69615a = enumC22000e1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21988b1) && this.f69615a == ((C21988b1) obj).f69615a;
    }

    public final int hashCode() {
        return this.f69615a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
