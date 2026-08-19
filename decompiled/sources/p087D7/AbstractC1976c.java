package p087D7;

import android.content.Context;
import android.os.Build;
import com.datadog.android.core.internal.data.upload.UploadWorker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import org.json.JSONArray;
import org.json.JSONObject;
import p025An.C0644w;
import p035B7.C0846c;
import p049Bm.InterfaceC1426a;
import p214Ib.AbstractC3673p;
import p214Ib.C3671n;
import p214Ib.C3675r;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p310M9.C5311e;
import p444S4.C6998d;
import p444S4.C7001g;
import p470T4.C7247l;
import p470T4.C7253r;
import p523V9.AbstractC7889G0;
import p658b5.C11245p;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17656A;
import p909nm.C17691y;
import p909nm.C17692z;

/* JADX INFO: renamed from: D7.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1976c {

    /* JADX INFO: renamed from: a */
    public static final Object f5848a = new Object();

    /* JADX INFO: renamed from: a */
    public static final String m3144a(Thread.State state) {
        switch (AbstractC1978e.f5850a[state.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "blocked";
            case 3:
                return "runnable";
            case 4:
                return "terminated";
            case 5:
                return "timed_waiting";
            case 6:
                return "waiting";
            default:
                throw new C0644w();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3145b(byte[] bArr, byte[] bArr2, int i10, int i11, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(bArr, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        int i12 = i10 + i11;
        int length = bArr2.length;
        EnumC11255b enumC11255b = EnumC11255b.f34099Z;
        if (i12 > length) {
            AbstractC7889G0.m8184b(internalLogger, 4, enumC11255b, C1974a.f5839Z, null, false, 56);
        } else if (i11 > bArr.length) {
            AbstractC7889G0.m8184b(internalLogger, 4, enumC11255b, C1974a.f5840o0, null, false, 56);
        } else {
            System.arraycopy(bArr, 0, bArr2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3146c(Executor executor, String operationName, InterfaceC11256c internalLogger, Runnable runnable) {
        int i10 = 2;
        AbstractC16544l.m18094g(operationName, "operationName");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        AbstractC16544l.m18094g(runnable, "runnable");
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0846c(operationName, i10), e10, 48);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m3147d(ArrayList arrayList, byte[] separator, byte[] prefix, byte[] suffix, InterfaceC11256c internalLogger) {
        int size;
        AbstractC16544l.m18094g(separator, "separator");
        AbstractC16544l.m18094g(prefix, "prefix");
        AbstractC16544l.m18094g(suffix, "suffix");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = (arrayList.size() - 1) * separator.length;
        }
        byte[] bArr = new byte[prefix.length + length + size + suffix.length];
        m3145b(prefix, bArr, 0, prefix.length, internalLogger);
        int length2 = prefix.length;
        Iterator it2 = AbstractC17680n.m19332I0(arrayList).iterator();
        while (true) {
            C17656A c17656a = (C17656A) it2;
            if (!c17656a.f56445Z.hasNext()) {
                m3145b(suffix, bArr, length2, suffix.length, internalLogger);
                return bArr;
            }
            C17692z c17692z = (C17692z) c17656a.next();
            byte[] bArr2 = (byte[]) c17692z.f56484b;
            m3145b(bArr2, bArr, length2, bArr2.length, internalLogger);
            length2 += ((byte[]) c17692z.f56484b).length;
            if (c17692z.f56483a != arrayList.size() - 1) {
                m3145b(separator, bArr, length2, separator.length, internalLogger);
                length2 += separator.length;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final String m3148e(Throwable th2) {
        AbstractC16544l.m18094g(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        AbstractC16544l.m18093f(string, "stringWriter.toString()");
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static final void m3149f(long j10, InterfaceC11256c internalLogger, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        long jNanoTime = System.nanoTime() - j10;
        int i10 = 1;
        boolean zBooleanValue = false;
        while (i10 <= 3 && !zBooleanValue) {
            if (System.nanoTime() - jNanoTime >= j10) {
                try {
                    zBooleanValue = ((Boolean) interfaceC1426a.invoke()).booleanValue();
                    jNanoTime = System.nanoTime();
                    i10++;
                } catch (Exception e10) {
                    AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C1974a.f5841p0, e10, 48);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static LinkedHashMap m3150g(LinkedHashMap linkedHashMap, InterfaceC11256c internalLogger) {
        int i10 = 0;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                linkedHashMap2.put(entry.getKey(), m3153j(entry.getValue()));
            } catch (Exception e10) {
                AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), new C1975b(entry, i10), e10, 48);
            }
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: h */
    public static final void m3151h(ScheduledExecutorService scheduledExecutorService, String operationName, long j10, TimeUnit unit, InterfaceC11256c internalLogger, Runnable runnable) {
        AbstractC16544l.m18094g(scheduledExecutorService, "<this>");
        AbstractC16544l.m18094g(operationName, "operationName");
        AbstractC16544l.m18094g(unit, "unit");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            scheduledExecutorService.schedule(runnable, j10, unit);
        } catch (RejectedExecutionException e10) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0846c(operationName, 3), e10, 48);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m3152i(ExecutorService executorService, String str, InterfaceC11256c internalLogger, Runnable runnable) {
        AbstractC16544l.m18094g(executorService, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            executorService.submit(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0846c(str, 4), e10, 48);
        }
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC3673p m3153j(Object obj) {
        boolean zM18089b = AbstractC16544l.m18089b(obj, f5848a);
        C3675r c3675r = C3675r.f11173Y;
        if (zM18089b || obj == null || obj.equals(c3675r)) {
            return c3675r;
        }
        if (obj instanceof Boolean) {
            return new C3678u((Boolean) obj);
        }
        if (obj instanceof Integer) {
            return new C3678u((Number) obj);
        }
        if (obj instanceof Long) {
            return new C3678u((Number) obj);
        }
        if (obj instanceof Float) {
            return new C3678u((Number) obj);
        }
        if (obj instanceof Double) {
            return new C3678u((Number) obj);
        }
        if (obj instanceof String) {
            return new C3678u((String) obj);
        }
        if (obj instanceof Date) {
            return new C3678u(Long.valueOf(((Date) obj).getTime()));
        }
        if (obj instanceof C3671n) {
            return (AbstractC3673p) obj;
        }
        if (obj instanceof Iterable) {
            C3671n c3671n = new C3671n();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                c3671n.m4385s(m3153j(it.next()));
            }
            return c3671n;
        }
        if (obj instanceof Map) {
            C3676s c3676s = new C3676s();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c3676s.m4391s(String.valueOf(entry.getKey()), m3153j(entry.getValue()));
            }
            return c3676s;
        }
        if (obj instanceof C3676s) {
            return (AbstractC3673p) obj;
        }
        if (obj instanceof C3678u) {
            return (AbstractC3673p) obj;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            C3676s c3676s2 = new C3676s();
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC16544l.m18093f(itKeys, "keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c3676s2.m4391s(next, m3153j(jSONObject.get(next)));
            }
            return c3676s2;
        }
        if (!(obj instanceof JSONArray)) {
            return new C3678u(obj.toString());
        }
        JSONArray jSONArray = (JSONArray) obj;
        C3671n c3671n2 = new C3671n();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            c3671n2.m4385s(m3153j(jSONArray.get(i10)));
        }
        return c3671n2;
    }

    /* JADX INFO: renamed from: k */
    public static final void m3154k(Context context, String instanceName, InterfaceC11256c internalLogger) throws Throwable {
        EnumC11255b enumC11255b = EnumC11255b.f34099Z;
        AbstractC16544l.m18094g(instanceName, "instanceName");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            C7253r c7253rM7690f = C7253r.m7690f(context);
            C6998d c6998d = new C6998d(4, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC17680n.m19328G0(new LinkedHashSet()) : C17691y.f56482Y);
            C5311e c5311e = new C5311e(UploadWorker.class);
            ((C11245p) c5311e.f17485o0).f34050j = c6998d;
            String tag = "DatadogBackgroundUpload/".concat(instanceName);
            AbstractC16544l.m18094g(tag, "tag");
            ((Set) c5311e.f17486p0).add(tag);
            c5311e.m5870z(5000L, TimeUnit.MILLISECONDS);
            HashMap map = new HashMap();
            map.put("_dd.sdk.instanceName", instanceName);
            C7001g c7001g = new C7001g(map);
            C7001g.m7402b(c7001g);
            ((C11245p) c5311e.f17485o0).f34045e = c7001g;
            new C7247l(c7253rM7690f, "DatadogUploadWorker", 1, Collections.singletonList(c5311e.m5861p())).m7657b();
            AbstractC7889G0.m8184b(internalLogger, 3, enumC11255b, C1974a.f5843r0, null, false, 56);
        } catch (Exception e10) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), C1974a.f5844s0, e10, 48);
        }
    }
}
