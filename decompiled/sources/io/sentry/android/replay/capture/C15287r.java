package io.sentry.android.replay.capture;

import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.EnumC15527z1;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15298l;
import io.sentry.android.replay.C15304r;
import io.sentry.protocol.C15447t;
import io.sentry.transport.C15481d;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p239Ja.C4307j;
import p379Pb.LVf.efyhmdM;
import p544W9.AbstractC8716t3;
import p561X.C8990d;
import p749fd.C13628m;
import p758g0.C13775m0;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C15287r extends AbstractC15275f {

    /* JADX INFO: renamed from: s */
    public final C15524y1 f47749s;

    /* JADX INFO: renamed from: t */
    public final C15109B f47750t;

    /* JADX INFO: renamed from: u */
    public final C15481d f47751u;

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: b */
    public final void mo16504b(C15304r c15304r) {
        m16512p("onConfigurationChanged", new C15286q(this, 0));
        m16502n(c15304r);
    }

    @Override // io.sentry.android.replay.capture.AbstractC15275f, io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: c */
    public final void mo16497c(C15304r recorderConfig, int i10, C15447t replayId, EnumC15527z1 enumC15527z1) {
        AbstractC16544l.m18094g(recorderConfig, "recorderConfig");
        AbstractC16544l.m18094g(replayId, "replayId");
        super.mo16497c(recorderConfig, i10, replayId, enumC15527z1);
        C15109B c15109b = this.f47750t;
        if (c15109b != null) {
            c15109b.mo16253v(new C4307j(this, 28));
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: d */
    public final InterfaceC15284o mo16505d() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: e */
    public final void mo16506e() {
        m16512p("pause", new C15286q(this, 1));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: f */
    public final void mo16507f(boolean z6, C13628m c13628m) {
        this.f47749s.getLogger().mo16298o(EnumC15375i1.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        this.f47713h.set(z6);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: g */
    public final void mo16508g(final C15298l c15298l) {
        this.f47751u.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int i10 = m16500l().f47814b;
        final int i11 = m16500l().f47813a;
        AbstractC8716t3.m9426c(this.f47709d, this.f47749s, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.p
            @Override // java.lang.Runnable
            public final void run() {
                C15287r this$0 = this.f47742Y;
                AbstractC16544l.m18094g(this$0, "this$0");
                C15298l c15298l2 = c15298l;
                C15294h c15294h = this$0.f47714i;
                if (c15294h != null) {
                    c15298l2.invoke(c15294h, Long.valueOf(jCurrentTimeMillis));
                }
                Date date = (Date) this$0.f47716k.getValue(this$0, AbstractC15275f.f47705r[1]);
                C15524y1 c15524y1 = this$0.f47749s;
                if (date == null) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (this$0.f47713h.get()) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                this$0.f47751u.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - date.getTime() >= c15524y1.getExperimental().f48340a.f47056h) {
                    AbstractC15283n abstractC15283nM16495i = AbstractC15275f.m16495i(this$0, c15524y1.getExperimental().f48340a.f47056h, date, this$0.m16498j(), this$0.m16499k(), i10, i11);
                    if (abstractC15283nM16495i instanceof C15281l) {
                        C15281l c15281l = (C15281l) abstractC15283nM16495i;
                        C15281l.m16511a(c15281l, this$0.f47750t);
                        this$0.m16501m(this$0.m16499k() + 1);
                        this$0.m16503o(c15281l.f47739a.f47011G0);
                    }
                }
                if (jCurrentTimeMillis2 - this$0.f47717l.get() >= c15524y1.getExperimental().f48340a.f47057i) {
                    c15524y1.getReplayController().stop();
                    c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m16512p(String str, InterfaceC1436k interfaceC1436k) {
        this.f47751u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Date date = (Date) this.f47716k.getValue(this, AbstractC15275f.f47705r[1]);
        if (date == null) {
            return;
        }
        int iM16499k = m16499k();
        long time = jCurrentTimeMillis - date.getTime();
        C15447t c15447tM16498j = m16498j();
        int i10 = m16500l().f47814b;
        int i11 = m16500l().f47813a;
        AbstractC8716t3.m9426c(this.f47709d, this.f47749s, "SessionCaptureStrategy.".concat(str), new RunnableC15276g(this, time, date, c15447tM16498j, iM16499k, i10, i11, interfaceC1436k));
    }

    @Override // io.sentry.android.replay.capture.AbstractC15275f, io.sentry.android.replay.capture.InterfaceC15284o
    public final void stop() {
        C15294h c15294h = this.f47714i;
        m16512p("stop", new C13775m0(this, 14, c15294h != null ? c15294h.m16518k() : null));
        C15109B c15109b = this.f47750t;
        if (c15109b != null) {
            c15109b.mo16253v(new C8990d(20));
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15287r(C15524y1 options, C15109B c15109b, C15481d c15481d, ScheduledExecutorService scheduledExecutorService, InterfaceC1436k interfaceC1436k) {
        super(options, c15109b, c15481d, scheduledExecutorService, interfaceC1436k);
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(c15481d, efyhmdM.NLfeyGFID);
        this.f47749s = options;
        this.f47750t = c15109b;
        this.f47751u = c15481d;
    }
}
