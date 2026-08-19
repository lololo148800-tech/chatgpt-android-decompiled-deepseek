package p988rc;

import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3587c;
import p204I1.C3604t;
import p492U1.C7548m;

/* JADX INFO: renamed from: rc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18919g {

    /* JADX INFO: renamed from: a */
    public final C3587c f60373a = new C3587c(16);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f60374b = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public static void m20268b(C18919g c18919g, C18913a c18913a) {
        c18919g.getClass();
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        c18919g.f60374b.put("inline:".concat(string), c18913a);
        C3587c c3587c = c18919g.f60373a;
        boolean z6 = c18913a.f60348a;
        if (z6) {
            c3587c.m4295g(new C3604t(Integer.MIN_VALUE, Integer.MIN_VALUE, C7548m.f23909c, null, null, null, 0, Integer.MIN_VALUE, null));
        }
        if ("�".length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        c3587c.m4294f("androidx.compose.foundation.text.inlineContent", string);
        c3587c.m4291c("�");
        c3587c.m4292d();
        if (z6) {
            c3587c.m4292d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20269a(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f60373a.m4291c(text);
    }

    /* JADX INFO: renamed from: c */
    public final void m20270c(int i10) {
        this.f60373a.m4293e(i10);
    }

    /* JADX INFO: renamed from: d */
    public final int m20271d(AbstractC18928p format) {
        AbstractC16544l.m18094g(format, "format");
        LinkedHashMap tags = this.f60374b;
        AbstractC16544l.m18094g(tags, "tags");
        String strConcat = format.f60393a;
        if (strConcat == null) {
            String string = UUID.randomUUID().toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            tags.put(string, format);
            strConcat = "format:".concat(string);
        }
        return this.f60373a.m4294f(AbstractC18928p.f60391b, strConcat);
    }
}
