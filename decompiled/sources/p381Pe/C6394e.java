package p381Pe;

import android.gov.nist.core.Separators;
import ao.AbstractC11153a0;
import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p049Bm.InterfaceC1436k;
import p1155zi.C22011h0;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9252a0;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pe.e */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6394e<ID, T> {
    public static final C6392c Companion = new C6392c();

    /* JADX INFO: renamed from: d */
    public static final C3430e f20811d = AbstractC8168p6.m8749b("Tree", null);

    /* JADX INFO: renamed from: e */
    public static final PluginGeneratedSerialDescriptor f20812e;

    /* JADX INFO: renamed from: a */
    public final Object f20813a;

    /* JADX INFO: renamed from: b */
    public final Map f20814b;

    /* JADX INFO: renamed from: c */
    public final int f20815c;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.Tree", null, 3);
        pluginGeneratedSerialDescriptor.m18453j("rootNodeId", false);
        pluginGeneratedSerialDescriptor.m18453j("nodes", false);
        pluginGeneratedSerialDescriptor.m18453j("size", true);
        f20812e = pluginGeneratedSerialDescriptor;
    }

    public C6394e(List list, String conversationId) {
        T next;
        Object obj;
        Object obj2;
        AbstractC16544l.m18094g(conversationId, "conversationId");
        List list2 = list;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (T t10 : list2) {
            linkedHashMap.put(((C6397h) t10).f20819a, t10);
        }
        Iterator<T> it = linkedHashMap.values().iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            obj2 = ((C6397h) next).f20820b;
            if (obj2 == null) {
                break;
            }
        } while (linkedHashMap.containsKey(obj2));
        C6397h c6397h = next;
        if (c6397h != null && (obj = c6397h.f20819a) != null) {
            this(linkedHashMap, obj);
            return;
        }
        throw new C6393d("Root not found, conversation " + C22011h0.m22343a(conversationId) + " size: " + linkedHashMap.size() + ", " + AbstractC17680n.m19349Y(AbstractC17680n.m19373w0(linkedHashMap.values(), 2), null, null, null, 0, null, C6391b.f20809Y, 31), linkedHashMap.size());
    }

    /* JADX INFO: renamed from: b */
    public static List m7024b(C6394e c6394e, Object obj) {
        ArrayList arrayList = new ArrayList();
        c6394e.getClass();
        while (true) {
            C6397h c6397h = (C6397h) c6394e.f20814b.get(obj);
            if (c6397h == null) {
                throw new IllegalArgumentException(AbstractC12107L1.m13824o(obj, "Node ", " not found"));
            }
            C6397h c6397hM7031g = c6394e.m7031g(AbstractC17680n.m19343S(c6397h.f20821c));
            if (c6397hM7031g == null) {
                return arrayList;
            }
            arrayList.add(c6397hM7031g);
            obj = c6397hM7031g.f20819a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static List m7025d(C6394e c6394e, Object obj) {
        LinkedList linkedList = new LinkedList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c6394e.getClass();
        while (!linkedHashSet.contains(obj)) {
            linkedHashSet.add(obj);
            C6397h c6397h = (C6397h) c6394e.f20814b.get(obj);
            if (c6397h == null) {
                throw new IllegalArgumentException(AbstractC12107L1.m13824o(obj, "Node ", " not found"));
            }
            C6397h c6397hM7031g = c6394e.m7031g(c6397h.f20820b);
            if (c6397hM7031g == null) {
                return linkedList;
            }
            linkedList.addFirst(c6397hM7031g);
            obj = c6397hM7031g.f20819a;
        }
        AbstractC8160o6.m8727b(f20811d, AbstractC12107L1.m13824o(obj, "Cycle detected in tree (nodeId ", Separators.RPAREN), null, 6);
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: h */
    public static C6397h m7026h(C6394e c6394e, C6397h c6397h, InterfaceC1436k interfaceC1436k) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c6394e.getClass();
        while (c6397h != null) {
            Object obj = c6397h.f20819a;
            if (linkedHashSet.contains(obj)) {
                AbstractC8160o6.m8727b(f20811d, AbstractC12107L1.m13824o(obj, "Cycle detected in tree (nodeId ", Separators.RPAREN), null, 6);
                break;
            }
            if (((Boolean) interfaceC1436k.invoke(c6397h)).booleanValue()) {
                return c6397h;
            }
            c6397h = c6394e.m7031g(c6397h.f20820b);
            linkedHashSet.add(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final List m7027a(Object obj, List list) {
        C6397h c6397h = (C6397h) this.f20814b.get(obj);
        if (c6397h == null) {
            return list;
        }
        list.add(c6397h);
        List list2 = c6397h.f20821c;
        if (list2.isEmpty()) {
            return list;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            m7027a(it.next(), list);
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m7028c(Object obj) {
        C6397h c6397h = (C6397h) this.f20814b.get(obj);
        if (c6397h != null) {
            return AbstractC17680n.m19361k0(m7024b(this, obj), AbstractC17680n.m19362l0(m7025d(this, obj), c6397h));
        }
        m7032i(obj);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final C6397h m7029e(InterfaceC1436k interfaceC1436k) {
        Object next;
        Iterator<T> it = this.f20814b.values().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Boolean) interfaceC1436k.invoke(next)).booleanValue()) {
                return (C6397h) next;
            }
        }
        next = null;
        return (C6397h) next;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6394e)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f20814b, ((C6394e) obj).f20814b);
    }

    /* JADX INFO: renamed from: f */
    public final C6397h m7030f(InterfaceC1436k interfaceC1436k) {
        Object obj = null;
        for (T t10 : this.f20814b.values()) {
            if (((Boolean) interfaceC1436k.invoke(t10)).booleanValue()) {
                obj = t10;
            }
        }
        return (C6397h) obj;
    }

    /* JADX INFO: renamed from: g */
    public final C6397h m7031g(Object obj) {
        if (obj != null) {
            return (C6397h) this.f20814b.get(obj);
        }
        return null;
    }

    public final int hashCode() {
        return this.f20814b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m7032i(Object obj) {
        Map map = this.f20814b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC9252a0.m9826a((C6397h) ((Map.Entry) it.next()).getValue()));
        }
        throw new IllegalArgumentException("Node " + obj + " not found. nodes=" + arrayList);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C6394e(int i10, Object obj, Map map, int i11) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, f20812e);
            throw null;
        }
        this.f20813a = obj;
        this.f20814b = map;
        if ((i10 & 4) == 0) {
            this.f20815c = map.size();
        } else {
            this.f20815c = i11;
        }
    }

    public C6394e(Map map, Object obj) {
        this.f20813a = obj;
        this.f20814b = map;
        this.f20815c = map.size();
    }
}
