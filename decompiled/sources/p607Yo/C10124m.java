package p607Yo;

import android.gov.nist.core.Separators;
import gp.InterfaceC14208a;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p030B2.C0781s;
import p117Eb.C2392v;
import p228J.C3847l0;
import p295Lj.C5102b;
import p523V9.AbstractC8031Y3;
import p544W9.AbstractC8495I3;
import p588Y2.C9642z;
import p632Zo.C10430a;
import p632Zo.C10431b;
import p632Zo.C10432c;
import p632Zo.C10433d;
import p632Zo.C10434e;
import p632Zo.C10435f;
import p632Zo.C10436g;
import p632Zo.C10437h;
import p632Zo.C10438i;
import p632Zo.C10439j;
import p667bp.AbstractC11538a;
import p690cp.AbstractC12935u;
import p690cp.C12910A;
import p690cp.C12912C;
import p690cp.C12921g;
import p690cp.C12925k;
import p690cp.C12932r;
import p690cp.C12939y;
import p712dp.C13191g;
import p734ep.C13458b;
import p734ep.InterfaceC13457a;
import p817j$.util.DesugarCollections;
import p817j$.util.Map;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Yo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C10124m {

    /* JADX INFO: renamed from: a */
    public final C2392v f30002a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f30003b;

    /* JADX INFO: renamed from: c */
    public final HashMap f30004c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f30005d;

    /* JADX INFO: renamed from: e */
    public final BitSet f30006e;

    /* JADX INFO: renamed from: f */
    public final BitSet f30007f;

    /* JADX INFO: renamed from: g */
    public HashMap f30008g;

    /* JADX INFO: renamed from: h */
    public C13458b f30009h;

    /* JADX INFO: renamed from: i */
    public boolean f30010i;

    /* JADX INFO: renamed from: j */
    public int f30011j;

    /* JADX INFO: renamed from: k */
    public C10116e f30012k;

    /* JADX INFO: renamed from: l */
    public C10115d f30013l;

    public C10124m(C2392v c2392v) {
        int i10 = 0;
        this.f30002a = c2392v;
        ArrayList arrayList = new ArrayList((ArrayList) c2392v.f7436Z);
        arrayList.add(new C10431b(1));
        arrayList.add(new C10431b(2));
        arrayList.add(new C10431b(3));
        arrayList.add(new C10431b(i10));
        arrayList.add(new C10431b(4));
        this.f30003b = arrayList;
        HashMap map = new HashMap();
        Object[] objArr = {new C10430a('*'), new C10430a('_')};
        ArrayList arrayList2 = new ArrayList(2);
        while (i10 < 2) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            i10++;
        }
        m10714b(DesugarCollections.unmodifiableList(arrayList2), map);
        m10714b((ArrayList) c2392v.f7437o0, map);
        this.f30004c = map;
        ArrayList arrayList3 = new ArrayList((ArrayList) c2392v.f7438p0);
        arrayList3.add(new C10435f());
        this.f30005d = arrayList3;
        BitSet bitSet = new BitSet();
        Iterator it = ((HashSet) c2392v.f7439q0).iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f30007f = bitSet;
        Set setKeySet = this.f30004c.keySet();
        ArrayList arrayList4 = this.f30003b;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C10431b) it3.next()).m10915a().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f30006e = bitSet2;
    }

    /* JADX INFO: renamed from: a */
    public static void m10713a(char c9, InterfaceC14208a interfaceC14208a, HashMap map) {
        if (((InterfaceC14208a) map.put(Character.valueOf(c9), interfaceC14208a)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c9 + Separators.QUOTE);
    }

    /* JADX INFO: renamed from: b */
    public static void m10714b(List list, HashMap map) {
        C10130s c10130s;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC14208a interfaceC14208a = (InterfaceC14208a) it.next();
            char cMo8904d = interfaceC14208a.mo8904d();
            char cMo8901a = interfaceC14208a.mo8901a();
            if (cMo8904d == cMo8901a) {
                InterfaceC14208a interfaceC14208a2 = (InterfaceC14208a) map.get(Character.valueOf(cMo8904d));
                if (interfaceC14208a2 == null || interfaceC14208a2.mo8904d() != interfaceC14208a2.mo8901a()) {
                    m10713a(cMo8904d, interfaceC14208a, map);
                } else {
                    if (interfaceC14208a2 instanceof C10130s) {
                        c10130s = (C10130s) interfaceC14208a2;
                    } else {
                        C10130s c10130s2 = new C10130s(cMo8904d);
                        c10130s2.m10725e(interfaceC14208a2);
                        c10130s = c10130s2;
                    }
                    c10130s.m10725e(interfaceC14208a);
                    map.put(Character.valueOf(cMo8904d), c10130s);
                }
            } else {
                m10713a(cMo8904d, interfaceC14208a, map);
                m10713a(cMo8901a, interfaceC14208a, map);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static C12912C m10715i(C3847l0 c3847l0) {
        C12912C c12912c = new C12912C(c3847l0.m4580g());
        c12912c.m14597i(c3847l0.m4581h());
        return c12912c;
    }

    /* JADX INFO: renamed from: c */
    public final void m10716c(AbstractC12935u abstractC12935u) {
        AbstractC12935u abstractC12935u2 = abstractC12935u.f41093b;
        if (abstractC12935u2 == null) {
            return;
        }
        AbstractC12935u abstractC12935u3 = abstractC12935u.f41094c;
        C12912C c12912c = null;
        C12912C c12912c2 = null;
        int length = 0;
        while (abstractC12935u2 != null) {
            if (abstractC12935u2 instanceof C12912C) {
                c12912c2 = (C12912C) abstractC12935u2;
                if (c12912c == null) {
                    c12912c = c12912c2;
                }
                length = c12912c2.f41068g.length() + length;
            } else {
                m10717d(c12912c, c12912c2, length);
                m10716c(abstractC12935u2);
                c12912c = null;
                c12912c2 = null;
                length = 0;
            }
            if (abstractC12935u2 == abstractC12935u3) {
                break;
            } else {
                abstractC12935u2 = abstractC12935u2.f41096e;
            }
        }
        m10717d(c12912c, c12912c2, length);
    }

    /* JADX INFO: renamed from: d */
    public final void m10717d(C12912C c12912c, C12912C c12912c2, int i10) {
        C12910A c12910a;
        if (c12912c == null || c12912c2 == null || c12912c == c12912c2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(c12912c.f41068g);
        if (this.f30010i) {
            c12910a = new C12910A();
            c12910a.m14586a(c12912c.m14594e());
        } else {
            c12910a = null;
        }
        AbstractC12935u abstractC12935u = c12912c.f41096e;
        AbstractC12935u abstractC12935u2 = c12912c2.f41096e;
        while (abstractC12935u != abstractC12935u2) {
            sb2.append(((C12912C) abstractC12935u).f41068g);
            if (c12910a != null) {
                c12910a.m14586a(abstractC12935u.m14594e());
            }
            AbstractC12935u abstractC12935u3 = abstractC12935u.f41096e;
            abstractC12935u.m14598k();
            abstractC12935u = abstractC12935u3;
        }
        c12912c.f41068g = sb2.toString();
        if (c12910a != null) {
            List listEmptyList = c12910a.f41066a;
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            c12912c.m14597i(listEmptyList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0296  */
    /* JADX WARN: Code duplicated, block: B:104:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02da  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x02de  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0314  */
    /* JADX WARN: Code duplicated, block: B:159:0x031b  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f1 A[PHI: r8
      0x03f1: PHI (r8v42 char) = (r8v41 char), (r8v43 char), (r8v44 char) binds: [B:185:0x03e7, B:187:0x03eb, B:190:0x03f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:196:0x0401  */
    /* JADX WARN: Code duplicated, block: B:209:0x045d  */
    /* JADX WARN: Code duplicated, block: B:309:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:43:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0150  */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad A[LOOP:5: B:46:0x015a->B:56:0x01ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0212  */
    /* JADX WARN: Code duplicated, block: B:77:0x0224 A[LOOP:6: B:75:0x021c->B:77:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0244  */
    /* JADX WARN: Code duplicated, block: B:82:0x0254  */
    /* JADX WARN: Code duplicated, block: B:86:0x026b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x027e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0281  */
    /* JADX WARN: Code duplicated, block: B:96:0x028a  */
    /* JADX WARN: Code duplicated, block: B:98:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r8v76, types: [Lj.b] */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX INFO: renamed from: e */
    public final void m10718e(C3847l0 c3847l0, AbstractC12935u abstractC12935u) {
        int i10;
        int i11;
        ?? UnmodifiableList;
        List listUnmodifiableList;
        String str;
        C2392v c2392v;
        C10438i c10438iM10917a;
        AbstractC12935u abstractC12935u2;
        C0781s c0781s;
        AbstractC12935u abstractC12935uM10715i;
        String strM4580g;
        String strM12930c;
        String strM12930c2;
        List list;
        InterfaceC14208a interfaceC14208a;
        Object objUnmodifiableList;
        C13458b c13458b;
        int i12;
        int codePoint;
        C0781s c0781sM14991m;
        ArrayList arrayList;
        C13458b c13458b2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ?? r10;
        ?? r6;
        int i22;
        char cCharAt;
        int i23;
        char cCharAt2;
        ?? c5102b;
        C10116e c10116e;
        C10116e c10116e2;
        char cCharAt3;
        char cCharAt4;
        C0781s c0781sM14991m2;
        Iterator it;
        C10439j c10439jMo10916a;
        AbstractC12935u abstractC12935u3;
        InterfaceC13457a c10432c;
        int i24 = 2;
        int i25 = 0;
        this.f30009h = new C13458b(c3847l0.f11629a);
        this.f30010i = !c3847l0.m4581h().isEmpty();
        this.f30011j = 0;
        C15384c c15384c = null;
        this.f30012k = null;
        this.f30013l = null;
        HashMap map = new HashMap();
        for (C10431b c10431b : this.f30003b) {
            switch (c10431b.f30904a) {
                case 0:
                    c10432c = new C10432c();
                    break;
                case 1:
                    c10432c = new C10433d();
                    break;
                case 2:
                    c10432c = new C10434e();
                    break;
                case 3:
                    c10432c = new C10436g();
                    break;
                default:
                    c10432c = new C10437h();
                    break;
            }
            Iterator it2 = c10431b.m10915a().iterator();
            while (it2.hasNext()) {
                ((List) Map.EL.computeIfAbsent(map, (Character) it2.next(), new C10123l())).add(c10432c);
            }
        }
        this.f30008g = map;
        while (true) {
            char cM14990l = this.f30009h.m14990l();
            if (cM14990l != 0) {
                int codePoint2 = 10;
                if (cM14990l != '\n') {
                    if (cM14990l == '[') {
                        C0781s c0781sM14991m3 = this.f30009h.m14991m();
                        this.f30009h.m14987i();
                        C0781s c0781sM14991m4 = this.f30009h.m14991m();
                        C12912C c12912cM10715i = m10715i(this.f30009h.m14982d(c0781sM14991m3, c0781sM14991m4));
                        C10115d c10115d = this.f30013l;
                        C10115d c10115d2 = new C10115d(null, null, c12912cM10715i, c0781sM14991m3, c0781sM14991m4, c10115d, this.f30012k);
                        if (c10115d != null) {
                            c10115d.f29948b = true;
                        }
                        this.f30013l = c10115d2;
                        Object[] objArr = {c12912cM10715i};
                        ArrayList arrayList2 = new ArrayList(1);
                        Object obj = objArr[0];
                        Objects.requireNonNull(obj);
                        arrayList2.add(obj);
                        listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                    } else if (cM14990l != ']') {
                        if (this.f30007f.get(cM14990l)) {
                            C0781s c0781sM14991m5 = this.f30009h.m14991m();
                            C0781s c0781sM14991m6 = this.f30009h.m14991m();
                            this.f30009h.m14987i();
                            C0781s c0781sM14991m7 = this.f30009h.m14991m();
                            if (this.f30009h.m14988j('[')) {
                                C0781s c0781sM14991m8 = this.f30009h.m14991m();
                                C12912C c12912cM10715i2 = m10715i(this.f30009h.m14982d(c0781sM14991m6, c0781sM14991m7));
                                C12912C c12912cM10715i3 = m10715i(this.f30009h.m14982d(c0781sM14991m7, c0781sM14991m8));
                                C10115d c10115d3 = this.f30013l;
                                C10115d c10115d4 = new C10115d(c12912cM10715i2, c0781sM14991m6, c12912cM10715i3, c0781sM14991m7, c0781sM14991m8, c10115d3, this.f30012k);
                                if (c10115d3 != null) {
                                    c10115d3.f29948b = true;
                                }
                                this.f30013l = c10115d4;
                                Object[] objArr2 = new Object[i24];
                                objArr2[i25] = c12912cM10715i2;
                                objArr2[1] = c12912cM10715i3;
                                ArrayList arrayList3 = new ArrayList(i24);
                                for (int i26 = i25; i26 < i24; i26++) {
                                    Object obj2 = objArr2[i26];
                                    Objects.requireNonNull(obj2);
                                    arrayList3.add(obj2);
                                }
                                objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                            } else {
                                objUnmodifiableList = c15384c;
                            }
                            if (objUnmodifiableList == null) {
                                this.f30009h.m14992n(c0781sM14991m5);
                                if (this.f30006e.get(cM14990l)) {
                                    list = (List) this.f30008g.get(Character.valueOf(cM14990l));
                                    if (list != null) {
                                        c0781sM14991m2 = this.f30009h.m14991m();
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                c10439jMo10916a = ((InterfaceC13457a) it.next()).mo10916a(this);
                                                if (c10439jMo10916a instanceof C10439j) {
                                                    abstractC12935u3 = c10439jMo10916a.f30921a;
                                                    this.f30009h.m14992n(c10439jMo10916a.f30922b);
                                                    if (this.f30010i && abstractC12935u3.m14594e().isEmpty()) {
                                                        C13458b c13458b3 = this.f30009h;
                                                        abstractC12935u3.m14597i(c13458b3.m14982d(c0781sM14991m2, c13458b3.m14991m()).m4581h());
                                                    }
                                                    Object[] objArr3 = new Object[1];
                                                    objArr3[i25] = abstractC12935u3;
                                                    ArrayList arrayList4 = new ArrayList(1);
                                                    Object obj3 = objArr3[i25];
                                                    Objects.requireNonNull(obj3);
                                                    arrayList4.add(obj3);
                                                    objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList4);
                                                } else {
                                                    this.f30009h.m14992n(c0781sM14991m2);
                                                }
                                            } else {
                                                interfaceC14208a = (InterfaceC14208a) this.f30004c.get(Character.valueOf(cM14990l));
                                                if (interfaceC14208a == null) {
                                                    Object[] objArr4 = new Object[1];
                                                    objArr4[i25] = m10719f();
                                                    ArrayList arrayList5 = new ArrayList(1);
                                                    Object obj4 = objArr4[i25];
                                                    Objects.requireNonNull(obj4);
                                                    arrayList5.add(obj4);
                                                    objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList5);
                                                } else {
                                                    c13458b = this.f30009h;
                                                    i12 = c13458b.f42593b;
                                                    if (i12 > 0) {
                                                        int i27 = i12 - 1;
                                                        cCharAt3 = ((C13191g) c13458b.f42596e).f41860a.charAt(i27);
                                                        if (Character.isLowSurrogate(cCharAt3) && i27 > 0) {
                                                            cCharAt4 = ((C13191g) c13458b.f42596e).f41860a.charAt(i12 - i24);
                                                            codePoint = cCharAt3;
                                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                            }
                                                        }
                                                    } else if (c13458b.f42592a > 0) {
                                                        codePoint = 10;
                                                    } else {
                                                        codePoint = i25;
                                                    }
                                                    codePoint = cCharAt3;
                                                    codePoint = cCharAt3;
                                                    c0781sM14991m = this.f30009h.m14991m();
                                                    if (this.f30009h.m14985g(cM14990l) < interfaceC14208a.mo8903c()) {
                                                        this.f30009h.m14992n(c0781sM14991m);
                                                        c5102b = c15384c;
                                                    } else {
                                                        arrayList = new ArrayList();
                                                        this.f30009h.m14992n(c0781sM14991m);
                                                        while (this.f30009h.m14988j(cM14990l)) {
                                                            C13458b c13458b4 = this.f30009h;
                                                            arrayList.add(m10715i(c13458b4.m14982d(c0781sM14991m, c13458b4.m14991m())));
                                                            c0781sM14991m = this.f30009h.m14991m();
                                                        }
                                                        c13458b2 = this.f30009h;
                                                        i13 = c13458b2.f42593b;
                                                        if (i13 < c13458b2.f42594c) {
                                                            cCharAt = ((C13191g) c13458b2.f42596e).f41860a.charAt(i13);
                                                            if (Character.isHighSurrogate(cCharAt) && (i23 = c13458b2.f42593b + 1) < c13458b2.f42594c) {
                                                                cCharAt2 = ((C13191g) c13458b2.f42596e).f41860a.charAt(i23);
                                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                }
                                                            }
                                                        } else if (c13458b2.f42592a >= ((ArrayList) c13458b2.f42595d).size() - 1) {
                                                            codePoint2 = i25;
                                                        }
                                                        if (codePoint != 0 || AbstractC8495I3.m9155c(codePoint)) {
                                                            i14 = 1;
                                                        } else {
                                                            i14 = i25;
                                                        }
                                                        if (codePoint != 0 || AbstractC8495I3.m9156d(codePoint)) {
                                                            i15 = 1;
                                                        } else {
                                                            i15 = i25;
                                                        }
                                                        if (codePoint2 != 0 || AbstractC8495I3.m9155c(codePoint2)) {
                                                            i16 = 1;
                                                        } else {
                                                            i16 = i25;
                                                        }
                                                        if (codePoint2 != 0 || AbstractC8495I3.m9156d(codePoint2)) {
                                                            i17 = 1;
                                                        } else {
                                                            i17 = i25;
                                                        }
                                                        if (i17 == 0 || (i16 != 0 && i15 == 0 && i14 == 0)) {
                                                            i18 = i25;
                                                        } else {
                                                            i18 = 1;
                                                        }
                                                        if (i15 == 0 || (i14 != 0 && i17 == 0 && i16 == 0)) {
                                                            i19 = i25;
                                                        } else {
                                                            i19 = 1;
                                                        }
                                                        if (cM14990l == '_') {
                                                            if (i18 != 0 || (i19 != 0 && i14 == 0)) {
                                                                i22 = i25;
                                                            } else {
                                                                i22 = 1;
                                                            }
                                                            if (i19 != 0 || (i18 != 0 && i16 == 0)) {
                                                                r6 = i25;
                                                                r10 = i22;
                                                            } else {
                                                                r6 = 1;
                                                                r10 = i22;
                                                            }
                                                        } else {
                                                            if (i18 == 0 && cM14990l == interfaceC14208a.mo8904d()) {
                                                                i20 = 1;
                                                            } else {
                                                                i20 = i25;
                                                            }
                                                            if (i19 == 0 && cM14990l == interfaceC14208a.mo8901a()) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = i25;
                                                            }
                                                            r10 = i20;
                                                            r6 = i21;
                                                        }
                                                        c5102b = new C5102b(arrayList, r10, r6);
                                                    }
                                                    if (c5102b == 0) {
                                                        objUnmodifiableList = c15384c;
                                                    } else {
                                                        C10116e c10116e3 = this.f30012k;
                                                        ArrayList arrayList6 = (ArrayList) c5102b.f16679c;
                                                        c10116e = new C10116e(arrayList6, cM14990l, c5102b.f16678b, c5102b.f16677a, c10116e3);
                                                        this.f30012k = c10116e;
                                                        c10116e2 = c10116e.f29961f;
                                                        if (c10116e2 != null) {
                                                            c10116e2.f29962g = c10116e;
                                                        }
                                                        objUnmodifiableList = arrayList6;
                                                    }
                                                    if (objUnmodifiableList == null) {
                                                        Object[] objArr5 = new Object[1];
                                                        objArr5[i25] = m10719f();
                                                        ArrayList arrayList7 = new ArrayList(1);
                                                        Object obj5 = objArr5[i25];
                                                        Objects.requireNonNull(obj5);
                                                        arrayList7.add(obj5);
                                                        objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList7);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        interfaceC14208a = (InterfaceC14208a) this.f30004c.get(Character.valueOf(cM14990l));
                                        if (interfaceC14208a == null) {
                                            Object[] objArr6 = new Object[1];
                                            objArr6[i25] = m10719f();
                                            ArrayList arrayList8 = new ArrayList(1);
                                            Object obj6 = objArr6[i25];
                                            Objects.requireNonNull(obj6);
                                            arrayList8.add(obj6);
                                            objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList8);
                                        } else {
                                            c13458b = this.f30009h;
                                            i12 = c13458b.f42593b;
                                            if (i12 > 0) {
                                                int i28 = i12 - 1;
                                                cCharAt3 = ((C13191g) c13458b.f42596e).f41860a.charAt(i28);
                                                if (Character.isLowSurrogate(cCharAt3)) {
                                                    cCharAt4 = ((C13191g) c13458b.f42596e).f41860a.charAt(i12 - i24);
                                                    codePoint = cCharAt3;
                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                    }
                                                }
                                            } else if (c13458b.f42592a > 0) {
                                                codePoint = 10;
                                            } else {
                                                codePoint = i25;
                                            }
                                            codePoint = cCharAt3;
                                            codePoint = cCharAt3;
                                            c0781sM14991m = this.f30009h.m14991m();
                                            if (this.f30009h.m14985g(cM14990l) < interfaceC14208a.mo8903c()) {
                                                this.f30009h.m14992n(c0781sM14991m);
                                                c5102b = c15384c;
                                            } else {
                                                arrayList = new ArrayList();
                                                this.f30009h.m14992n(c0781sM14991m);
                                                while (this.f30009h.m14988j(cM14990l)) {
                                                    C13458b c13458b5 = this.f30009h;
                                                    arrayList.add(m10715i(c13458b5.m14982d(c0781sM14991m, c13458b5.m14991m())));
                                                    c0781sM14991m = this.f30009h.m14991m();
                                                }
                                                c13458b2 = this.f30009h;
                                                i13 = c13458b2.f42593b;
                                                if (i13 < c13458b2.f42594c) {
                                                    cCharAt = ((C13191g) c13458b2.f42596e).f41860a.charAt(i13);
                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                        cCharAt2 = ((C13191g) c13458b2.f42596e).f41860a.charAt(i23);
                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                        }
                                                    }
                                                } else if (c13458b2.f42592a >= ((ArrayList) c13458b2.f42595d).size() - 1) {
                                                    codePoint2 = i25;
                                                }
                                                if (codePoint != 0) {
                                                    i14 = 1;
                                                } else {
                                                    i14 = 1;
                                                }
                                                if (codePoint != 0) {
                                                    i15 = 1;
                                                } else {
                                                    i15 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i16 = 1;
                                                } else {
                                                    i16 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i17 = 1;
                                                } else {
                                                    i17 = 1;
                                                }
                                                if (i17 == 0) {
                                                    i18 = i25;
                                                } else {
                                                    i18 = i25;
                                                }
                                                if (i15 == 0) {
                                                    i19 = i25;
                                                } else {
                                                    i19 = i25;
                                                }
                                                if (cM14990l == '_') {
                                                    if (i18 != 0) {
                                                        i22 = i25;
                                                    } else {
                                                        i22 = i25;
                                                    }
                                                    if (i19 != 0) {
                                                        r6 = i25;
                                                        r10 = i22;
                                                    } else {
                                                        r6 = i25;
                                                        r10 = i22;
                                                    }
                                                } else {
                                                    if (i18 == 0) {
                                                        i20 = i25;
                                                    } else {
                                                        i20 = i25;
                                                    }
                                                    if (i19 == 0) {
                                                        i21 = i25;
                                                    } else {
                                                        i21 = i25;
                                                    }
                                                    r10 = i20;
                                                    r6 = i21;
                                                }
                                                c5102b = new C5102b(arrayList, r10, r6);
                                            }
                                            if (c5102b == 0) {
                                                objUnmodifiableList = c15384c;
                                            } else {
                                                C10116e c10116e4 = this.f30012k;
                                                ArrayList arrayList9 = (ArrayList) c5102b.f16679c;
                                                c10116e = new C10116e(arrayList9, cM14990l, c5102b.f16678b, c5102b.f16677a, c10116e4);
                                                this.f30012k = c10116e;
                                                c10116e2 = c10116e.f29961f;
                                                if (c10116e2 != null) {
                                                    c10116e2.f29962g = c10116e;
                                                }
                                                objUnmodifiableList = arrayList9;
                                            }
                                            if (objUnmodifiableList == null) {
                                                Object[] objArr7 = new Object[1];
                                                objArr7[i25] = m10719f();
                                                ArrayList arrayList10 = new ArrayList(1);
                                                Object obj7 = objArr7[i25];
                                                Objects.requireNonNull(obj7);
                                                arrayList10.add(obj7);
                                                objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList10);
                                            }
                                        }
                                    }
                                } else {
                                    Object[] objArr8 = new Object[1];
                                    objArr8[i25] = m10719f();
                                    ArrayList arrayList11 = new ArrayList(1);
                                    Object obj8 = objArr8[i25];
                                    Objects.requireNonNull(obj8);
                                    arrayList11.add(obj8);
                                    objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList11);
                                }
                            }
                        } else if (this.f30006e.get(cM14990l)) {
                            Object[] objArr9 = new Object[1];
                            objArr9[i25] = m10719f();
                            ArrayList arrayList12 = new ArrayList(1);
                            Object obj9 = objArr9[i25];
                            Objects.requireNonNull(obj9);
                            arrayList12.add(obj9);
                            objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList12);
                        } else {
                            list = (List) this.f30008g.get(Character.valueOf(cM14990l));
                            if (list != null) {
                                c0781sM14991m2 = this.f30009h.m14991m();
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c10439jMo10916a = ((InterfaceC13457a) it.next()).mo10916a(this);
                                        if (c10439jMo10916a instanceof C10439j) {
                                            abstractC12935u3 = c10439jMo10916a.f30921a;
                                            this.f30009h.m14992n(c10439jMo10916a.f30922b);
                                            if (this.f30010i) {
                                                C13458b c13458b6 = this.f30009h;
                                                abstractC12935u3.m14597i(c13458b6.m14982d(c0781sM14991m2, c13458b6.m14991m()).m4581h());
                                            }
                                            Object[] objArr10 = new Object[1];
                                            objArr10[i25] = abstractC12935u3;
                                            ArrayList arrayList13 = new ArrayList(1);
                                            Object obj10 = objArr10[i25];
                                            Objects.requireNonNull(obj10);
                                            arrayList13.add(obj10);
                                            objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList13);
                                        } else {
                                            this.f30009h.m14992n(c0781sM14991m2);
                                        }
                                    } else {
                                        interfaceC14208a = (InterfaceC14208a) this.f30004c.get(Character.valueOf(cM14990l));
                                        if (interfaceC14208a == null) {
                                            Object[] objArr11 = new Object[1];
                                            objArr11[i25] = m10719f();
                                            ArrayList arrayList14 = new ArrayList(1);
                                            Object obj11 = objArr11[i25];
                                            Objects.requireNonNull(obj11);
                                            arrayList14.add(obj11);
                                            objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList14);
                                        } else {
                                            c13458b = this.f30009h;
                                            i12 = c13458b.f42593b;
                                            if (i12 > 0) {
                                                int i29 = i12 - 1;
                                                cCharAt3 = ((C13191g) c13458b.f42596e).f41860a.charAt(i29);
                                                if (Character.isLowSurrogate(cCharAt3)) {
                                                    cCharAt4 = ((C13191g) c13458b.f42596e).f41860a.charAt(i12 - i24);
                                                    codePoint = cCharAt3;
                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                    }
                                                }
                                            } else if (c13458b.f42592a > 0) {
                                                codePoint = 10;
                                            } else {
                                                codePoint = i25;
                                            }
                                            codePoint = cCharAt3;
                                            codePoint = cCharAt3;
                                            c0781sM14991m = this.f30009h.m14991m();
                                            if (this.f30009h.m14985g(cM14990l) < interfaceC14208a.mo8903c()) {
                                                this.f30009h.m14992n(c0781sM14991m);
                                                c5102b = c15384c;
                                            } else {
                                                arrayList = new ArrayList();
                                                this.f30009h.m14992n(c0781sM14991m);
                                                while (this.f30009h.m14988j(cM14990l)) {
                                                    C13458b c13458b7 = this.f30009h;
                                                    arrayList.add(m10715i(c13458b7.m14982d(c0781sM14991m, c13458b7.m14991m())));
                                                    c0781sM14991m = this.f30009h.m14991m();
                                                }
                                                c13458b2 = this.f30009h;
                                                i13 = c13458b2.f42593b;
                                                if (i13 < c13458b2.f42594c) {
                                                    cCharAt = ((C13191g) c13458b2.f42596e).f41860a.charAt(i13);
                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                        cCharAt2 = ((C13191g) c13458b2.f42596e).f41860a.charAt(i23);
                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                        }
                                                    }
                                                } else if (c13458b2.f42592a >= ((ArrayList) c13458b2.f42595d).size() - 1) {
                                                    codePoint2 = i25;
                                                }
                                                if (codePoint != 0) {
                                                    i14 = 1;
                                                } else {
                                                    i14 = 1;
                                                }
                                                if (codePoint != 0) {
                                                    i15 = 1;
                                                } else {
                                                    i15 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i16 = 1;
                                                } else {
                                                    i16 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i17 = 1;
                                                } else {
                                                    i17 = 1;
                                                }
                                                if (i17 == 0) {
                                                    i18 = i25;
                                                } else {
                                                    i18 = i25;
                                                }
                                                if (i15 == 0) {
                                                    i19 = i25;
                                                } else {
                                                    i19 = i25;
                                                }
                                                if (cM14990l == '_') {
                                                    if (i18 != 0) {
                                                        i22 = i25;
                                                    } else {
                                                        i22 = i25;
                                                    }
                                                    if (i19 != 0) {
                                                        r6 = i25;
                                                        r10 = i22;
                                                    } else {
                                                        r6 = i25;
                                                        r10 = i22;
                                                    }
                                                } else {
                                                    if (i18 == 0) {
                                                        i20 = i25;
                                                    } else {
                                                        i20 = i25;
                                                    }
                                                    if (i19 == 0) {
                                                        i21 = i25;
                                                    } else {
                                                        i21 = i25;
                                                    }
                                                    r10 = i20;
                                                    r6 = i21;
                                                }
                                                c5102b = new C5102b(arrayList, r10, r6);
                                            }
                                            if (c5102b == 0) {
                                                objUnmodifiableList = c15384c;
                                            } else {
                                                C10116e c10116e5 = this.f30012k;
                                                ArrayList arrayList15 = (ArrayList) c5102b.f16679c;
                                                c10116e = new C10116e(arrayList15, cM14990l, c5102b.f16678b, c5102b.f16677a, c10116e5);
                                                this.f30012k = c10116e;
                                                c10116e2 = c10116e.f29961f;
                                                if (c10116e2 != null) {
                                                    c10116e2.f29962g = c10116e;
                                                }
                                                objUnmodifiableList = arrayList15;
                                            }
                                            if (objUnmodifiableList == null) {
                                                Object[] objArr12 = new Object[1];
                                                objArr12[i25] = m10719f();
                                                ArrayList arrayList16 = new ArrayList(1);
                                                Object obj12 = objArr12[i25];
                                                Objects.requireNonNull(obj12);
                                                arrayList16.add(obj12);
                                                objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList16);
                                            }
                                        }
                                    }
                                }
                            } else {
                                interfaceC14208a = (InterfaceC14208a) this.f30004c.get(Character.valueOf(cM14990l));
                                if (interfaceC14208a == null) {
                                    Object[] objArr13 = new Object[1];
                                    objArr13[i25] = m10719f();
                                    ArrayList arrayList17 = new ArrayList(1);
                                    Object obj13 = objArr13[i25];
                                    Objects.requireNonNull(obj13);
                                    arrayList17.add(obj13);
                                    objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList17);
                                } else {
                                    c13458b = this.f30009h;
                                    i12 = c13458b.f42593b;
                                    if (i12 > 0) {
                                        int i210 = i12 - 1;
                                        cCharAt3 = ((C13191g) c13458b.f42596e).f41860a.charAt(i210);
                                        if (Character.isLowSurrogate(cCharAt3)) {
                                            cCharAt4 = ((C13191g) c13458b.f42596e).f41860a.charAt(i12 - i24);
                                            codePoint = cCharAt3;
                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                            }
                                        }
                                    } else if (c13458b.f42592a > 0) {
                                        codePoint = 10;
                                    } else {
                                        codePoint = i25;
                                    }
                                    codePoint = cCharAt3;
                                    codePoint = cCharAt3;
                                    c0781sM14991m = this.f30009h.m14991m();
                                    if (this.f30009h.m14985g(cM14990l) < interfaceC14208a.mo8903c()) {
                                        this.f30009h.m14992n(c0781sM14991m);
                                        c5102b = c15384c;
                                    } else {
                                        arrayList = new ArrayList();
                                        this.f30009h.m14992n(c0781sM14991m);
                                        while (this.f30009h.m14988j(cM14990l)) {
                                            C13458b c13458b8 = this.f30009h;
                                            arrayList.add(m10715i(c13458b8.m14982d(c0781sM14991m, c13458b8.m14991m())));
                                            c0781sM14991m = this.f30009h.m14991m();
                                        }
                                        c13458b2 = this.f30009h;
                                        i13 = c13458b2.f42593b;
                                        if (i13 < c13458b2.f42594c) {
                                            cCharAt = ((C13191g) c13458b2.f42596e).f41860a.charAt(i13);
                                            if (Character.isHighSurrogate(cCharAt)) {
                                                cCharAt2 = ((C13191g) c13458b2.f42596e).f41860a.charAt(i23);
                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                }
                                            }
                                        } else if (c13458b2.f42592a >= ((ArrayList) c13458b2.f42595d).size() - 1) {
                                            codePoint2 = i25;
                                        }
                                        if (codePoint != 0) {
                                            i14 = 1;
                                        } else {
                                            i14 = 1;
                                        }
                                        if (codePoint != 0) {
                                            i15 = 1;
                                        } else {
                                            i15 = 1;
                                        }
                                        if (codePoint2 != 0) {
                                            i16 = 1;
                                        } else {
                                            i16 = 1;
                                        }
                                        if (codePoint2 != 0) {
                                            i17 = 1;
                                        } else {
                                            i17 = 1;
                                        }
                                        if (i17 == 0) {
                                            i18 = i25;
                                        } else {
                                            i18 = i25;
                                        }
                                        if (i15 == 0) {
                                            i19 = i25;
                                        } else {
                                            i19 = i25;
                                        }
                                        if (cM14990l == '_') {
                                            if (i18 != 0) {
                                                i22 = i25;
                                            } else {
                                                i22 = i25;
                                            }
                                            if (i19 != 0) {
                                                r6 = i25;
                                                r10 = i22;
                                            } else {
                                                r6 = i25;
                                                r10 = i22;
                                            }
                                        } else {
                                            if (i18 == 0) {
                                                i20 = i25;
                                            } else {
                                                i20 = i25;
                                            }
                                            if (i19 == 0) {
                                                i21 = i25;
                                            } else {
                                                i21 = i25;
                                            }
                                            r10 = i20;
                                            r6 = i21;
                                        }
                                        c5102b = new C5102b(arrayList, r10, r6);
                                    }
                                    if (c5102b == 0) {
                                        objUnmodifiableList = c15384c;
                                    } else {
                                        C10116e c10116e6 = this.f30012k;
                                        ArrayList arrayList18 = (ArrayList) c5102b.f16679c;
                                        c10116e = new C10116e(arrayList18, cM14990l, c5102b.f16678b, c5102b.f16677a, c10116e6);
                                        this.f30012k = c10116e;
                                        c10116e2 = c10116e.f29961f;
                                        if (c10116e2 != null) {
                                            c10116e2.f29962g = c10116e;
                                        }
                                        objUnmodifiableList = arrayList18;
                                    }
                                    if (objUnmodifiableList == null) {
                                        Object[] objArr14 = new Object[1];
                                        objArr14[i25] = m10719f();
                                        ArrayList arrayList19 = new ArrayList(1);
                                        Object obj14 = objArr14[i25];
                                        Objects.requireNonNull(obj14);
                                        arrayList19.add(obj14);
                                        objUnmodifiableList = DesugarCollections.unmodifiableList(arrayList19);
                                    }
                                }
                            }
                        }
                        i10 = i25;
                        i11 = i24;
                        UnmodifiableList = objUnmodifiableList;
                    } else {
                        C0781s c0781sM14991m9 = this.f30009h.m14991m();
                        this.f30009h.m14987i();
                        C0781s c0781sM14991m10 = this.f30009h.m14991m();
                        C10115d c10115d5 = this.f30013l;
                        if (c10115d5 == null) {
                            abstractC12935uM10715i = m10715i(this.f30009h.m14982d(c0781sM14991m9, c0781sM14991m10));
                        } else if (c10115d5.f29947a) {
                            String strM4580g2 = this.f30009h.m14982d((C0781s) c10115d5.f29953g, c0781sM14991m9).m4580g();
                            C0781s c0781sM14991m11 = this.f30009h.m14991m();
                            C13458b c13458b9 = this.f30009h;
                            if (c13458b9.m14988j('(')) {
                                c13458b9.m14993o();
                                char cM14990l2 = c13458b9.m14990l();
                                C0781s c0781sM14991m12 = c13458b9.m14991m();
                                if (AbstractC8031Y3.m8380d(c13458b9)) {
                                    if (cM14990l2 == '<') {
                                        String strM4580g3 = c13458b9.m14982d(c0781sM14991m12, c13458b9.m14991m()).m4580g();
                                        strM4580g = strM4580g3.substring(1, strM4580g3.length() - 1);
                                    } else {
                                        strM4580g = c13458b9.m14982d(c0781sM14991m12, c13458b9.m14991m()).m4580g();
                                    }
                                    strM12930c = AbstractC11538a.m12930c(strM4580g);
                                } else {
                                    strM12930c = null;
                                }
                                if (strM12930c != null) {
                                    if (c13458b9.m14993o() >= 1) {
                                        C0781s c0781sM14991m13 = c13458b9.m14991m();
                                        if (c13458b9.m14983e()) {
                                            char cM14990l3 = c13458b9.m14990l();
                                            char c9 = '\"';
                                            if (cM14990l3 != '\"') {
                                                c9 = '\'';
                                                if (cM14990l3 == '\'') {
                                                    c13458b9.m14987i();
                                                    if (!AbstractC8031Y3.m8382f(c13458b9, c9) && c13458b9.m14983e()) {
                                                        c13458b9.m14987i();
                                                        String strM4580g4 = c13458b9.m14982d(c0781sM14991m13, c13458b9.m14991m()).m4580g();
                                                        strM12930c2 = AbstractC11538a.m12930c(strM4580g4.substring(1, strM4580g4.length() - 1));
                                                    } else {
                                                        strM12930c2 = null;
                                                    }
                                                } else if (cM14990l3 != '(') {
                                                    strM12930c2 = null;
                                                } else {
                                                    c9 = ')';
                                                    c13458b9.m14987i();
                                                    if (AbstractC8031Y3.m8382f(c13458b9, c9)) {
                                                        strM12930c2 = null;
                                                    } else {
                                                        c13458b9.m14987i();
                                                        String strM4580g5 = c13458b9.m14982d(c0781sM14991m13, c13458b9.m14991m()).m4580g();
                                                        strM12930c2 = AbstractC11538a.m12930c(strM4580g5.substring(1, strM4580g5.length() - 1));
                                                    }
                                                }
                                            } else {
                                                c13458b9.m14987i();
                                                if (AbstractC8031Y3.m8382f(c13458b9, c9)) {
                                                    strM12930c2 = null;
                                                } else {
                                                    c13458b9.m14987i();
                                                    String strM4580g6 = c13458b9.m14982d(c0781sM14991m13, c13458b9.m14991m()).m4580g();
                                                    strM12930c2 = AbstractC11538a.m12930c(strM4580g6.substring(1, strM4580g6.length() - 1));
                                                }
                                            }
                                        } else {
                                            strM12930c2 = null;
                                        }
                                        c13458b9.m14993o();
                                    } else {
                                        strM12930c2 = null;
                                    }
                                    if (c13458b9.m14988j(')')) {
                                        c15384c = new C15384c(strM12930c, 18, strM12930c2);
                                    } else {
                                        c15384c = null;
                                    }
                                } else {
                                    c15384c = null;
                                }
                            }
                            C12912C c12912c = (C12912C) c10115d5.f29949c;
                            if (c15384c != null) {
                                c2392v = new C2392v(c12912c, strM4580g2, null, (String) c15384c.f47967Z, (String) c15384c.f47968o0, 24);
                            } else {
                                this.f30009h.m14992n(c0781sM14991m11);
                                C13458b c13458b10 = this.f30009h;
                                if (c13458b10.m14988j('[')) {
                                    C0781s c0781sM14991m14 = c13458b10.m14991m();
                                    if (AbstractC8031Y3.m8381e(c13458b10)) {
                                        C0781s c0781sM14991m15 = c13458b10.m14991m();
                                        if (c13458b10.m14988j(']')) {
                                            String strM4580g7 = c13458b10.m14982d(c0781sM14991m14, c0781sM14991m15).m4580g();
                                            if (strM4580g7.length() > 999) {
                                                str = null;
                                            } else {
                                                str = strM4580g7;
                                            }
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    this.f30009h.m14992n(c0781sM14991m11);
                                }
                                c2392v = (c10115d5.f29948b && (str == null || str.isEmpty()) && c12912c == null) ? null : new C2392v((C12912C) c10115d5.f29949c, strM4580g2, str, null, null, 24);
                            }
                            if (c2392v == null) {
                                abstractC12935u2 = null;
                            } else {
                                C0781s c0781sM14991m16 = this.f30009h.m14991m();
                                Iterator it3 = this.f30005d.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C10435f c10435f = (C10435f) it3.next();
                                        C13458b c13458b11 = this.f30009h;
                                        c10435f.getClass();
                                        String str2 = (String) c2392v.f7439q0;
                                        if (str2 != null) {
                                            c10438iM10917a = C10435f.m10917a(c2392v, c13458b11, str2, (String) c2392v.f7440r0);
                                        } else {
                                            String str3 = (String) c2392v.f7438p0;
                                            if (str3 == null || str3.isEmpty()) {
                                                str3 = (String) c2392v.f7437o0;
                                            }
                                            C12921g c12921g = (C12921g) ((HashMap) ((C9642z) this.f30002a.f7440r0).f29064Z).get(C12932r.class);
                                            C12932r c12932r = (C12932r) (c12921g == null ? null : c12921g.f41072b.get(AbstractC11538a.m12929b(str3)));
                                            c10438iM10917a = c12932r != null ? C10435f.m10917a(c2392v, c13458b11, c12932r.f41089h, c12932r.f41090i) : null;
                                        }
                                        if (c10438iM10917a instanceof C10438i) {
                                            abstractC12935u2 = c10438iM10917a.f30918a;
                                            boolean z6 = c10438iM10917a.f30920c;
                                            this.f30009h.m14992n(c10438iM10917a.f30919b);
                                            C12912C c12912c2 = (C12912C) c10115d5.f29950d;
                                            AbstractC12935u abstractC12935u4 = c12912c2.f41096e;
                                            while (abstractC12935u4 != null) {
                                                AbstractC12935u abstractC12935u5 = abstractC12935u4.f41096e;
                                                abstractC12935u2.m14593c(abstractC12935u4);
                                                abstractC12935u4 = abstractC12935u5;
                                            }
                                            if (this.f30010i) {
                                                if (!z6 || (c0781s = (C0781s) c10115d5.f29951e) == null) {
                                                    c0781s = (C0781s) c10115d5.f29952f;
                                                }
                                                C13458b c13458b12 = this.f30009h;
                                                abstractC12935u2.m14597i(c13458b12.m14982d(c0781s, c13458b12.m14991m()).m4581h());
                                            }
                                            m10720g((C10116e) c10115d5.f29955i);
                                            m10716c(abstractC12935u2);
                                            if (z6 && c12912c != null) {
                                                c12912c.m14598k();
                                            }
                                            c12912c2.m14598k();
                                            C10115d c10115d6 = (C10115d) this.f30013l.f29954h;
                                            this.f30013l = c10115d6;
                                            if (c12912c == null) {
                                                while (c10115d6 != null) {
                                                    if (((C12912C) c10115d6.f29949c) == null) {
                                                        c10115d6.f29947a = false;
                                                    }
                                                    c10115d6 = (C10115d) c10115d6.f29954h;
                                                }
                                            }
                                        } else {
                                            this.f30009h.m14992n(c0781sM14991m16);
                                        }
                                    } else {
                                        abstractC12935u2 = null;
                                    }
                                }
                            }
                            if (abstractC12935u2 != null) {
                                abstractC12935uM10715i = abstractC12935u2;
                            } else {
                                this.f30009h.m14992n(c0781sM14991m10);
                                this.f30013l = (C10115d) this.f30013l.f29954h;
                                abstractC12935uM10715i = m10715i(this.f30009h.m14982d(c0781sM14991m9, c0781sM14991m10));
                            }
                        } else {
                            this.f30013l = (C10115d) c10115d5.f29954h;
                            abstractC12935uM10715i = m10715i(this.f30009h.m14982d(c0781sM14991m9, c0781sM14991m10));
                        }
                        ArrayList arrayList20 = new ArrayList(1);
                        Object obj15 = new Object[]{abstractC12935uM10715i}[0];
                        Objects.requireNonNull(obj15);
                        arrayList20.add(obj15);
                        listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList20);
                    }
                    i11 = 2;
                    i10 = 0;
                    UnmodifiableList = listUnmodifiableList;
                } else {
                    this.f30009h.m14987i();
                    i11 = 2;
                    i10 = 0;
                    Object[] objArr15 = {this.f30011j >= 2 ? new C12925k() : new C12939y()};
                    ArrayList arrayList21 = new ArrayList(1);
                    Object obj16 = objArr15[0];
                    Objects.requireNonNull(obj16);
                    arrayList21.add(obj16);
                    UnmodifiableList = DesugarCollections.unmodifiableList(arrayList21);
                }
            } else {
                i10 = i25;
                i11 = i24;
                UnmodifiableList = 0;
            }
            if (UnmodifiableList == 0) {
                m10720g(null);
                m10716c(abstractC12935u);
                return;
            }
            Iterator it4 = UnmodifiableList.iterator();
            while (it4.hasNext()) {
                abstractC12935u.m14593c((AbstractC12935u) it4.next());
            }
            c15384c = null;
            i24 = i11;
            i25 = i10;
        }
    }

    /* JADX INFO: renamed from: f */
    public final C12912C m10719f() {
        char cM14990l;
        C0781s c0781sM14991m = this.f30009h.m14991m();
        this.f30009h.m14987i();
        while (true) {
            cM14990l = this.f30009h.m14990l();
            if (cM14990l == 0 || this.f30006e.get(cM14990l)) {
                break;
            }
            this.f30009h.m14987i();
        }
        C13458b c13458b = this.f30009h;
        C3847l0 c3847l0M14982d = c13458b.m14982d(c0781sM14991m, c13458b.m14991m());
        String strM4580g = c3847l0M14982d.m4580g();
        if (cM14990l == '\n') {
            int length = strM4580g.length() - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (strM4580g.charAt(length) != ' ') {
                    break;
                }
                length--;
            }
            int i10 = length + 1;
            this.f30011j = strM4580g.length() - i10;
            strM4580g = strM4580g.substring(0, i10);
        } else if (cM14990l == 0) {
            strM4580g = strM4580g.substring(0, AbstractC8495I3.m9158f(strM4580g.length() - 1, 0, strM4580g) + 1);
        }
        C12912C c12912c = new C12912C(strM4580g);
        c12912c.m14597i(c3847l0M14982d.m4581h());
        return c12912c;
    }

    /* JADX INFO: renamed from: g */
    public final void m10720g(C10116e c10116e) {
        boolean z6;
        ArrayList arrayList;
        HashMap map = new HashMap();
        C10116e c10116e2 = this.f30012k;
        while (c10116e2 != null) {
            C10116e c10116e3 = c10116e2.f29961f;
            if (c10116e3 == c10116e) {
                break;
            } else {
                c10116e2 = c10116e3;
            }
        }
        while (c10116e2 != null) {
            HashMap map2 = this.f30004c;
            char c9 = c10116e2.f29957b;
            InterfaceC14208a interfaceC14208a = (InterfaceC14208a) map2.get(Character.valueOf(c9));
            if (!c10116e2.f29960e || interfaceC14208a == null) {
                c10116e2 = c10116e2.f29962g;
            } else {
                char cMo8904d = interfaceC14208a.mo8904d();
                C10116e c10116e4 = c10116e2.f29961f;
                int iMo8902b = 0;
                boolean z10 = false;
                while (true) {
                    if (c10116e4 == null || c10116e4 == c10116e || c10116e4 == map.get(Character.valueOf(c9))) {
                        z6 = false;
                        break;
                    }
                    if (c10116e4.f29959d && c10116e4.f29957b == cMo8904d) {
                        iMo8902b = interfaceC14208a.mo8902b(c10116e4, c10116e2);
                        if (iMo8902b > 0) {
                            z6 = true;
                            z10 = true;
                            break;
                        }
                        z10 = true;
                    }
                    c10116e4 = c10116e4.f29961f;
                }
                if (z6) {
                    for (int i10 = 0; i10 < iMo8902b; i10++) {
                        ArrayList arrayList2 = c10116e4.f29956a;
                        ((C12912C) arrayList2.remove(arrayList2.size() - 1)).m14598k();
                    }
                    int i11 = 0;
                    while (true) {
                        arrayList = c10116e2.f29956a;
                        if (i11 >= iMo8902b) {
                            break;
                        }
                        ((C12912C) arrayList.remove(0)).m14598k();
                        i11++;
                    }
                    C10116e c10116e5 = c10116e2.f29961f;
                    while (c10116e5 != null && c10116e5 != c10116e4) {
                        C10116e c10116e6 = c10116e5.f29961f;
                        m10721h(c10116e5);
                        c10116e5 = c10116e6;
                    }
                    if (c10116e4.f29956a.size() == 0) {
                        m10721h(c10116e4);
                    }
                    if (arrayList.size() == 0) {
                        C10116e c10116e7 = c10116e2.f29962g;
                        m10721h(c10116e2);
                        c10116e2 = c10116e7;
                    }
                } else {
                    if (!z10) {
                        map.put(Character.valueOf(c9), c10116e2.f29961f);
                        if (!c10116e2.f29959d) {
                            m10721h(c10116e2);
                        }
                    }
                    c10116e2 = c10116e2.f29962g;
                }
            }
        }
        while (true) {
            C10116e c10116e8 = this.f30012k;
            if (c10116e8 == null || c10116e8 == c10116e) {
                return;
            } else {
                m10721h(c10116e8);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10721h(C10116e c10116e) {
        C10116e c10116e2 = c10116e.f29961f;
        if (c10116e2 != null) {
            c10116e2.f29962g = c10116e.f29962g;
        }
        C10116e c10116e3 = c10116e.f29962g;
        if (c10116e3 == null) {
            this.f30012k = c10116e2;
        } else {
            c10116e3.f29961f = c10116e2;
        }
    }
}
