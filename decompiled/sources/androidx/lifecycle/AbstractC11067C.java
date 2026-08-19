package androidx.lifecycle;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Looper;
import java.util.Map;
import p003A1.RunnableC0153B;
import p1012t.C19711a;
import p1028u.C20087d;
import p1028u.C20089f;

/* JADX INFO: renamed from: androidx.lifecycle.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11067C {

    /* JADX INFO: renamed from: k */
    public static final Object f33358k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f33359a;

    /* JADX INFO: renamed from: b */
    public final C20089f f33360b;

    /* JADX INFO: renamed from: c */
    public int f33361c;

    /* JADX INFO: renamed from: d */
    public boolean f33362d;

    /* JADX INFO: renamed from: e */
    public volatile Object f33363e;

    /* JADX INFO: renamed from: f */
    public volatile Object f33364f;

    /* JADX INFO: renamed from: g */
    public int f33365g;

    /* JADX INFO: renamed from: h */
    public boolean f33366h;

    /* JADX INFO: renamed from: i */
    public boolean f33367i;

    /* JADX INFO: renamed from: j */
    public final RunnableC0153B f33368j;

    public AbstractC11067C(Object obj) {
        this.f33359a = new Object();
        this.f33360b = new C20089f();
        this.f33361c = 0;
        this.f33364f = f33358k;
        this.f33368j = new RunnableC0153B(this, 16);
        this.f33363e = obj;
        this.f33365g = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m12116a(String str) {
        C19711a.m20661e().f62404a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC10763a.m11054l("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12117b(AbstractC11066B abstractC11066B) {
        if (abstractC11066B.f33355Z) {
            if (!abstractC11066B.mo12112d()) {
                abstractC11066B.m12115a(false);
                return;
            }
            int i10 = abstractC11066B.f33356o0;
            int i11 = this.f33365g;
            if (i10 >= i11) {
                return;
            }
            abstractC11066B.f33356o0 = i11;
            abstractC11066B.f33354Y.mo259u(this.f33363e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12118c(AbstractC11066B abstractC11066B) {
        if (this.f33366h) {
            this.f33367i = true;
            return;
        }
        this.f33366h = true;
        do {
            this.f33367i = false;
            if (abstractC11066B != null) {
                m12117b(abstractC11066B);
                abstractC11066B = null;
            } else {
                C20089f c20089f = this.f33360b;
                c20089f.getClass();
                C20087d c20087d = new C20087d(c20089f);
                c20089f.f63614o0.put(c20087d, Boolean.FALSE);
                while (c20087d.hasNext()) {
                    m12117b((AbstractC11066B) ((Map.Entry) c20087d.next()).getValue());
                    if (this.f33367i) {
                        break;
                    }
                }
            }
        } while (this.f33367i);
        this.f33366h = false;
    }

    /* JADX INFO: renamed from: d */
    public Object mo129d() {
        Object obj = this.f33363e;
        if (obj != f33358k) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m12119e(InterfaceC11112u interfaceC11112u, InterfaceC11070F interfaceC11070F) {
        m12116a("observe");
        if (interfaceC11112u.mo7809i().mo7807b() == EnumC11104m.f33474Y) {
            return;
        }
        C11065A c11065a = new C11065A(this, interfaceC11112u, interfaceC11070F);
        AbstractC11066B abstractC11066B = (AbstractC11066B) this.f33360b.mo20917i(interfaceC11070F, c11065a);
        if (abstractC11066B != null && !abstractC11066B.mo12111c(interfaceC11112u)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC11066B != null) {
            return;
        }
        interfaceC11112u.mo7809i().mo7806a(c11065a);
    }

    /* JADX INFO: renamed from: f */
    public final void m12120f(InterfaceC11070F interfaceC11070F) {
        m12116a("observeForever");
        C11117z c11117z = new C11117z(this, interfaceC11070F);
        AbstractC11066B abstractC11066B = (AbstractC11066B) this.f33360b.mo20917i(interfaceC11070F, c11117z);
        if (abstractC11066B instanceof C11065A) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC11066B != null) {
            return;
        }
        c11117z.m12115a(true);
    }

    /* JADX INFO: renamed from: g */
    public void mo130g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo131h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo12121i(InterfaceC11070F interfaceC11070F) {
        m12116a("removeObserver");
        AbstractC11066B abstractC11066B = (AbstractC11066B) this.f33360b.mo20918j(interfaceC11070F);
        if (abstractC11066B == null) {
            return;
        }
        abstractC11066B.mo12110b();
        abstractC11066B.m12115a(false);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo12122j(Object obj);

    public AbstractC11067C() {
        this.f33359a = new Object();
        this.f33360b = new C20089f();
        this.f33361c = 0;
        Object obj = f33358k;
        this.f33364f = obj;
        this.f33368j = new RunnableC0153B(this, 16);
        this.f33363e = obj;
        this.f33365g = -1;
    }
}
