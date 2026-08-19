package p1041uf;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p040Bd.AbstractC0985Q1;
import p040Bd.C0893B;
import p040Bd.C0901C1;
import p040Bd.C0911E;
import p040Bd.C0918F0;
import p040Bd.C0919F1;
import p040Bd.C0924G0;
import p040Bd.C0935I;
import p040Bd.C0937I1;
import p040Bd.C0954L0;
import p040Bd.C0960M0;
import p040Bd.C0965N;
import p040Bd.C0971O;
import p040Bd.C0979P1;
import p040Bd.C0995S0;
import p040Bd.C1013V0;
import p040Bd.C1031Y0;
import p040Bd.C1092h0;
import p040Bd.C1113k0;
import p040Bd.C1119l0;
import p040Bd.C1131n0;
import p040Bd.C1149q0;
import p040Bd.C1168t1;
import p040Bd.C1186w1;
import p040Bd.C1197y0;
import p040Bd.C1203z0;
import p040Bd.C1204z1;
import p1081wc.AbstractC20882b;
import p1081wc.InterfaceC20904w;
import p339Nf.AbstractC5722d;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: uf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20212a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20904w f63989a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f63990b = new LinkedHashSet();

    public C20212a(InterfaceC20904w interfaceC20904w) {
        this.f63989a = interfaceC20904w;
    }

    /* JADX INFO: renamed from: a */
    public final void m21013a(AbstractC20882b abstractC20882b, String str, String str2, AbstractC0985Q1 abstractC0985Q1, Integer num, List list) {
        Map mapM19244f;
        String str3;
        List listM9974d;
        List listM9974d2;
        C17309l c17309l = new C17309l("type", abstractC0985Q1.mo1962d());
        String strM6157a = null;
        String str4 = str == null ? null : str;
        if (str4 == null) {
            str4 = "";
        }
        Map mapM19244f2 = AbstractC17659D.m19244f(c17309l, new C17309l("conversationId", str4), new C17309l("messageId", str2), new C17309l("index", Integer.valueOf(num != null ? num.intValue() : 0)));
        if (abstractC0985Q1 instanceof C0935I) {
            mapM19244f = AbstractC17660E.m19258c(new C17309l("source", ((C0935I) abstractC0985Q1).f2683c));
        } else {
            boolean z6 = abstractC0985Q1 instanceof C0937I1;
            C17689w c17689w = C17689w.f56480Y;
            if (z6) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC0985Q1 abstractC0985Q2 = (AbstractC0985Q1) it.next();
                    if (abstractC0985Q2 instanceof C0937I1) {
                        listM9974d2 = AbstractC9393x3.m9974d(abstractC0985Q2);
                    } else {
                        listM9974d2 = abstractC0985Q2 instanceof C1113k0 ? ((C1113k0) abstractC0985Q2).f3020c : c17689w;
                    }
                    AbstractC17686t.m19398v(listM9974d2, arrayList);
                }
                int iIndexOf = arrayList.indexOf(abstractC0985Q1);
                C0937I1 c0937i1 = (C0937I1) abstractC0985Q1;
                String str5 = c0937i1.f2688d;
                mapM19244f = AbstractC17659D.m19244f(new C17309l(UiComponentConfig.Title.type, str5 != null ? str5 : ""), new C17309l("url", c0937i1.f2687c), new C17309l("citation_number", Integer.valueOf(iIndexOf)));
            } else if (abstractC0985Q1 instanceof C1113k0) {
                C0937I1 c0937i2 = num != null ? (C0937I1) AbstractC17680n.m19344T(num.intValue(), ((C1113k0) abstractC0985Q1).f3020c) : null;
                if (c0937i2 == null) {
                    AbstractC8160o6.m8731f(AbstractC8168p6.m8749b("SearchAnalytics", null), "No url citation was found for index " + num, null, null, 6);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC0985Q1 abstractC0985Q3 = (AbstractC0985Q1) it2.next();
                    if (abstractC0985Q3 instanceof C0937I1) {
                        listM9974d = AbstractC9393x3.m9974d(abstractC0985Q3);
                    } else {
                        listM9974d = abstractC0985Q3 instanceof C1113k0 ? ((C1113k0) abstractC0985Q3).f3020c : c17689w;
                    }
                    AbstractC17686t.m19398v(listM9974d, arrayList2);
                }
                int iIndexOf2 = arrayList2.indexOf(c0937i2);
                String str6 = c0937i2.f2688d;
                mapM19244f = AbstractC17659D.m19244f(new C17309l(UiComponentConfig.Title.type, str6 != null ? str6 : ""), new C17309l("url", c0937i2.f2687c), new C17309l("citation_number", Integer.valueOf(iIndexOf2)));
            } else if (abstractC0985Q1 instanceof C0924G0) {
                C0918F0 c0918f0 = num != null ? (C0918F0) AbstractC17680n.m19344T(num.intValue(), ((C0924G0) abstractC0985Q1).f2669d) : null;
                String str7 = c0918f0 != null ? c0918f0.f2649a : null;
                if (str7 == null) {
                    str7 = "";
                }
                C17309l c17309l2 = new C17309l(UiComponentConfig.Title.type, str7);
                strM6157a = c0918f0 != null ? c0918f0.f2650b : null;
                mapM19244f = AbstractC17659D.m19244f(c17309l2, new C17309l("url", strM6157a != null ? strM6157a : ""));
            } else if (abstractC0985Q1 instanceof C0971O) {
                C0965N c0965n = num != null ? (C0965N) AbstractC17680n.m19344T(num.intValue(), ((C0971O) abstractC0985Q1).f2747c) : null;
                if (c0965n != null && (str3 = c0965n.f2740c) != null) {
                    strM6157a = AbstractC5722d.m6157a(str3);
                }
                mapM19244f = AbstractC0168G.m535x("host", strM6157a != null ? strM6157a : "");
            } else if (abstractC0985Q1 instanceof C1203z0) {
                if (num == null) {
                    AbstractC8160o6.m8731f(AbstractC8168p6.m8749b("SearchAnalytics", null), "No index was provided for ImageV2", null, null, 6);
                    return;
                }
                C1197y0 c1197y0 = (C1197y0) AbstractC17680n.m19344T(num.intValue(), ((C1203z0) abstractC0985Q1).f3165c);
                if (c1197y0 == null) {
                    AbstractC8160o6.m8731f(AbstractC8168p6.m8749b("SearchAnalytics", null), "No ImageV2 item was found for index " + num, null, null, 6);
                    return;
                }
                mapM19244f = AbstractC17659D.m19244f(new C17309l("url", c1197y0.f3152a), new C17309l(UiComponentConfig.Title.type, c1197y0.f3154c));
            } else if (abstractC0985Q1 instanceof C0901C1) {
                C0901C1 c0901c1 = (C0901C1) abstractC0985Q1;
                String str8 = c0901c1.f2631d;
                mapM19244f = AbstractC17659D.m19244f(new C17309l("url", str8 != null ? str8 : ""), new C17309l(UiComponentConfig.Title.type, c0901c1.f2630c));
            } else if (abstractC0985Q1 instanceof C0960M0) {
                C0954L0 c0954l0 = (C0954L0) AbstractC17680n.m19344T(num != null ? num.intValue() : 0, ((C0960M0) abstractC0985Q1).f2728c);
                String str9 = c0954l0 != null ? c0954l0.f2715c : null;
                if (str9 == null) {
                    str9 = "";
                }
                C17309l c17309l3 = new C17309l("url", str9);
                strM6157a = c0954l0 != null ? c0954l0.f2713a : null;
                mapM19244f = AbstractC17659D.m19244f(c17309l3, new C17309l(UiComponentConfig.Title.type, strM6157a != null ? strM6157a : ""));
            } else if (abstractC0985Q1 instanceof C0979P1) {
                C0979P1 c0979p1 = (C0979P1) abstractC0985Q1;
                mapM19244f = AbstractC17659D.m19244f(new C17309l("site", c0979p1.f2763d.f2753Y), new C17309l("url", c0979p1.f2762c));
            } else {
                if (!(abstractC0985Q1 instanceof C0911E ? true : abstractC0985Q1 instanceof C1092h0 ? true : abstractC0985Q1 instanceof C1149q0 ? true : abstractC0985Q1 instanceof C1168t1 ? true : abstractC0985Q1 instanceof C1186w1 ? true : abstractC0985Q1 instanceof C1204z1 ? true : abstractC0985Q1 instanceof C0919F1 ? true : abstractC0985Q1 instanceof C1013V0 ? true : abstractC0985Q1 instanceof C1031Y0 ? true : abstractC0985Q1 instanceof C0995S0 ? true : abstractC0985Q1 instanceof C1119l0 ? true : abstractC0985Q1 instanceof C1131n0 ? true : abstractC0985Q1 instanceof C0893B)) {
                    throw new C0644w();
                }
                mapM19244f = C17690x.f56481Y;
            }
        }
        this.f63989a.mo21447a(abstractC20882b, AbstractC17659D.m19248j(mapM19244f2, mapM19244f));
    }
}
