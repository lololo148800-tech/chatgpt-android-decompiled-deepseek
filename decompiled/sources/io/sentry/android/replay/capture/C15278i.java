package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.EnumC15527z1;
import io.sentry.RunnableC15149O0;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15295i;
import io.sentry.android.replay.C15298l;
import io.sentry.android.replay.C15304r;
import io.sentry.rrweb.AbstractC15461b;
import io.sentry.transport.C15481d;
import io.sentry.util.C15501f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p049Bm.InterfaceC1436k;
import p239Ja.C4307j;
import p329N3.RunnableC5632v;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8716t3;
import p749fd.C13628m;
import p758g0.C13775m0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15278i extends AbstractC15275f {

    /* JADX INFO: renamed from: s */
    public final C15524y1 f47734s;

    /* JADX INFO: renamed from: t */
    public final C15109B f47735t;

    /* JADX INFO: renamed from: u */
    public final C15481d f47736u;

    /* JADX INFO: renamed from: v */
    public final C15501f f47737v;

    /* JADX INFO: renamed from: w */
    public final ArrayList f47738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15278i(C15524y1 options, C15109B c15109b, C15481d dateProvider, C15501f random, ScheduledExecutorService scheduledExecutorService) {
        super(options, c15109b, dateProvider, scheduledExecutorService, null);
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        AbstractC16544l.m18094g(random, "random");
        this.f47734s = options;
        this.f47735t = c15109b;
        this.f47736u = dateProvider;
        this.f47737v = random;
        this.f47738w = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: b */
    public final void mo16504b(C15304r c15304r) {
        m16509p("configuration_changed", new C15277h(this, 0));
        m16502n(c15304r);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: d */
    public final InterfaceC15284o mo16505d() {
        if (this.f47713h.get()) {
            this.f47734s.getLogger().mo16298o(EnumC15375i1.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        C15287r c15287r = new C15287r(this.f47734s, this.f47735t, this.f47736u, this.f47709d, null);
        c15287r.mo16497c(m16500l(), m16499k(), m16498j(), EnumC15527z1.BUFFER);
        return c15287r;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: e */
    public final void mo16506e() {
        m16509p("pause", new C15277h(this, 1));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: f */
    public final void mo16507f(boolean z6, C13628m c13628m) {
        C15524y1 c15524y1 = this.f47734s;
        Double d10 = c15524y1.getExperimental().f48340a.f47050b;
        C15501f c15501f = this.f47737v;
        AbstractC16544l.m18094g(c15501f, "<this>");
        if (!(d10 != null && d10.doubleValue() >= c15501f.m16686b())) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        C15109B c15109b = this.f47735t;
        if (c15109b != null) {
            c15109b.mo16253v(new C4307j(this, 27));
        }
        if (!z6) {
            m16509p("capture_replay", new C13775m0(this, 12, c13628m));
        } else {
            this.f47713h.set(true);
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: g */
    public final void mo16508g(C15298l c15298l) {
        this.f47736u.getClass();
        AbstractC8716t3.m9426c(this.f47709d, this.f47734s, "BufferCaptureStrategy.add_frame", new RunnableC5632v(this, c15298l, System.currentTimeMillis(), 2));
    }

    /* JADX INFO: renamed from: p */
    public final void m16509p(String str, InterfaceC1436k interfaceC1436k) {
        Date dateM9341i;
        ArrayList arrayList;
        C15524y1 c15524y1 = this.f47734s;
        long j10 = c15524y1.getExperimental().f48340a.f47055g;
        this.f47736u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C15294h c15294h = this.f47714i;
        if (c15294h == null || (arrayList = c15294h.f47778s0) == null || !(!arrayList.isEmpty())) {
            dateM9341i = AbstractC8656j3.m9341i(jCurrentTimeMillis - j10);
        } else {
            C15294h c15294h2 = this.f47714i;
            AbstractC16544l.m18091d(c15294h2);
            dateM9341i = AbstractC8656j3.m9341i(((C15295i) AbstractC17680n.m19341Q(c15294h2.f47778s0)).f47782b);
        }
        Date date = dateM9341i;
        AbstractC16544l.m18093f(date, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        AbstractC8716t3.m9426c(this.f47709d, c15524y1, "BufferCaptureStrategy.".concat(str), new RunnableC15276g(this, jCurrentTimeMillis - date.getTime(), date, m16498j(), m16499k(), m16500l().f47814b, m16500l().f47813a, interfaceC1436k));
    }

    @Override // io.sentry.android.replay.capture.AbstractC15275f, io.sentry.android.replay.capture.InterfaceC15284o
    public final void stop() {
        C15294h c15294h = this.f47714i;
        AbstractC8716t3.m9426c(this.f47709d, this.f47734s, "BufferCaptureStrategy.stop", new RunnableC15149O0(c15294h != null ? c15294h.m16518k() : null, 1));
        super.stop();
    }

    @Override // io.sentry.android.replay.capture.AbstractC15275f, io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: a */
    public final void mo16496a(MotionEvent motionEvent) {
        super.mo16496a(motionEvent);
        this.f47736u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f47734s.getExperimental().f48340a.f47055g;
        ConcurrentLinkedDeque events = this.f47722q;
        AbstractC16544l.m18094g(events, "events");
        Iterator it = events.iterator();
        AbstractC16544l.m18093f(it, ahZQMZ.ZbIZhNRqeu);
        while (it.hasNext()) {
            if (((AbstractC15461b) it.next()).f48291Z < jCurrentTimeMillis) {
                it.remove();
            }
        }
    }
}
