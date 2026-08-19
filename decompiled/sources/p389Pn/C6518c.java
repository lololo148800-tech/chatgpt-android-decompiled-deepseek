package p389Pn;

import io.sentry.AbstractC15181a0;
import io.sentry.C15346d0;
import io.sentry.C15349e0;
import io.sentry.C15354f0;
import io.sentry.C15357g0;
import io.sentry.C15360h0;
import io.sentry.InterfaceC15320b0;
import io.sentry.InterfaceC15325c0;
import io.sentry.vendor.gson.stream.C15513a;
import java.util.ArrayList;
import java.util.Iterator;
import p001A.C0100z;
import p561X.C8990d;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Pn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6518c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f21127a;

    public C6518c(int i10) {
        switch (i10) {
            case 1:
                this.f21127a = new ArrayList();
                break;
            default:
                this.f21127a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7087a(InterfaceC6527l interfaceC6527l) {
        boolean z6 = interfaceC6527l instanceof InterfaceC6530o;
        ArrayList arrayList = this.f21127a;
        if (z6) {
            arrayList.add(interfaceC6527l);
        } else if (interfaceC6527l instanceof C6522g) {
            Iterator it = ((C6522g) interfaceC6527l).f21133a.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC6530o) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC15325c0 m7088b() {
        ArrayList arrayList = this.f21127a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (InterfaceC15325c0) AbstractC17792x.m19532o(1, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public boolean m7089c() {
        if (this.f21127a.size() == 1) {
            return true;
        }
        InterfaceC15325c0 interfaceC15325c0M7088b = m7088b();
        m7092f();
        if (!(m7088b() instanceof C15354f0)) {
            if (!(m7088b() instanceof C15346d0)) {
                return false;
            }
            C15346d0 c15346d0 = (C15346d0) m7088b();
            if (interfaceC15325c0M7088b == null || c15346d0 == null) {
                return false;
            }
            c15346d0.f47913a.add(interfaceC15325c0M7088b.getValue());
            return false;
        }
        C15354f0 c15354f0 = (C15354f0) m7088b();
        m7092f();
        C15349e0 c15349e0 = (C15349e0) m7088b();
        if (c15354f0 == null || interfaceC15325c0M7088b == null || c15349e0 == null) {
            return false;
        }
        c15349e0.f47928a.put(c15354f0.f47939a, interfaceC15325c0M7088b.getValue());
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7090d(InterfaceC15320b0 interfaceC15320b0) {
        Object objMo392h = interfaceC15320b0.mo392h();
        if (m7088b() == null && objMo392h != null) {
            this.f21127a.add(new C15357g0(objMo392h));
            return true;
        }
        if (m7088b() instanceof C15354f0) {
            C15354f0 c15354f0 = (C15354f0) m7088b();
            m7092f();
            ((C15349e0) m7088b()).f47928a.put(c15354f0.f47939a, objMo392h);
            return false;
        }
        if (!(m7088b() instanceof C15346d0)) {
            return false;
        }
        ((C15346d0) m7088b()).f47913a.add(objMo392h);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public void m7091e(final C15360h0 c15360h0) {
        boolean zM7089c;
        int i10 = AbstractC15181a0.f47259a[((C15513a) c15360h0.f47948Z).m16695C0().ordinal()];
        ArrayList arrayList = this.f21127a;
        C15513a c15513a = (C15513a) c15360h0.f47948Z;
        switch (i10) {
            case 1:
                c15513a.m16709a();
                arrayList.add(new C15346d0());
                zM7089c = false;
                break;
            case 2:
                c15513a.m16696E();
                zM7089c = m7089c();
                break;
            case 3:
                c15360h0.m16614e();
                arrayList.add(new C15349e0());
                zM7089c = false;
                break;
            case 4:
                c15360h0.m16618k();
                zM7089c = m7089c();
                break;
            case 5:
                arrayList.add(new C15354f0(c15513a.m16710a0()));
                zM7089c = false;
                break;
            case 6:
                final int i11 = 0;
                zM7089c = m7090d(new InterfaceC15320b0() { // from class: io.sentry.Z
                    @Override // io.sentry.InterfaceC15320b0
                    /* JADX INFO: renamed from: h */
                    public final Object mo392h() {
                        switch (i11) {
                            case 0:
                                return ((C15513a) c15360h0.f47948Z).m16719x();
                            default:
                                return Boolean.valueOf(((C15513a) c15360h0.f47948Z).m16704S0());
                        }
                    }
                });
                break;
            case 7:
                zM7089c = m7090d(new C0100z(this, 28, c15360h0));
                break;
            case 8:
                final int i12 = 1;
                zM7089c = m7090d(new InterfaceC15320b0() { // from class: io.sentry.Z
                    @Override // io.sentry.InterfaceC15320b0
                    /* JADX INFO: renamed from: h */
                    public final Object mo392h() {
                        switch (i12) {
                            case 0:
                                return ((C15513a) c15360h0.f47948Z).m16719x();
                            default:
                                return Boolean.valueOf(((C15513a) c15360h0.f47948Z).m16704S0());
                        }
                    }
                });
                break;
            case 9:
                c15513a.m16712e0();
                zM7089c = m7090d(new C8990d(15));
                break;
            case 10:
                zM7089c = true;
                break;
            default:
                zM7089c = false;
                break;
        }
        if (zM7089c) {
            return;
        }
        m7091e(c15360h0);
    }

    /* JADX INFO: renamed from: f */
    public void m7092f() {
        ArrayList arrayList = this.f21127a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
