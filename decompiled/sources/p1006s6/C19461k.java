package p1006s6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: s6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C19461k implements InterfaceC19456f {

    /* JADX INFO: renamed from: Y */
    public Object f61759Y;

    /* JADX INFO: renamed from: Z */
    public boolean f61760Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f61761o0 = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static Object m20588a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        if (obj instanceof List) {
            if (!(obj2 instanceof List)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            C3508g c3508gM19380i = AbstractC17681o.m19380i((Collection) obj);
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508gM19380i, 10));
            C3507f it = c3508gM19380i.iterator();
            while (it.f10596o0) {
                int iMo4199a = it.mo4199a();
                arrayList.add(m20588a(list.get(iMo4199a), list2.get(iMo4199a)));
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            if (obj.equals(obj2)) {
                return obj;
            }
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
        if (!(obj2 instanceof Map)) {
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        LinkedHashSet<String> linkedHashSetM19266f = AbstractC17665J.m19266f(map.keySet(), map2.keySet());
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(linkedHashSetM19266f, 10));
        for (String str : linkedHashSetM19266f) {
            arrayList2.add(new C17309l(str, m20588a(map.get(str), map2.get(str))));
        }
        return AbstractC17659D.m19253o(arrayList2);
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: B */
    public final InterfaceC19456f mo20539B(long j10) {
        m20590k(Long.valueOf(j10));
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: C */
    public final InterfaceC19456f mo20540C(int i10) {
        m20590k(Integer.valueOf(i10));
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: F */
    public final InterfaceC19456f mo20542F(double d10) {
        m20590k(Double.valueOf(d10));
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: I0 */
    public final InterfaceC19456f mo20543I0() {
        m20590k(null);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: L */
    public final InterfaceC19456f mo20544L(String value) {
        AbstractC16544l.m18094g(value, "value");
        m20590k(value);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC19456f mo20545M0(String name) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC19460j abstractC19460j = (AbstractC19460j) AbstractC17680n.m19351a0(this.f61761o0);
        if (!(abstractC19460j instanceof C19459i)) {
            throw new IllegalStateException("Check failed.");
        }
        C19459i c19459i = (C19459i) abstractC19460j;
        if (c19459i.f61758b != null) {
            throw new IllegalStateException("Check failed.");
        }
        c19459i.f61758b = name;
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: X */
    public final InterfaceC19456f mo20548X(boolean z6) {
        m20590k(Boolean.valueOf(z6));
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final Object m20589e() {
        if (this.f61760Z) {
            return this.f61759Y;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: j */
    public final InterfaceC19456f mo20551j() {
        ArrayList arrayList = this.f61761o0;
        AbstractC19460j abstractC19460j = (AbstractC19460j) arrayList.remove(arrayList.size() - 1);
        if (!(abstractC19460j instanceof C19459i)) {
            throw new IllegalStateException("Check failed.");
        }
        m20590k(((C19459i) abstractC19460j).f61757a);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final void m20590k(Object obj) {
        AbstractC19460j abstractC19460j = (AbstractC19460j) AbstractC17680n.m19353c0(this.f61761o0);
        if (!(abstractC19460j instanceof C19459i)) {
            if (abstractC19460j instanceof C19458h) {
                ((C19458h) abstractC19460j).f61756a.add(obj);
                return;
            } else {
                this.f61759Y = obj;
                this.f61760Z = true;
                return;
            }
        }
        C19459i c19459i = (C19459i) abstractC19460j;
        String str = c19459i.f61758b;
        if (str == null) {
            throw new IllegalStateException("Check failed.");
        }
        LinkedHashMap linkedHashMap = c19459i.f61757a;
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, m20588a(linkedHashMap.get(str), obj));
        } else {
            linkedHashMap.put(str, obj);
        }
        c19459i.f61758b = null;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: o */
    public final InterfaceC19456f mo20554o() {
        this.f61761o0.add(new C19459i(new LinkedHashMap()));
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: p */
    public final InterfaceC19456f mo20555p() {
        ArrayList arrayList = this.f61761o0;
        AbstractC19460j abstractC19460j = (AbstractC19460j) arrayList.remove(arrayList.size() - 1);
        if (!(abstractC19460j instanceof C19458h)) {
            throw new IllegalStateException("Check failed.");
        }
        m20590k(((C19458h) abstractC19460j).f61756a);
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: q */
    public final InterfaceC19456f mo20556q() {
        this.f61761o0.add(new C19458h(new ArrayList()));
        return this;
    }

    @Override // p1006s6.InterfaceC19456f
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC19456f mo20557u0(C19453c value) {
        AbstractC16544l.m18094g(value, "value");
        m20590k(value);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
