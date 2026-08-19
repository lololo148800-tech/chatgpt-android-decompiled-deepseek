package p1146z8;

import android.gov.nist.core.Separators;
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

/* JADX INFO: renamed from: z8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21814a implements InterfaceC13290b {

    /* JADX INFO: renamed from: b */
    public static final byte[] f69184b;

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f69185a;

    static {
        byte[] bytes = Separators.RETURN.getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        f69184b = bytes;
    }

    public C21814a(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f69185a = internalLogger;
    }

    @Override // p721e7.InterfaceC13290b
    /* JADX INFO: renamed from: a */
    public final C13289a mo6986a(C11682a context, List batchData) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(batchData, "batchData");
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "randomUUID().toString()");
        String str = String.format(Locale.US, "%s/api/v2/spans", Arrays.copyOf(new Object[]{context.f35409a.f31170Z}, 1));
        Map mapM19244f = AbstractC17659D.m19244f(new C17309l("DD-API-KEY", context.f35410b), new C17309l("DD-EVP-ORIGIN", context.f35415g), new C17309l("DD-EVP-ORIGIN-VERSION", context.f35416h), new C17309l("DD-REQUEST-ID", string));
        List list = batchData;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C13579e) it.next()).f42929a);
        }
        return new C13289a(string, "Traces Request", str, mapM19244f, AbstractC1976c.m3147d(arrayList, f69184b, new byte[0], new byte[0], this.f69185a), "text/plain;charset=UTF-8");
    }
}
