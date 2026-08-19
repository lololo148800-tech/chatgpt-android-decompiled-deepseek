package p933oo;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17329F;
import mo.C17326C;
import mo.C17327D;
import mo.C17348o;
import mo.C17358y;
import mo.EnumC17357x;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import no.AbstractC17708b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p813ij.C15026j;
import p974qo.C18792h;
import ro.C19261e;

/* JADX INFO: renamed from: oo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C18251b implements InterfaceC17351r {
    @Override // mo.InterfaceC17351r
    public final C17327D intercept(InterfaceC17350q interfaceC17350q) {
        String str;
        String str2;
        C19261e c19261e = (C19261e) interfaceC17350q;
        System.currentTimeMillis();
        C17358y request = c19261e.f61057e;
        AbstractC16544l.m18094g(request, "request");
        Object obj = null;
        C15026j c15026j = new C15026j(request, obj);
        if (request.m19037a().f55225j) {
            c15026j = new C15026j(obj, obj);
        }
        C18792h call = c19261e.f61053a;
        boolean z6 = call instanceof C18792h;
        C17358y c17358y = (C17358y) c15026j.f46724Y;
        C17327D c17327d = (C17327D) c15026j.f46725Z;
        if (c17358y == null && c17327d == null) {
            C17327D c17327d2 = new C17327D(request, EnumC17357x.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new C17348o((String[]) new ArrayList(20).toArray(new String[0])), AbstractC17708b.f56538c, null, null, null, -1L, System.currentTimeMillis(), null);
            AbstractC16544l.m18094g(call, "call");
            return c17327d2;
        }
        if (c17358y == null) {
            AbstractC16544l.m18091d(c17327d);
            C17326C c17326cM18986e = c17327d.m18986e();
            C17327D c17327dM19771a = C18250a.m19771a(c17327d);
            C17326C.m18983b("cacheResponse", c17327dM19771a);
            c17326cM18986e.f55168i = c17327dM19771a;
            C17327D c17327dM18984a = c17326cM18986e.m18984a();
            AbstractC16544l.m18094g(call, "call");
            return c17327dM18984a;
        }
        if (c17327d != null) {
            AbstractC16544l.m18094g(call, "call");
        }
        C17327D c17327dM20335b = c19261e.m20335b(c17358y);
        String str3 = "networkResponse";
        if (c17327d == null) {
            str = "networkResponse";
        } else {
            if (c17327dM20335b.f55176p0 == 304) {
                C17326C c17326cM18986e2 = c17327d.m18986e();
                C17348o c17348o = c17327dM20335b.f55178r0;
                ArrayList arrayList = new ArrayList(20);
                C17348o c17348o2 = c17327d.f55178r0;
                int size = c17348o2.size();
                int i10 = 0;
                while (i10 < size) {
                    String name = c17348o2.m19014m(i10);
                    int i11 = size;
                    String value = c17348o2.m19018s(i10);
                    C17348o c17348o3 = c17348o2;
                    if (SIPHeaderNames.WARNING.equalsIgnoreCase(name)) {
                        str2 = str3;
                        if (AbstractC21329w.m21734u(value, "1", false)) {
                        }
                        i10++;
                        size = i11;
                        c17348o2 = c17348o3;
                        str3 = str2;
                    } else {
                        str2 = str3;
                    }
                    if (SIPHeaderNames.CONTENT_LENGTH.equalsIgnoreCase(name) || SIPHeaderNames.CONTENT_ENCODING.equalsIgnoreCase(name) || SIPHeaderNames.CONTENT_TYPE.equalsIgnoreCase(name) || !C18250a.m19772b(name) || c17348o.m19012f(name) == null) {
                        AbstractC16544l.m18094g(name, "name");
                        AbstractC16544l.m18094g(value, "value");
                        arrayList.add(name);
                        arrayList.add(AbstractC21322p.m21711s0(value).toString());
                    }
                    i10++;
                    size = i11;
                    c17348o2 = c17348o3;
                    str3 = str2;
                }
                String str4 = str3;
                int size2 = c17348o.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String name2 = c17348o.m19014m(i12);
                    if (!SIPHeaderNames.CONTENT_LENGTH.equalsIgnoreCase(name2) && !SIPHeaderNames.CONTENT_ENCODING.equalsIgnoreCase(name2) && !SIPHeaderNames.CONTENT_TYPE.equalsIgnoreCase(name2) && C18250a.m19772b(name2)) {
                        String value2 = c17348o.m19018s(i12);
                        AbstractC16544l.m18094g(name2, "name");
                        AbstractC16544l.m18094g(value2, "value");
                        arrayList.add(name2);
                        arrayList.add(AbstractC21322p.m21711s0(value2).toString());
                    }
                }
                c17326cM18986e2.f55165f = new C17348o((String[]) arrayList.toArray(new String[0])).m19016q();
                c17326cM18986e2.f55170k = c17327dM20335b.f55183w0;
                c17326cM18986e2.f55171l = c17327dM20335b.f55184x0;
                C17327D c17327dM19771a2 = C18250a.m19771a(c17327d);
                C17326C.m18983b("cacheResponse", c17327dM19771a2);
                c17326cM18986e2.f55168i = c17327dM19771a2;
                C17327D c17327dM19771a3 = C18250a.m19771a(c17327dM20335b);
                C17326C.m18983b(str4, c17327dM19771a3);
                c17326cM18986e2.f55167h = c17327dM19771a3;
                c17326cM18986e2.m18984a();
                AbstractC17329F abstractC17329F = c17327dM20335b.f55179s0;
                AbstractC16544l.m18091d(abstractC17329F);
                abstractC17329F.close();
                AbstractC16544l.m18091d(null);
                throw null;
            }
            str = "networkResponse";
            AbstractC17329F abstractC17329F2 = c17327d.f55179s0;
            if (abstractC17329F2 != null) {
                AbstractC17708b.m19412d(abstractC17329F2);
            }
        }
        C17326C c17326cM18986e3 = c17327dM20335b.m18986e();
        C17327D c17327dM19771a4 = C18250a.m19771a(c17327d);
        C17326C.m18983b("cacheResponse", c17327dM19771a4);
        c17326cM18986e3.f55168i = c17327dM19771a4;
        C17327D c17327dM19771a5 = C18250a.m19771a(c17327dM20335b);
        C17326C.m18983b(str, c17327dM19771a5);
        c17326cM18986e3.f55167h = c17327dM19771a5;
        return c17326cM18986e3.m18984a();
    }
}
