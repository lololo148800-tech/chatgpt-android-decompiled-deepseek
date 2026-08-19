package p1027tp;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Method;
import java.util.Map;
import mo.C17348o;
import p228J.C3847l0;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: tp.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C20037B extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63457b;

    /* JADX INFO: renamed from: c */
    public final Method f63458c;

    /* JADX INFO: renamed from: d */
    public final int f63459d;

    public /* synthetic */ C20037B(Method method, int i10, int i11) {
        this.f63457b = i11;
        this.f63458c = method;
        this.f63459d = i10;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        switch (this.f63457b) {
            case 0:
                Map map = (Map) obj;
                int i10 = this.f63459d;
                Method method = this.f63458c;
                if (map == null) {
                    throw AbstractC20056V.m20885k(method, i10, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC20056V.m20885k(method, i10, "Header map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC20056V.m20885k(method, i10, AbstractC10763a.m11054l("Header map contained null value for key '", str, bQBnquXS.VpmLTmDhbk), new Object[0]);
                    }
                    c20045j.m20862b(str, value.toString());
                }
                return;
            case 1:
                C17348o c17348o = (C17348o) obj;
                if (c17348o == null) {
                    int i11 = this.f63459d;
                    throw AbstractC20056V.m20885k(this.f63458c, i11, "Headers parameter must not be null.", new Object[0]);
                }
                C3847l0 c3847l0 = c20045j.f63483f;
                c3847l0.getClass();
                int size = c17348o.size();
                for (int i12 = 0; i12 < size; i12++) {
                    c3847l0.m4575b(c17348o.m19014m(i12), c17348o.m19018s(i12));
                }
                return;
            default:
                if (obj != null) {
                    c20045j.f63480c = obj.toString();
                    return;
                } else {
                    int i13 = this.f63459d;
                    throw AbstractC20056V.m20885k(this.f63458c, i13, "@Url parameter is null.", new Object[0]);
                }
        }
    }
}
