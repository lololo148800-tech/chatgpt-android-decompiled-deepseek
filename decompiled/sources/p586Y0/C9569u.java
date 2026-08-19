package p586Y0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1727e;
import p415R0.InterfaceC6785c;
import p415R0.InterfaceC6786d;
import p466T0.C7176c;
import p466T0.C7178e;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: Y0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C9569u implements InterfaceC9542A, Map, InterfaceC1727e {

    /* JADX INFO: renamed from: Y */
    public C9568t f28779Y;

    /* JADX INFO: renamed from: Z */
    public final C9563o f28780Z;

    /* JADX INFO: renamed from: o0 */
    public final C9563o f28781o0;

    /* JADX INFO: renamed from: p0 */
    public final C9563o f28782p0;

    public C9569u() {
        C7176c c7176c = C7176c.f22810o0;
        C9568t c9568t = new C9568t(c7176c);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C9568t c9568t2 = new C9568t(c7176c);
            c9568t2.f28702a = 1;
            c9568t.f28703b = c9568t2;
        }
        this.f28779Y = c9568t;
        this.f28780Z = new C9563o(this, 0);
        this.f28781o0 = new C9563o(this, 1);
        this.f28782p0 = new C9563o(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public final C9568t m10115a() {
        C9568t c9568t = this.f28779Y;
        AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C9568t) AbstractC9562n.m10097u(c9568t, this);
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC9556h abstractC9556hM10087k;
        C9568t c9568t = this.f28779Y;
        AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
        C7176c c7176c = C7176c.f22810o0;
        if (c7176c != c9568t2.f28777c) {
            C9568t c9568t3 = this.f28779Y;
            AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, this, abstractC9556hM10087k);
                synchronized (AbstractC9567s.f28776b) {
                    c9568t4.f28777c = c7176c;
                    c9568t4.f28778d++;
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m10115a().f28777c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m10115a().f28777c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f28780Z;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: f */
    public final AbstractC9544C mo6345f() {
        return this.f28779Y;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m10115a().f28777c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m10115a().f28777c.isEmpty();
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        return null;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f28781o0;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f28779Y = (C9568t) abstractC9544C;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        Object objPut;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        do {
            Object obj3 = AbstractC9567s.f28776b;
            synchronized (obj3) {
                C9568t c9568t = this.f28779Y;
                AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                interfaceC6786d = c9568t2.f28777c;
                i10 = c9568t2.f28778d;
            }
            AbstractC16544l.m18091d(interfaceC6786d);
            C7178e c7178e = (C7178e) interfaceC6786d.builder();
            objPut = c7178e.put(obj, obj2);
            InterfaceC6786d interfaceC6786dBuild = c7178e.build();
            if (AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                break;
            }
            C9568t c9568t3 = this.f28779Y;
            AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, this, abstractC9556hM10087k);
                synchronized (obj3) {
                    int i11 = c9568t4.f28778d;
                    if (i11 == i10) {
                        c9568t4.f28777c = interfaceC6786dBuild;
                        c9568t4.f28778d = i11 + 1;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return objPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0057 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putAll(Map map) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        do {
            Object obj = AbstractC9567s.f28776b;
            synchronized (obj) {
                C9568t c9568t = this.f28779Y;
                AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                interfaceC6786d = c9568t2.f28777c;
                i10 = c9568t2.f28778d;
            }
            AbstractC16544l.m18091d(interfaceC6786d);
            C7178e c7178e = (C7178e) interfaceC6786d.builder();
            c7178e.putAll(map);
            InterfaceC6786d interfaceC6786dBuild = c7178e.build();
            if (AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                return;
            }
            C9568t c9568t3 = this.f28779Y;
            AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, this, abstractC9556hM10087k);
                synchronized (obj) {
                    try {
                        int i11 = c9568t4.f28778d;
                        if (i11 == i10) {
                            c9568t4.f28777c = interfaceC6786dBuild;
                            c9568t4.f28778d = i11 + 1;
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC6786d interfaceC6786d;
        int i10;
        Object objRemove;
        AbstractC9556h abstractC9556hM10087k;
        boolean z6;
        do {
            Object obj2 = AbstractC9567s.f28776b;
            synchronized (obj2) {
                C9568t c9568t = this.f28779Y;
                AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C9568t c9568t2 = (C9568t) AbstractC9562n.m10085i(c9568t);
                interfaceC6786d = c9568t2.f28777c;
                i10 = c9568t2.f28778d;
            }
            AbstractC16544l.m18091d(interfaceC6786d);
            InterfaceC6785c interfaceC6785cBuilder = interfaceC6786d.builder();
            objRemove = interfaceC6785cBuilder.remove(obj);
            InterfaceC6786d interfaceC6786dBuild = interfaceC6785cBuilder.build();
            if (AbstractC16544l.m18089b(interfaceC6786dBuild, interfaceC6786d)) {
                break;
            }
            C9568t c9568t3 = this.f28779Y;
            AbstractC16544l.m18092e(c9568t3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9568t c9568t4 = (C9568t) AbstractC9562n.m10100x(c9568t3, this, abstractC9556hM10087k);
                synchronized (obj2) {
                    int i11 = c9568t4.f28778d;
                    if (i11 == i10) {
                        c9568t4.f28777c = interfaceC6786dBuild;
                        c9568t4.f28778d = i11 + 1;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        } while (!z6);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return m10115a().f28777c.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f28782p0;
    }

    public final String toString() {
        C9568t c9568t = this.f28779Y;
        AbstractC16544l.m18092e(c9568t, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((C9568t) AbstractC9562n.m10085i(c9568t)).f28777c + MMVKXkcLpuHFDi.pPBq + hashCode();
    }
}
