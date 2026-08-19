package p404Qe;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import android.text.Html;
import android.widget.TextView;
import bf.C11349D;
import bf.C11370Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p072Ci.C1699d;
import p1156zj.AbstractC22180o0;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p165G9.AbstractC3021g;
import p229J0.C3991U3;
import p324Mn.C5551u;
import p537W0.C8410b;
import p544W9.AbstractC8681n4;
import p729ej.C13430u;
import p857kl.AbstractC16435B;
import p857kl.C16447N;
import p857kl.C16477y;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;
import p925oe.C18098X;
import p925oe.C18102a0;
import p936p0.C18265e;
import p948pi.C18422e;

/* JADX INFO: renamed from: Qe.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6665a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21433Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f21434Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6665a(String str, int i10) {
        super(1);
        this.f21433Y = i10;
        this.f21434Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        String str = this.f21434Z;
        switch (this.f21433Y) {
            case 0:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{"parse_xls"});
                AbstractC8681n4.m9374c(url, new String[]{str});
                return c17296c;
            case 1:
                C16477y headers = (C16477y) obj;
                AbstractC16544l.m18094g(headers, "$this$headers");
                List list = AbstractC16435B.f50983a;
                headers.m4522M(SIPHeaderNames.AUTHORIZATION, "Bearer " + str);
                return c17296c;
            case 2:
                String deviceName = (String) obj;
                AbstractC16544l.m18094g(deviceName, "deviceName");
                return Boolean.valueOf(deviceName.equals(str));
            case 3:
                return Integer.valueOf(AbstractC3021g.m3873a((String) ((C17309l) obj).f55136Y, str));
            case 4:
                C16447N url2 = (C16447N) obj;
                AbstractC16544l.m18094g(url2, "$this$url");
                AbstractC8681n4.m9374c(url2, new String[]{str, "interpreter/download"});
                return c17296c;
            case 5:
                C11370Z gizmos = (C11370Z) obj;
                AbstractC16544l.m18094g(gizmos, "gizmos");
                List list2 = gizmos.f34376b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!AbstractC16544l.m18089b(((C11349D) obj2).f34318a, str)) {
                        arrayList.add(obj2);
                    }
                }
                return C11370Z.m12781a(gizmos, arrayList, null, 5);
            case 6:
                C11349D snorlax = (C11349D) obj;
                AbstractC16544l.m18094g(snorlax, "snorlax");
                if (AbstractC16544l.m18089b(snorlax.f34318a, str)) {
                    return null;
                }
                return snorlax;
            case 7:
                C16447N url3 = (C16447N) obj;
                AbstractC16544l.m18094g(url3, "$this$url");
                AbstractC8681n4.m9374c(url3, new String[]{str});
                return c17296c;
            case 8:
                C16447N url4 = (C16447N) obj;
                AbstractC16544l.m18094g(url4, "$this$url");
                AbstractC8681n4.m9374c(url4, new String[]{str, "user-settings"});
                return c17296c;
            case 9:
                C1699d settings = (C1699d) obj;
                AbstractC16544l.m18094g(settings, "settings");
                return C1699d.m2511a(settings, null, null, null, null, null, this.f21434Z, null, null, null, 2015);
            case 10:
                C1699d settings2 = (C1699d) obj;
                AbstractC16544l.m18094g(settings2, "settings");
                return C1699d.m2511a(settings2, null, null, null, null, null, null, this.f21434Z, null, null, 1983);
            case 11:
                C2963j c2963j = (C2963j) obj;
                AbstractC2973t.m3811f(c2963j, str);
                AbstractC2973t.m3812g(c2963j, 5);
                return c17296c;
            case 12:
                C16447N url5 = (C16447N) obj;
                AbstractC16544l.m18094g(url5, "$this$url");
                AbstractC8681n4.m9374c(url5, new String[]{str});
                return c17296c;
            case 13:
                TextView it = (TextView) obj;
                AbstractC16544l.m18094g(it, "it");
                it.setText(Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str));
                return c17296c;
            case 14:
                return new C18422e(str, false, (C5551u) null, 14);
            case 15:
                C18102a0 state = (C18102a0) obj;
                AbstractC16544l.m18094g(state, "state");
                Set set = state.f57743a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : set) {
                    if (!AbstractC16544l.m18089b(((C18098X) obj3).f57738a, str)) {
                        arrayList2.add(obj3);
                    }
                }
                return new C18102a0(AbstractC17680n.m19328G0(arrayList2));
            case 16:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C3991U3(str, 15), true, -608803892), 3);
                return c17296c;
            case 17:
                Map it2 = (Map) obj;
                AbstractC16544l.m18094g(it2, "it");
                it2.remove(str);
                return c17296c;
            case 18:
                return Boolean.valueOf(AbstractC16544l.m18089b((String) obj, str));
            default:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                AbstractC22180o0 abstractC22180o0Mo22377c = ((AbstractC22180o0) action.f42521b).mo22377c();
                if (abstractC22180o0Mo22377c != null) {
                    action.f42521b = abstractC22180o0Mo22377c.m22398a(str);
                }
                return c17296c;
        }
    }
}
