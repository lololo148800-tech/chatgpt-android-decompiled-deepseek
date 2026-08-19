package p214Ib;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Ib.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3671n extends AbstractC3673p implements Iterable {

    /* JADX INFO: renamed from: Y */
    public final ArrayList f11172Y;

    public C3671n() {
        this.f11172Y = new ArrayList();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C3671n) && ((C3671n) obj).f11172Y.equals(this.f11172Y));
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: f */
    public final boolean mo4380f() {
        return m4387u().mo4380f();
    }

    public final int hashCode() {
        return this.f11172Y.hashCode();
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: i */
    public final int mo4381i() {
        return m4387u().mo4381i();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11172Y.iterator();
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: p */
    public final long mo4382p() {
        return m4387u().mo4382p();
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: q */
    public final Number mo4383q() {
        return m4387u().mo4383q();
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: r */
    public final String mo4384r() {
        return m4387u().mo4384r();
    }

    /* JADX INFO: renamed from: s */
    public final void m4385s(AbstractC3673p abstractC3673p) {
        if (abstractC3673p == null) {
            abstractC3673p = C3675r.f11173Y;
        }
        this.f11172Y.add(abstractC3673p);
    }

    /* JADX INFO: renamed from: t */
    public final void m4386t(String str) {
        this.f11172Y.add(str == null ? C3675r.f11173Y : new C3678u(str));
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC3673p m4387u() {
        ArrayList arrayList = this.f11172Y;
        int size = arrayList.size();
        if (size == 1) {
            return (AbstractC3673p) arrayList.get(0);
        }
        throw new IllegalStateException(AbstractC10763a.m11048f(size, "Array must have size 1, but has size "));
    }

    public C3671n(int i10) {
        this.f11172Y = new ArrayList(i10);
    }
}
