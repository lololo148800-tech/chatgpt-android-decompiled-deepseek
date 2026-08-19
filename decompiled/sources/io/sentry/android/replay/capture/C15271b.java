package io.sentry.android.replay.capture;

import io.sentry.EnumC15527z1;
import io.sentry.android.replay.C15304r;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.RunnableC0153B;
import p128Em.InterfaceC2580c;
import p225Im.InterfaceC3776x;
import p437Rn.C6959q;
import p544W9.AbstractC8716t3;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15271b implements InterfaceC2580c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47689a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f47690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC15275f f47691c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC15275f f47692d;

    public C15271b(AbstractC15275f abstractC15275f, AbstractC15275f abstractC15275f2, int i10) {
        this.f47689a = i10;
        switch (i10) {
            case 1:
                this.f47691c = abstractC15275f;
                this.f47692d = abstractC15275f2;
                this.f47690b = new AtomicReference(null);
                break;
            default:
                this.f47691c = abstractC15275f;
                this.f47692d = abstractC15275f2;
                this.f47690b = new AtomicReference(null);
                break;
        }
    }

    @Override // p128Em.InterfaceC2579b
    public final Object getValue(Object obj, InterfaceC3776x property) {
        switch (this.f47689a) {
            case 0:
                AbstractC16544l.m18094g(property, "property");
                break;
            default:
                AbstractC16544l.m18094g(property, "property");
                break;
        }
        return this.f47690b.get();
    }

    @Override // p128Em.InterfaceC2580c
    public final void setValue(Object obj, InterfaceC3776x property, Object obj2) {
        switch (this.f47689a) {
            case 0:
                AbstractC16544l.m18094g(property, "property");
                Object andSet = this.f47690b.getAndSet(obj2);
                if (!AbstractC16544l.m18089b(andSet, obj2)) {
                    C6959q c6959q = new C6959q(andSet, (C15304r) obj2, this.f47692d, 29);
                    AbstractC15275f abstractC15275f = this.f47691c;
                    if (!abstractC15275f.f47706a.getMainThreadChecker().mo16438a()) {
                        c6959q.invoke();
                    } else {
                        AbstractC8716t3.m9426c(AbstractC15275f.m16494h(abstractC15275f), abstractC15275f.f47706a, "CaptureStrategy.runInBackground", new RunnableC0153B(c6959q, 21));
                    }
                }
                break;
            default:
                AbstractC16544l.m18094g(property, "property");
                Object andSet2 = this.f47690b.getAndSet(obj2);
                if (!AbstractC16544l.m18089b(andSet2, obj2)) {
                    C15272c c15272c = new C15272c(andSet2, (EnumC15527z1) obj2, this.f47692d, 2);
                    AbstractC15275f abstractC15275f2 = this.f47691c;
                    if (!abstractC15275f2.f47706a.getMainThreadChecker().mo16438a()) {
                        c15272c.invoke();
                    } else {
                        AbstractC8716t3.m9426c(AbstractC15275f.m16494h(abstractC15275f2), abstractC15275f2.f47706a, "CaptureStrategy.runInBackground", new RunnableC0153B(c15272c, 24));
                    }
                }
                break;
        }
    }
}
