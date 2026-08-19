package p712dp;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p117Eb.C2392v;
import p607Yo.C10119h;
import p607Yo.C10124m;
import p632Zo.C10430a;
import p632Zo.C10431b;
import p632Zo.C10435f;
import p690cp.AbstractC12935u;
import p690cp.C12922h;
import p756fp.AbstractC13719a;
import p756fp.InterfaceC13720b;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: dp.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C13189e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f41852a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f41853b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f41854c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f41855d;

    /* JADX INFO: renamed from: e */
    public final HashSet f41856e;

    /* JADX INFO: renamed from: f */
    public final C13186b f41857f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f41858g;

    /* JADX INFO: renamed from: h */
    public final int f41859h;

    public C13189e(C13187c c13187c) {
        int i10 = 0;
        int i11 = 2;
        int i12 = 1;
        ArrayList arrayList = c13187c.f41845c;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c13187c.f41851i;
        LinkedHashSet linkedHashSet2 = C10119h.f29967u;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC13720b) C10119h.f29968v.get((Class) it.next()));
        }
        this.f41852a = arrayList2;
        C13186b c13186b = (C13186b) Objects.requireNonNullElseGet(null, new C13185a());
        this.f41857f = c13186b;
        this.f41858g = (ArrayList) c13187c.f41849g;
        ArrayList arrayList3 = c13187c.f41846d;
        this.f41853b = arrayList3;
        ArrayList arrayList4 = (ArrayList) c13187c.f41847e;
        this.f41854c = arrayList4;
        ArrayList arrayList5 = (ArrayList) c13187c.f41848f;
        this.f41855d = arrayList5;
        HashSet hashSet = (HashSet) c13187c.f41850h;
        this.f41856e = hashSet;
        this.f41859h = c13187c.f41844b;
        new HashMap();
        c13186b.getClass();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        arrayList6.add(new C10431b(i12));
        arrayList6.add(new C10431b(i11));
        arrayList6.add(new C10431b(3));
        arrayList6.add(new C10431b(i10));
        arrayList6.add(new C10431b(4));
        HashMap map = new HashMap();
        Object[] objArr = {new C10430a('*'), new C10430a('_')};
        ArrayList arrayList7 = new ArrayList(2);
        while (i10 < 2) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList7.add(obj);
            i10++;
        }
        C10124m.m10714b(DesugarCollections.unmodifiableList(arrayList7), map);
        C10124m.m10714b(arrayList4, map);
        new ArrayList(arrayList5).add(new C10435f());
        BitSet bitSet = new BitSet();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(33);
        Set setKeySet = map.keySet();
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            bitSet2.set(((Character) it3.next()).charValue());
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((C10431b) it4.next()).m10915a().iterator();
            while (it5.hasNext()) {
                bitSet2.set(((Character) it5.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC12935u m14846a(String str) {
        Objects.requireNonNull(str, "input must not be null");
        C10119h c10119h = new C10119h(this.f41852a, this.f41857f, this.f41853b, this.f41854c, this.f41855d, this.f41856e, this.f41859h);
        int i10 = 0;
        while (true) {
            int length = str.length();
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                char cCharAt = str.charAt(i11);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                break;
            }
            c10119h.m10710i(i10, str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (!str.isEmpty() && (i10 == 0 || i10 < str.length())) {
            c10119h.m10710i(i10, str.substring(i10));
        }
        c10119h.m10707f(c10119h.f29987s.size());
        C2392v c2392v = new C2392v(c10119h.f29980l, c10119h.f29981m, c10119h.f29982n, c10119h.f29983o, c10119h.f29986r, 23);
        c10119h.f29979k.getClass();
        C10124m c10124m = new C10124m(c2392v);
        Iterator it = c10119h.f29988t.iterator();
        while (it.hasNext()) {
            ((AbstractC13719a) it.next()).mo10035i(c10124m);
        }
        AbstractC12935u abstractC12935uMo7844a = (C12922h) c10119h.f29985q.f29964b;
        Iterator it2 = this.f41858g.iterator();
        while (it2.hasNext()) {
            abstractC12935uMo7844a = ((InterfaceC13190f) it2.next()).mo7844a(abstractC12935uMo7844a);
        }
        return abstractC12935uMo7844a;
    }
}
