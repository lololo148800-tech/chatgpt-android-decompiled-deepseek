package io.sentry.android.replay.capture;

import io.sentry.protocol.C15447t;
import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15276g implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47723Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f47724Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Date f47725o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C15447t f47726p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f47727q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f47728r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f47729s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC16546n f47730t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ AbstractC15275f f47731u0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC15276g(C15278i c15278i, long j10, Date date, C15447t c15447t, int i10, int i11, int i12, InterfaceC1436k interfaceC1436k) {
        this.f47731u0 = c15278i;
        this.f47724Z = j10;
        this.f47725o0 = date;
        this.f47726p0 = c15447t;
        this.f47727q0 = i10;
        this.f47728r0 = i11;
        this.f47729s0 = i12;
        this.f47730t0 = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47723Y) {
            case 0:
                C15278i this$0 = (C15278i) this.f47731u0;
                AbstractC16544l.m18094g(this$0, "this$0");
                Date date = this.f47725o0;
                C15447t replayId = this.f47726p0;
                AbstractC16544l.m18094g(replayId, "$replayId");
                this.f47730t0.invoke(AbstractC15275f.m16495i(this$0, this.f47724Z, date, replayId, this.f47727q0, this.f47728r0, this.f47729s0));
                break;
            default:
                C15287r this$1 = (C15287r) this.f47731u0;
                AbstractC16544l.m18094g(this$1, "this$0");
                Date date2 = this.f47725o0;
                C15447t replayId2 = this.f47726p0;
                AbstractC16544l.m18094g(replayId2, "$replayId");
                this.f47730t0.invoke(AbstractC15275f.m16495i(this$1, this.f47724Z, date2, replayId2, this.f47727q0, this.f47728r0, this.f47729s0));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC15276g(C15287r c15287r, long j10, Date date, C15447t c15447t, int i10, int i11, int i12, InterfaceC1436k interfaceC1436k) {
        this.f47731u0 = c15287r;
        this.f47724Z = j10;
        this.f47725o0 = date;
        this.f47726p0 = c15447t;
        this.f47727q0 = i10;
        this.f47728r0 = i11;
        this.f47729s0 = i12;
        this.f47730t0 = (AbstractC16546n) interfaceC1436k;
    }
}
