package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: f0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C13467E {

    /* JADX INFO: renamed from: b */
    public static final C13467E f42621b = new C13467E(new C13482U(null, null, null, null, false, null, 63));

    /* JADX INFO: renamed from: a */
    public final C13482U f42622a;

    public C13467E(C13482U c13482u) {
        this.f42622a = c13482u;
    }

    /* JADX INFO: renamed from: a */
    public final C13467E m14995a(C13467E c13467e) {
        C13482U c13482u = c13467e.f42622a;
        C13482U c13482u2 = this.f42622a;
        C13469G c13469g = c13482u.f42660a;
        if (c13469g == null) {
            c13469g = c13482u2.f42660a;
        }
        C13480S c13480s = c13482u.f42661b;
        if (c13480s == null) {
            c13480s = c13482u2.f42661b;
        }
        C13501s c13501s = c13482u.f42662c;
        if (c13501s == null) {
            c13501s = c13482u2.f42662c;
        }
        C13473K c13473k = c13482u.f42663d;
        if (c13473k == null) {
            c13473k = c13482u2.f42663d;
        }
        return new C13467E(new C13482U(c13469g, c13480s, c13501s, c13473k, false, AbstractC17659D.m19248j(c13482u2.f42665f, c13482u.f42665f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13467E) && AbstractC16544l.m18089b(((C13467E) obj).f42622a, this.f42622a);
    }

    public final int hashCode() {
        return this.f42622a.hashCode();
    }

    public final String toString() {
        if (equals(f42621b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        C13482U c13482u = this.f42622a;
        C13469G c13469g = c13482u.f42660a;
        sb2.append(c13469g != null ? c13469g.toString() : null);
        sb2.append(",\nSlide - ");
        C13480S c13480s = c13482u.f42661b;
        sb2.append(c13480s != null ? c13480s.toString() : null);
        sb2.append(",\nShrink - ");
        C13501s c13501s = c13482u.f42662c;
        sb2.append(c13501s != null ? c13501s.toString() : null);
        sb2.append(FpwNpGDhomXHZ.YCfC);
        C13473K c13473k = c13482u.f42663d;
        sb2.append(c13473k != null ? c13473k.toString() : null);
        return sb2.toString();
    }
}
