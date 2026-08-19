package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C20571u implements InterfaceC20563m {

    /* JADX INFO: renamed from: a */
    public final EnumC20570t f65298a;

    /* JADX INFO: renamed from: b */
    public final String f65299b;

    public C20571u(EnumC20570t enumC20570t) {
        String str = enumC20570t.f65297Y;
        this.f65298a = enumC20570t;
        this.f65299b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20571u)) {
            return false;
        }
        C20571u c20571u = (C20571u) obj;
        return this.f65298a == c20571u.f65298a && AbstractC16544l.m18089b(this.f65299b, c20571u.f65299b);
    }

    @Override // p1062vd.InterfaceC20563m
    public final String getId() {
        return this.f65299b;
    }

    public final int hashCode() {
        return this.f65299b.hashCode() + (this.f65298a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
