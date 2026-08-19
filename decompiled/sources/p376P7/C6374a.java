package p376P7;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p087D7.AbstractC1976c;
import p1113xn.C21307a;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p721e7.C13289a;
import p721e7.InterfaceC13290b;
import p743f7.C13579e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: P7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6374a implements InterfaceC13290b {

    /* JADX INFO: renamed from: b */
    public static final byte[] f20765b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f20766c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f20767d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f20768a;

    static {
        Charset charset = C21307a.f67720a;
        byte[] bytes = Separators.COMMA.getBytes(charset);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        f20765b = bytes;
        byte[] bytes2 = "[".getBytes(charset);
        AbstractC16544l.m18093f(bytes2, "getBytes(...)");
        f20766c = bytes2;
        byte[] bytes3 = "]".getBytes(charset);
        AbstractC16544l.m18093f(bytes3, "getBytes(...)");
        f20767d = bytes3;
    }

    public C6374a(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f20768a = internalLogger;
    }

    @Override // p721e7.InterfaceC13290b
    /* JADX INFO: renamed from: a */
    public final C13289a mo6986a(C11682a context, List batchData) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(batchData, "batchData");
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "randomUUID().toString()");
        Locale locale = Locale.US;
        String str = context.f35409a.f31170Z;
        String str2 = context.f35415g;
        String str3 = String.format(locale, "%s/api/v2/logs?%s=%s", Arrays.copyOf(new Object[]{str, "ddsource", str2}, 3));
        Map mapM19244f = AbstractC17659D.m19244f(new C17309l("DD-API-KEY", context.f35410b), new C17309l("DD-EVP-ORIGIN", str2), new C17309l("DD-EVP-ORIGIN-VERSION", context.f35416h), new C17309l("DD-REQUEST-ID", string));
        List list = batchData;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C13579e) it.next()).f42929a);
        }
        return new C13289a(string, "Logs Request", str3, mapM19244f, AbstractC1976c.m3147d(arrayList, f20765b, f20766c, f20767d, this.f20768a), "application/json");
    }
}
