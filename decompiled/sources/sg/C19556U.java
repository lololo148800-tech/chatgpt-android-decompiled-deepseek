package sg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sg.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C19556U implements InterfaceC19558W {

    /* JADX INFO: renamed from: a */
    public final C19575q f62111a;

    /* JADX INFO: renamed from: b */
    public final C19578t f62112b;

    public C19556U(C19575q c19575q, C19578t reason) {
        AbstractC16544l.m18094g(reason, "reason");
        this.f62111a = c19575q;
        this.f62112b = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19556U)) {
            return false;
        }
        C19556U c19556u = (C19556U) obj;
        return AbstractC16544l.m18089b(this.f62111a, c19556u.f62111a) && AbstractC16544l.m18089b(this.f62112b, c19556u.f62112b);
    }

    public final int hashCode() {
        return this.f62112b.hashCode() + (this.f62111a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
