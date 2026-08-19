package p905nd;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17349p;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21329w;
import p364Oh.C6226E;
import p541W6.C8431a;
import p541W6.InterfaceC8434d;
import p712dp.C13187c;
import p813ij.C15026j;

/* JADX INFO: renamed from: nd.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C17591s {

    /* JADX INFO: renamed from: a */
    public final C17349p f56322a;

    /* JADX INFO: renamed from: b */
    public final C15026j f56323b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8434d f56324c = new C8431a();

    public C17591s(C6226E c6226e) {
        C17349p c17349pM14841c = null;
        Locale locale = Locale.ROOT;
        String strM534w = AbstractC0168G.m534w(locale, "ROOT", "auth0.openai.com", locale, "this as java.lang.String).toLowerCase(locale)");
        if (AbstractC21329w.m21734u(strM534w, "http://", false)) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("Invalid domain url: '", "auth0.openai.com", "'. Only HTTPS domain URLs are supported. If no scheme is passed, HTTPS will be used.").toString());
        }
        strM534w = AbstractC21329w.m21734u(strM534w, "https://", false) ? strM534w : "https://".concat(strM534w);
        AbstractC16544l.m18094g(strM534w, "<this>");
        try {
            C13187c c13187c = new C13187c(1);
            c13187c.m14844f(null, strM534w);
            c17349pM14841c = c13187c.m14841c();
        } catch (IllegalArgumentException unused) {
        }
        this.f56322a = c17349pM14841c;
        if (c17349pM14841c == null) {
            throw new IllegalArgumentException(String.format("Invalid domain url: '%s'", Arrays.copyOf(new Object[]{"auth0.openai.com"}, 1)).toString());
        }
        this.f56323b = new C15026j(11);
    }
}
