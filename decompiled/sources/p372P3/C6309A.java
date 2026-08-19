package p372P3;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: P3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C6309A {

    /* JADX INFO: renamed from: a */
    public final C6311C f20441a;

    /* JADX INFO: renamed from: b */
    public final C6311C f20442b;

    public C6309A(C6311C c6311c, C6311C c6311c2) {
        this.f20441a = c6311c;
        this.f20442b = c6311c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6309A.class != obj.getClass()) {
            return false;
        }
        C6309A c6309a = (C6309A) obj;
        return this.f20441a.equals(c6309a.f20441a) && this.f20442b.equals(c6309a.f20442b);
    }

    public final int hashCode() {
        return this.f20442b.hashCode() + (this.f20441a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        C6311C c6311c = this.f20441a;
        sb2.append(c6311c);
        C6311C c6311c2 = this.f20442b;
        if (c6311c.equals(c6311c2)) {
            str = "";
        } else {
            str = ", " + c6311c2;
        }
        return AbstractC9306j0.m9891j(str, "]", sb2);
    }
}
