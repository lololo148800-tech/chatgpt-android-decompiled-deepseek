package io.sentry;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.view.Surface;
import ao.C11172k;
import ao.InterfaceC11173k0;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.clientreport.C15333a;
import io.sentry.clientreport.C15335c;
import io.sentry.clientreport.C15336d;
import io.sentry.clientreport.C15338f;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.clientreport.InterfaceC15339g;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15448u;
import io.sentry.util.C15498c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mo.C17327D;
import mo.InterfaceC17338e;
import np.InterfaceC17710b;
import p001A.C0023L0;
import p001A.C0090u;
import p004A2.InterfaceC0310a;
import p010A8.C0398a;
import p010A8.C0399b;
import p010A8.C0400c;
import p010A8.C0401d;
import p010A8.C0402e;
import p010A8.C0403f;
import p010A8.C0404g;
import p010A8.C0405h;
import p010A8.C0406i;
import p010A8.C0407j;
import p010A8.C0408k;
import p010A8.C0409l;
import p025An.C0624m;
import p025An.C0626n;
import p028B.C0710q;
import p030B2.C0781s;
import p049Bm.InterfaceC1436k;
import p084D4.AbstractC1933p0;
import p084D4.C1877A0;
import p087D7.AbstractC1976c;
import p087D7.C1975b;
import p1020t7.C19805c;
import p1022t9.C19820e;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p1060v9.AbstractC20502t;
import p1060v9.C20494l;
import p1102x9.C21158b;
import p1113xn.AbstractC21322p;
import p1142z3.C21744l;
import p1142z3.InterfaceC21739g;
import p1142z3.InterfaceC21740h;
import p117Eb.C2385o;
import p178H.C3129W;
import p178H.C3149i;
import p178H.C3164p0;
import p178H.C3165q;
import p214Ib.C3671n;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p225Im.InterfaceC3756d;
import p253K.AbstractC4502m;
import p283L5.AbstractC4941g;
import p301M.InterfaceC5221c;
import p372P3.InterfaceC6333o;
import p402Qc.C6593i;
import p422R7.C6816a;
import p422R7.C6817b;
import p422R7.C6818c;
import p422R7.C6819d;
import p422R7.C6820e;
import p422R7.C6821f;
import p422R7.C6822g;
import p422R7.C6823h;
import p422R7.C6824i;
import p422R7.C6825j;
import p451Sb.C7102a;
import p509Uk.C7718k;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8138m0;
import p532Vk.C8388a;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8589Y2;
import p544W9.AbstractC8656j3;
import p556Wk.AbstractC8910Y;
import p556Wk.C8907V;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p641a7.AbstractC10516b;
import p658b5.C11241l;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p666bl.C11500p;
import p676c7.C11682a;
import p676c7.C11685d;
import p676c7.C11688g;
import p692d0.AbstractC12978q;
import p692d0.C12959L;
import p692d0.C12977p;
import p754fl.C13694d;
import p765g7.InterfaceC13823a;
import p803i7.InterfaceC14938a;
import p817j$.util.DesugarTimeZone;
import p817j$.util.concurrent.ConcurrentHashMap;
import p827j7.C16175c;
import p849k7.C16354g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p974qo.C18792h;
import p994rk.C19067A1;

/* JADX INFO: renamed from: io.sentry.g1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15358g1 implements InterfaceC5221c, InterfaceC17338e, InterfaceC11173k0, InterfaceC15339g, InterfaceC21739g {

    /* JADX INFO: renamed from: o0 */
    public static volatile C15358g1 f47944o0;

    /* JADX INFO: renamed from: Y */
    public Object f47945Y;

    /* JADX INFO: renamed from: Z */
    public Object f47946Z;

    public /* synthetic */ C15358g1(Object obj, Object obj2) {
        this.f47945Y = obj;
        this.f47946Z = obj2;
    }

    /* JADX INFO: renamed from: i */
    public static EnumC15359h m16577i(EnumC15361h1 enumC15361h1) {
        if (EnumC15361h1.Event.equals(enumC15361h1)) {
            return EnumC15359h.Error;
        }
        if (EnumC15361h1.Session.equals(enumC15361h1)) {
            return EnumC15359h.Session;
        }
        if (EnumC15361h1.Transaction.equals(enumC15361h1)) {
            return EnumC15359h.Transaction;
        }
        if (EnumC15361h1.UserFeedback.equals(enumC15361h1)) {
            return EnumC15359h.UserReport;
        }
        if (EnumC15361h1.Profile.equals(enumC15361h1)) {
            return EnumC15359h.Profile;
        }
        if (EnumC15361h1.Statsd.equals(enumC15361h1)) {
            return EnumC15359h.MetricBucket;
        }
        if (EnumC15361h1.Attachment.equals(enumC15361h1)) {
            return EnumC15359h.Attachment;
        }
        if (EnumC15361h1.CheckIn.equals(enumC15361h1)) {
            return EnumC15359h.Monitor;
        }
        return EnumC15361h1.ReplayVideo.equals(enumC15361h1) ? EnumC15359h.Replay : EnumC15359h.Default;
    }

    /* JADX INFO: renamed from: n */
    public static C15358g1 m16578n() {
        if (f47944o0 == null) {
            synchronized (C15358g1.class) {
                try {
                    if (f47944o0 == null) {
                        f47944o0 = new C15358g1(0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47944o0;
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: G */
    public void mo7940G(EnumC15337e enumC15337e, C11241l c11241l) {
        if (c11241l == null) {
            return;
        }
        try {
            Iterator it = ((Collection) c11241l.f34017Z).iterator();
            while (it.hasNext()) {
                mo7945w(enumC15337e, (C15321b1) it.next());
            }
        } catch (Throwable th2) {
            ((C15524y1) this.f47946Z).getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        AbstractC4941g.m5559R("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof C3164p0);
        ((InterfaceC0310a) this.f47945Y).accept(new C3149i(1, (Surface) this.f47946Z));
    }

    @Override // ao.InterfaceC11173k0
    /* JADX INFO: renamed from: a */
    public KSerializer mo12393a(InterfaceC3756d interfaceC3756d) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f47946Z;
        Class clsM8667b = AbstractC8138m0.m8667b(interfaceC3756d);
        Object c11172k = concurrentHashMap.get(clsM8667b);
        if (c11172k == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM8667b, (c11172k = new C11172k((KSerializer) ((InterfaceC1436k) this.f47945Y).invoke(interfaceC3756d))))) != null) {
            c11172k = objPutIfAbsent;
        }
        return ((C11172k) c11172k).f33817a;
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: b */
    public void mo1006b(C18792h call, C17327D c17327d) {
        AbstractC16544l.m18094g(call, "call");
        if (call.f59718A0) {
            return;
        }
        ((C0624m) this.f47946Z).resumeWith(c17327d);
    }

    @Override // p1142z3.InterfaceC21739g
    /* JADX INFO: renamed from: c */
    public InterfaceC21740h mo12896c() {
        return new C21744l((Context) this.f47945Y, ((C11500p) this.f47946Z).mo12896c());
    }

    /* JADX INFO: renamed from: d */
    public void m16579d(String str) {
        AbstractC8483G3.m9133c(str, "integration is required.");
        ((CopyOnWriteArraySet) this.f47945Y).add(str);
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: e */
    public void mo7942e(EnumC15337e enumC15337e, EnumC15359h enumC15359h) {
        mo7944v(enumC15337e, enumC15359h, 1L);
    }

    /* JADX INFO: renamed from: f */
    public void m16580f(String str) {
        ((CopyOnWriteArraySet) this.f47946Z).add(new C15448u(str, "7.19.1"));
    }

    /* JADX INFO: renamed from: g */
    public void m16581g(AbstractC1933p0 abstractC1933p0, C0781s c0781s) {
        C12959L c12959l = (C12959L) this.f47945Y;
        C1877A0 c1877a0M2859a = (C1877A0) c12959l.get(abstractC1933p0);
        if (c1877a0M2859a == null) {
            c1877a0M2859a = C1877A0.m2859a();
            c12959l.put(abstractC1933p0, c1877a0M2859a);
        }
        c1877a0M2859a.f5454c = c0781s;
        c1877a0M2859a.f5452a |= 8;
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: h */
    public void mo1007h(C18792h call, IOException iOException) {
        Throwable c8388a;
        Object obj;
        AbstractC16544l.m18094g(call, "call");
        C0624m c0624m = (C0624m) this.f47946Z;
        c0624m.getClass();
        if (C0624m.f1871s0.get(c0624m) instanceof C0626n) {
            return;
        }
        if (iOException instanceof C7718k) {
            c8388a = iOException.getCause();
            if (c8388a != null) {
                iOException = c8388a;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            C13694d request = (C13694d) this.f47945Y;
            if (message == null || !AbstractC21322p.m21667A(message, "connect", true)) {
                iOException = AbstractC8910Y.m9564a(request, iOException);
            } else {
                InterfaceC17710b interfaceC17710b = AbstractC8910Y.f27266a;
                AbstractC16544l.m18094g(request, "request");
                StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
                sb2.append(request.f43201a);
                sb2.append(", connect_timeout=");
                C8907V c8907v = (C8907V) request.m15170a();
                if (c8907v == null || (obj = c8907v.f27259b) == null) {
                    obj = "unknown";
                }
                sb2.append(obj);
                sb2.append(" ms]");
                c8388a = new C8388a(sb2.toString(), iOException);
                iOException = c8388a;
            }
        }
        c0624m.resumeWith(AbstractC9233X.m9806b(iOException));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x020d A[PHI: r13
      0x020d: PHI (r13v17 int) = (r13v16 int), (r13v18 int) binds: [B:99:0x0204, B:103:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: j */
    public C6825j m16582j(int i10, String message, Throwable th2, Map map, Set set, long j10, String threadName, C11682a datadogContext, boolean z6, String loggerName, boolean z10, boolean z11, C11688g c11688g, C11685d c11685d, List threads) {
        C6819d c6819d;
        String formattedDate;
        C6821f c6821f;
        int i11;
        Map map2;
        Map map3;
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(threadName, "threadName");
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        AbstractC16544l.m18094g(loggerName, "loggerName");
        AbstractC16544l.m18094g(threads, "threads");
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(map);
        if (th2 != null) {
            Object objRemove = linkedHashMapM19256r.remove("_dd.error.fingerprint");
            String str = objRemove instanceof String ? (String) objRemove : null;
            String canonicalName = th2.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th2.getClass().getSimpleName();
            }
            String str2 = canonicalName;
            String strM9790b = AbstractC9221V.m9790b(th2);
            String message2 = th2.getMessage();
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(threads, 10));
            for (Iterator it = r5.iterator(); it.hasNext(); it = it) {
                C16175c c16175c = (C16175c) it.next();
                arrayList.add(new C6823h(c16175c.f50212a, c16175c.f50214c, c16175c.f50215d, c16175c.f50213b));
            }
            c6819d = new C6819d(str2, message2, strM9790b, str, arrayList.isEmpty() ? null : arrayList);
        } else {
            c6819d = null;
        }
        long j11 = j10 + datadogContext.f35417i.f35450d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(linkedHashMapM19256r);
        if (z10 && (map3 = (Map) datadogContext.f35424p.get("tracing")) != null) {
            Object obj = map3.get("context@".concat(threadName));
            Map map4 = obj instanceof Map ? (Map) obj : null;
            if (map4 != null) {
                linkedHashMap.put("dd.trace_id", map4.get("trace_id"));
                linkedHashMap.put("dd.span_id", map4.get("span_id"));
            }
        }
        if (z11 && (map2 = (Map) datadogContext.f35424p.get("rum")) != null) {
            linkedHashMap.put("application_id", map2.get("application_id"));
            linkedHashMap.put("session_id", map2.get("session_id"));
            linkedHashMap.put("view.id", map2.get("view_id"));
            linkedHashMap.put("user_action.id", map2.get("action_id"));
        }
        synchronized (((SimpleDateFormat) this.f47946Z)) {
            formattedDate = ((SimpleDateFormat) this.f47946Z).format(new Date(j11));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        String str3 = datadogContext.f35412d;
        String strConcat = str3.length() > 0 ? "env:".concat(str3) : null;
        if (strConcat != null) {
            linkedHashSet.add(strConcat);
        }
        String str4 = datadogContext.f35413e;
        String strConcat2 = str4.length() > 0 ? "version:".concat(str4) : null;
        if (strConcat2 != null) {
            linkedHashSet.add(strConcat2);
        }
        String str5 = datadogContext.f35414f;
        String strConcat3 = str5.length() > 0 ? "variant:".concat(str5) : null;
        if (strConcat3 != null) {
            linkedHashSet.add(strConcat3);
        }
        C11688g c11688g2 = c11688g == null ? datadogContext.f35421m : c11688g;
        C6824i c6824i = new C6824i(c11688g2.f35452a, c11688g2.f35453b, c11688g2.f35454c, AbstractC17659D.m19256r(c11688g2.f35455d));
        if (c11685d != null || z6) {
            C11685d c11685d2 = c11685d == null ? datadogContext.f35419k : c11685d;
            Long l4 = c11685d2.f35441c;
            String str6 = c11685d2.f35440b;
            C6822g c6822g = (l4 == null && str6 == null) ? null : new C6822g(l4 != null ? l4.toString() : null, str6);
            Long l10 = c11685d2.f35444f;
            String string = l10 != null ? l10.toString() : null;
            Long l11 = c11685d2.f35443e;
            String string2 = l11 != null ? l11.toString() : null;
            Long l12 = c11685d2.f35442d;
            c6821f = new C6821f(new C6816a(c6822g, string, string2, l12 != null ? l12.toString() : null, AbstractC10763a.m11041B(c11685d2.f35439a)));
        } else {
            c6821f = null;
        }
        C6820e c6820e = new C6820e(loggerName, threadName, datadogContext.f35416h);
        String str7 = (String) this.f47945Y;
        if (str7 == null) {
            str7 = datadogContext.f35411c;
        }
        if (i10 == 2) {
            i11 = 6;
        } else if (i10 != 9) {
            int i12 = 4;
            if (i10 != 4) {
                i12 = 5;
                if (i10 == 5) {
                    i11 = 3;
                } else if (i10 == 6) {
                    i11 = 2;
                } else if (i10 != 7) {
                    i11 = i12;
                } else {
                    i11 = 1;
                }
            } else {
                i11 = i12;
            }
        } else {
            i11 = 7;
        }
        String str8 = datadogContext.f35423o;
        C6817b c6817b = new C6817b(new C6818c(datadogContext.f35420l.f35433i));
        String strM19349Y = AbstractC17680n.m19349Y(linkedHashSet, Separators.COMMA, null, null, 0, null, null, 62);
        AbstractC16544l.m18093f(formattedDate, "formattedDate");
        return new C6825j(i11, str7, message, formattedDate, c6820e, c6817b, c6824i, c6821f, c6819d, str8, strM19349Y, linkedHashMap);
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC13823a m16583k() {
        InterfaceC13823a interfaceC13823a = (InterfaceC13823a) ((AtomicReference) this.f47946Z).get();
        InterfaceC13823a interfaceC13823aM10971a = null;
        if (interfaceC13823a == null) {
            synchronized (((AtomicReference) this.f47946Z)) {
                InterfaceC13823a interfaceC13823a2 = (InterfaceC13823a) ((AtomicReference) this.f47946Z).get();
                if (interfaceC13823a2 != null) {
                    interfaceC13823aM10971a = interfaceC13823a2;
                } else if (AbstractC10516b.m10972b()) {
                    interfaceC13823aM10971a = AbstractC10516b.m10971a(null);
                    ((AtomicReference) this.f47946Z).set(interfaceC13823aM10971a);
                    ((C6593i) this.f47945Y).invoke(interfaceC13823aM10971a);
                }
            }
        } else {
            C16354g c16354g = interfaceC13823a instanceof C16354g ? (C16354g) interfaceC13823a : null;
            Boolean boolValueOf = c16354g != null ? Boolean.valueOf(c16354g.m17953x().f50764c.get()) : null;
            if (boolValueOf == null || boolValueOf.booleanValue()) {
                return interfaceC13823a;
            }
            AtomicReference atomicReference = (AtomicReference) this.f47946Z;
            while (!atomicReference.compareAndSet(interfaceC13823a, null) && atomicReference.get() == interfaceC13823a) {
            }
        }
        return interfaceC13823aM10971a;
    }

    /* JADX INFO: renamed from: l */
    public LinkedHashSet m16584l() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f47945Y) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f47946Z).values());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC6333o m16585m(Object... objArr) {
        Constructor constructorM3485e;
        synchronized (((AtomicBoolean) this.f47946Z)) {
            if (!((AtomicBoolean) this.f47946Z).get()) {
                try {
                    constructorM3485e = ((C2385o) this.f47945Y).m3485e();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f47946Z).set(true);
                    constructorM3485e = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorM3485e = null;
        }
        if (constructorM3485e == null) {
            return null;
        }
        try {
            return (InterfaceC6333o) constructorM3485e.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m16586o(String str) {
        String str2 = (String) this.f47946Z;
        Resources resources = (Resources) this.f47945Y;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        ((InterfaceC0310a) this.f47945Y).accept(new C3149i(0, (Surface) this.f47946Z));
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: p */
    public C11241l mo7943p(C11241l c11241l) {
        C15524y1 c15524y1 = (C15524y1) this.f47946Z;
        Date dateM9340h = AbstractC8656j3.m9340h();
        C15333a c15333a = (C15333a) this.f47945Y;
        c15333a.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((C15498c) c15333a.f47885Y).m16684a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new C15338f(((C15336d) entry.getKey()).f47890a, ((C15336d) entry.getKey()).f47891b, lValueOf));
            }
        }
        C15335c c15335c = arrayList.isEmpty() ? null : new C15335c(dateM9340h, arrayList);
        if (c15335c == null) {
            return c11241l;
        }
        try {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) c11241l.f34017Z).iterator();
            while (it.hasNext()) {
                arrayList2.add((C15321b1) it.next());
            }
            arrayList2.add(C15321b1.m16525a(c15524y1.getSerializer(), c15335c));
            return new C11241l((C15175X0) c11241l.f34016Y, (Collection) arrayList2);
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return c11241l;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16587q(C0090u c0090u) {
        synchronized (this.f47945Y) {
            try {
                c0090u.getClass();
                for (String str : new LinkedHashSet(c0090u.f396f)) {
                    AbstractC8072d6.m8486c("CameraRepository", "Added camera: " + str);
                    ((LinkedHashMap) this.f47946Z).put(str, c0090u.m321a(str));
                }
            } catch (C3165q e10) {
                throw new C3129W(e10);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public C0781s m16588r(AbstractC1933p0 abstractC1933p0, int i10) {
        C1877A0 c1877a0;
        C0781s c0781s;
        C12959L c12959l = (C12959L) this.f47945Y;
        int iM14644d = c12959l.m14644d(abstractC1933p0);
        if (iM14644d >= 0 && (c1877a0 = (C1877A0) c12959l.m14649j(iM14644d)) != null) {
            int i11 = c1877a0.f5452a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                c1877a0.f5452a = i12;
                if (i10 == 4) {
                    c0781s = c1877a0.f5453b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0781s = c1877a0.f5454c;
                }
                if ((i12 & 12) == 0) {
                    c12959l.m14647g(iM14644d);
                    c1877a0.f5452a = 0;
                    c1877a0.f5453b = null;
                    c1877a0.f5454c = null;
                    C1877A0.f5451d.mo914c(c1877a0);
                }
                return c0781s;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public void m16589s(String str, String str2, Long l4) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((C15498c) ((C15333a) this.f47945Y).f47885Y).m16684a()).get(new C15336d(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l4.longValue());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m16590t(AbstractC1933p0 abstractC1933p0) {
        C1877A0 c1877a0 = (C1877A0) ((C12959L) this.f47945Y).get(abstractC1933p0);
        if (c1877a0 == null) {
            return;
        }
        c1877a0.f5452a &= -2;
    }

    /* JADX INFO: renamed from: u */
    public void m16591u(AbstractC1933p0 abstractC1933p0) {
        C12977p c12977p = (C12977p) this.f47946Z;
        for (int iM14670j = c12977p.m14670j() - 1; iM14670j >= 0; iM14670j--) {
            if (abstractC1933p0 == c12977p.m14671k(iM14670j)) {
                Object[] objArr = c12977p.f41189o0;
                Object obj = objArr[iM14670j];
                Object obj2 = AbstractC12978q.f41191a;
                if (obj == obj2) {
                    break;
                }
                objArr[iM14670j] = obj2;
                c12977p.f41187Y = true;
                break;
            }
        }
        C1877A0 c1877a0 = (C1877A0) ((C12959L) this.f47945Y).remove(abstractC1933p0);
        if (c1877a0 != null) {
            c1877a0.f5452a = 0;
            c1877a0.f5453b = null;
            c1877a0.f5454c = null;
            C1877A0.f5451d.mo914c(c1877a0);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: v */
    public void mo7944v(EnumC15337e enumC15337e, EnumC15359h enumC15359h, long j10) {
        try {
            m16589s(enumC15337e.getReason(), enumC15359h.getCategory(), Long.valueOf(j10));
        } catch (Throwable th2) {
            ((C15524y1) this.f47946Z).getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC15339g
    /* JADX INFO: renamed from: w */
    public void mo7945w(EnumC15337e enumC15337e, C15321b1 c15321b1) {
        C15421A c15421aM16530e;
        C15524y1 c15524y1 = (C15524y1) this.f47946Z;
        if (c15321b1 == null) {
            return;
        }
        try {
            EnumC15361h1 enumC15361h1 = c15321b1.f47863a.f47870o0;
            if (EnumC15361h1.ClientReport.equals(enumC15361h1)) {
                try {
                    m16592x(c15321b1.m16528c(c15524y1.getSerializer()));
                } catch (Exception unused) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                EnumC15359h enumC15359hM16577i = m16577i(enumC15361h1);
                if (enumC15359hM16577i.equals(EnumC15359h.Transaction) && (c15421aM16530e = c15321b1.m16530e(c15524y1.getSerializer())) != null) {
                    m16589s(enumC15337e.getReason(), EnumC15359h.Span.getCategory(), Long.valueOf(((long) c15421aM16530e.f48054E0.size()) + 1));
                }
                m16589s(enumC15337e.getReason(), enumC15359hM16577i.getCategory(), 1L);
            }
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m16592x(C15335c c15335c) {
        if (c15335c == null) {
            return;
        }
        for (C15338f c15338f : c15335c.f47888Z) {
            m16589s(c15338f.f47892Y, c15338f.f47893Z, c15338f.f47894o0);
        }
    }

    /* JADX INFO: renamed from: y */
    public String m16593y(C11682a datadogContext, C0409l c0409l) {
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        C0401d c0401d = c0409l.f1365k;
        C0407j c0407j = c0401d.f1338e;
        LinkedHashMap linkedHashMapM9252b = AbstractC8589Y2.m9252b((InterfaceC14938a) this.f47946Z, c0407j.f1353d, "meta.usr", null, null, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMapM9252b.size()));
        for (Map.Entry entry : linkedHashMapM9252b.entrySet()) {
            Object key = entry.getKey();
            String strValueOf = null;
            try {
                Object value = entry.getValue();
                if (!AbstractC16544l.m18089b(value, AbstractC1976c.f5848a) && value != null) {
                    strValueOf = value instanceof Date ? String.valueOf(((Date) value).getTime()) : value instanceof C3678u ? ((C3678u) value).mo4384r() : value.toString();
                }
            } catch (Exception e10) {
                AbstractC7889G0.m8185c((InterfaceC11256c) this.f47945Y, 5, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), new C1975b(entry, 3), e10, 48);
            }
            linkedHashMap.put(key, strValueOf);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(linkedHashMap2);
        C0402e c0402e = c0409l.f1364j;
        LinkedHashMap linkedHashMapM9252b2 = AbstractC8589Y2.m9252b((InterfaceC14938a) this.f47946Z, c0402e.f1343b, "metrics", null, null, 12);
        String version = c0401d.f1334a;
        AbstractC16544l.m18094g(version, "version");
        C0400c c0400c = c0401d.f1335b;
        C0406i c0406i = c0401d.f1337d;
        Map map = c0401d.f1340g;
        String traceId = c0409l.f1355a;
        AbstractC16544l.m18094g(traceId, "traceId");
        String str = c0409l.f1356b;
        String str2 = c0409l.f1357c;
        String str3 = c0409l.f1358d;
        String name = c0409l.f1359e;
        AbstractC16544l.m18094g(name, "name");
        String service = c0409l.f1360f;
        AbstractC16544l.m18094g(service, "service");
        C3676s c3676s = new C3676s();
        c3676s.m4394v("trace_id", traceId);
        c3676s.m4394v("span_id", str);
        c3676s.m4394v("parent_id", str2);
        c3676s.m4394v("resource", str3);
        c3676s.m4394v(DiagnosticsEntry.NAME_KEY, name);
        c3676s.m4394v(ReferencesHeader.SERVICE, service);
        c3676s.m4393u(Long.valueOf(c0409l.f1361g), "duration");
        c3676s.m4393u(Long.valueOf(c0409l.f1362h), "start");
        c3676s.m4393u(Long.valueOf(c0409l.f1363i), "error");
        c3676s.m4394v("type", "custom");
        C3676s c3676s2 = new C3676s();
        Long l4 = c0402e.f1342a;
        if (l4 != null) {
            AbstractC17792x.m19539v(l4, c3676s2, "_top_level");
        }
        for (Map.Entry entry3 : linkedHashMapM9252b2.entrySet()) {
            String str4 = (String) entry3.getKey();
            Number number = (Number) entry3.getValue();
            if (!AbstractC17678l.m19298e(str4, C0402e.f1341c)) {
                c3676s2.m4393u(number, str4);
            }
        }
        c3676s.m4391s("metrics", c3676s2);
        C3676s c3676s3 = new C3676s();
        c3676s3.m4394v("version", version);
        C3676s c3676s4 = new C3676s();
        String str5 = c0400c.f1329a;
        if (str5 != null) {
            c3676s4.m4394v("source", str5);
        }
        C0398a c0398a = c0400c.f1330b;
        if (c0398a != null) {
            C3676s c3676s5 = new C3676s();
            String str6 = c0398a.f1323a;
            if (str6 != null) {
                c3676s5.m4394v(ParameterNames.f31999ID, str6);
            }
            c3676s4.m4391s(SIPServerTransaction.CONTENT_TYPE_APPLICATION, c3676s5);
        }
        C0404g c0404g = c0400c.f1331c;
        if (c0404g != null) {
            C3676s c3676s6 = new C3676s();
            String str7 = c0404g.f1345a;
            if (str7 != null) {
                c3676s6.m4394v(ParameterNames.f31999ID, str7);
            }
            c3676s4.m4391s(ParameterNames.SESSION, c3676s6);
        }
        C0408k c0408k = c0400c.f1332d;
        if (c0408k != null) {
            C3676s c3676s7 = new C3676s();
            String str8 = c0408k.f1354a;
            if (str8 != null) {
                c3676s7.m4394v(ParameterNames.f31999ID, str8);
            }
            c3676s4.m4391s("view", c3676s7);
        }
        c3676s3.m4391s("_dd", c3676s4);
        C3676s c3676s8 = new C3676s();
        c3676s8.m4394v("kind", "client");
        c3676s3.m4391s("span", c3676s8);
        C3676s c3676s9 = new C3676s();
        c3676s9.m4394v("version", c0406i.f1348a);
        c3676s3.m4391s("tracer", c3676s9);
        C3676s c3676s10 = new C3676s();
        String str9 = c0407j.f1350a;
        if (str9 != null) {
            c3676s10.m4394v(ParameterNames.f31999ID, str9);
        }
        String str10 = c0407j.f1351b;
        if (str10 != null) {
            c3676s10.m4394v(DiagnosticsEntry.NAME_KEY, str10);
        }
        String str11 = c0407j.f1352c;
        if (str11 != null) {
            c3676s10.m4394v("email", str11);
        }
        for (Map.Entry entry4 : linkedHashMapM19256r.entrySet()) {
            String str12 = (String) entry4.getKey();
            Object value2 = entry4.getValue();
            if (!AbstractC17678l.m19298e(str12, C0407j.f1349e)) {
                c3676s10.m4391s(str12, AbstractC1976c.m3153j(value2));
            }
        }
        c3676s3.m4391s("usr", c3676s10);
        C0403f c0403f = c0401d.f1339f;
        if (c0403f != null) {
            C3676s c3676s11 = new C3676s();
            C0399b c0399b = c0403f.f1344a;
            C3676s c3676s12 = new C3676s();
            C0405h c0405h = c0399b.f1324a;
            if (c0405h != null) {
                C3676s c3676s13 = new C3676s();
                String str13 = c0405h.f1346a;
                if (str13 != null) {
                    c3676s13.m4394v(ParameterNames.f31999ID, str13);
                }
                String str14 = c0405h.f1347b;
                if (str14 != null) {
                    c3676s13.m4394v(DiagnosticsEntry.NAME_KEY, str14);
                }
                c3676s12.m4391s("sim_carrier", c3676s13);
            }
            String str15 = c0399b.f1325b;
            if (str15 != null) {
                c3676s12.m4394v("signal_strength", str15);
            }
            String str16 = c0399b.f1326c;
            if (str16 != null) {
                c3676s12.m4394v("downlink_kbps", str16);
            }
            String str17 = c0399b.f1327d;
            if (str17 != null) {
                c3676s12.m4394v("uplink_kbps", str17);
            }
            String str18 = c0399b.f1328e;
            if (str18 != null) {
                c3676s12.m4394v("connectivity", str18);
            }
            c3676s11.m4391s("client", c3676s12);
            c3676s3.m4391s("network", c3676s11);
        }
        for (Map.Entry entry5 : map.entrySet()) {
            String str19 = (String) entry5.getKey();
            String str20 = (String) entry5.getValue();
            if (!AbstractC17678l.m19298e(str19, C0401d.f1333h)) {
                c3676s3.m4394v(str19, str20);
            }
        }
        c3676s.m4391s("meta", c3676s3);
        C3671n c3671n = new C3671n(1);
        c3671n.m4385s(c3676s);
        C3676s c3676s14 = new C3676s();
        c3676s14.m4391s("spans", c3671n);
        c3676s14.m4394v("env", datadogContext.f35412d);
        String string = c3676s14.toString();
        AbstractC16544l.m18093f(string, "jsonObject.toString()");
        return string;
    }

    /* JADX INFO: renamed from: z */
    public void m16594z(List value) {
        AbstractC16544l.m18094g(value, "value");
        C2153Q0 c2153q0 = (C2153Q0) this.f47945Y;
        c2153q0.getClass();
        c2153q0.m3251l(null, value);
    }

    public C15358g1(Context context, int i10) {
        switch (i10) {
            case 20:
                AbstractC20502t.m21157h(context);
                Resources resources = context.getResources();
                this.f47945Y = resources;
                this.f47946Z = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            case 21:
            default:
                this.f47946Z = new AtomicLong(-1L);
                this.f47945Y = new C21158b(context, null, C21158b.f67233k, new C20494l("mlkit:vision"), C19820e.f62871c);
                break;
            case 22:
                C11500p c11500p = new C11500p(8);
                this.f47945Y = context.getApplicationContext();
                this.f47946Z = c11500p;
                break;
        }
    }

    public C15358g1(List initialValue) {
        AbstractC16544l.m18094g(initialValue, "initialValue");
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(initialValue);
        this.f47945Y = c2153q0M3204c;
        this.f47946Z = new C2146N(c2153q0M3204c, 0);
    }

    public C15358g1(C19805c c19805c, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f47945Y = c19805c;
        this.f47946Z = internalLogger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15358g1(C19067A1 c19067a1) {
        List listM9974d;
        if (c19067a1 == null) {
            listM9974d = C17689w.f56480Y;
        } else {
            listM9974d = AbstractC9393x3.m9974d(c19067a1);
        }
        this(listM9974d);
    }

    public C15358g1(String str) {
        this.f47945Y = str;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.f47946Z = simpleDateFormat;
    }

    public C15358g1(C15524y1 c15524y1) {
        this.f47946Z = c15524y1;
        this.f47945Y = new C15333a(0);
    }

    public C15358g1(int i10) {
        switch (i10) {
            case 3:
                this.f47945Y = new C12959L(0);
                this.f47946Z = new C12977p((Object) null);
                break;
            case 5:
                this.f47945Y = new Object();
                this.f47946Z = new LinkedHashMap();
                new HashSet();
                break;
            case 8:
                this.f47945Y = Collections.emptyList();
                this.f47946Z = Collections.emptyList();
                break;
            default:
                this.f47945Y = new CopyOnWriteArraySet();
                this.f47946Z = new CopyOnWriteArraySet();
                break;
        }
    }

    public C15358g1(Context context, Object obj, LinkedHashSet linkedHashSet) {
        C0710q c0710qM1480a;
        C7102a c7102a = new C7102a(1);
        this.f47945Y = new HashMap();
        this.f47946Z = c7102a;
        if (obj instanceof C0710q) {
            c0710qM1480a = (C0710q) obj;
        } else {
            c0710qM1480a = C0710q.m1480a(context, AbstractC4502m.m5243f());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.f47945Y).put(str, new C0023L0(context, str, c0710qM1480a, (C7102a) this.f47946Z));
        }
    }

    public C15358g1(InterfaceC1436k interfaceC1436k) {
        this.f47945Y = interfaceC1436k;
        this.f47946Z = new ConcurrentHashMap();
    }

    public C15358g1(C2385o c2385o) {
        this.f47945Y = c2385o;
        this.f47946Z = new AtomicBoolean(false);
    }
}
