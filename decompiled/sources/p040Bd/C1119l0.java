package p040Bd;

import p019Ah.EnumC0511a;

/* JADX INFO: renamed from: Bd.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1119l0 extends AbstractC0888A0 {

    /* JADX INFO: renamed from: a */
    public final String f3033a;

    public C1119l0() {
        EnumC0511a enumC0511a = EnumC0511a.f1649Y;
        this.f3033a = "hardcoded_icon";
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return 13;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return 0;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3033a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1119l0)) {
            return false;
        }
        C1119l0 c1119l0 = (C1119l0) obj;
        c1119l0.getClass();
        Integer num = 0;
        if (!num.equals(0)) {
            return false;
        }
        Integer num2 = 13;
        if (!num2.equals(13)) {
            return false;
        }
        EnumC0511a enumC0511a = EnumC0511a.f1649Y;
        return this.f3033a.equals(c1119l0.f3033a);
    }

    public final int hashCode() {
        Integer num = 0;
        Integer num2 = 13;
        return this.f3033a.hashCode() + ((EnumC0511a.f1649Y.hashCode() + ((num2.hashCode() + (num.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
