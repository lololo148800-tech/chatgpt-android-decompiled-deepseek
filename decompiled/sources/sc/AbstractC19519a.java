package sc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p033B5.C0842z;
import p1113xn.AbstractC21322p;
import p204I1.C3588d;
import p204I1.C3590f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p988rc.C18918f;

/* JADX INFO: renamed from: sc.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19519a {

    /* JADX INFO: renamed from: a */
    public static final List f61992a = AbstractC17681o.m19382k(' ', '.', '!', '?', ',', ';', ':', '\n', '\r', '\t', (char) 8230, (char) 8212, (char) 183, (char) 161, (char) 191, (char) 12290, (char) 12289, (char) 65292, (char) 65311, (char) 65281, (char) 65306, (char) 65307, (char) 8230, (char) 161, (char) 191, (char) 4962, (char) 4963, (char) 4964, (char) 4965, (char) 4966, (char) 4967, (char) 4968);

    /* JADX WARN: Code duplicated, block: B:48:0x01a8  */
    /* JADX INFO: renamed from: a */
    public static final C19530l m20621a(C3590f c3590f, C18918f c18918f, boolean z6) {
        Iterable iterable;
        AbstractC16544l.m18094g(c3590f, "<this>");
        String str = c3590f.f10934Y;
        List listM19382k = AbstractC17681o.m19382k(0, Integer.valueOf(str.length()));
        List<C3588d> listM4299b = c3590f.m4299b();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM4299b, 10));
        for (C3588d c3588d : listM4299b) {
            arrayList.add(AbstractC17681o.m19382k(Integer.valueOf(c3588d.f10931b), Integer.valueOf(c3588d.f10932c)));
        }
        List listM19370t0 = AbstractC17680n.m19370t0(AbstractC17680n.m19361k0(AbstractC17682p.m19390s(arrayList), listM19382k), new C0842z(22));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM19370t0) {
            if (((Number) obj).intValue() <= str.length()) {
                arrayList2.add(obj);
            }
        }
        Iterator it = AbstractC17680n.m19335K(arrayList2).iterator();
        if (it.hasNext()) {
            ArrayList arrayList3 = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                String strSubstring = str.substring(((Number) next).intValue(), ((Number) next2).intValue());
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                arrayList3.add(strSubstring);
                next = next2;
            }
            iterable = arrayList3;
        } else {
            iterable = C17689w.f56480Y;
        }
        List list = c18918f.f60370g;
        if (list == null) {
            list = f61992a;
        }
        Iterable<String> iterable2 = iterable;
        ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
        for (String str2 : iterable2) {
            char[] cArrM19375y0 = AbstractC17680n.m19375y0(list);
            arrayList4.add(AbstractC21322p.m21696d0(str2, Arrays.copyOf(cArrM19375y0, cArrM19375y0.length), 4));
        }
        ArrayList<String> arrayListM19390s = AbstractC17682p.m19390s(arrayList4);
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(0);
        for (String str3 : arrayListM19390s) {
            if (!AbstractC16544l.m18089b(str3, AbstractC17680n.m19351a0(arrayListM19390s))) {
                double length = str3.length();
                int i10 = c18918f.f60369f;
                if (length > ((double) i10) * 1.2d) {
                    arrayListM19384m.add(Integer.valueOf(((Number) AbstractC17680n.m19351a0(arrayListM19384m)).intValue() + i10));
                }
                int length2 = str.length();
                int length3 = str3.length() + ((Number) AbstractC17680n.m19351a0(arrayListM19384m)).intValue() + 1;
                if (length2 > length3) {
                    length2 = length3;
                }
                arrayListM19384m.add(Integer.valueOf(length2));
            }
        }
        if (z6) {
            arrayListM19384m.add(Integer.valueOf(str.length()));
        } else {
            List list2 = list;
            String str4 = (String) AbstractC17680n.m19353c0(arrayListM19390s);
            Character chValueOf = null;
            if (str4 != null && str4.length() != 0) {
                chValueOf = Character.valueOf(str4.charAt(str4.length() - 1));
            }
            if (AbstractC17680n.m19333J(list2, chValueOf)) {
                arrayListM19384m.add(Integer.valueOf(str.length()));
            }
        }
        List listM19335K = AbstractC17680n.m19335K(arrayListM19384m);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : listM19335K) {
            if (((Number) obj2).intValue() <= str.length()) {
                arrayList5.add(obj2);
            }
        }
        return new C19530l(c3590f, arrayList5, z6);
    }
}
