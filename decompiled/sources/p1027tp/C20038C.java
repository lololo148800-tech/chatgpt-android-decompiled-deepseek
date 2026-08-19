package p1027tp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.protobuf.AbstractC12107L1;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import mo.AbstractC17325B;
import mo.C17348o;
import p571X9.AbstractC9276e0;

/* JADX INFO: renamed from: tp.C */
/* JADX INFO: loaded from: classes2.dex */
public final class C20038C extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63460b = 0;

    /* JADX INFO: renamed from: c */
    public final Method f63461c;

    /* JADX INFO: renamed from: d */
    public final int f63462d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC20067k f63463e;

    /* JADX INFO: renamed from: f */
    public final Object f63464f;

    public C20038C(Method method, int i10, C17348o c17348o, InterfaceC20067k interfaceC20067k) {
        this.f63461c = method;
        this.f63462d = i10;
        this.f63464f = c17348o;
        this.f63463e = interfaceC20067k;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        InterfaceC20067k interfaceC20067k = this.f63463e;
        Object obj2 = this.f63464f;
        Method method = this.f63461c;
        int i10 = this.f63462d;
        switch (this.f63460b) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c20045j.m20863c((C17348o) obj2, (AbstractC17325B) interfaceC20067k.mo15962a(obj));
                    return;
                } catch (IOException e10) {
                    throw AbstractC20056V.m20885k(method, i10, AbstractC12107L1.m13824o(obj, "Unable to convert ", " to RequestBody"), e10);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC20056V.m20885k(method, i10, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC20056V.m20885k(method, i10, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC20056V.m20885k(method, i10, AbstractC10763a.m11054l("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    c20045j.m20863c(AbstractC9276e0.m9847d(SIPHeaderNames.CONTENT_DISPOSITION, AbstractC10763a.m11054l("form-data; name=\"", str, Separators.DOUBLE_QUOTE), "Content-Transfer-Encoding", (String) obj2), (AbstractC17325B) interfaceC20067k.mo15962a(value));
                }
                return;
        }
    }

    public C20038C(Method method, int i10, InterfaceC20067k interfaceC20067k, String str) {
        this.f63461c = method;
        this.f63462d = i10;
        this.f63463e = interfaceC20067k;
        this.f63464f = str;
    }
}
