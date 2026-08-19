package p544W9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p1113xn.AbstractC21322p;
import p283L5.C4953s;
import p283L5.C4955u;
import p803i7.C14941d;
import p803i7.InterfaceC14938a;
import p909nm.AbstractC17659D;
import p909nm.C17691y;

/* JADX INFO: renamed from: W9.Y2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8589Y2 {
    /* JADX INFO: renamed from: a */
    public static C4955u m9251a(C0657F c0657f) {
        int i10 = Integer.parseInt(c0657f.m1350W(Long.MAX_VALUE));
        long j10 = Long.parseLong(c0657f.m1350W(Long.MAX_VALUE));
        long j11 = Long.parseLong(c0657f.m1350W(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = Integer.parseInt(c0657f.m1350W(Long.MAX_VALUE));
        for (int i12 = 0; i12 < i11; i12++) {
            String strM1350W = c0657f.m1350W(Long.MAX_VALUE);
            int iM21678L = AbstractC21322p.m21678L(strM1350W, ':', 0, false, 6);
            if (iM21678L == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strM1350W).toString());
            }
            String strSubstring = strM1350W.substring(0, iM21678L);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            String string = AbstractC21322p.m21711s0(strSubstring).toString();
            String strSubstring2 = strM1350W.substring(iM21678L + 1);
            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring2);
        }
        return new C4955u(i10, j10, j11, new C4953s(AbstractC17659D.m19254p(linkedHashMap)), null, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ LinkedHashMap m9252b(InterfaceC14938a interfaceC14938a, Map map, String str, String str2, Set set, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            set = C17691y.f56482Y;
        }
        return ((C14941d) interfaceC14938a).m16098a(map, str, str2, set);
    }

    /* JADX INFO: renamed from: c */
    public static void m9253c(C4955u c4955u, C0656E c0656e) {
        c0656e.mo1329Q0(c4955u.f16161a);
        c0656e.mo1328M(10);
        c0656e.mo1329Q0(c4955u.f16162b);
        c0656e.mo1328M(10);
        c0656e.mo1329Q0(c4955u.f16163c);
        c0656e.mo1328M(10);
        Set<Map.Entry> setEntrySet = c4955u.f16164d.f16157a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        c0656e.mo1329Q0(size);
        c0656e.mo1328M(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                c0656e.mo1333c0((String) entry.getKey());
                c0656e.mo1333c0(":");
                c0656e.mo1333c0(str);
                c0656e.mo1328M(10);
            }
        }
    }
}
