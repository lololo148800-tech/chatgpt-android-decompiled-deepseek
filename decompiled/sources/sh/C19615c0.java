package sh;

import p1107xh.EnumC21249l;

/* JADX INFO: renamed from: sh.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19615c0 {

    /* JADX INFO: renamed from: a */
    public final EnumC21249l f62239a;

    public C19615c0(EnumC21249l enumC21249l) {
        this.f62239a = enumC21249l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19615c0) && this.f62239a == ((C19615c0) obj).f62239a;
    }

    public final int hashCode() {
        EnumC21249l enumC21249l = this.f62239a;
        if (enumC21249l == null) {
            return 0;
        }
        return enumC21249l.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
