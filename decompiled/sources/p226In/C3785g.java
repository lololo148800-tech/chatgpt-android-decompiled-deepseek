package p226In;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.InterfaceC17302e;
import p025An.C0622l;
import p025An.C0624m;
import p025An.InterfaceC0586M0;
import p025An.InterfaceC0618j;
import p025An.InterfaceC0620k;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p077Cn.C1743k;
import p117Eb.C2391u;
import p153Fn.AbstractC2940r;
import p153Fn.C2942t;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: In.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3785g implements InterfaceC0618j, InterfaceC3786h, InterfaceC0586M0 {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11436r0 = AtomicReferenceFieldUpdater.newUpdater(C3785g.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f11437Y;

    /* JADX INFO: renamed from: o0 */
    public Object f11439o0;
    private volatile /* synthetic */ Object state$volatile = AbstractC3788j.f11443a;

    /* JADX INFO: renamed from: Z */
    public ArrayList f11438Z = new ArrayList(2);

    /* JADX INFO: renamed from: p0 */
    public int f11440p0 = -1;

    /* JADX INFO: renamed from: q0 */
    public Object f11441q0 = AbstractC3788j.f11446d;

    public C3785g(InterfaceC18776i interfaceC18776i) {
        this.f11437Y = interfaceC18776i;
    }

    @Override // p025An.InterfaceC0586M0
    /* JADX INFO: renamed from: a */
    public final void mo1212a(AbstractC2940r abstractC2940r, int i10) {
        this.f11439o0 = abstractC2940r;
        this.f11440p0 = i10;
    }

    @Override // p025An.InterfaceC0618j
    /* JADX INFO: renamed from: b */
    public final void mo1237b(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11436r0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC3788j.f11444b) {
                return;
            }
            C2942t c2942t = AbstractC3788j.f11445c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2942t)) {
                    ArrayList arrayList = this.f11438Z;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C3783e) it.next()).m4453a();
                    }
                    this.f11441q0 = AbstractC3788j.f11446d;
                    this.f11438Z = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m4454c(AbstractC19687c abstractC19687c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11436r0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C3783e c3783e = (C3783e) obj;
        Object obj2 = this.f11441q0;
        ArrayList<C3783e> arrayList = this.f11438Z;
        if (arrayList != null) {
            for (C3783e c3783e2 : arrayList) {
                if (c3783e2 != c3783e) {
                    c3783e2.m4453a();
                }
            }
            atomicReferenceFieldUpdater.set(this, AbstractC3788j.f11444b);
            this.f11441q0 = AbstractC3788j.f11446d;
            this.f11438Z = null;
        }
        Object objInvoke = c3783e.f11425c.invoke(c3783e.f11423a, c3783e.f11426d, obj2);
        C2942t c2942t = AbstractC3788j.f11447e;
        InterfaceC17302e interfaceC17302e = c3783e.f11427e;
        return c3783e.f11426d == c2942t ? ((InterfaceC1436k) interfaceC17302e).invoke(abstractC19687c) : ((InterfaceC1439n) interfaceC17302e).invoke(objInvoke, abstractC19687c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m4455d(AbstractC19687c abstractC19687c) {
        C3784f c3784f;
        Object obj;
        C3785g c3785g;
        if (abstractC19687c instanceof C3784f) {
            c3784f = (C3784f) abstractC19687c;
            int i10 = c3784f.f11435p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3784f.f11435p0 = i10 - Integer.MIN_VALUE;
            } else {
                c3784f = new C3784f(this, abstractC19687c);
            }
        } else {
            c3784f = new C3784f(this, abstractC19687c);
        }
        Object objM4454c = c3784f.f11433Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3784f.f11435p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c3785g = c3784f.f11432Y;
                AbstractC9233X.m9807c(objM4454c);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM4454c);
            }
        }
        AbstractC9233X.m9807c(objM4454c);
        c3784f.f11432Y = this;
        c3784f.f11435p0 = 1;
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c3784f));
        c0624m.m1262r();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11436r0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2942t c2942t = AbstractC3788j.f11443a;
            obj = C17296C.f55119a;
            if (obj2 == c2942t) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0624m)) {
                        c0624m.m1265v(this);
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            } else {
                if (!(obj2 instanceof List)) {
                    if (!(obj2 instanceof C3783e)) {
                        throw new IllegalStateException(("unexpected state: " + obj2).toString());
                    }
                    C3783e c3783e = (C3783e) obj2;
                    Object obj3 = this.f11441q0;
                    InterfaceC1440o interfaceC1440o = c3783e.f11428f;
                    c0624m.mo1246n(obj, interfaceC1440o != null ? (InterfaceC1440o) interfaceC1440o.invoke(this, c3783e.f11426d, obj3) : null);
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2942t)) {
                        Iterator it = ((Iterable) obj2).iterator();
                        while (it.hasNext()) {
                            C3783e c3783eM4456e = m4456e(it.next());
                            AbstractC16544l.m18091d(c3783eM4456e);
                            c3783eM4456e.f11429g = null;
                            c3783eM4456e.f11430h = -1;
                            m4458g(c3783eM4456e, true);
                        }
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        Object objM1261q = c0624m.m1261q();
        if (objM1261q == EnumC19250a.f61036Y) {
            obj = objM1261q;
        }
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c3785g = this;
        c3784f.f11432Y = null;
        c3784f.f11435p0 = 2;
        objM4454c = c3785g.m4454c(c3784f);
        return objM4454c == enumC19250a ? enumC19250a : objM4454c;
    }

    /* JADX INFO: renamed from: e */
    public final C3783e m4456e(Object obj) {
        ArrayList arrayList = this.f11438Z;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((C3783e) obj3).f11423a == obj) {
                obj2 = obj3;
                break;
            }
        }
        C3783e c3783e = (C3783e) obj2;
        if (c3783e != null) {
            return c3783e;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Bm.o, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Bm.o, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: f */
    public final void m4457f(C2391u c2391u, InterfaceC1439n interfaceC1439n) {
        m4458g(new C3783e(this, (C1743k) c2391u.f7429Z, (AbstractC16541i) c2391u.f7430o0, (AbstractC16541i) c2391u.f7431p0, null, interfaceC1439n, (C0622l) c2391u.f7432q0), false);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.o, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: g */
    public final void m4458g(C3783e c3783e, boolean z6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11436r0;
        if (atomicReferenceFieldUpdater.get(this) instanceof C3783e) {
            return;
        }
        Object obj = c3783e.f11423a;
        if (!z6) {
            ArrayList arrayList = this.f11438Z;
            AbstractC16544l.m18091d(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C3783e) it.next()).f11423a == obj) {
                        throw new IllegalStateException(AbstractC10763a.m11051i(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        c3783e.f11424b.invoke(obj, this, c3783e.f11426d);
        if (this.f11441q0 != AbstractC3788j.f11446d) {
            atomicReferenceFieldUpdater.set(this, c3783e);
            return;
        }
        if (!z6) {
            ArrayList arrayList2 = this.f11438Z;
            AbstractC16544l.m18091d(arrayList2);
            arrayList2.add(c3783e);
        }
        c3783e.f11429g = this.f11439o0;
        c3783e.f11430h = this.f11440p0;
        this.f11439o0 = null;
        this.f11440p0 = -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m4459h(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11436r0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC0620k)) {
                if (AbstractC16544l.m18089b(obj3, AbstractC3788j.f11444b) || (obj3 instanceof C3783e)) {
                    return 3;
                }
                if (AbstractC16544l.m18089b(obj3, AbstractC3788j.f11445c)) {
                    return 2;
                }
                if (AbstractC16544l.m18089b(obj3, AbstractC3788j.f11443a)) {
                    List listM9974d = AbstractC9393x3.m9974d(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listM9974d)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListM19362l0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            C3783e c3783eM4456e = m4456e(obj);
            if (c3783eM4456e != null) {
                InterfaceC1440o interfaceC1440o = c3783eM4456e.f11428f;
                InterfaceC1440o interfaceC1440o2 = interfaceC1440o != null ? (InterfaceC1440o) interfaceC1440o.invoke(this, c3783eM4456e.f11426d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c3783eM4456e)) {
                        InterfaceC0620k interfaceC0620k = (InterfaceC0620k) obj3;
                        this.f11441q0 = obj2;
                        C2942t c2942tMo1245h = interfaceC0620k.mo1245h(C17296C.f55119a, interfaceC1440o2);
                        if (c2942tMo1245h == null) {
                            this.f11441q0 = AbstractC3788j.f11446d;
                            return 2;
                        }
                        interfaceC0620k.mo1247t(c2942tMo1245h);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
