package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import p1073w3.C20810l;
import p310M9.C5311e;
import p826j6.AbstractC16144M;
import p826j6.C16139H;
import p826j6.C16155i;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC12008t0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceFutureC12028y0 f36330Y;

    /* JADX INFO: renamed from: Z */
    public final C20810l f36331Z;

    public RunnableC12008t0(InterfaceFutureC12028y0 interfaceFutureC12028y0, C20810l c20810l) {
        this.f36330Y = interfaceFutureC12028y0;
        this.f36331Z = c20810l;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable th2;
        boolean z6 = true;
        boolean z10 = false;
        InterfaceFutureC12028y0 interfaceFutureC12028y0 = this.f36330Y;
        boolean z11 = interfaceFutureC12028y0 instanceof AbstractC11885K0;
        C20810l c20810l = this.f36331Z;
        if (z11) {
            AbstractC11984n0 abstractC11984n0 = (AbstractC11984n0) ((AbstractC11885K0) interfaceFutureC12028y0);
            if (abstractC11984n0 instanceof InterfaceC11968j0) {
                Object obj2 = abstractC11984n0.f36304Y;
                if (obj2 instanceof C11948e0) {
                    th2 = ((C11948e0) obj2).f36254a;
                } else {
                    th2 = null;
                }
            } else {
                th2 = null;
            }
            if (th2 != null) {
                c20810l.m21338d(th2);
                return;
            }
        }
        try {
            if (!interfaceFutureC12028y0.isDone()) {
                throw new IllegalStateException(AbstractC11957g1.m13445g("Future was expected to be done: %s", interfaceFutureC12028y0));
            }
            while (true) {
                try {
                    obj = interfaceFutureC12028y0.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = z6;
                } catch (Throwable th3) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            if (num.intValue() <= 0) {
                ((Runnable) c20810l.f66087c).run();
                return;
            }
            int iIntValue = num.intValue();
            C16139H c16139h = (C16139H) c20810l.f66088d;
            int i10 = c20810l.f66085a;
            c16139h.getClass();
            C16155i c16155iM17720a = AbstractC16144M.m17720a(iIntValue, "Billing override value was set by a license tester.");
            c16139h.m17707N(105, i10, c16155iM17720a);
            ((Consumer) c20810l.f66086b).m17405p(c16155iM17720a);
        } catch (ExecutionException e10) {
            c20810l.m21338d(e10.getCause());
        } catch (Throwable th4) {
            c20810l.m21338d(th4);
        }
    }

    public final String toString() {
        C5311e c5311e = new C5311e(RunnableC12008t0.class.getSimpleName(), 21);
        C11963i c11963i = new C11963i();
        ((C11963i) c5311e.f17486p0).f36276b = c11963i;
        c5311e.f17486p0 = c11963i;
        c11963i.f36275a = this.f36331Z;
        return c5311e.toString();
    }
}
