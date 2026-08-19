package af;

import bf.C11363S;
import bf.C11364T;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.InterfaceC21925I1;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: af.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10575c0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21925I1 f31409a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21925I1 f31410b;

    /* JADX INFO: renamed from: c */
    public final C11363S f31411c;

    public C10575c0(InterfaceC21925I1 categoryResult, InterfaceC21925I1 loadingMore) {
        AbstractC16544l.m18094g(categoryResult, "categoryResult");
        AbstractC16544l.m18094g(loadingMore, "loadingMore");
        this.f31409a = categoryResult;
        this.f31410b = loadingMore;
        C21921H1 c21921h1 = categoryResult instanceof C21921H1 ? (C21921H1) categoryResult : null;
        this.f31411c = c21921h1 != null ? (C11363S) c21921h1.f69472a : null;
    }

    /* JADX INFO: renamed from: a */
    public final C10575c0 m10983a(C11363S moreResults) {
        InterfaceC21925I1 categoryResult;
        C11364T c11364t;
        AbstractC16544l.m18094g(moreResults, "moreResults");
        C11363S c11363s = this.f31411c;
        String str = (c11363s == null || (c11364t = c11363s.f34359a) == null) ? null : c11364t.f34364a;
        C11364T c11364t2 = moreResults.f34359a;
        if (!AbstractC16544l.m18089b(str, c11364t2.f34364a)) {
            return this;
        }
        if (c11363s != null) {
            C11364T c11364t3 = c11363s.f34359a;
            if (AbstractC16544l.m18089b(c11364t3.f34364a, c11364t2.f34364a)) {
                c11363s = new C11363S(c11364t3, AbstractC17680n.m19361k0(moreResults.f34360b, c11363s.f34360b), moreResults.f34361c);
            }
            categoryResult = new C21921H1(c11363s);
        } else {
            categoryResult = this.f31409a;
        }
        C21921H1 c21921h1 = new C21921H1(C17296C.f55119a);
        AbstractC16544l.m18094g(categoryResult, "categoryResult");
        return new C10575c0(categoryResult, c21921h1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10575c0)) {
            return false;
        }
        C10575c0 c10575c0 = (C10575c0) obj;
        return AbstractC16544l.m18089b(this.f31409a, c10575c0.f31409a) && AbstractC16544l.m18089b(this.f31410b, c10575c0.f31410b);
    }

    public final int hashCode() {
        return this.f31410b.hashCode() + (this.f31409a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C10575c0(InterfaceC21925I1 interfaceC21925I1, int i10) {
        this((i10 & 1) != 0 ? C21917G1.f69468a : interfaceC21925I1, new C21921H1(C17296C.f55119a));
    }
}
