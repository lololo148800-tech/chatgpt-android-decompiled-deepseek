package p1042uh;

import p1107xh.EnumC21225O;

/* JADX INFO: renamed from: uh.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C20278n {

    /* JADX INFO: renamed from: a */
    public final EnumC21225O f64119a;

    public C20278n(EnumC21225O enumC21225O) {
        this.f64119a = enumC21225O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20278n) && this.f64119a == ((C20278n) obj).f64119a;
    }

    public final int hashCode() {
        EnumC21225O enumC21225O = this.f64119a;
        if (enumC21225O == null) {
            return 0;
        }
        return enumC21225O.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
