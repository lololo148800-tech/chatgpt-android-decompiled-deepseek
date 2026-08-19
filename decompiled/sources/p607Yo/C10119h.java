package p607Yo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p584Xo.C9538a;
import p588Y2.C9642z;
import p690cp.AbstractC12933s;
import p690cp.C12913D;
import p690cp.C12916b;
import p690cp.C12921g;
import p690cp.C12924j;
import p690cp.C12926l;
import p690cp.C12927m;
import p690cp.C12930p;
import p690cp.C12938x;
import p690cp.C12940z;
import p712dp.C13186b;
import p712dp.C13191g;
import p756fp.AbstractC13719a;
import p756fp.InterfaceC13720b;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p911o0.AbstractC17792x;
import p960q9.C18655i;

/* JADX INFO: renamed from: Yo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10119h {

    /* JADX INFO: renamed from: u */
    public static final LinkedHashSet f29967u;

    /* JADX INFO: renamed from: v */
    public static final Map f29968v;

    /* JADX INFO: renamed from: a */
    public C13191g f29969a;

    /* JADX INFO: renamed from: e */
    public boolean f29973e;

    /* JADX INFO: renamed from: i */
    public boolean f29977i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f29978j;

    /* JADX INFO: renamed from: k */
    public final C13186b f29979k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f29980l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f29981m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f29982n;

    /* JADX INFO: renamed from: o */
    public final HashSet f29983o;

    /* JADX INFO: renamed from: p */
    public final int f29984p;

    /* JADX INFO: renamed from: q */
    public final C10117f f29985q;

    /* JADX INFO: renamed from: s */
    public final ArrayList f29987s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f29988t;

    /* JADX INFO: renamed from: b */
    public int f29970b = -1;

    /* JADX INFO: renamed from: c */
    public int f29971c = 0;

    /* JADX INFO: renamed from: d */
    public int f29972d = 0;

    /* JADX INFO: renamed from: f */
    public int f29974f = 0;

    /* JADX INFO: renamed from: g */
    public int f29975g = 0;

    /* JADX INFO: renamed from: h */
    public int f29976h = 0;

    /* JADX INFO: renamed from: r */
    public final C9642z f29986r = new C9642z(1, (byte) 0);

    static {
        int i10 = 4;
        int i11 = 3;
        int i12 = 2;
        int i13 = 1;
        Object[] objArr = {C12916b.class, C12926l.class, C12924j.class, C12927m.class, C12913D.class, AbstractC12933s.class, C12930p.class};
        ArrayList arrayList = new ArrayList(7);
        int i14 = 0;
        for (int i15 = 7; i14 < i15; i15 = 7) {
            Object obj = objArr[i14];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            i14++;
        }
        f29967u = new LinkedHashSet(DesugarCollections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(C12916b.class, new C9538a(i13));
        map.put(C12926l.class, new C9538a(i11));
        map.put(C12924j.class, new C9538a(i12));
        map.put(C12927m.class, new C9538a(i10));
        map.put(C12913D.class, new C9538a(7));
        map.put(AbstractC12933s.class, new C9538a(6));
        map.put(C12930p.class, new C9538a(5));
        f29968v = DesugarCollections.unmodifiableMap(map);
    }

    public C10119h(ArrayList arrayList, C13186b c13186b, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, int i10) {
        ArrayList arrayList5 = new ArrayList();
        this.f29987s = arrayList5;
        this.f29988t = new ArrayList();
        this.f29978j = arrayList;
        this.f29979k = c13186b;
        this.f29980l = arrayList2;
        this.f29981m = arrayList3;
        this.f29982n = arrayList4;
        this.f29983o = hashSet;
        this.f29984p = i10;
        C10117f c10117f = new C10117f(0);
        this.f29985q = c10117f;
        arrayList5.add(new C10118g(c10117f, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m10702a(C10118g c10118g) {
        while (true) {
            AbstractC13719a abstractC13719aM10709h = m10709h();
            AbstractC13719a abstractC13719a = c10118g.f29965a;
            if (abstractC13719aM10709h.mo10700c(abstractC13719a.mo7966f())) {
                m10709h().mo7966f().m14593c(abstractC13719a.mo7966f());
                this.f29987s.add(c10118g);
                return;
            }
            m10707f(1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10703b(AbstractC13719a abstractC13719a) {
        for (C12921g c12921g : abstractC13719a.mo10724g()) {
            C9642z c9642z = this.f29986r;
            c9642z.getClass();
            Class cls = c12921g.f41071a;
            HashMap map = (HashMap) c9642z.f29064Z;
            C12921g c12921g2 = (C12921g) map.get(cls);
            if (c12921g2 == null) {
                map.put(c12921g.f41071a, c12921g);
            } else {
                for (Map.Entry entry : c12921g.f41072b.entrySet()) {
                    p817j$.util.Map.EL.putIfAbsent(c12921g2.f41072b, (String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10704c() {
        CharSequence charSequenceSubSequence;
        int i10;
        C12940z c12940z;
        int i11;
        if (this.f29973e) {
            int i12 = this.f29971c + 1;
            CharSequence charSequence = this.f29969a.f41860a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i12, charSequence.length());
            int i13 = 4 - (this.f29972d % 4);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + i13);
            for (int i14 = 0; i14 < i13; i14++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            int i15 = this.f29971c;
            if (i15 == 0) {
                charSequenceSubSequence = this.f29969a.f41860a;
            } else {
                CharSequence charSequence2 = this.f29969a.f41860a;
                charSequenceSubSequence = charSequence2.subSequence(i15, charSequence2.length());
            }
        }
        m10709h().mo7964a(new C13191g(charSequenceSubSequence, (this.f29984p != 3 || (i10 = this.f29971c) >= (i11 = (c12940z = this.f29969a.f41861b).f41106d)) ? null : c12940z.m14600a(i10, i11)));
        m10705d();
    }

    /* JADX INFO: renamed from: d */
    public final void m10705d() {
        int i10 = 1;
        if (this.f29984p == 1) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f29987s;
            if (i10 >= arrayList.size()) {
                return;
            }
            C10118g c10118g = (C10118g) arrayList.get(i10);
            int iMin = Math.min(c10118g.f29966b, this.f29971c);
            if (this.f29969a.f41860a.length() - iMin != 0) {
                C12940z c12940z = this.f29969a.f41861b;
                c10118g.f29965a.mo10723b(c12940z.m14600a(iMin, c12940z.f41106d));
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10706e() {
        char cCharAt = this.f29969a.f41860a.charAt(this.f29971c);
        this.f29971c++;
        if (cCharAt != '\t') {
            this.f29972d++;
        } else {
            int i10 = this.f29972d;
            this.f29972d = (4 - (i10 % 4)) + i10;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10707f(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList = this.f29987s;
            AbstractC13719a abstractC13719a = ((C10118g) arrayList.remove(arrayList.size() - 1)).f29965a;
            m10703b(abstractC13719a);
            abstractC13719a.mo7965e();
            this.f29988t.add(abstractC13719a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10708g() {
        int i10 = this.f29971c;
        int i11 = this.f29972d;
        this.f29977i = true;
        int length = this.f29969a.f41860a.length();
        while (i10 < length) {
            char cCharAt = this.f29969a.f41860a.charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f29977i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f29974f = i10;
        this.f29975g = i11;
        this.f29976h = i11 - this.f29972d;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC13719a m10709h() {
        return ((C10118g) AbstractC17792x.m19532o(1, this.f29987s)).f29965a;
    }

    /* JADX INFO: renamed from: i */
    public final void m10710i(int i10, String str) {
        ArrayList arrayList;
        C10114c c10114cMo7774a;
        List listM14594e;
        this.f29970b++;
        this.f29971c = 0;
        this.f29972d = 0;
        this.f29973e = false;
        if (str.indexOf(0) != -1) {
            str = str.replace((char) 0, (char) 65533);
        }
        this.f29969a = new C13191g(str, this.f29984p != 1 ? new C12940z(this.f29970b, 0, i10, str.length()) : null);
        int i11 = 1;
        int i12 = 1;
        while (true) {
            arrayList = this.f29987s;
            if (i11 >= arrayList.size()) {
                break;
            }
            C10118g c10118g = (C10118g) arrayList.get(i11);
            AbstractC13719a abstractC13719a = c10118g.f29965a;
            m10708g();
            C10112a c10112aMo7967j = abstractC13719a.mo7967j(this);
            if (!(c10112aMo7967j instanceof C10112a)) {
                break;
            }
            c10118g.f29966b = this.f29971c;
            if (c10112aMo7967j.f29941c) {
                m10705d();
                m10707f(arrayList.size() - i11);
                return;
            }
            int i13 = c10112aMo7967j.f29939a;
            if (i13 != -1) {
                m10712k(i13);
            } else {
                int i14 = c10112aMo7967j.f29940b;
                if (i14 != -1) {
                    m10711j(i14);
                }
            }
            i12++;
            i11++;
        }
        int size = arrayList.size() - i12;
        abstractC13719a = ((C10118g) arrayList.get(i12 - 1)).f29965a;
        int i15 = this.f29971c;
        boolean zMo10701h = (abstractC13719a.mo7966f() instanceof C12938x) || abstractC13719a.mo10701h();
        boolean z6 = false;
        while (zMo10701h) {
            i15 = this.f29971c;
            m10708g();
            if (this.f29977i || (this.f29976h < 4 && Character.isLetter(Character.codePointAt(this.f29969a.f41860a, this.f29974f)))) {
                m10712k(this.f29974f);
                break;
            }
            C18655i c18655i = new C18655i(abstractC13719a, 22);
            Iterator it = this.f29978j.iterator();
            do {
                if (!it.hasNext()) {
                    c10114cMo7774a = null;
                    break;
                }
                c10114cMo7774a = ((InterfaceC13720b) it.next()).mo7774a(this, c18655i);
            } while (!(c10114cMo7774a instanceof C10114c));
            if (c10114cMo7774a == null) {
                m10712k(this.f29974f);
                break;
            }
            int i16 = this.f29971c;
            if (size > 0) {
                m10707f(size);
                size = 0;
            }
            int i17 = c10114cMo7774a.f29944b;
            if (i17 != -1) {
                m10712k(i17);
            } else {
                int i18 = c10114cMo7774a.f29945c;
                if (i18 != -1) {
                    m10711j(i18);
                }
            }
            if (c10114cMo7774a.f29946d) {
                AbstractC13719a abstractC13719a2 = ((C10118g) arrayList.remove(arrayList.size() - 1)).f29965a;
                if (abstractC13719a2 instanceof C10129r) {
                    m10703b((C10129r) abstractC13719a2);
                }
                abstractC13719a2.mo7965e();
                abstractC13719a2.mo7966f().m14598k();
                listM14594e = abstractC13719a2.mo7966f().m14594e();
            } else {
                listM14594e = null;
            }
            for (AbstractC13719a abstractC13719a3 : c10114cMo7774a.f29943a) {
                m10702a(new C10118g(abstractC13719a3, i16));
                if (listM14594e != null) {
                    abstractC13719a3.mo7966f().m14597i(listM14594e);
                }
                zMo10701h = abstractC13719a3.mo10701h();
            }
            z6 = true;
        }
        if (!z6 && !this.f29977i && m10709h().mo10034d()) {
            ((C10118g) AbstractC17792x.m19532o(1, arrayList)).f29966b = i15;
            m10704c();
            return;
        }
        if (size > 0) {
            m10707f(size);
        }
        if (!abstractC13719a3.mo10701h()) {
            m10704c();
        } else if (this.f29977i) {
            m10705d();
        } else {
            m10702a(new C10118g(new C10129r(), i15));
            m10704c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10711j(int i10) {
        int i11;
        int i12 = this.f29975g;
        if (i10 >= i12) {
            this.f29971c = this.f29974f;
            this.f29972d = i12;
        }
        int length = this.f29969a.f41860a.length();
        while (true) {
            i11 = this.f29972d;
            if (i11 >= i10 || this.f29971c == length) {
                break;
            } else {
                m10706e();
            }
        }
        if (i11 <= i10) {
            this.f29973e = false;
            return;
        }
        this.f29971c--;
        this.f29972d = i10;
        this.f29973e = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m10712k(int i10) {
        int i11 = this.f29974f;
        if (i10 >= i11) {
            this.f29971c = i11;
            this.f29972d = this.f29975g;
        }
        int length = this.f29969a.f41860a.length();
        while (true) {
            int i12 = this.f29971c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                m10706e();
            }
        }
        this.f29973e = false;
    }
}
