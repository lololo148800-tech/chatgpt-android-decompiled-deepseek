package io.sentry.android.replay.capture;

import io.sentry.protocol.C15447t;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.RunnableC0153B;
import p128Em.InterfaceC2580c;
import p225Im.InterfaceC3776x;
import p544W9.AbstractC8716t3;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15273d implements InterfaceC2580c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47697a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f47698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC15275f f47699c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC15275f f47700d;

    public C15273d(AbstractC15275f abstractC15275f, AbstractC15275f abstractC15275f2) {
        this.f47697a = 1;
        this.f47699c = abstractC15275f;
        this.f47700d = abstractC15275f2;
        this.f47698b = new AtomicReference(null);
    }

    @Override // p128Em.InterfaceC2579b
    public final Object getValue(Object obj, InterfaceC3776x property) {
        switch (this.f47697a) {
            case 0:
                AbstractC16544l.m18094g(property, "property");
                break;
            default:
                AbstractC16544l.m18094g(property, "property");
                break;
        }
        return this.f47698b.get();
    }

    @Override // p128Em.InterfaceC2580c
    public final void setValue(Object obj, InterfaceC3776x property, Object obj2) {
        switch (this.f47697a) {
            case 0:
                AbstractC16544l.m18094g(property, "property");
                Object andSet = this.f47698b.getAndSet(obj2);
                if (!AbstractC16544l.m18089b(andSet, obj2)) {
                    C15272c c15272c = new C15272c(andSet, (C15447t) obj2, this.f47700d, 0);
                    AbstractC15275f abstractC15275f = this.f47699c;
                    if (!abstractC15275f.f47706a.getMainThreadChecker().mo16438a()) {
                        c15272c.invoke();
                    } else {
                        AbstractC8716t3.m9426c(AbstractC15275f.m16494h(abstractC15275f), abstractC15275f.f47706a, "CaptureStrategy.runInBackground", new RunnableC0153B(c15272c, 22));
                    }
                }
                break;
            default:
                AbstractC16544l.m18094g(property, "property");
                Object andSet2 = this.f47698b.getAndSet(obj2);
                if (!AbstractC16544l.m18089b(andSet2, obj2)) {
                    C15272c c15272c2 = new C15272c(andSet2, (Date) obj2, this.f47700d, 3);
                    AbstractC15275f abstractC15275f2 = this.f47699c;
                    if (!abstractC15275f2.f47706a.getMainThreadChecker().mo16438a()) {
                        c15272c2.invoke();
                    } else {
                        AbstractC8716t3.m9426c(AbstractC15275f.m16494h(abstractC15275f2), abstractC15275f2.f47706a, "CaptureStrategy.runInBackground", new RunnableC0153B(c15272c2, 25));
                    }
                }
                break;
        }
    }

    public C15273d(C15447t c15447t, AbstractC15275f abstractC15275f, AbstractC15275f abstractC15275f2) {
        this.f47697a = 0;
        this.f47699c = abstractC15275f;
        this.f47700d = abstractC15275f2;
        this.f47698b = new AtomicReference(c15447t);
    }
}
