package p890mb;

import com.auth0.android.request.internal.RunnableC11843b;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p1037ub.InterfaceC20181a;
import p1037ub.InterfaceC20182b;
import p1053v3.p1054lN.IGDwkYw;
import p1104xb.InterfaceC21170a;
import p117Eb.C2382l;
import p228J.AbstractC3794B0;
import p571X9.AbstractC9156K;
import p571X9.AbstractC9162L;
import p817j$.util.concurrent.ConcurrentHashMap;
import p832jb.C16183c;
import p849k7.C16349b;

/* JADX INFO: renamed from: mb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17209f implements InterfaceC17205b {

    /* JADX INFO: renamed from: t0 */
    public static final C2382l f54930t0 = new C2382l(1);

    /* JADX INFO: renamed from: q0 */
    public final C17214k f54935q0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC17208e f54937s0;

    /* JADX INFO: renamed from: Y */
    public final HashMap f54931Y = new HashMap();

    /* JADX INFO: renamed from: Z */
    public final HashMap f54932Z = new HashMap();

    /* JADX INFO: renamed from: o0 */
    public final HashMap f54933o0 = new HashMap();

    /* JADX INFO: renamed from: p0 */
    public final HashSet f54934p0 = new HashSet();

    /* JADX INFO: renamed from: r0 */
    public final AtomicReference f54936r0 = new AtomicReference();

    public C17209f(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC17208e interfaceC17208e) {
        C17214k c17214k = new C17214k(executor);
        this.f54935q0 = c17214k;
        this.f54937s0 = interfaceC17208e;
        ArrayList<C17204a> arrayList3 = new ArrayList();
        arrayList3.add(C17204a.m18944c(c17214k, C17214k.class, InterfaceC20182b.class, InterfaceC20181a.class));
        arrayList3.add(C17204a.m18944c(this, C17209f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C17204a c17204a = (C17204a) it.next();
            if (c17204a != null) {
                arrayList3.add(c17204a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC21170a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f54937s0.mo8898e(componentRegistrar));
                        it3.remove();
                    }
                } catch (C17215l e10) {
                    it3.remove();
                    AbstractC15256t.m16483u("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((C17204a) it4.next()).f54921b.toArray()) {
                    if (obj.toString().contains(IGDwkYw.WgNQvTib)) {
                        if (this.f54934p0.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f54934p0.add(obj.toString());
                    }
                }
            }
            if (this.f54931Y.isEmpty()) {
                AbstractC9156K.m9705a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f54931Y.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC9156K.m9705a(arrayList6);
            }
            for (C17204a c17204a2 : arrayList3) {
                this.f54931Y.put(c17204a2, new C17216m(new C16183c(this, 1, c17204a2)));
            }
            arrayList5.addAll(m18948f(arrayList3));
            arrayList5.addAll(m18949g());
            m18947e();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f54936r0.get();
        if (bool != null) {
            m18945c(this.f54931Y, bool.booleanValue());
        }
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: C */
    public final Object mo12534C(C17220q c17220q) {
        InterfaceC21170a interfaceC21170aMo12575t = mo12575t(c17220q);
        if (interfaceC21170aMo12575t == null) {
            return null;
        }
        return interfaceC21170aMo12575t.get();
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: a */
    public final Object mo12555a(Class cls) {
        return mo12534C(C17220q.m18953a(cls));
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: b */
    public final Set mo12557b(C17220q c17220q) {
        InterfaceC21170a interfaceC21170a;
        synchronized (this) {
            interfaceC21170a = (C17217n) this.f54933o0.get(c17220q);
            if (interfaceC21170a == null) {
                interfaceC21170a = f54930t0;
            }
        }
        return (Set) interfaceC21170a.get();
    }

    /* JADX INFO: renamed from: c */
    public final void m18945c(HashMap map, boolean z6) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C17204a c17204a = (C17204a) entry.getKey();
            InterfaceC21170a interfaceC21170a = (InterfaceC21170a) entry.getValue();
            int i10 = c17204a.f54923d;
            if (i10 == 1 || (i10 == 2 && z6)) {
                interfaceC21170a.get();
            }
        }
        C17214k c17214k = this.f54935q0;
        synchronized (c17214k) {
            arrayDeque = c17214k.f54947b;
            if (arrayDeque != null) {
                c17214k.f54947b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw AbstractC3794B0.m4497v(it);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18946d(boolean z6) {
        HashMap map;
        AtomicReference atomicReference = this.f54936r0;
        Boolean boolValueOf = Boolean.valueOf(z6);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f54931Y);
        }
        m18945c(map, z6);
    }

    /* JADX INFO: renamed from: e */
    public final void m18947e() {
        for (C17204a c17204a : this.f54931Y.keySet()) {
            for (C17212i c17212i : c17204a.f54922c) {
                if (c17212i.f54944b == 2 && !this.f54933o0.containsKey(c17212i.f54943a)) {
                    HashMap map = this.f54933o0;
                    C17220q c17220q = c17212i.f54943a;
                    Set setEmptySet = Collections.emptySet();
                    C17217n c17217n = new C17217n();
                    c17217n.f54953b = null;
                    c17217n.f54952a = Collections.newSetFromMap(new ConcurrentHashMap());
                    c17217n.f54952a.addAll(setEmptySet);
                    map.put(c17220q, c17217n);
                } else if (this.f54932Z.containsKey(c17212i.f54943a)) {
                    continue;
                } else {
                    int i10 = c17212i.f54944b;
                    if (i10 == 1) {
                        throw new C17213j("Unsatisfied dependency for component " + c17204a + ": " + c17212i.f54943a);
                    }
                    if (i10 != 2) {
                        HashMap map2 = this.f54932Z;
                        C17220q c17220q2 = c17212i.f54943a;
                        C16349b c16349b = C17218o.f54954c;
                        C2382l c2382l = C17218o.f54955d;
                        C17218o c17218o = new C17218o();
                        c17218o.f54956a = c16349b;
                        c17218o.f54957b = c2382l;
                        map2.put(c17220q2, c17218o);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m18948f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17204a c17204a = (C17204a) it.next();
            if (c17204a.f54924e == 0) {
                InterfaceC21170a interfaceC21170a = (InterfaceC21170a) this.f54931Y.get(c17204a);
                for (C17220q c17220q : c17204a.f54921b) {
                    HashMap map = this.f54932Z;
                    if (map.containsKey(c17220q)) {
                        arrayList2.add(new RunnableC11843b((C17218o) ((InterfaceC21170a) map.get(c17220q)), 27, interfaceC21170a));
                    } else {
                        map.put(c17220q, interfaceC21170a);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m18949g() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f54931Y.entrySet()) {
            C17204a c17204a = (C17204a) entry.getKey();
            if (c17204a.f54924e != 0) {
                InterfaceC21170a interfaceC21170a = (InterfaceC21170a) entry.getValue();
                for (C17220q c17220q : c17204a.f54921b) {
                    if (!map.containsKey(c17220q)) {
                        map.put(c17220q, new HashSet());
                    }
                    ((Set) map.get(c17220q)).add(interfaceC21170a);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f54933o0;
            if (map2.containsKey(key)) {
                C17217n c17217n = (C17217n) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC11843b(c17217n, 28, (InterfaceC21170a) it.next()));
                }
            } else {
                C17220q c17220q2 = (C17220q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C17217n c17217n2 = new C17217n();
                c17217n2.f54953b = null;
                c17217n2.f54952a = Collections.newSetFromMap(new ConcurrentHashMap());
                c17217n2.f54952a.addAll(set);
                map2.put(c17220q2, c17217n2);
            }
        }
        return arrayList;
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: o */
    public final InterfaceC21170a mo12569o(Class cls) {
        return mo12575t(C17220q.m18953a(cls));
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: t */
    public final synchronized InterfaceC21170a mo12575t(C17220q c17220q) {
        AbstractC9162L.m9711a(c17220q, "Null interface requested.");
        return (InterfaceC21170a) this.f54932Z.get(c17220q);
    }
}
