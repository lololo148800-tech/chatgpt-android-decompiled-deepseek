package p828j8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p087D7.AbstractC1976c;
import p1113xn.C21307a;
import p279L1.VOxZ.sVoFrD;
import p588Y2.C9642z;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p700d8.C13044e;
import p721e7.C13289a;
import p721e7.InterfaceC13290b;
import p743f7.C13579e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p960q9.C18655i;

/* JADX INFO: renamed from: j8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16176a implements InterfaceC13290b {

    /* JADX INFO: renamed from: d */
    public static final byte[] f50216d;

    /* JADX INFO: renamed from: a */
    public final String f50217a;

    /* JADX INFO: renamed from: b */
    public final C18655i f50218b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11256c f50219c;

    static {
        byte[] bytes = Separators.RETURN.getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        f50216d = bytes;
    }

    public C16176a(String str, C18655i c18655i, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f50217a = str;
        this.f50218b = c18655i;
        this.f50219c = internalLogger;
    }

    @Override // p721e7.InterfaceC13290b
    /* JADX INFO: renamed from: a */
    public final C13289a mo6986a(C11682a context, List batchData) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(batchData, "batchData");
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "randomUUID().toString()");
        String str = sVoFrD.DVyyLgQyCn;
        String str2 = context.f35415g;
        C17309l c17309l = new C17309l(str, str2);
        String str3 = "service:" + context.f35411c;
        String str4 = "version:" + context.f35413e;
        StringBuilder sb2 = new StringBuilder("sdk_version:");
        String str5 = context.f35416h;
        sb2.append(str5);
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(str3, str4, sb2.toString(), "env:" + context.f35412d);
        String str6 = context.f35414f;
        if (str6.length() > 0) {
            arrayListM19384m.add("variant:".concat(str6));
        }
        Map mapM19244f = AbstractC17659D.m19244f(c17309l, new C17309l("ddtags", AbstractC17680n.m19349Y(arrayListM19384m, Separators.COMMA, null, null, 0, null, null, 62)));
        Locale locale = Locale.US;
        String str7 = this.f50217a;
        if (str7 == null) {
            str7 = context.f35409a.f31170Z;
        }
        String str8 = String.format(locale, "%s/api/v2/rum", Arrays.copyOf(new Object[]{str7}, 1));
        ArrayList arrayList = new ArrayList(mapM19244f.size());
        for (Map.Entry entry : mapM19244f.entrySet()) {
            arrayList.add(entry.getKey() + Separators.EQUALS + entry.getValue());
        }
        String strM11052j = AbstractC10763a.m11052j(str8, AbstractC17680n.m19349Y(arrayList, Separators.AND, Separators.QUESTION, null, 0, null, null, 60));
        Map mapM19244f2 = AbstractC17659D.m19244f(new C17309l("DD-API-KEY", context.f35410b), new C17309l("DD-EVP-ORIGIN", str2), new C17309l("DD-EVP-ORIGIN-VERSION", str5), new C17309l("DD-REQUEST-ID", string));
        C18655i c18655i = this.f50218b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List list = batchData;
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            C13579e c13579e = (C13579e) it.next();
            C13044e c13044e = (C13044e) ((C9642z) c18655i.f59414Z).mo3913N(c13579e.f42930b);
            if (c13044e instanceof C13044e) {
                linkedHashMap2.put(c13579e, c13044e);
                String str9 = c13044e.f41453a;
                Long l4 = (Long) linkedHashMap.get(str9);
                long j10 = c13044e.f41454b;
                if (l4 == null) {
                    linkedHashMap.put(str9, Long.valueOf(j10));
                } else {
                    linkedHashMap.put(str9, Long.valueOf(Math.max(j10, l4.longValue())));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            C13579e c13579e2 = (C13579e) obj;
            if (linkedHashMap2.containsKey(c13579e2)) {
                C13044e c13044e2 = (C13044e) AbstractC17659D.m19243e(linkedHashMap2, c13579e2);
                if (c13044e2.f41454b == ((Number) AbstractC17659D.m19243e(linkedHashMap, c13044e2.f41453a)).longValue()) {
                }
            }
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C13579e) it2.next()).f42929a);
        }
        return new C13289a(string, "RUM Request", strM11052j, mapM19244f2, AbstractC1976c.m3147d(arrayList3, f50216d, new byte[0], new byte[0], this.f50219c), "text/plain;charset=UTF-8");
    }
}
