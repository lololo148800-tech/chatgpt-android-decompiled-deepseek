package io.sentry.android.replay.capture;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.RunnableC0153B;
import p128Em.InterfaceC2580c;
import p225Im.InterfaceC3776x;
import p544W9.AbstractC8716t3;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15274e implements InterfaceC2580c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47701a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f47702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC15275f f47703c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC15275f f47704d;

    public C15274e(AbstractC15275f abstractC15275f, AbstractC15275f abstractC15275f2, int i10) {
        this.f47701a = i10;
        switch (i10) {
            case 1:
                this.f47703c = abstractC15275f;
                this.f47704d = abstractC15275f2;
                this.f47702b = new AtomicReference(null);
                break;
            default:
                this.f47703c = abstractC15275f;
                this.f47704d = abstractC15275f2;
                this.f47702b = new AtomicReference(-1);
                break;
        }
    }

    @Override // p128Em.InterfaceC2579b
    public final Object getValue(Object obj, InterfaceC3776x property) {
        switch (this.f47701a) {
            case 0:
                AbstractC16544l.m18094g(property, "property");
                break;
            default:
                AbstractC16544l.m18094g(property, "property");
                break;
        }
        return this.f47702b.get();
    }

    @Override // p128Em.InterfaceC2580c
    public final void setValue(Object obj, InterfaceC3776x property, Object obj2) {
        switch (this.f47701a) {
            case 0:
                AbstractC16544l.m18094g(property, "property");
                Object andSet = this.f47702b.getAndSet(obj2);
                if (!AbstractC16544l.m18089b(andSet, obj2)) {
                    C15272c c15272c = new C15272c(andSet, (Integer) obj2, this.f47704d, 1);
                    AbstractC15275f abstractC15275f = this.f47703c;
                    if (!abstractC15275f.f47706a.getMainThreadChecker().mo16438a()) {
                        c15272c.invoke();
                    } else {
                        AbstractC8716t3.m9426c(AbstractC15275f.m16494h(abstractC15275f), abstractC15275f.f47706a, "CaptureStrategy.runInBackground", new RunnableC0153B(c15272c, 23));
                    }
                }
                break;
            default:
                AbstractC16544l.m18094g(property, "property");
                Object andSet2 = this.f47702b.getAndSet(obj2);
                if (!AbstractC16544l.m18089b(andSet2, obj2)) {
                    C15272c c15272c2 = new C15272c(andSet2, (String) obj2, this.f47704d, 4);
                    AbstractC15275f abstractC15275f2 = this.f47703c;
                    if (!abstractC15275f2.f47706a.getMainThreadChecker().mo16438a()) {
                        c15272c2.invoke();
                    } else {
                        AbstractC8716t3.m9426c(AbstractC15275f.m16494h(abstractC15275f2), abstractC15275f2.f47706a, "CaptureStrategy.runInBackground", new RunnableC0153B(c15272c2, 26));
                    }
                }
                break;
        }
    }
}
