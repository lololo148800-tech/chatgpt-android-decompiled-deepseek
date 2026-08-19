package p980r3;

import androidx.lifecycle.C11069E;
import androidx.lifecycle.InterfaceC11070F;
import androidx.lifecycle.InterfaceC11112u;
import p001A.C0095w0;
import p960q9.C18650d;

/* JADX INFO: renamed from: r3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18871a extends C11069E {

    /* JADX INFO: renamed from: l */
    public final C18650d f60111l;

    /* JADX INFO: renamed from: m */
    public InterfaceC11112u f60112m;

    /* JADX INFO: renamed from: n */
    public C0095w0 f60113n;

    public C18871a(C18650d c18650d) {
        this.f60111l = c18650d;
        if (c18650d.f59397a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c18650d.f59397a = this;
    }

    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: g */
    public final void mo130g() {
        C18650d c18650d = this.f60111l;
        c18650d.f59398b = true;
        c18650d.f59400d = false;
        c18650d.f59399c = false;
        c18650d.f59405i.drainPermits();
        c18650d.m20014c();
    }

    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: h */
    public final void mo131h() {
        this.f60111l.f59398b = false;
    }

    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: i */
    public final void mo12121i(InterfaceC11070F interfaceC11070F) {
        super.mo12121i(interfaceC11070F);
        this.f60112m = null;
        this.f60113n = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m20193l() {
        InterfaceC11112u interfaceC11112u = this.f60112m;
        C0095w0 c0095w0 = this.f60113n;
        if (interfaceC11112u == null || c0095w0 == null) {
            return;
        }
        super.mo12121i(c0095w0);
        m12119e(interfaceC11112u, c0095w0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f60111l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
