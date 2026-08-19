package p001A;

import androidx.lifecycle.C11068D;
import androidx.lifecycle.C11069E;
import java.util.Iterator;
import java.util.Map;
import p1028u.C20085b;
import p1028u.C20089f;

/* JADX INFO: renamed from: A.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0020K extends C11069E {

    /* JADX INFO: renamed from: l */
    public C20089f f104l = new C20089f();

    /* JADX INFO: renamed from: m */
    public C11069E f105m;

    /* JADX INFO: renamed from: n */
    public final Object f106n;

    public C0020K(Object obj) {
        this.f106n = obj;
    }

    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: d */
    public final Object mo129d() {
        C11069E c11069e = this.f105m;
        return c11069e == null ? this.f106n : c11069e.mo129d();
    }

    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: g */
    public final void mo130g() {
        Iterator it = this.f104l.iterator();
        while (true) {
            C20085b c20085b = (C20085b) it;
            if (!c20085b.hasNext()) {
                return;
            } else {
                ((C11068D) ((Map.Entry) c20085b.next()).getValue()).m12123a();
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: h */
    public final void mo131h() {
        Iterator it = this.f104l.iterator();
        while (true) {
            C20085b c20085b = (C20085b) it;
            if (!c20085b.hasNext()) {
                return;
            }
            C11068D c11068d = (C11068D) ((Map.Entry) c20085b.next()).getValue();
            c11068d.f33369Y.mo12121i(c11068d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m132l(C11069E c11069e) {
        C11068D c11068d;
        C11069E c11069e2 = this.f105m;
        C20089f c20089f = this.f104l;
        if (c11069e2 != null && (c11068d = (C11068D) c20089f.mo20918j(c11069e2)) != null) {
            c11068d.f33369Y.mo12121i(c11068d);
        }
        this.f105m = c11069e;
        C0072l c0072l = new C0072l(this, 2);
        if (c11069e == null) {
            throw new NullPointerException("source cannot be null");
        }
        C11068D c11068d2 = new C11068D(c11069e, c0072l);
        C11068D c11068d3 = (C11068D) c20089f.mo20917i(c11069e, c11068d2);
        if (c11068d3 != null && c11068d3.f33370Z != c0072l) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c11068d3 == null && this.f33361c > 0) {
            c11068d2.m12123a();
        }
    }
}
