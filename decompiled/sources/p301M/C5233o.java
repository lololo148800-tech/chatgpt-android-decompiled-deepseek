package p301M;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p003A1.RunnableC0153B;
import p277L.ExecutorC4828a;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p720e6.C13287b;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: M.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5233o implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: Y */
    public ArrayList f16984Y;

    /* JADX INFO: renamed from: Z */
    public ArrayList f16985Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f16986o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicInteger f16987p0;

    /* JADX INFO: renamed from: q0 */
    public final C10145l f16988q0 = AbstractC16347a.m17947b(new C13287b(this, 17));

    /* JADX INFO: renamed from: r0 */
    public C10142i f16989r0;

    public C5233o(ArrayList arrayList, boolean z6, ExecutorC4828a executorC4828a) {
        this.f16984Y = arrayList;
        this.f16985Z = new ArrayList(arrayList.size());
        this.f16986o0 = z6;
        this.f16987p0 = new AtomicInteger(arrayList.size());
        mo5766a(new RunnableC0153B(this, 8), AbstractC8577W2.m9240b());
        if (this.f16984Y.isEmpty()) {
            this.f16989r0.m10747a(new ArrayList(this.f16985Z));
            return;
        }
        for (int i10 = 0; i10 < this.f16984Y.size(); i10++) {
            this.f16985Z.add(null);
        }
        ArrayList arrayList2 = this.f16984Y;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) arrayList2.get(i11);
            interfaceFutureC13608b.mo5766a(new RunnableC5232n(this, i11, interfaceFutureC13608b, 0), executorC4828a);
        }
    }

    @Override // p747fb.InterfaceFutureC13608b
    /* JADX INFO: renamed from: a */
    public final void mo5766a(Runnable runnable, Executor executor) {
        this.f16988q0.f30070Z.mo5766a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        ArrayList arrayList = this.f16984Y;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceFutureC13608b) it.next()).cancel(z6);
            }
        }
        return this.f16988q0.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return (List) this.f16988q0.f30070Z.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16988q0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16988q0.f30070Z.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<InterfaceFutureC13608b> arrayList = this.f16984Y;
        if (arrayList != null && !isDone()) {
            loop0: for (InterfaceFutureC13608b interfaceFutureC13608b : arrayList) {
                while (!interfaceFutureC13608b.isDone()) {
                    try {
                        interfaceFutureC13608b.get();
                    } catch (Error e10) {
                        throw e10;
                    } catch (InterruptedException e11) {
                        throw e11;
                    } catch (Throwable unused) {
                        if (this.f16986o0) {
                            return (List) this.f16988q0.f30070Z.get();
                        }
                    }
                }
            }
        }
        return (List) this.f16988q0.f30070Z.get();
    }
}
