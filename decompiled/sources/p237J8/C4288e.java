package p237J8;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import jm.InterfaceC16271b;
import kotlin.jvm.internal.AbstractC16544l;
import p1101x8.C21156a;
import p164G8.C3007a;
import p164G8.C3008b;

/* JADX INFO: renamed from: J8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4288e implements InterfaceC4290g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13957a;

    /* JADX INFO: renamed from: b */
    public final Object f13958b;

    public C4288e() {
        this.f13957a = 0;
        this.f13958b = C21156a.f67231a;
    }

    @Override // p237J8.InterfaceC4290g
    /* JADX INFO: renamed from: a */
    public final void mo5038a(C3008b c3008b, InterfaceC16271b interfaceC16271b) {
        switch (this.f13957a) {
            case 0:
                BigInteger traceId = c3008b.f9041d;
                ((C21156a) this.f13958b).getClass();
                String str = "";
                AbstractC16544l.m18094g(traceId, "traceId");
                try {
                    String string = traceId.and(C21156a.f67232b).toString();
                    AbstractC16544l.m18093f(string, "{\n            traceId.an…ASK).toString()\n        }");
                    str = string;
                } catch (ArithmeticException | NumberFormatException unused) {
                }
                String strM21592a = C21156a.m21592a(traceId);
                interfaceC16271b.mo389e("x-datadog-trace-id", str);
                interfaceC16271b.mo389e("x-datadog-parent-id", c3008b.f9042e.toString());
                C3007a c3007aM3858p = c3008b.f9039b.m3858p();
                String str2 = c3007aM3858p != null ? c3007aM3858p.f9032a.f9050m : c3008b.f9050m;
                if (str2 != null) {
                    interfaceC16271b.mo389e("x-datadog-origin", str2);
                }
                for (Map.Entry entry : c3008b.f9040c.entrySet()) {
                    String str3 = "ot-baggage-" + ((String) entry.getKey());
                    String strEncode = (String) entry.getValue();
                    try {
                        strEncode = URLEncoder.encode(strEncode, "UTF-8");
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    interfaceC16271b.mo389e(str3, strEncode);
                }
                interfaceC16271b.mo389e("x-datadog-tags", "_dd.p.tid=" + strM21592a);
                interfaceC16271b.mo389e("x-datadog-sampling-priority", "1");
                break;
            default:
                Iterator it = ((ArrayList) this.f13958b).iterator();
                while (it.hasNext()) {
                    ((InterfaceC4290g) it.next()).mo5038a(c3008b, interfaceC16271b);
                }
                break;
        }
    }

    public C4288e(ArrayList arrayList) {
        this.f13957a = 1;
        this.f13958b = arrayList;
    }
}
