package p403Qd;

import kotlin.jvm.internal.AbstractC16544l;
import p621Zd.C10282c;

/* JADX INFO: renamed from: Qd.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C6604J {

    /* JADX INFO: renamed from: a */
    public final C6636i f21323a;

    /* JADX INFO: renamed from: b */
    public final C10282c f21324b;

    /* JADX INFO: renamed from: c */
    public final boolean f21325c;

    public C6604J(C6636i c6636i, C10282c c10282c, boolean z6) {
        this.f21323a = c6636i;
        this.f21324b = c10282c;
        this.f21325c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6604J)) {
            return false;
        }
        C6604J c6604j = (C6604J) obj;
        return AbstractC16544l.m18089b(this.f21323a, c6604j.f21323a) && AbstractC16544l.m18089b(this.f21324b, c6604j.f21324b) && this.f21325c == c6604j.f21325c;
    }

    public final int hashCode() {
        int iHashCode = this.f21323a.hashCode() * 31;
        C10282c c10282c = this.f21324b;
        return ((iHashCode + (c10282c == null ? 0 : c10282c.hashCode())) * 31) + (this.f21325c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
