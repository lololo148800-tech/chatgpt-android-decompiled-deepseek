package androidx.lifecycle;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Looper;
import androidx.work.impl.utils.p651oZ.HhJS;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1012t.C19711a;
import p1028u.C20084a;
import p1028u.C20085b;
import p1028u.C20086c;
import p1028u.C20087d;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p183H4.C3227b;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: loaded from: classes.dex */
public final class C11114w extends AbstractC11105n {

    /* JADX INFO: renamed from: b */
    public final boolean f33502b;

    /* JADX INFO: renamed from: c */
    public C20084a f33503c = new C20084a();

    /* JADX INFO: renamed from: d */
    public EnumC11104m f33504d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f33505e;

    /* JADX INFO: renamed from: f */
    public int f33506f;

    /* JADX INFO: renamed from: g */
    public boolean f33507g;

    /* JADX INFO: renamed from: h */
    public boolean f33508h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f33509i;

    /* JADX INFO: renamed from: j */
    public final C2153Q0 f33510j;

    public C11114w(InterfaceC11112u interfaceC11112u, boolean z6) {
        this.f33502b = z6;
        EnumC11104m enumC11104m = EnumC11104m.f33475Z;
        this.f33504d = enumC11104m;
        this.f33509i = new ArrayList();
        this.f33505e = new WeakReference(interfaceC11112u);
        this.f33510j = AbstractC2124C.m3204c(enumC11104m);
    }

    @Override // androidx.lifecycle.AbstractC11105n
    /* JADX INFO: renamed from: a */
    public final void mo7806a(InterfaceC11111t observer) {
        InterfaceC11110s c11097f;
        InterfaceC11112u interfaceC11112u;
        ArrayList arrayList = this.f33509i;
        int i10 = 2;
        AbstractC16544l.m18094g(observer, "observer");
        m12169e("addObserver");
        EnumC11104m enumC11104m = this.f33504d;
        EnumC11104m enumC11104m2 = EnumC11104m.f33474Y;
        if (enumC11104m != enumC11104m2) {
            enumC11104m2 = EnumC11104m.f33475Z;
        }
        C11113v c11113v = new C11113v();
        HashMap map = AbstractC11116y.f33512a;
        boolean z6 = observer instanceof InterfaceC11110s;
        boolean z10 = observer instanceof DefaultLifecycleObserver;
        if (z6 && z10) {
            c11097f = new C11097f((DefaultLifecycleObserver) observer, (InterfaceC11110s) observer);
        } else if (z10) {
            c11097f = new C11097f((DefaultLifecycleObserver) observer, (InterfaceC11110s) null);
        } else if (z6) {
            c11097f = (InterfaceC11110s) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC11116y.m12175b(cls) == 2) {
                Object obj = AbstractC11116y.f33513b.get(cls);
                AbstractC16544l.m18091d(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC11116y.m12174a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC11099h[] interfaceC11099hArr = new InterfaceC11099h[size];
                if (size > 0) {
                    AbstractC11116y.m12174a((Constructor) list.get(0), observer);
                    throw null;
                }
                c11097f = new C3227b(interfaceC11099hArr, i10);
            } else {
                c11097f = new C11097f(observer);
            }
        }
        c11113v.f33487b = c11097f;
        c11113v.f33486a = enumC11104m2;
        if (((C11113v) this.f33503c.mo20917i(observer, c11113v)) == null && (interfaceC11112u = (InterfaceC11112u) this.f33505e.get()) != null) {
            boolean z11 = this.f33506f != 0 || this.f33507g;
            EnumC11104m enumC11104mM12168d = m12168d(observer);
            this.f33506f++;
            while (c11113v.f33486a.compareTo(enumC11104mM12168d) < 0 && this.f33503c.f63601q0.containsKey(observer)) {
                arrayList.add(c11113v.f33486a);
                C11101j c11101j = EnumC11103l.Companion;
                EnumC11104m enumC11104m3 = c11113v.f33486a;
                c11101j.getClass();
                EnumC11103l enumC11103lM12160b = C11101j.m12160b(enumC11104m3);
                if (enumC11103lM12160b == null) {
                    throw new IllegalStateException("no event up from " + c11113v.f33486a);
                }
                c11113v.m12163a(interfaceC11112u, enumC11103lM12160b);
                arrayList.remove(arrayList.size() - 1);
                enumC11104mM12168d = m12168d(observer);
            }
            if (!z11) {
                m12173i();
            }
            this.f33506f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC11105n
    /* JADX INFO: renamed from: b */
    public final EnumC11104m mo7807b() {
        return this.f33504d;
    }

    @Override // androidx.lifecycle.AbstractC11105n
    /* JADX INFO: renamed from: c */
    public final void mo7808c(InterfaceC11111t observer) {
        AbstractC16544l.m18094g(observer, "observer");
        m12169e("removeObserver");
        this.f33503c.mo20918j(observer);
    }

    /* JADX INFO: renamed from: d */
    public final EnumC11104m m12168d(InterfaceC11111t interfaceC11111t) {
        C11113v c11113v;
        HashMap map = this.f33503c.f63601q0;
        C20086c c20086c = map.containsKey(interfaceC11111t) ? ((C20086c) map.get(interfaceC11111t)).f63608p0 : null;
        EnumC11104m enumC11104m = (c20086c == null || (c11113v = (C11113v) c20086c.f63606Z) == null) ? null : c11113v.f33486a;
        ArrayList arrayList = this.f33509i;
        EnumC11104m enumC11104m2 = arrayList.isEmpty() ? null : (EnumC11104m) AbstractC17792x.m19532o(1, arrayList);
        EnumC11104m state1 = this.f33504d;
        AbstractC16544l.m18094g(state1, "state1");
        if (enumC11104m == null || enumC11104m.compareTo(state1) >= 0) {
            enumC11104m = state1;
        }
        return (enumC11104m2 == null || enumC11104m2.compareTo(enumC11104m) >= 0) ? enumC11104m : enumC11104m2;
    }

    /* JADX INFO: renamed from: e */
    public final void m12169e(String str) {
        if (this.f33502b) {
            C19711a.m20661e().f62404a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC10763a.m11054l("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12171g(EnumC11104m enumC11104m) {
        EnumC11104m enumC11104m2 = this.f33504d;
        if (enumC11104m2 == enumC11104m) {
            return;
        }
        EnumC11104m enumC11104m3 = EnumC11104m.f33475Z;
        EnumC11104m enumC11104m4 = EnumC11104m.f33474Y;
        if (enumC11104m2 == enumC11104m3 && enumC11104m == enumC11104m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC11104m + ", but was " + this.f33504d + " in component " + this.f33505e.get()).toString());
        }
        this.f33504d = enumC11104m;
        if (this.f33507g || this.f33506f != 0) {
            this.f33508h = true;
            return;
        }
        this.f33507g = true;
        m12173i();
        this.f33507g = false;
        if (this.f33504d == enumC11104m4) {
            this.f33503c = new C20084a();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12172h(EnumC11104m state) {
        AbstractC16544l.m18094g(state, "state");
        m12169e("setCurrentState");
        m12171g(state);
    }

    /* JADX INFO: renamed from: i */
    public final void m12173i() {
        InterfaceC11112u interfaceC11112u = (InterfaceC11112u) this.f33505e.get();
        if (interfaceC11112u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C20084a c20084a = this.f33503c;
            if (c20084a.f63615p0 != 0) {
                C20086c c20086c = c20084a.f63612Y;
                AbstractC16544l.m18091d(c20086c);
                EnumC11104m enumC11104m = ((C11113v) c20086c.f63606Z).f33486a;
                C20086c c20086c2 = this.f33503c.f63613Z;
                AbstractC16544l.m18091d(c20086c2);
                EnumC11104m enumC11104m2 = ((C11113v) c20086c2.f63606Z).f33486a;
                if (enumC11104m == enumC11104m2 && this.f33504d == enumC11104m2) {
                    break;
                }
                this.f33508h = false;
                EnumC11104m enumC11104m3 = this.f33504d;
                C20086c c20086c3 = this.f33503c.f63612Y;
                AbstractC16544l.m18091d(c20086c3);
                if (enumC11104m3.compareTo(((C11113v) c20086c3.f63606Z).f33486a) < 0) {
                    C20084a c20084a2 = this.f33503c;
                    C20085b c20085b = new C20085b(c20084a2.f63613Z, c20084a2.f63612Y, 1);
                    c20084a2.f63614o0.put(c20085b, Boolean.FALSE);
                    while (c20085b.hasNext() && !this.f33508h) {
                        Map.Entry entry = (Map.Entry) c20085b.next();
                        AbstractC16544l.m18093f(entry, "next()");
                        InterfaceC11111t interfaceC11111t = (InterfaceC11111t) entry.getKey();
                        C11113v c11113v = (C11113v) entry.getValue();
                        while (c11113v.f33486a.compareTo(this.f33504d) > 0 && !this.f33508h && this.f33503c.f63601q0.containsKey(interfaceC11111t)) {
                            C11101j c11101j = EnumC11103l.Companion;
                            EnumC11104m enumC11104m4 = c11113v.f33486a;
                            c11101j.getClass();
                            EnumC11103l enumC11103lM12159a = C11101j.m12159a(enumC11104m4);
                            if (enumC11103lM12159a == null) {
                                throw new IllegalStateException("no event down from " + c11113v.f33486a);
                            }
                            this.f33509i.add(enumC11103lM12159a.m12162a());
                            c11113v.m12163a(interfaceC11112u, enumC11103lM12159a);
                            ArrayList arrayList = this.f33509i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C20086c c20086c4 = this.f33503c.f63613Z;
                if (!this.f33508h && c20086c4 != null && this.f33504d.compareTo(((C11113v) c20086c4.f63606Z).f33486a) > 0) {
                    C20084a c20084a3 = this.f33503c;
                    c20084a3.getClass();
                    C20087d c20087d = new C20087d(c20084a3);
                    c20084a3.f63614o0.put(c20087d, Boolean.FALSE);
                    while (c20087d.hasNext() && !this.f33508h) {
                        Map.Entry entry2 = (Map.Entry) c20087d.next();
                        InterfaceC11111t interfaceC11111t2 = (InterfaceC11111t) entry2.getKey();
                        C11113v c11113v2 = (C11113v) entry2.getValue();
                        while (c11113v2.f33486a.compareTo(this.f33504d) < 0 && !this.f33508h && this.f33503c.f63601q0.containsKey(interfaceC11111t2)) {
                            this.f33509i.add(c11113v2.f33486a);
                            C11101j c11101j2 = EnumC11103l.Companion;
                            EnumC11104m enumC11104m5 = c11113v2.f33486a;
                            c11101j2.getClass();
                            EnumC11103l enumC11103lM12160b = C11101j.m12160b(enumC11104m5);
                            if (enumC11103lM12160b == null) {
                                throw new IllegalStateException("no event up from " + c11113v2.f33486a);
                            }
                            c11113v2.m12163a(interfaceC11112u, enumC11103lM12160b);
                            ArrayList arrayList2 = this.f33509i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f33508h = false;
        this.f33510j.setValue(this.f33504d);
    }

    /* JADX INFO: renamed from: f */
    public final void m12170f(EnumC11103l enumC11103l) {
        AbstractC16544l.m18094g(enumC11103l, HhJS.MMOxvNcL);
        m12169e("handleLifecycleEvent");
        m12171g(enumC11103l.m12162a());
    }
}
