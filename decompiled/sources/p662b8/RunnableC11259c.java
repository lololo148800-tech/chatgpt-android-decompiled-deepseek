package p662b8;

import android.gov.nist.core.Separators;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p087D7.AbstractC1976c;
import p087D7.C1979f;
import p523V9.AbstractC7889G0;
import p592Y7.AbstractC9667b;
import p661b7.EnumC11255b;
import p765g7.InterfaceC13823a;
import p827j7.C16175c;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: b8.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11259c implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f34108Y;

    /* JADX INFO: renamed from: Z */
    public final Handler f34109Z;

    /* JADX INFO: renamed from: o0 */
    public final long f34110o0 = 5000;

    /* JADX INFO: renamed from: p0 */
    public final long f34111p0 = 500;

    /* JADX INFO: renamed from: q0 */
    public boolean f34112q0;

    public RunnableC11259c(InterfaceC13823a interfaceC13823a, Handler handler) {
        this.f34108Y = interfaceC13823a;
        this.f34109Z = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map allStackTraces;
        while (!Thread.interrupted() && !this.f34112q0) {
            try {
                RunnableC11257a runnableC11257a = new RunnableC11257a();
                synchronized (runnableC11257a) {
                    try {
                        if (!this.f34109Z.post(runnableC11257a)) {
                            return;
                        }
                        runnableC11257a.wait(this.f34110o0);
                        if (!runnableC11257a.f34103Y) {
                            Thread thread = this.f34109Z.getLooper().getThread();
                            AbstractC16544l.m18093f(thread, "handler.looper.thread");
                            C11260d c11260d = new C11260d();
                            c11260d.setStackTrace(thread.getStackTrace());
                            String name = thread.getName();
                            AbstractC16544l.m18093f(name, "anrThread.name");
                            Thread.State state = thread.getState();
                            AbstractC16544l.m18093f(state, "anrThread.state");
                            ArrayList arrayListM19384m = AbstractC17681o.m19384m(new C16175c(name, AbstractC1976c.m3144a(state), false, AbstractC1976c.m3148e(c11260d)));
                            try {
                                allStackTraces = Thread.getAllStackTraces();
                                AbstractC16544l.m18093f(allStackTraces, "{\n            Thread.getAllStackTraces()\n        }");
                            } catch (SecurityException e10) {
                                AbstractC7889G0.m8184b(this.f34108Y.mo15463s(), 5, EnumC11255b.f34099Z, C11258b.f34104Z, e10, false, 48);
                                allStackTraces = C17690x.f56481Y;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : allStackTraces.entrySet()) {
                                if (!AbstractC16544l.m18089b((Thread) entry.getKey(), thread)) {
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
                            Iterator it = linkedHashMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                Thread thread2 = (Thread) ((Map.Entry) it.next()).getKey();
                                String name2 = thread2.getName();
                                AbstractC16544l.m18093f(name2, "thread.name");
                                Thread.State state2 = thread2.getState();
                                AbstractC16544l.m18093f(state2, "thread.state");
                                String strM3144a = AbstractC1976c.m3144a(state2);
                                StackTraceElement[] stackTrace = thread2.getStackTrace();
                                AbstractC16544l.m18093f(stackTrace, "thread.stackTrace");
                                arrayList.add(new C16175c(name2, strM3144a, false, AbstractC17678l.m19283F(stackTrace, Separators.RETURN, null, null, C1979f.f5851Y, 30)));
                            }
                            AbstractC9667b.m10254a(this.f34108Y).mo10262r("Application Not Responding", 2, c11260d, AbstractC17660E.m19258c(new C17309l("_dd.error.threads", AbstractC17680n.m19361k0(arrayList, arrayListM19384m))));
                            runnableC11257a.wait();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j10 = this.f34111p0;
                if (j10 > 0) {
                    Thread.sleep(j10);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
