package p736f0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: f0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C13468F {

    /* JADX INFO: renamed from: b */
    public static final C13468F f42623b;

    /* JADX INFO: renamed from: c */
    public static final C13468F f42624c;

    /* JADX INFO: renamed from: a */
    public final C13482U f42625a;

    static {
        LinkedHashMap linkedHashMap = null;
        C13469G c13469g = null;
        C13480S c13480s = null;
        C13501s c13501s = null;
        C13473K c13473k = null;
        f42623b = new C13468F(new C13482U(c13469g, c13480s, c13501s, c13473k, false, linkedHashMap, 63));
        f42624c = new C13468F(new C13482U(c13469g, c13480s, c13501s, c13473k, true, linkedHashMap, 47));
    }

    public C13468F(C13482U c13482u) {
        this.f42625a = c13482u;
    }

    /* JADX INFO: renamed from: a */
    public final C13468F m14996a(C13468F c13468f) {
        C13482U c13482u = c13468f.f42625a;
        C13482U c13482u2 = this.f42625a;
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
        return new C13468F(new C13482U(c13469g, c13480s, c13501s, c13473k, c13482u.f42664e || c13482u2.f42664e, AbstractC17659D.m19248j(c13482u2.f42665f, c13482u.f42665f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13468F) && AbstractC16544l.m18089b(((C13468F) obj).f42625a, this.f42625a);
    }

    public final int hashCode() {
        return this.f42625a.hashCode();
    }

    public final String toString() {
        if (equals(f42623b)) {
            return "ExitTransition.None";
        }
        if (equals(f42624c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        C13482U c13482u = this.f42625a;
        C13469G c13469g = c13482u.f42660a;
        sb2.append(c13469g != null ? c13469g.toString() : null);
        sb2.append(",\nSlide - ");
        C13480S c13480s = c13482u.f42661b;
        sb2.append(c13480s != null ? c13480s.toString() : null);
        sb2.append(",\nShrink - ");
        C13501s c13501s = c13482u.f42662c;
        sb2.append(c13501s != null ? c13501s.toString() : null);
        sb2.append(",\nScale - ");
        C13473K c13473k = c13482u.f42663d;
        sb2.append(c13473k != null ? c13473k.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(c13482u.f42664e);
        return sb2.toString();
    }
}
