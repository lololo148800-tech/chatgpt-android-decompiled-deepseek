package p364Oh;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21937L1;
import p1155zi.C21941M1;
import p1155zi.C21945N1;
import p1155zi.C21949O1;
import p1155zi.C21952P1;

/* JADX INFO: renamed from: Oh.C */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6224C {
    /* JADX INFO: renamed from: a */
    public static AbstractC21933K1 m6734a(AbstractC6249w abstractC6249w) {
        AbstractC16544l.m18094g(abstractC6249w, "<this>");
        if (abstractC6249w instanceof C6222A) {
            C6222A c6222a = (C6222A) abstractC6249w;
            return new C21949O1(abstractC6249w.f20328a, Integer.valueOf(c6222a.f20254b), c6222a.f20255c, c6222a.f20256d, c6222a.f20257e);
        }
        boolean z6 = abstractC6249w instanceof C6250x;
        Throwable cause = abstractC6249w.f20328a;
        if (z6) {
            AbstractC16544l.m18094g(cause, "cause");
            return new C21937L1(cause);
        }
        if (abstractC6249w instanceof C6252z) {
            return new C21945N1(1, cause);
        }
        if (abstractC6249w instanceof C6251y) {
            return new C21941M1(cause);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC21955Q1 m6735b() {
        if (this instanceof C6223B) {
            return new C21952P1(C17296C.f55119a);
        }
        if (this instanceof C6248v) {
            return C21929J1.f69476a;
        }
        if (this instanceof AbstractC6249w) {
            return m6734a((AbstractC6249w) this);
        }
        throw new C0644w();
    }
}
