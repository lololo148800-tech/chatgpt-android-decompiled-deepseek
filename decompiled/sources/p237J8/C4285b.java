package p237J8;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import jm.InterfaceC16271b;
import p1113xn.AbstractC21322p;
import p138F8.vJO.anhfj;
import p164G8.C3007a;
import p164G8.C3008b;

/* JADX INFO: renamed from: J8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4285b implements InterfaceC4290g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13952a;

    public /* synthetic */ C4285b(int i10) {
        this.f13952a = i10;
    }

    @Override // p237J8.InterfaceC4290g
    /* JADX INFO: renamed from: a */
    public final void mo5038a(C3008b c3008b, InterfaceC16271b interfaceC16271b) {
        switch (this.f13952a) {
            case 0:
                try {
                    String string = c3008b.f9041d.toString(16);
                    Locale locale = Locale.US;
                    String lowerCase = string.toLowerCase(locale);
                    String lowerCase2 = c3008b.f9042e.toString(16).toLowerCase(locale);
                    if (c3008b.m3841d()) {
                        interfaceC16271b.mo389e("b3", lowerCase + "-" + lowerCase2 + "-" + (c3008b.m3840c() > 0 ? AbstractC4286c.f13953a : AbstractC4286c.f13954b));
                    } else {
                        interfaceC16271b.mo389e("b3", lowerCase + "-" + lowerCase2);
                    }
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case 1:
                try {
                    String string2 = c3008b.f9041d.toString(16);
                    Locale locale2 = Locale.US;
                    interfaceC16271b.mo389e("X-B3-TraceId", string2.toLowerCase(locale2));
                    interfaceC16271b.mo389e("X-B3-SpanId", c3008b.f9042e.toString(16).toLowerCase(locale2));
                    if (c3008b.m3841d()) {
                        interfaceC16271b.mo389e("X-B3-Sampled", c3008b.m3840c() > 0 ? AbstractC4287d.f13955a : AbstractC4287d.f13956b);
                    }
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            case 2:
                interfaceC16271b.mo389e("Trace-ID", c3008b.f9041d.toString());
                interfaceC16271b.mo389e("Span-ID", c3008b.f9042e.toString());
                interfaceC16271b.mo389e("Parent_ID", c3008b.f9043f.toString());
                for (Map.Entry entry : c3008b.f9040c.entrySet()) {
                    String str = "Baggage-" + ((String) entry.getKey());
                    String strEncode = (String) entry.getValue();
                    try {
                        strEncode = URLEncoder.encode(strEncode, "UTF-8");
                    } catch (UnsupportedEncodingException unused3) {
                    }
                    interfaceC16271b.mo389e(str, strEncode);
                }
                break;
            default:
                try {
                    String string3 = c3008b.f9041d.toString(16);
                    Locale locale3 = Locale.US;
                    String lowerCase3 = string3.toLowerCase(locale3);
                    String lowerCase4 = c3008b.f9042e.toString(16).toLowerCase(locale3);
                    String str2 = c3008b.m3840c() > 0 ? AbstractC4292i.f13966a : AbstractC4292i.f13967b;
                    C3007a c3007aM3858p = c3008b.f9039b.m3858p();
                    String str3 = c3007aM3858p != null ? c3007aM3858p.f9032a.f9050m : c3008b.f9050m;
                    interfaceC16271b.mo389e("traceparent", "00-" + AbstractC21322p.m21686T(32, lowerCase3) + "-" + AbstractC21322p.m21686T(16, lowerCase4) + "-0" + str2);
                    StringBuilder sb2 = new StringBuilder(anhfj.qaHJnQbgKaW);
                    sb2.append(str2);
                    sb2.append(";p:");
                    sb2.append(lowerCase4);
                    if (str3 != null) {
                        sb2.append(";o:");
                        sb2.append(str3.toLowerCase(locale3));
                    }
                    interfaceC16271b.mo389e("tracestate", sb2.toString());
                } catch (NumberFormatException unused4) {
                    return;
                }
                break;
        }
    }
}
