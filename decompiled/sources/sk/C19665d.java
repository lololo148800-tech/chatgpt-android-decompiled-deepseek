package sk;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.EnumC17307j;
import mo.C17327D;
import mo.InterfaceC17338e;
import p025An.C0644w;
import p1027tp.AbstractC20056V;
import p1027tp.C20077u;
import p1027tp.InterfaceC20062f;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p1057v6.C20462b;
import p1057v6.C20463c;
import p1057v6.C20468h;
import p1140z1.C21658D;
import p1140z1.C21685c0;
import p1140z1.C21696i;
import p1140z1.C21709o0;
import p228J.C3847l0;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8183r5;
import p571X9.AbstractC9154J3;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p784hb.C14438g;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p917o6.AbstractC17863p;
import p917o6.AbstractC17865r;
import p917o6.C17836D;
import p917o6.C17840H;
import p917o6.C17847O;
import p917o6.C17859l;
import p917o6.C17860m;
import p917o6.C17862o;
import p917o6.C17864q;
import p974qo.C18792h;

/* JADX INFO: renamed from: sk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19665d implements InterfaceC17338e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62328Y;

    /* JADX INFO: renamed from: Z */
    public final Object f62329Z;

    /* JADX INFO: renamed from: o0 */
    public Object f62330o0;

    public /* synthetic */ C19665d(Object obj, int i10, Object obj2) {
        this.f62328Y = i10;
        this.f62330o0 = obj;
        this.f62329Z = obj2;
    }

    /* JADX INFO: renamed from: e */
    public static void m20638e(List list, String str, String str2, C3847l0 c3847l0) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17865r abstractC17865r = (AbstractC17865r) it.next();
            if (abstractC17865r instanceof C17859l) {
                c3847l0.f11629a.add(abstractC17865r);
            } else {
                if (!(abstractC17865r instanceof C17860m)) {
                    throw new C0644w();
                }
                C17860m c17860m = (C17860m) abstractC17865r;
                if (AbstractC17680n.m19333J(c17860m.f56953b, str2) || c17860m.f56952a.equals(str)) {
                    m20638e(c17860m.f56954c, str, str2, c3847l0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20639a(Object obj, String str) {
        ((ArrayList) this.f62329Z).add(AbstractC9306j0.m9890i(str, Separators.EQUALS, String.valueOf(obj)));
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: b */
    public void mo1006b(C18792h c18792h, C17327D c17327d) {
        InterfaceC20062f interfaceC20062f = (InterfaceC20062f) this.f62329Z;
        C20077u c20077u = (C20077u) this.f62330o0;
        try {
            try {
                interfaceC20062f.mo3627v(c20077u, c20077u.m20915c(c17327d));
            } catch (Throwable th2) {
                AbstractC20056V.m20889o(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            AbstractC20056V.m20889o(th3);
            try {
                interfaceC20062f.mo3626s(c20077u, th3);
            } catch (Throwable th4) {
                AbstractC20056V.m20889o(th4);
                th4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20640c(C21658D c21658d) {
        if (c21658d.m22024V()) {
            ((C21709o0) this.f62330o0).add(c21658d);
        } else {
            AbstractC8111i5.m8592c("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX INFO: renamed from: d */
    public C20462b m20641d(String str, String str2, Map map, List list) {
        C14438g c14438g;
        C17309l c17309l;
        Object obj = map.get("__typename");
        String str3 = obj instanceof String ? (String) obj : null;
        C3847l0 c3847l0 = new C3847l0(4);
        m20638e(list, str2, str3, c3847l0);
        ArrayList arrayList = c3847l0.f11629a;
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((C17859l) obj2).f56947a.equals(entry.getKey())) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.isEmpty()) {
                c17309l = null;
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c14438g = (C14438g) this.f62329Z;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    AbstractC8183r5.m8765c((C17859l) next, (Map) c14438g.f45414Y);
                    arrayList4.add(next);
                }
                if (arrayList4.isEmpty()) {
                    c17309l = null;
                } else {
                    C17859l c17859l = (C17859l) AbstractC17680n.m19341Q(arrayList4);
                    String str4 = c17859l.f56947a;
                    AbstractC9154J3 type = c17859l.f56948b;
                    AbstractC16544l.m18094g(type, "type");
                    C17689w c17689w = C17689w.f56480Y;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        AbstractC17686t.m19398v(((C17859l) it2.next()).f56951e, arrayList5);
                    }
                    C17859l c17859l2 = new C17859l(str4, type, c17689w, c17859l.f56950d, arrayList5);
                    String strM19600b = c17859l2.m19600b(c14438g);
                    String str5 = AbstractC16544l.m18089b(str, C20462b.f64955c.f64956a) ? null : str;
                    c17309l = new C17309l(strM19600b, m20644i(entry.getValue(), c17859l2, type, str5 == null ? strM19600b : str5 + '.' + strM19600b));
                }
            }
            if (c17309l != null) {
                arrayList2.add(c17309l);
            }
        }
        C20468h c20468h = new C20468h(str, AbstractC17659D.m19253o(arrayList2), null);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f62330o0;
        C20468h c20468h2 = (C20468h) linkedHashMap.get(str);
        if (c20468h2 != null) {
            c20468h = (C20468h) c20468h2.m21113b(c20468h, null).f55136Y;
        }
        linkedHashMap.put(str, c20468h);
        return new C20462b(str);
    }

    /* JADX INFO: renamed from: f */
    public synchronized Map m20642f() {
        try {
            if (((Map) this.f62330o0) == null) {
                this.f62330o0 = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f62329Z));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f62330o0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m20643g(C21658D c21658d) {
        if (c21658d.m22024V()) {
            return ((C21709o0) this.f62330o0).remove(c21658d);
        }
        AbstractC8111i5.m8592c("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: h */
    public void mo1007h(C18792h c18792h, IOException iOException) {
        try {
            ((InterfaceC20062f) this.f62329Z).mo3626s((C20077u) this.f62330o0, iOException);
        } catch (Throwable th2) {
            AbstractC20056V.m20889o(th2);
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public Object m20644i(Object obj, C17859l c17859l, AbstractC9154J3 abstractC9154J3, String str) {
        if (abstractC9154J3 instanceof C17864q) {
            if (obj == null) {
                throw new IllegalStateException("Check failed.");
            }
            abstractC9154J3 = ((C17864q) abstractC9154J3).f56957a;
        } else if (obj == null) {
            return null;
        }
        if (!(abstractC9154J3 instanceof C17862o)) {
            if (!(abstractC9154J3 instanceof AbstractC17863p)) {
                return obj;
            }
            AbstractC17863p abstractC17863p = (AbstractC17863p) abstractC9154J3;
            AbstractC16544l.m18094g(abstractC17863p, "<this>");
            if (!(abstractC17863p instanceof C17847O) && !(abstractC17863p instanceof C17836D) && !(abstractC17863p instanceof C17840H)) {
                return obj;
            }
            if (!(obj instanceof Map)) {
                throw new IllegalStateException("Check failed.");
            }
            Map obj2 = (Map) obj;
            AbstractC16544l.m18094g(obj2, "obj");
            AbstractC9154J3 abstractC9154J4 = c17859l.f56948b;
            AbstractC17863p abstractC17863pMo9703b = abstractC9154J4.mo9703b();
            AbstractC16544l.m18094g(abstractC17863pMo9703b, "<this>");
            if (abstractC17863pMo9703b instanceof C17836D) {
            } else if (abstractC17863pMo9703b instanceof C17840H) {
            }
            return m20641d(str, abstractC9154J4.mo9703b().f56956a, obj2, c17859l.f56951e);
        }
        if (!(obj instanceof List)) {
            throw new IllegalStateException("Check failed.");
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        int i10 = 0;
        for (Object obj3 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            AbstractC9154J3 abstractC9154J5 = ((C17862o) abstractC9154J3).f56955a;
            String strValueOf = String.valueOf(i10);
            if (str != null) {
                strValueOf = str + '.' + strValueOf;
            }
            arrayList.add(m20644i(obj3, c17859l, abstractC9154J5, strValueOf));
            i10 = i11;
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f62328Y) {
            case 3:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f62330o0.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f62329Z;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 6:
                return ((C21709o0) this.f62330o0).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C19665d(Object obj) {
        this.f62328Y = 3;
        this.f62330o0 = obj;
        this.f62329Z = new ArrayList();
    }

    public C19665d(Set initialValue) {
        this.f62328Y = 0;
        AbstractC16544l.m18094g(initialValue, "initialValue");
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(initialValue);
        this.f62329Z = c2153q0M3204c;
        this.f62330o0 = new C2146N(c2153q0M3204c, 0);
    }

    public C19665d(C14438g c14438g, String rootKey, C20463c c20463c) {
        this.f62328Y = 4;
        AbstractC16544l.m18094g(rootKey, "rootKey");
        this.f62329Z = c14438g;
        this.f62330o0 = new LinkedHashMap();
    }

    public C19665d(int i10) {
        this.f62328Y = i10;
        switch (i10) {
            case 6:
                this.f62329Z = AbstractC9227W.m9799b(EnumC17307j.f55134Z, C21696i.f68865o0);
                this.f62330o0 = new C21709o0(new C21685c0(1));
                break;
            case 7:
                this.f62329Z = new HashMap();
                break;
            default:
                this.f62329Z = new LinkedHashMap();
                this.f62330o0 = new LinkedHashMap();
                break;
        }
    }
}
