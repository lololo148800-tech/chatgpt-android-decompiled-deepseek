package p586Y0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1726d;
import p076Cm.InterfaceC1728f;
import p415R0.InterfaceC6784b;
import p415R0.InterfaceC6785c;
import p415R0.InterfaceC6786d;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Y0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9563o implements Set, InterfaceC1728f {

    /* JADX INFO: renamed from: Y */
    public final C9569u f28769Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f28770Z;

    public C9563o(C9569u c9569u, int i10) {
        this.f28770Z = i10;
        this.f28769Y = c9569u;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m10101f(Collection collection) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        Collection<Map.Entry> collection2 = collection;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(collection2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C9569u c9569u = this.f28769Y;
        boolean z10 = false;
        do {
            synchronized (AbstractC9567s.f28776b) {
                C9568t c9568t = c9569u.f28779Y;
                AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                interfaceC6786d = c9568t2.f28777c;
                i10 = c9568t2.f28778d;
            }
            AbstractC16544l.m18091d(interfaceC6786d);
            InterfaceC6785c interfaceC6785cBuilder = interfaceC6786d.builder();
            Iterator it = c9569u.f28780Z.iterator();
            while (true) {
                z6 = true;
                if (!((C9574z) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((C9574z) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC16544l.m18089b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    interfaceC6785cBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            InterfaceC6786d interfaceC6786dBuild = interfaceC6785cBuilder.build();
            if (AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                break;
            }
            C9568t c9568t3 = c9569u.f28779Y;
            AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, c9569u, abstractC9556hM10087k);
                synchronized (AbstractC9567s.f28776b) {
                    int i11 = c9568t4.f28778d;
                    if (i11 == i10) {
                        c9568t4.f28777c = interfaceC6786dBuild;
                        c9568t4.f28778d = i11 + 1;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, c9569u);
        } while (!z6);
        return z10;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m10102j(Collection collection) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        Set setM19328G0 = AbstractC17680n.m19328G0(collection);
        C9569u c9569u = this.f28769Y;
        boolean z10 = false;
        do {
            synchronized (AbstractC9567s.f28776b) {
                C9568t c9568t = c9569u.f28779Y;
                AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                interfaceC6786d = c9568t2.f28777c;
                i10 = c9568t2.f28778d;
            }
            AbstractC16544l.m18091d(interfaceC6786d);
            InterfaceC6785c interfaceC6785cBuilder = interfaceC6786d.builder();
            Iterator it = c9569u.f28780Z.iterator();
            while (true) {
                z6 = true;
                if (!((C9574z) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((C9574z) it).next();
                if (!setM19328G0.contains(entry.getKey())) {
                    interfaceC6785cBuilder.remove(entry.getKey());
                    z10 = true;
                }
            }
            InterfaceC6786d interfaceC6786dBuild = interfaceC6785cBuilder.build();
            if (AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                break;
            }
            C9568t c9568t3 = c9569u.f28779Y;
            AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, c9569u, abstractC9556hM10087k);
                synchronized (AbstractC9567s.f28776b) {
                    int i11 = c9568t4.f28778d;
                    if (i11 == i10) {
                        c9568t4.f28777c = interfaceC6786dBuild;
                        c9568t4.f28778d = i11 + 1;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, c9569u);
        } while (!z6);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f28770Z) {
            case 0:
                AbstractC9567s.m10114j();
                throw null;
            case 1:
                AbstractC9567s.m10114j();
                throw null;
            default:
                AbstractC9567s.m10114j();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f28770Z) {
            case 0:
                AbstractC9567s.m10114j();
                throw null;
            case 1:
                AbstractC9567s.m10114j();
                throw null;
            default:
                AbstractC9567s.m10114j();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f28769Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f28770Z) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC1723a) && !(obj instanceof InterfaceC1726d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC16544l.m18089b(this.f28769Y.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f28769Y.containsKey(obj);
            default:
                return this.f28769Y.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f28770Z) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f28769Y.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f28769Y.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f28769Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f28770Z) {
            case 0:
                C9569u c9569u = this.f28769Y;
                return new C9574z(c9569u, ((InterfaceC6784b) c9569u.m10115a().f28777c.entrySet()).iterator(), 0);
            case 1:
                C9569u c9569u2 = this.f28769Y;
                return new C9574z(c9569u2, ((InterfaceC6784b) c9569u2.m10115a().f28777c.entrySet()).iterator(), 1);
            default:
                C9569u c9569u3 = this.f28769Y;
                return new C9574z(c9569u3, ((InterfaceC6784b) c9569u3.m10115a().f28777c.entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[ORIG_RETURN, RETURN] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 java.lang.Object, still in use, count: 2, list:
          (r2v9 java.lang.Object) from 0x002c: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v9 java.lang.Object) binds: [B:10:0x002b, B:36:0x002c] A[DONT_GENERATE, DONT_INLINE]
          (r2v9 java.lang.Object) from 0x001e: CHECK_CAST (java.util.Map$Entry) (r2v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f28770Z
            switch(r0) {
                case 0: goto L47;
                case 1: goto L3b;
                default: goto L5;
            }
        L5:
            Y0.u r0 = r4.f28769Y
            Y0.o r1 = r0.f28780Z
            java.util.Iterator r1 = r1.iterator()
        Ld:
            r2 = r1
            Y0.z r2 = (p586Y0.C9574z) r2
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L2b
            r2 = r1
            Y0.z r2 = (p586Y0.C9574z) r2
            java.lang.Object r2 = r2.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.AbstractC16544l.m18089b(r3, r5)
            if (r3 == 0) goto Ld
            goto L2c
        L2b:
            r2 = 0
        L2c:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L39
            java.lang.Object r5 = r2.getKey()
            r0.remove(r5)
            r5 = 1
            goto L3a
        L39:
            r5 = 0
        L3a:
            return r5
        L3b:
            Y0.u r0 = r4.f28769Y
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            return r5
        L47:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L57
            boolean r0 = r5 instanceof p076Cm.InterfaceC1723a
            if (r0 == 0) goto L55
            boolean r0 = r5 instanceof p076Cm.InterfaceC1726d
            if (r0 == 0) goto L57
        L55:
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            if (r0 != 0) goto L5b
            goto L6a
        L5b:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            Y0.u r0 = r4.f28769Y
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L6a
            r1 = r2
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p586Y0.C9563o.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        switch (this.f28770Z) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it.hasNext()) {
                        if (this.f28769Y.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        if (this.f28769Y.remove(it2.next()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
            default:
                Set setM19328G0 = AbstractC17680n.m19328G0(collection);
                C9569u c9569u = this.f28769Y;
                boolean z12 = false;
                do {
                    synchronized (AbstractC9567s.f28776b) {
                        C9568t c9568t = c9569u.f28779Y;
                        AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                        interfaceC6786d = c9568t2.f28777c;
                        i10 = c9568t2.f28778d;
                    }
                    AbstractC16544l.m18091d(interfaceC6786d);
                    InterfaceC6785c interfaceC6785cBuilder = interfaceC6786d.builder();
                    Iterator it3 = c9569u.f28780Z.iterator();
                    while (true) {
                        z6 = true;
                        if (!((C9574z) it3).hasNext()) {
                            InterfaceC6786d interfaceC6786dBuild = interfaceC6785cBuilder.build();
                            if (!AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                                C9568t c9568t3 = c9569u.f28779Y;
                                AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (AbstractC9562n.f28759b) {
                                    abstractC9556hM10087k = AbstractC9562n.m10087k();
                                    C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, c9569u, abstractC9556hM10087k);
                                    synchronized (AbstractC9567s.f28776b) {
                                        int i11 = c9568t4.f28778d;
                                        if (i11 == i10) {
                                            c9568t4.f28777c = interfaceC6786dBuild;
                                            c9568t4.f28778d = i11 + 1;
                                        } else {
                                            z6 = false;
                                        }
                                        break;
                                    }
                                }
                                AbstractC9562n.m10091o(abstractC9556hM10087k, c9569u);
                            }
                            return z12;
                        }
                        Map.Entry entry = (Map.Entry) ((C9574z) it3).next();
                        if (setM19328G0.contains(entry.getValue())) {
                            interfaceC6785cBuilder.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                } while (!z6);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        boolean z6;
        AbstractC9556h abstractC9556hM10087k;
        switch (this.f28770Z) {
            case 0:
                return m10101f(collection);
            case 1:
                return m10102j(collection);
            default:
                Set setM19328G0 = AbstractC17680n.m19328G0(collection);
                C9569u c9569u = this.f28769Y;
                boolean z10 = false;
                do {
                    synchronized (AbstractC9567s.f28776b) {
                        C9568t c9568t = c9569u.f28779Y;
                        AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                        interfaceC6786d = c9568t2.f28777c;
                        i10 = c9568t2.f28778d;
                    }
                    AbstractC16544l.m18091d(interfaceC6786d);
                    InterfaceC6785c interfaceC6785cBuilder = interfaceC6786d.builder();
                    Iterator it = c9569u.f28780Z.iterator();
                    while (true) {
                        z6 = true;
                        if (!((C9574z) it).hasNext()) {
                            InterfaceC6786d interfaceC6786dBuild = interfaceC6785cBuilder.build();
                            if (!AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                                C9568t c9568t3 = c9569u.f28779Y;
                                AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (AbstractC9562n.f28759b) {
                                    abstractC9556hM10087k = AbstractC9562n.m10087k();
                                    C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, c9569u, abstractC9556hM10087k);
                                    synchronized (AbstractC9567s.f28776b) {
                                        int i11 = c9568t4.f28778d;
                                        if (i11 == i10) {
                                            c9568t4.f28777c = interfaceC6786dBuild;
                                            c9568t4.f28778d = i11 + 1;
                                        } else {
                                            z6 = false;
                                        }
                                        break;
                                    }
                                }
                                AbstractC9562n.m10091o(abstractC9556hM10087k, c9569u);
                            }
                            return z10;
                        }
                        Map.Entry entry = (Map.Entry) ((C9574z) it).next();
                        if (!setM19328G0.contains(entry.getValue())) {
                            interfaceC6785cBuilder.remove(entry.getKey());
                            z10 = true;
                        }
                    }
                } while (!z6);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f28769Y.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }
}
