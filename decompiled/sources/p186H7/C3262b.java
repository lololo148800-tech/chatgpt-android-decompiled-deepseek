package p186H7;

import android.content.Context;
import android.gov.nist.core.Separators;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.C0397g;
import p087D7.AbstractC1976c;
import p087D7.C1979f;
import p1113xn.AbstractC21322p;
import p470T4.C7253r;
import p523V9.AbstractC7889G0;
import p530Vi.AbstractC8301I;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p827j7.C16173a;
import p827j7.C16174b;
import p827j7.C16175c;
import p849k7.C16354g;
import p849k7.C16360m;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: H7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3262b implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: Y */
    public final C16354g f9933Y;

    /* JADX INFO: renamed from: Z */
    public final WeakReference f9934Z;

    /* JADX INFO: renamed from: o0 */
    public Thread.UncaughtExceptionHandler f9935o0;

    public C3262b(C16354g c16354g, Context appContext) {
        AbstractC16544l.m18094g(appContext, "appContext");
        this.f9933Y = c16354g;
        this.f9934Z = new WeakReference(appContext);
    }

    /* JADX INFO: renamed from: a */
    public static String m4146a(Throwable th2) {
        String message = th2.getMessage();
        if (message != null && !AbstractC21322p.m21681O(message)) {
            return message;
        }
        String canonicalName = th2.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = th2.getClass().getSimpleName();
        }
        return "Application crash detected: ".concat(canonicalName);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01f6 A[EDGE_INSN: B:52:0x01f6->B:53:0x0205 BREAK  A[LOOP:3: B:33:0x019f->B:81:?]] */
    /* JADX WARN: Code duplicated, block: B:60:0x021e  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) throws Throwable {
        Map allStackTraces;
        Context context;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        boolean z6;
        EnumC11255b enumC11255b = EnumC11255b.f34099Z;
        C16354g c16354g = this.f9933Y;
        AbstractC16544l.m18094g(t10, "t");
        AbstractC16544l.m18094g(e10, "e");
        String name = t10.getName();
        Thread.State state = t10.getState();
        AbstractC16544l.m18093f(state, "crashedThread.state");
        String strM3144a = AbstractC1976c.m3144a(state);
        String strM3148e = AbstractC1976c.m3148e(e10);
        AbstractC16544l.m18093f(name, "name");
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(new C16175c(name, strM3144a, true, strM3148e));
        try {
            allStackTraces = Thread.getAllStackTraces();
            AbstractC16544l.m18093f(allStackTraces, "{\n            Thread.getAllStackTraces()\n        }");
        } catch (SecurityException e11) {
            AbstractC7889G0.m8184b(c16354g.f50802j, 5, enumC11255b, C3261a.f9928Z, e11, false, 48);
            allStackTraces = C17690x.f56481Y;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : allStackTraces.entrySet()) {
            if (!AbstractC16544l.m18089b((Thread) entry.getKey(), t10)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((StackTraceElement[]) entry2.getValue()).length != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Thread thread = (Thread) entry3.getKey();
            String name2 = thread.getName();
            AbstractC16544l.m18093f(name2, "thread.name");
            Thread.State state2 = thread.getState();
            AbstractC16544l.m18093f(state2, "thread.state");
            String strM3144a2 = AbstractC1976c.m3144a(state2);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry3.getValue();
            AbstractC16544l.m18094g(stackTraceElementArr, "<this>");
            arrayList.add(new C16175c(name2, strM3144a2, false, AbstractC17678l.m19283F(stackTraceElementArr, Separators.RETURN, null, null, C1979f.f5851Y, 30)));
        }
        ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(arrayList, arrayListM19384m);
        C16360m c16360mMo15458n = c16354g.mo15458n("logs");
        EnumC11255b enumC11255b2 = EnumC11255b.f34098Y;
        if (c16360mMo15458n != null) {
            String name3 = t10.getName();
            AbstractC16544l.m18093f(name3, "t.name");
            c16360mMo15458n.m17960a(new C16173a(name3, e10, System.currentTimeMillis(), m4146a(e10), arrayListM19361k0));
        } else {
            AbstractC7889G0.m8184b(c16354g.f50802j, 3, enumC11255b2, C3261a.f9929o0, null, false, 56);
        }
        C16360m c16360mMo15458n2 = c16354g.mo15458n("rum");
        if (c16360mMo15458n2 != null) {
            c16360mMo15458n2.m17960a(new C16174b(m4146a(e10), e10, arrayListM19361k0));
        } else {
            AbstractC7889G0.m8184b(c16354g.f50802j, 3, enumC11255b2, C3261a.f9930p0, null, false, 56);
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) c16354g.m17953x().m17950b();
        InterfaceC11256c internalLogger = c16354g.f50802j;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        long jNanoTime = System.nanoTime();
        long nanos = TimeUnit.MILLISECONDS.toNanos(100L);
        long jM8922m = AbstractC8301I.m8922m(100L, 0L, 10L);
        while (threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() > 0) {
            try {
                try {
                    Thread.sleep(jM8922m);
                } catch (SecurityException e12) {
                    AbstractC7889G0.m8184b(internalLogger, 5, enumC11255b, C0397g.f1320p0, e12, false, 48);
                    z6 = true;
                }
            } catch (IllegalArgumentException e13) {
                AbstractC7889G0.m8184b(internalLogger, 4, enumC11255b, C0397g.f1321q0, e13, false, 48);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                z6 = true;
                if (System.nanoTime() - jNanoTime < nanos) {
                }
                if (threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() > 0) {
                    break;
                }
                AbstractC7889G0.m8184b(c16354g.f50802j, 4, enumC11255b2, C3261a.f9931q0, null, false, 56);
                break;
                context = (Context) this.f9934Z.get();
                if (context != null) {
                    AbstractC1976c.m3154k(context, c16354g.f50794b, internalLogger);
                }
                uncaughtExceptionHandler = this.f9935o0;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(t10, e10);
                }
            }
            z6 = false;
            if (System.nanoTime() - jNanoTime < nanos || z6) {
                if (threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() > 0) {
                    break;
                }
                AbstractC7889G0.m8184b(c16354g.f50802j, 4, enumC11255b2, C3261a.f9931q0, null, false, 56);
                break;
            }
        }
        context = (Context) this.f9934Z.get();
        if (context != null && C7253r.m7689e() != null) {
            AbstractC1976c.m3154k(context, c16354g.f50794b, internalLogger);
        }
        uncaughtExceptionHandler = this.f9935o0;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
