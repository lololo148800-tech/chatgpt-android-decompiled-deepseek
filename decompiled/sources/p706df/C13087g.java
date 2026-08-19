package p706df;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: df.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13087g {
    public static final C13086f Companion = new C13086f();

    /* JADX INFO: renamed from: a */
    public final String f41579a;

    /* JADX INFO: renamed from: b */
    public final String f41580b;

    /* JADX INFO: renamed from: c */
    public final String f41581c;

    public C13087g(String conversationId, String title, String str) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(title, "title");
        this.f41579a = conversationId;
        this.f41580b = title;
        this.f41581c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13087g)) {
            return false;
        }
        C13087g c13087g = (C13087g) obj;
        return AbstractC16544l.m18089b(this.f41579a, c13087g.f41579a) && AbstractC16544l.m18089b(this.f41580b, c13087g.f41580b) && AbstractC16544l.m18089b(this.f41581c, c13087g.f41581c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f41579a.hashCode() * 31, 31, this.f41580b);
        String str = this.f41581c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C13087g(int i10, String str, String str2, String str3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C13085e.f41578a.getDescriptor());
            throw null;
        }
        this.f41579a = str;
        this.f41580b = str2;
        if ((i10 & 4) == 0) {
            this.f41581c = null;
        } else {
            this.f41581c = str3;
        }
    }
}
