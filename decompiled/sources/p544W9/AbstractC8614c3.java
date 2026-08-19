package p544W9;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p015Ad.AbstractC0434i;
import p030B2.C0742X;
import p041Be.C1241m;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p067Cd.C1632f;
import p098Di.C2058g;
import p1113xn.AbstractC21322p;
import p1126yd.C21488o;
import p1155zi.C21984a1;
import p1155zi.EnumC21974X0;
import p229J0.C4171z3;
import p318Mh.AbstractC5364G0;
import p318Mh.C5374M;
import p381Pe.C6394e;
import p403Qd.C6636i;
import p403Qd.EnumC6624c;
import p553Wh.C8870f;
import p575Xd.C9436E;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p948pi.C18418a;
import tm.C20007b;

/* JADX INFO: renamed from: W9.c3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8614c3 {
    /* JADX INFO: renamed from: a */
    public static final void m9262a(C18418a c18418a, C8870f appState, EnumC21974X0 enumC21974X0, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(appState, "appState");
        if (c18418a != null && !c18418a.f58773a.f58783b) {
            interfaceC1426a.invoke();
            return;
        }
        C5374M c5374m = C5374M.f17623g;
        c5374m.getClass();
        AbstractC5364G0.m5889d(appState.f27149b, c5374m.m5885a(new C4171z3(enumC21974X0, 14)), true);
    }

    /* JADX INFO: renamed from: b */
    public static final void m9263b(C18418a c18418a, EnumC21974X0 enumC21974X0, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a) {
        if (!c18418a.f58773a.f58783b) {
            interfaceC1426a.invoke();
            return;
        }
        C5374M c5374m = C5374M.f17623g;
        c5374m.getClass();
        interfaceC1436k.invoke(new C2058g(c5374m.m5885a(new C4171z3(enumC21974X0, 14)), true));
    }

    /* JADX INFO: renamed from: c */
    public static final C6636i m9264c(C1241m c1241m) {
        EnumC6624c enumC6624c;
        Object next;
        AbstractC16544l.m18094g(c1241m, "<this>");
        String string = AbstractC21322p.m21711s0(c1241m.f3267b).toString();
        Integer num = c1241m.f3273h;
        if (num != null) {
            int iIntValue = num.intValue();
            C20007b c20007b = EnumC6624c.f21359q0;
            c20007b.getClass();
            C0742X c0742x = new C0742X(c20007b, 8);
            do {
                if (!c0742x.hasNext()) {
                    next = null;
                    break;
                }
                next = c0742x.next();
            } while (((EnumC6624c) next).f21360Y != iIntValue);
            enumC6624c = (EnumC6624c) next;
        } else {
            enumC6624c = null;
        }
        String str = c1241m.f3266a;
        C6636i c6636i = new C6636i(str, str, c1241m.f3270e, c1241m.f3271f, c1241m.f3268c, string, (Map) null, (C9436E) null, (String) null, c1241m.f3269d, c1241m.f3275j, (String) null, enumC6624c, c1241m.f3274i, false, (C6394e) null, 2044864);
        Map map = c1241m.f3272g;
        return map != null ? C6636i.m7162a(c6636i, null, null, null, null, null, null, null, null, null, null, null, null, false, null, AbstractC0434i.m1092d(map, c1241m.f3266a, null), 1048575) : c6636i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final C6636i m9265d(C21488o toDomainConversation, String id2, String str) {
        AbstractC16544l.m18094g(toDomainConversation, "$this$toDomainConversation");
        AbstractC16544l.m18094g(id2, "id");
        Object obj = null;
        C6394e c6394eM1092d = AbstractC0434i.m1092d(toDomainConversation.f68093g, id2, null);
        String str2 = toDomainConversation.f68087a;
        String string = str2 != null ? AbstractC21322p.m21711s0(str2).toString() : null;
        String str3 = toDomainConversation.f68091e;
        String str4 = str3 != null ? str3 : null;
        Iterable iterable = toDomainConversation.f68094h;
        if (iterable == null) {
            iterable = C17689w.f56480Y;
        }
        C9436E c9436e = new C9436E(2, AbstractC17680n.m19328G0(iterable));
        List list = toDomainConversation.f68095i;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj2 : list) {
            linkedHashMap.put(new C21984a1(((C1632f) obj2).f4622a), obj2);
        }
        Integer num = toDomainConversation.f68098l;
        if (num != null) {
            int iIntValue = num.intValue();
            C20007b c20007b = EnumC6624c.f21359q0;
            c20007b.getClass();
            C0742X c0742x = new C0742X(c20007b, 8);
            while (c0742x.hasNext()) {
                Object next = c0742x.next();
                if (((EnumC6624c) next).f21360Y == iIntValue) {
                    obj = next;
                    break;
                }
            }
            obj = (EnumC6624c) obj;
        }
        return new C6636i(id2, str, toDomainConversation.f68089c, toDomainConversation.f68090d, toDomainConversation.f68088b, string, (Map) linkedHashMap, c9436e, str4, toDomainConversation.f68097k, toDomainConversation.f68099m, toDomainConversation.f68092f, (EnumC6624c) obj, (String) null, false, c6394eM1092d, 1020160);
    }
}
