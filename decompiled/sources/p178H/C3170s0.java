package p178H;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import io.sentry.C15358g1;
import io.sentry.internal.debugmeta.C15384c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001A.C0100z;
import p004A2.InterfaceC0310a;
import p1009s9.C19506i;
import p109E3.C2292p;
import p228J.C3836g;
import p228J.InterfaceC3870x;
import p277L.ExecutorC4828a;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.RunnableC5228j;
import p310M9.C5311e;
import p414R.RunnableC6774h;
import p544W9.AbstractC8577W2;
import p571X9.AbstractC9306j0;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: H.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3170s0 {

    /* JADX INFO: renamed from: a */
    public final Object f9534a = new Object();

    /* JADX INFO: renamed from: b */
    public final Size f9535b;

    /* JADX INFO: renamed from: c */
    public final C3175v f9536c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3870x f9537d;

    /* JADX INFO: renamed from: e */
    public final boolean f9538e;

    /* JADX INFO: renamed from: f */
    public final C10145l f9539f;

    /* JADX INFO: renamed from: g */
    public final C10142i f9540g;

    /* JADX INFO: renamed from: h */
    public final C10145l f9541h;

    /* JADX INFO: renamed from: i */
    public final C10142i f9542i;

    /* JADX INFO: renamed from: j */
    public final C10142i f9543j;

    /* JADX INFO: renamed from: k */
    public final C3162o0 f9544k;

    /* JADX INFO: renamed from: l */
    public C3151j f9545l;

    /* JADX INFO: renamed from: m */
    public InterfaceC3168r0 f9546m;

    /* JADX INFO: renamed from: n */
    public Executor f9547n;

    static {
        Range range = C3836g.f11605f;
    }

    public C3170s0(Size size, InterfaceC3870x interfaceC3870x, boolean z6, C3175v c3175v, RunnableC6774h runnableC6774h) {
        this.f9535b = size;
        this.f9537d = interfaceC3870x;
        this.f9538e = z6;
        this.f9536c = c3175v;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i10 = 0;
        C10145l c10145lM17947b = AbstractC16347a.m17947b(new InterfaceC10143j() { // from class: H.m0
            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i) {
                switch (i10) {
                    case 0:
                        atomicReference.set(c10142i);
                        return AbstractC9306j0.m9891j(str, "-cancellation", new StringBuilder());
                    case 1:
                        atomicReference.set(c10142i);
                        return AbstractC9306j0.m9891j(str, "-status", new StringBuilder());
                    default:
                        atomicReference.set(c10142i);
                        return AbstractC9306j0.m9891j(str, "-Surface", new StringBuilder());
                }
            }
        });
        C10142i c10142i = (C10142i) atomicReference.get();
        c10142i.getClass();
        this.f9543j = c10142i;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i11 = 1;
        C10145l c10145lM17947b2 = AbstractC16347a.m17947b(new InterfaceC10143j() { // from class: H.m0
            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i2) {
                switch (i11) {
                    case 0:
                        atomicReference2.set(c10142i2);
                        return AbstractC9306j0.m9891j(str, "-cancellation", new StringBuilder());
                    case 1:
                        atomicReference2.set(c10142i2);
                        return AbstractC9306j0.m9891j(str, "-status", new StringBuilder());
                    default:
                        atomicReference2.set(c10142i2);
                        return AbstractC9306j0.m9891j(str, "-Surface", new StringBuilder());
                }
            }
        });
        this.f9541h = c10145lM17947b2;
        c10145lM17947b2.mo5766a(new RunnableC5228j(c10145lM17947b2, 0, new C15384c(c10142i, 6, c10145lM17947b)), AbstractC8577W2.m9240b());
        C10142i c10142i2 = (C10142i) atomicReference2.get();
        c10142i2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i12 = 2;
        C10145l c10145lM17947b3 = AbstractC16347a.m17947b(new InterfaceC10143j() { // from class: H.m0
            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i3) {
                switch (i12) {
                    case 0:
                        atomicReference3.set(c10142i3);
                        return AbstractC9306j0.m9891j(str, "-cancellation", new StringBuilder());
                    case 1:
                        atomicReference3.set(c10142i3);
                        return AbstractC9306j0.m9891j(str, "-status", new StringBuilder());
                    default:
                        atomicReference3.set(c10142i3);
                        return AbstractC9306j0.m9891j(str, "-Surface", new StringBuilder());
                }
            }
        });
        this.f9539f = c10145lM17947b3;
        C10142i c10142i3 = (C10142i) atomicReference3.get();
        c10142i3.getClass();
        this.f9540g = c10142i3;
        C3162o0 c3162o0 = new C3162o0(this, size);
        this.f9544k = c3162o0;
        InterfaceFutureC13608b interfaceFutureC13608bM5780d = AbstractC5229k.m5780d(c3162o0.f11530e);
        c10145lM17947b3.mo5766a(new RunnableC5228j(c10145lM17947b3, 0, new C5311e(interfaceFutureC13608bM5780d, c10142i2, str, 4)), AbstractC8577W2.m9240b());
        interfaceFutureC13608bM5780d.mo5766a(new RunnableC3160n0(this, 0), AbstractC8577W2.m9240b());
        ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
        AtomicReference atomicReference4 = new AtomicReference(null);
        C10145l c10145lM17947b4 = AbstractC16347a.m17947b(new C0100z(this, 14, atomicReference4));
        c10145lM17947b4.mo5766a(new RunnableC5228j(c10145lM17947b4, 0, new C19506i(runnableC6774h, 10)), executorC4828aM9240b);
        C10142i c10142i4 = (C10142i) atomicReference4.get();
        c10142i4.getClass();
        this.f9542i = c10142i4;
    }

    /* JADX INFO: renamed from: a */
    public final void m3999a(final Surface surface, Executor executor, final InterfaceC0310a interfaceC0310a) {
        if (!this.f9540g.m10747a(surface)) {
            C10145l c10145l = this.f9539f;
            if (!c10145l.isCancelled()) {
                AbstractC4941g.m5559R(null, c10145l.f30070Z.isDone());
                try {
                    c10145l.get();
                    final int i10 = 0;
                    executor.execute(new Runnable() { // from class: H.l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    interfaceC0310a.accept(new C3149i(3, surface));
                                    break;
                                default:
                                    interfaceC0310a.accept(new C3149i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i11 = 1;
                    executor.execute(new Runnable() { // from class: H.l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    interfaceC0310a.accept(new C3149i(3, surface));
                                    break;
                                default:
                                    interfaceC0310a.accept(new C3149i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        C15358g1 c15358g1 = new C15358g1(interfaceC0310a, surface);
        C10145l c10145l2 = this.f9541h;
        c10145l2.mo5766a(new RunnableC5228j(c10145l2, 0, c15358g1), executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m4000b(Executor executor, InterfaceC3168r0 interfaceC3168r0) {
        C3151j c3151j;
        synchronized (this.f9534a) {
            this.f9546m = interfaceC3168r0;
            this.f9547n = executor;
            c3151j = this.f9545l;
        }
        if (c3151j != null) {
            executor.execute(new RunnableC3154k0(interfaceC3168r0, c3151j, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4001c() {
        this.f9540g.m10748b(new C2292p("Surface request will not complete."));
    }
}
