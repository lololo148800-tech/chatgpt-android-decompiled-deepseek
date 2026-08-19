package p228J;

import android.graphics.Rect;
import bb.AbstractC11278C;
import bb.C11294T;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p057C3.C1525C;
import p057C3.C1526D;
import p057C3.C1528F;
import p057C3.C1545X;
import p057C3.C1547Z;
import p057C3.C1557e0;
import p1016t3.AbstractC19764N;
import p1016t3.C19763M;
import p1016t3.C19797x;
import p1057v6.C20461a;
import p1057v6.C20468h;
import p1073w3.AbstractC20817s;
import p1122y6.C21391b;
import p129En.C2585E;
import p178H.C3179x;
import p178H.InterfaceC3122O;
import p232J3.AbstractC4226a;
import p232J3.C4222W;
import p248Jk.InterfaceC4478i;
import p556Wk.C8919d0;
import p593Y8.C9683j;
import p658b5.C11238i;
import p660b6.InterfaceC11253e;
import p747fb.InterfaceFutureC13608b;
import p749fd.C13628m;
import p802i6.C14935a;
import p817j$.util.DesugarCollections;
import p825j5.C16127d;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17677k;
import sl.C19673h;
import sl.InterfaceC19682q;
import sl.InterfaceC19683r;

/* JADX INFO: renamed from: J.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3812N implements InterfaceC3864u, InterfaceC11253e, InterfaceC19683r {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11538Y;

    /* JADX INFO: renamed from: Z */
    public Object f11539Z;

    public /* synthetic */ AbstractC3812N(char c9, int i10) {
        this.f11538Y = i10;
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo4512A();

    /* JADX INFO: renamed from: B */
    public C19797x m4513B() {
        C1526D c1526d = (C1526D) this;
        AbstractC19764N abstractC19764NM2239Y = c1526d.m2239Y();
        if (abstractC19764NM2239Y.m20728p()) {
            return null;
        }
        return abstractC19764NM2239Y.mo2411m(c1526d.m2236V(), (C19763M) this.f11539Z, 0L).f62588c;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: C */
    public void mo295C(InterfaceC3805H interfaceC3805H) {
        ((InterfaceC3864u) this.f11539Z).mo295C(interfaceC3805H);
    }

    /* JADX INFO: renamed from: D */
    public abstract List mo4514D();

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: E */
    public void mo296E(C3857q0 c3857q0) {
        ((InterfaceC3864u) this.f11539Z).mo296E(c3857q0);
    }

    /* JADX INFO: renamed from: F */
    public abstract List mo4515F();

    /* JADX INFO: renamed from: G */
    public abstract C20468h mo4516G(String str, C20461a c20461a);

    /* JADX INFO: renamed from: H */
    public abstract Collection mo4517H(Collection collection, C20461a c20461a);

    /* JADX INFO: renamed from: I */
    public abstract Set mo4518I(Collection collection, C20461a c20461a);

    /* JADX INFO: renamed from: J */
    public void m4519J(int i10, InterfaceC1436k interfaceC1436k) {
        C9683j c9683j = (C9683j) this.f11539Z;
        C16127d c16127d = (C16127d) ((ThreadLocal) c9683j.f29194p0).get();
        if (c16127d != null) {
            if (c16127d.f50044d.add(Integer.valueOf(i10))) {
                interfaceC1436k.invoke(new C13628m(c16127d, 4));
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            interfaceC1436k.invoke(new C13628m(linkedHashSet, 5));
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            c9683j.m10274T((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* JADX INFO: renamed from: K */
    public void m4520K(C16127d transaction, C16127d c16127d, Throwable th2, Object obj) throws Throwable {
        AbstractC16544l.m18094g(transaction, "transaction");
        LinkedHashSet linkedHashSet = transaction.f50044d;
        ArrayList arrayList = transaction.f50043c;
        ArrayList arrayList2 = transaction.f50042b;
        LinkedHashSet linkedHashSet2 = transaction.f50045e;
        boolean z6 = false;
        if (c16127d != null) {
            if (transaction.f50046f && transaction.f50047g) {
                z6 = true;
            }
            c16127d.f50047g = z6;
            c16127d.f50042b.addAll(arrayList2);
            c16127d.f50043c.addAll(arrayList);
            c16127d.f50044d.addAll(linkedHashSet);
            c16127d.f50045e.addAll(linkedHashSet2);
        } else if (transaction.f50046f && transaction.f50047g) {
            if (!linkedHashSet2.isEmpty()) {
                String[] strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                ((C9683j) this.f11539Z).m10274T((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            linkedHashSet2.clear();
            linkedHashSet.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((InterfaceC1426a) it.next()).invoke();
            }
            arrayList2.clear();
        } else {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1426a) it2.next()).invoke();
                }
                arrayList.clear();
            } catch (Throwable th3) {
                if (th2 == null) {
                    throw th3;
                }
                throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th2 + "\nwith cause " + th2.getCause() + "\n\nRollback exception: " + th3, th3);
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m4521L(Serializable serializable, InterfaceC4478i interfaceC4478i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11539Z;
        if (interfaceC4478i == null) {
            throw new NullPointerException("provider");
        }
        linkedHashMap.put(serializable, interfaceC4478i);
    }

    /* JADX INFO: renamed from: M */
    public void m4522M(String str, String value) {
        AbstractC16544l.m18094g(value, "value");
        mo4525P(value);
        List listM4537v = m4537v(str);
        listM4537v.clear();
        listM4537v.add(value);
    }

    /* JADX INFO: renamed from: N */
    public void m4523N(C19797x c19797x) {
        C11294T c11294tM12695y = AbstractC11278C.m12695y(c19797x);
        C1526D c1526d = (C1526D) this;
        c1526d.m2256q0();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c11294tM12695y.f34187p0; i10++) {
            arrayList.add(c1526d.f4054D0.mo4959b((C19797x) c11294tM12695y.get(i10)));
        }
        c1526d.m2256q0();
        c1526d.m2240Z(c1526d.f4087k1);
        c1526d.m2237W();
        c1526d.f4066P0++;
        ArrayList arrayList2 = c1526d.f4052B0;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                arrayList2.remove(i11);
            }
            C4222W c4222w = c1526d.f4070T0;
            int[] iArr = c4222w.f13794b;
            int[] iArr2 = new int[iArr.length - size];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 < 0 || i14 >= size) {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= size;
                    }
                    iArr2[i15] = i14;
                } else {
                    i12++;
                }
            }
            c1526d.f4070T0 = new C4222W(iArr2, new Random(c4222w.f13793a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            C1545X c1545x = new C1545X((AbstractC4226a) arrayList.get(i16), c1526d.f4053C0);
            arrayList3.add(c1545x);
            arrayList2.add(i16, new C1525C(c1545x.f4233b, c1545x.f4232a));
        }
        c1526d.f4070T0 = c1526d.f4070T0.m4987a(arrayList3.size());
        C1557e0 c1557e0 = new C1557e0(arrayList2, c1526d.f4070T0);
        boolean zM20728p = c1557e0.m20728p();
        int i17 = c1557e0.f4326d;
        if (!zM20728p && -1 >= i17) {
            throw new C8919d0();
        }
        int iMo2412a = c1557e0.mo2412a(false);
        C1547Z c1547zM2244e0 = c1526d.m2244e0(c1526d.f4087k1, c1557e0, c1526d.m2245f0(c1557e0, iMo2412a, -9223372036854775807L));
        int i18 = c1547zM2244e0.f4254e;
        if (iMo2412a != -1 && i18 != 1) {
            i18 = (c1557e0.m20728p() || iMo2412a >= i17) ? 4 : 2;
        }
        C1547Z c1547zM2378f = c1547zM2244e0.m2378f(i18);
        c1526d.f4099x0.f4161t0.m21376a(17, new C1528F(arrayList3, c1526d.f4070T0, iMo2412a, AbstractC20817s.m21390D(-9223372036854775807L))).m21374b();
        c1526d.m2254o0(c1547zM2378f, 0, (c1526d.f4087k1.f4251b.f13895a.equals(c1547zM2378f.f4251b.f13895a) || c1526d.f4087k1.f4250a.m20728p()) ? false : true, 4, c1526d.m2238X(c1547zM2378f), -1);
    }

    /* JADX INFO: renamed from: O */
    public void mo4524O(String name) {
        AbstractC16544l.m18094g(name, "name");
    }

    /* JADX INFO: renamed from: P */
    public void mo4525P(String value) {
        AbstractC16544l.m18094g(value, "value");
    }

    @Override // sl.InterfaceC19683r
    /* JADX INFO: renamed from: a */
    public Set mo4526a() {
        Set setEntrySet = ((Map) this.f11539Z).entrySet();
        AbstractC16544l.m18094g(setEntrySet, "<this>");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        AbstractC16544l.m18093f(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @Override // sl.InterfaceC19683r
    /* JADX INFO: renamed from: b */
    public Set mo4527b() {
        return ((Map) this.f11539Z).keySet();
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC13608b mo299c(boolean z6) {
        return ((InterfaceC3864u) this.f11539Z).mo299c(z6);
    }

    @Override // sl.InterfaceC19683r
    /* JADX INFO: renamed from: d */
    public List mo4528d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return (List) ((Map) this.f11539Z).get(name);
    }

    /* JADX INFO: renamed from: e */
    public void m4529e(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        mo4525P(value);
        m4537v(name).add(value);
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC13608b mo302f(C3179x c3179x) {
        return ((InterfaceC3864u) this.f11539Z).mo302f(c3179x);
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: g */
    public InterfaceFutureC13608b mo303g(float f10) {
        return ((InterfaceC3864u) this.f11539Z).mo303g(f10);
    }

    /* JADX INFO: renamed from: h */
    public void m4530h(InterfaceC19682q stringValues) {
        AbstractC16544l.m18094g(stringValues, "stringValues");
        stringValues.mo7980e(new C2585E(this, 4));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo4531i(C11238i c11238i);

    @Override // p660b6.InterfaceC11253e
    public boolean isStatic() {
        List list = (List) this.f11539Z;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((C14935a) list.get(0)).m16097c();
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: j */
    public Rect mo305j() {
        return ((InterfaceC3864u) this.f11539Z).mo305j();
    }

    /* JADX INFO: renamed from: k */
    public void m4532k() {
        ((Map) this.f11539Z).clear();
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: l */
    public void mo307l(int i10) {
        ((InterfaceC3864u) this.f11539Z).mo307l(i10);
    }

    @Override // sl.InterfaceC19683r
    /* JADX INFO: renamed from: m */
    public void mo4533m(String name, Iterable values) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(values, "values");
        List listM4537v = m4537v(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            mo4525P((String) it.next());
        }
        AbstractC17686t.m19398v(values, listM4537v);
    }

    /* JADX INFO: renamed from: n */
    public abstract AbstractC3812N mo4534n();

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC13608b mo308o(ArrayList arrayList, int i10, int i11) {
        return ((InterfaceC3864u) this.f11539Z).mo308o(arrayList, i10, i11);
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: q */
    public InterfaceFutureC13608b mo310q(int i10, int i11) {
        return ((InterfaceC3864u) this.f11539Z).mo310q(i10, i11);
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: r */
    public InterfaceC3805H mo311r() {
        return ((InterfaceC3864u) this.f11539Z).mo311r();
    }

    /* JADX INFO: renamed from: s */
    public abstract Object mo4535s(Object obj);

    /* JADX INFO: renamed from: t */
    public AbstractC3812N m4536t() {
        C21391b c21391b = (C21391b) this.f11539Z;
        if (c21391b == null) {
            return mo4534n();
        }
        AbstractC3812N abstractC3812NMo4534n = mo4534n();
        AbstractC3812N cache = c21391b.m4536t();
        AbstractC16544l.m18094g(cache, "cache");
        AbstractC3812N abstractC3812N = abstractC3812NMo4534n;
        while (true) {
            AbstractC3812N abstractC3812N2 = (AbstractC3812N) abstractC3812N.f11539Z;
            if (abstractC3812N2 == null) {
                abstractC3812N.f11539Z = cache;
                return abstractC3812NMo4534n;
            }
            abstractC3812N = abstractC3812N2;
        }
    }

    public String toString() {
        switch (this.f11538Y) {
            case 6:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f11539Z;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: u */
    public void mo314u(InterfaceC3122O interfaceC3122O) {
        ((InterfaceC3864u) this.f11539Z).mo314u(interfaceC3122O);
    }

    /* JADX INFO: renamed from: v */
    public List m4537v(String str) {
        Map map = (Map) this.f11539Z;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo4524O(str);
        map.put(str, arrayList);
        return arrayList;
    }

    @Override // p660b6.InterfaceC11253e
    /* JADX INFO: renamed from: w */
    public List mo4538w() {
        return (List) this.f11539Z;
    }

    @Override // p228J.InterfaceC3864u
    /* JADX INFO: renamed from: x */
    public void mo315x() {
        ((InterfaceC3864u) this.f11539Z).mo315x();
    }

    /* JADX INFO: renamed from: y */
    public Object m4539y(Object obj) {
        synchronized (((HashMap) this.f11539Z)) {
            try {
                if (((HashMap) this.f11539Z).containsKey(obj)) {
                    return ((HashMap) this.f11539Z).get(obj);
                }
                Object objMo4535s = mo4535s(obj);
                ((HashMap) this.f11539Z).put(obj, objMo4535s);
                return objMo4535s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public String m4540z(String str) {
        List listMo4528d = mo4528d(str);
        if (listMo4528d != null) {
            return (String) AbstractC17680n.m19343S(listMo4528d);
        }
        return null;
    }

    public /* synthetic */ AbstractC3812N(Object obj, int i10) {
        this.f11538Y = i10;
        this.f11539Z = obj;
    }

    public AbstractC3812N(int i10, byte b) {
        this.f11538Y = i10;
        switch (i10) {
            case 4:
                this.f11539Z = new HashMap();
                break;
            case 7:
                this.f11539Z = new C17677k();
                break;
            case 11:
                this.f11539Z = new C19763M();
                break;
            default:
                List<String> listM19382k = AbstractC17681o.m19382k("http", "https");
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19382k, 10));
                for (String str : listM19382k) {
                    List listM19382k2 = AbstractC17681o.m19382k("www.chatgpt.com", "chatgpt.com", "chat.com", "www.chat.com", "chat.openai.com");
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listM19382k2, 10));
                    Iterator it = listM19382k2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(str + "://" + ((String) it.next()));
                    }
                    arrayList.add(arrayList2);
                }
                this.f11539Z = AbstractC17682p.m19390s(arrayList);
                break;
        }
    }

    public AbstractC3812N(int i10, int i11) {
        this.f11538Y = i11;
        switch (i11) {
            case 10:
                this.f11539Z = new C19673h();
                break;
            default:
                this.f11539Z = new LinkedHashMap(i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
                break;
        }
    }

    public AbstractC3812N(C9683j driver) {
        this.f11538Y = 8;
        AbstractC16544l.m18094g(driver, "driver");
        this.f11539Z = driver;
    }
}
