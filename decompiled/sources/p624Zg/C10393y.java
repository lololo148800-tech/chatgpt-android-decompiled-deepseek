package p624Zg;

import p1155zi.EnumC21909E1;

/* JADX INFO: renamed from: Zg.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10393y extends AbstractC10331A {
    @Override // p624Zg.InterfaceC10333C
    /* JADX INFO: renamed from: a */
    public final String mo10886a() {
        return "downgrade";
    }

    @Override // p624Zg.AbstractC10331A
    /* JADX INFO: renamed from: b */
    public final EnumC21909E1 mo10885b() {
        return EnumC21909E1.Pro;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10393y)) {
            return false;
        }
        EnumC21909E1 enumC21909E1 = EnumC21909E1.Plus;
        ((C10393y) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return EnumC21909E1.Pro.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
