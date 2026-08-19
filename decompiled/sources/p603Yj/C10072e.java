package p603Yj;

import android.gov.nist.core.Separators;
import p003A1.C0286s;
import p197Hj.C3457c;
import p931ok.C18226g;

/* JADX INFO: renamed from: Yj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10072e {

    /* JADX INFO: renamed from: a */
    public final C18226g f29822a;

    /* JADX INFO: renamed from: b */
    public final C0286s f29823b;

    /* JADX INFO: renamed from: c */
    public final C3457c f29824c;

    public C10072e(C18226g c18226g, C0286s c0286s, C3457c c3457c) {
        this.f29822a = c18226g;
        this.f29823b = c0286s;
        this.f29824c = c3457c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10072e)) {
            return false;
        }
        C10072e c10072e = (C10072e) obj;
        return this.f29822a.equals(c10072e.f29822a) && this.f29823b.equals(c10072e.f29823b) && this.f29824c.equals(c10072e.f29824c);
    }

    public final int hashCode() {
        return this.f29824c.hashCode() + ((this.f29823b.hashCode() + (this.f29822a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SandboxScreen(mainScreen=" + this.f29822a + ", onFabClick=" + this.f29823b + ", getCurrentForcedStatus=" + this.f29824c + Separators.RPAREN;
    }
}
