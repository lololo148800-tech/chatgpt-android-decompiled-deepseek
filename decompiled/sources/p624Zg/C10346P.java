package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10346P implements InterfaceC10347Q {

    /* JADX INFO: renamed from: Y */
    public final C10348S f30688Y;

    /* JADX INFO: renamed from: Z */
    public final C10385q f30689Z;

    public C10346P(C10348S c10348s, C10385q c10385q) {
        this.f30688Y = c10348s;
        this.f30689Z = c10385q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10346P)) {
            return false;
        }
        C10346P c10346p = (C10346P) obj;
        return AbstractC16544l.m18089b(this.f30688Y, c10346p.f30688Y) && AbstractC16544l.m18089b(this.f30689Z, c10346p.f30689Z);
    }

    public final int hashCode() {
        C10348S c10348s = this.f30688Y;
        return this.f30689Z.hashCode() + ((c10348s == null ? 0 : c10348s.hashCode()) * 31);
    }

    public final String toString() {
        return "█";
    }
}
