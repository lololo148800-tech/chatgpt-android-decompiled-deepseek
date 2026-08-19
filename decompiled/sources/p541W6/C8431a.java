package p541W6;

import com.auth0.android.request.internal.AbstractC11847f;
import fo.C13711h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.C17348o;
import mo.C17349p;
import mo.C17352s;
import mo.C17355v;
import mo.C17356w;
import p1113xn.AbstractC21322p;
import p214Ib.C3669l;
import p571X9.AbstractC9123E2;
import p571X9.AbstractC9276e0;
import p571X9.AbstractC9282f0;
import p594Y9.AbstractC9942o3;
import p712dp.C13187c;
import p791hj.C14522e;
import p909nm.AbstractC17659D;
import p909nm.C17690x;

/* JADX INFO: renamed from: W6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8431a implements InterfaceC8434d {

    /* JADX INFO: renamed from: d */
    public static final C17352s f26250d;

    /* JADX INFO: renamed from: a */
    public final Map f26251a = C17690x.f56481Y;

    /* JADX INFO: renamed from: b */
    public final C3669l f26252b = AbstractC11847f.f35979a;

    /* JADX INFO: renamed from: c */
    public final C17356w f26253c;

    static {
        Pattern pattern = C17352s.f55296e;
        f26250d = AbstractC9282f0.m9857c("application/json; charset=utf-8");
    }

    public C8431a() {
        C17355v c17355v = new C17355v();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c17355v.m19031a(10, timeUnit);
        c17355v.m19033c(10, timeUnit);
        this.f26253c = new C17356w(c17355v);
    }

    @Override // p541W6.InterfaceC8434d
    /* JADX INFO: renamed from: a */
    public final C8436f mo9037a(String str, C13711h options) {
        AbstractC16544l.m18094g(options, "options");
        C13187c c13187c = new C13187c(1);
        c13187c.m14844f(null, str);
        C17349p c17349pM14841c = c13187c.m14841c();
        C14522e c14522e = new C14522e(3);
        C13187c c13187cM19025f = c17349pM14841c.m19025f();
        AbstractC9942o3 abstractC9942o3 = (AbstractC9942o3) options.f43259Z;
        boolean z6 = abstractC9942o3 instanceof C8433c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) options.f43260o0;
        if (z6) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry2.getKey();
                Object value = entry2.getValue();
                AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.String");
                c13187cM19025f.m14840b(str2, (String) value);
                arrayList.add(c13187cM19025f);
            }
            c14522e.m16028v(abstractC9942o3.toString(), null);
        } else {
            String strM4375i = this.f26252b.m4375i(linkedHashMap);
            AbstractC16544l.m18093f(strM4375i, "gson.toJson(options.parameters)");
            c14522e.m16028v(abstractC9942o3.toString(), AbstractC9123E2.m9653a(strM4375i, f26250d));
        }
        LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(this.f26251a, (LinkedHashMap) options.f43261p0);
        String[] strArr = new String[linkedHashMapM19248j.size() * 2];
        int i10 = 0;
        for (Map.Entry entry3 : linkedHashMapM19248j.entrySet()) {
            String str3 = (String) entry3.getKey();
            String str4 = (String) entry3.getValue();
            String string = AbstractC21322p.m21711s0(str3).toString();
            String string2 = AbstractC21322p.m21711s0(str4).toString();
            AbstractC9276e0.m9845b(string);
            AbstractC9276e0.m9846c(string2, string);
            strArr[i10] = string;
            strArr[i10 + 1] = string2;
            i10 += 2;
        }
        C17348o c17348o = new C17348o(strArr);
        c14522e.f45762Z = c13187cM19025f.m14841c();
        c14522e.m16025s(c17348o);
        C17327D c17327dM20063e = this.f26253c.m19035b(c14522e.m16017i()).m20063e();
        AbstractC17329F abstractC17329F = c17327dM20063e.f55179s0;
        AbstractC16544l.m18091d(abstractC17329F);
        return new C8436f(c17327dM20063e.f55176p0, abstractC17329F.mo18988O0().mo1349T0(), c17327dM20063e.f55178r0.m19017r());
    }
}
