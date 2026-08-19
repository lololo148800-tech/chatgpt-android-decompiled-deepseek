package p1027tp;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import mo.C17327D;
import mo.C17328E;
import mo.C17348o;
import mo.EnumC17357x;
import p791hj.C14522e;

/* JADX INFO: renamed from: tp.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C20048M<T> {

    /* JADX INFO: renamed from: a */
    public final C17327D f63525a;

    /* JADX INFO: renamed from: b */
    public final Object f63526b;

    /* JADX INFO: renamed from: c */
    public final C17328E f63527c;

    public C20048M(C17327D c17327d, Object obj, C17328E c17328e) {
        this.f63525a = c17327d;
        this.f63526b = obj;
        this.f63527c = c17328e;
    }

    /* JADX INFO: renamed from: a */
    public static C20048M m20868a(C17328E c17328e) {
        throw new IllegalArgumentException("code < 400: 0");
    }

    /* JADX INFO: renamed from: b */
    public static C20048M m20869b() {
        ArrayList arrayList = new ArrayList(20);
        EnumC17357x enumC17357x = EnumC17357x.HTTP_1_1;
        C14522e c14522e = new C14522e(3);
        c14522e.m16010B("http://localhost/");
        return m20870c(null, new C17327D(c14522e.m16017i(), enumC17357x, "OK", RCHTTPStatusCodes.SUCCESS, null, new C17348o((String[]) arrayList.toArray(new String[0])), null, null, null, null, 0L, 0L, null));
    }

    /* JADX INFO: renamed from: c */
    public static C20048M m20870c(Object obj, C17327D c17327d) {
        if (c17327d.m18985a()) {
            return new C20048M(c17327d, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f63525a.toString();
    }
}
