package p544W9;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p346Nn.AbstractC5886a;
import p346Nn.C5871K;
import p346Nn.InterfaceC5892d;
import p523V9.AbstractC8142m4;
import p604Yk.C10077b;
import p857kl.AbstractC16449P;
import p857kl.C16445L;
import p857kl.C16447N;
import p857kl.C16452T;

/* JADX INFO: renamed from: W9.q4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8699q4 {
    /* JADX INFO: renamed from: a */
    public static final C16447N m9401a(String urlString) {
        AbstractC16544l.m18094g(urlString, "urlString");
        C16447N c16447n = new C16447N();
        AbstractC16449P.m18026b(c16447n, urlString);
        return c16447n;
    }

    /* JADX INFO: renamed from: b */
    public static final C16452T m9402b(C16447N builder) {
        AbstractC16544l.m18094g(builder, "builder");
        C16447N c16447n = new C16447N();
        m9404d(c16447n, builder);
        return c16447n.m18021b();
    }

    /* JADX INFO: renamed from: c */
    public static void m9403c(InterfaceC5892d interfaceC5892d, AbstractC5886a format) {
        AbstractC16544l.m18094g(format, "format");
        if (format instanceof C5871K) {
            interfaceC5892d.mo6297m(((C5871K) format).f19190a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9404d(C16447N c16447n, C16447N url) {
        AbstractC16544l.m18094g(c16447n, "<this>");
        AbstractC16544l.m18094g(url, "url");
        c16447n.f51021d = url.f51021d;
        String str = url.f51018a;
        AbstractC16544l.m18094g(str, "<set-?>");
        c16447n.f51018a = str;
        c16447n.m18024e(url.f51020c);
        List list = url.f51025h;
        AbstractC16544l.m18094g(list, "<set-?>");
        c16447n.f51025h = list;
        c16447n.f51022e = url.f51022e;
        c16447n.f51023f = url.f51023f;
        C16445L c16445lM9346b = AbstractC8657j4.m9346b();
        AbstractC8142m4.m8673a(c16445lM9346b, url.f51026i);
        c16447n.f51026i = c16445lM9346b;
        c16447n.f51027j = new C10077b(c16445lM9346b);
        String str2 = url.f51024g;
        AbstractC16544l.m18094g(str2, "<set-?>");
        c16447n.f51024g = str2;
        c16447n.f51019b = url.f51019b;
    }
}
