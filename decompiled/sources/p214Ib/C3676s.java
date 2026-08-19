package p214Ib;

import p265Kb.C4622o;

/* JADX INFO: renamed from: Ib.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3676s extends AbstractC3673p {

    /* JADX INFO: renamed from: Y */
    public final C4622o f11174Y = new C4622o(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C3676s) && ((C3676s) obj).f11174Y.equals(this.f11174Y));
    }

    public final int hashCode() {
        return this.f11174Y.hashCode();
    }

    /* JADX INFO: renamed from: s */
    public final void m4391s(String str, AbstractC3673p abstractC3673p) {
        if (abstractC3673p == null) {
            abstractC3673p = C3675r.f11173Y;
        }
        this.f11174Y.put(str, abstractC3673p);
    }

    /* JADX INFO: renamed from: t */
    public final void m4392t(Boolean bool, String str) {
        m4391s(str, bool == null ? C3675r.f11173Y : new C3678u(bool));
    }

    /* JADX INFO: renamed from: u */
    public final void m4393u(Number number, String str) {
        m4391s(str, number == null ? C3675r.f11173Y : new C3678u(number));
    }

    /* JADX INFO: renamed from: v */
    public final void m4394v(String str, String str2) {
        m4391s(str, str2 == null ? C3675r.f11173Y : new C3678u(str2));
    }

    /* JADX INFO: renamed from: w */
    public final AbstractC3673p m4395w(String str) {
        return (AbstractC3673p) this.f11174Y.get(str);
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC3673p m4396x(String str) {
        return (AbstractC3673p) this.f11174Y.remove(str);
    }
}
