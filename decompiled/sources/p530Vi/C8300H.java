package p530Vi;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import bo.AbstractC11516d;
import bo.C11515c;
import com.segment.analytics.kotlin.core.RemoteMetric;
import com.segment.analytics.kotlin.core.RemoteMetric$$serializer;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.C0565C;
import p025An.C0611f0;
import p033B5.C0841y;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p1114xp.InterfaceC21347r;
import p153Fn.C2925c;
import p334Na.AbstractC5695b;
import p451Sb.C7102a;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9227W;
import p658b5.C11241l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Vi.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8300H implements InterfaceC21347r {

    /* JADX INFO: renamed from: A0 */
    public static final C17314q f25861A0;

    /* JADX INFO: renamed from: Z */
    public static double f25863Z = 1.0d;

    /* JADX INFO: renamed from: u0 */
    public static int f25870u0;

    /* JADX INFO: renamed from: v0 */
    public static boolean f25871v0;

    /* JADX INFO: renamed from: w0 */
    public static long f25872w0;

    /* JADX INFO: renamed from: x0 */
    public static boolean f25873x0;

    /* JADX INFO: renamed from: y0 */
    public static final C2925c f25874y0;

    /* JADX INFO: renamed from: z0 */
    public static final C0611f0 f25875z0;

    /* JADX INFO: renamed from: Y */
    public static final C8300H f25862Y = new C8300H();

    /* JADX INFO: renamed from: o0 */
    public static final C11241l f25864o0 = new C11241l("", (C7102a) new C8323s(19));

    /* JADX INFO: renamed from: p0 */
    public static final boolean f25865p0 = true;

    /* JADX INFO: renamed from: q0 */
    public static final C8298F f25866q0 = C8298F.f25858Y;

    /* JADX INFO: renamed from: r0 */
    public static final int f25867r0 = 20;

    /* JADX INFO: renamed from: s0 */
    public static final int f25868s0 = 28000;

    /* JADX INFO: renamed from: t0 */
    public static final ConcurrentLinkedQueue f25869t0 = new ConcurrentLinkedQueue();

    static {
        new LinkedHashMap();
        f25873x0 = true;
        f25874y0 = AbstractC0575H.m1174c(AbstractC5695b.m6138e(AbstractC0575H.m1176e(), new C0841y(C0565C.f1783Y, 4)));
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        f25875z0 = new C0611f0(executorServiceNewSingleThreadExecutor);
        f25861A0 = AbstractC9227W.m9800c(C8318n.f25932o0);
    }

    /* JADX INFO: renamed from: a */
    public static void m8906a(C8300H c8300h, String str, Map map, int i10) {
        Object next;
        c8300h.getClass();
        LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(map, (Map) f25861A0.getValue());
        ConcurrentLinkedQueue concurrentLinkedQueue = f25869t0;
        Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RemoteMetric remoteMetric = (RemoteMetric) next;
            if (AbstractC16544l.m18089b(remoteMetric.f40483b, str) && AbstractC16544l.m18089b(remoteMetric.f40485d, linkedHashMapM19248j)) {
                break;
            }
        }
        RemoteMetric remoteMetric2 = (RemoteMetric) next;
        if (remoteMetric2 != null) {
            remoteMetric2.f40484c++;
            return;
        }
        RemoteMetric remoteMetric3 = new RemoteMetric(str, 1, linkedHashMapM19248j, null);
        byte[] bytes = remoteMetric3.toString().getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        if (f25870u0 + length <= f25868s0) {
            concurrentLinkedQueue.add(remoteMetric3);
            f25870u0 += length;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8907d() {
        String str;
        C8298F c8298f = f25866q0;
        if (f25863Z == 0.0d) {
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = f25869t0;
        int size = concurrentLinkedQueue.size();
        f25870u0 = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i10 = size - 1;
            if (size <= 0 || concurrentLinkedQueue.isEmpty()) {
                break;
            }
            RemoteMetric remoteMetric = (RemoteMetric) concurrentLinkedQueue.poll();
            if (remoteMetric != null) {
                remoteMetric.f40484c = AbstractC2119a.m3194h(((double) remoteMetric.f40484c) / f25863Z);
                arrayList.add(remoteMetric);
            }
            size = i10;
        }
        Long lM21738y = null;
        try {
            C11515c c11515c = AbstractC11516d.f34842d;
            Map mapM19258c = AbstractC17660E.m19258c(new C17309l("series", arrayList));
            c11515c.getClass();
            String strM12905d = c11515c.m12905d(new C11131E(C11181o0.f33827a, new C11158d(RemoteMetric$$serializer.INSTANCE, 0), 1), mapM19258c);
            C8321q c8321qM12594P = f25864o0.m12594P("api.segment.io/v1");
            OutputStream outputStream = c8321qM12594P.f25944o0;
            if (outputStream != null) {
                try {
                    byte[] bytes = strM12905d.getBytes(C21307a.f67720a);
                    AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    AbstractC7942M5.m8232a(outputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(outputStream, th2);
                        throw th3;
                    }
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
            c8321qM12594P.close();
        } catch (C8322r e10) {
            if (c8298f != null) {
                c8298f.invoke(e10);
            }
            if (e10.f25946Y == 429) {
                List list = (List) e10.f25947Z.get(SIPHeaderNames.RETRY_AFTER);
                if (list != null && (str = (String) AbstractC17680n.m19343S(list)) != null) {
                    lM21738y = AbstractC21329w.m21738y(str);
                }
                if (lM21738y != null) {
                    f25872w0 = (System.currentTimeMillis() / ((long) 1000)) + lM21738y.longValue();
                }
            }
        } catch (Exception e11) {
            if (c8298f != null) {
                c8298f.invoke(e11);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8908b() {
        try {
            if (f25869t0.isEmpty()) {
                return;
            }
            if (f25872w0 > ((int) (System.currentTimeMillis() / ((long) 1000)))) {
                return;
            }
            f25872w0 = 0L;
            try {
                m8907d();
                f25870u0 = 0;
            } catch (Throwable th2) {
                C8298F c8298f = f25866q0;
                if (c8298f != null) {
                    c8298f.invoke(th2);
                }
                f25863Z = 0.0d;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8909c(String str, InterfaceC1436k interfaceC1436k) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        interfaceC1436k.invoke(linkedHashMap);
        if (f25863Z != 0.0d && AbstractC21329w.m21734u(str, "analytics_mobile", false) && !linkedHashMap.isEmpty() && Math.random() <= f25863Z && f25869t0.size() < f25867r0) {
            m8906a(this, str, linkedHashMap, 12);
        }
    }
}
