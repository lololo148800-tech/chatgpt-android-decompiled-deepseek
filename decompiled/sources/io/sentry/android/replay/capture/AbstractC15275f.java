package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15527z1;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15304r;
import io.sentry.protocol.C15447t;
import io.sentry.rrweb.C15466g;
import io.sentry.rrweb.C15467h;
import io.sentry.rrweb.C15468i;
import io.sentry.rrweb.EnumC15465f;
import io.sentry.transport.C15481d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import mm.C17314q;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p054C0.C1497j;
import p225Im.InterfaceC3776x;
import p544W9.AbstractC8656j3;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15275f implements InterfaceC15284o {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ InterfaceC3776x[] f47705r;

    /* JADX INFO: renamed from: a */
    public final C15524y1 f47706a;

    /* JADX INFO: renamed from: b */
    public final C15109B f47707b;

    /* JADX INFO: renamed from: c */
    public final C15481d f47708c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f47709d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f47710e;

    /* JADX INFO: renamed from: f */
    public final C17314q f47711f;

    /* JADX INFO: renamed from: g */
    public final C1497j f47712g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f47713h;

    /* JADX INFO: renamed from: i */
    public C15294h f47714i;

    /* JADX INFO: renamed from: j */
    public final C15271b f47715j;

    /* JADX INFO: renamed from: k */
    public final C15273d f47716k;

    /* JADX INFO: renamed from: l */
    public final AtomicLong f47717l;

    /* JADX INFO: renamed from: m */
    public final C15274e f47718m;

    /* JADX INFO: renamed from: n */
    public final C15273d f47719n;

    /* JADX INFO: renamed from: o */
    public final C15274e f47720o;

    /* JADX INFO: renamed from: p */
    public final C15271b f47721p;

    /* JADX INFO: renamed from: q */
    public final ConcurrentLinkedDeque f47722q;

    static {
        C16549q c16549q = new C16549q(AbstractC15275f.class, "recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f47705r = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(AbstractC15275f.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0, c16527d), AbstractC0168G.m528q(AbstractC15275f.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0, c16527d), AbstractC0168G.m528q(AbstractC15275f.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0, c16527d), AbstractC0168G.m528q(AbstractC15275f.class, "currentSegment", "getCurrentSegment()I", 0, c16527d), AbstractC0168G.m528q(AbstractC15275f.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0, c16527d)};
    }

    public AbstractC15275f(C15524y1 options, C15109B c15109b, C15481d dateProvider, ScheduledExecutorService scheduledExecutorService, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.f47706a = options;
        this.f47707b = c15109b;
        this.f47708c = dateProvider;
        this.f47709d = scheduledExecutorService;
        this.f47710e = interfaceC1436k;
        this.f47711f = AbstractC9227W.m9800c(C15270a.f47688Y);
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        C1497j c1497j = new C1497j();
        c1497j.f3972o0 = dateProvider;
        c1497j.f3973p0 = new LinkedHashMap(10);
        this.f47712g = c1497j;
        this.f47713h = new AtomicBoolean(false);
        this.f47715j = new C15271b(this, this, 0);
        this.f47716k = new C15273d(this, this);
        this.f47717l = new AtomicLong();
        this.f47718m = new C15274e(this, this, 1);
        this.f47719n = new C15273d(C15447t.f48216Z, this, this);
        this.f47720o = new C15274e(this, this, 0);
        this.f47721p = new C15271b(this, this, 1);
        this.f47722q = new ConcurrentLinkedDeque();
    }

    /* JADX INFO: renamed from: h */
    public static final ScheduledExecutorService m16494h(AbstractC15275f abstractC15275f) {
        Object value = abstractC15275f.f47711f.getValue();
        AbstractC16544l.m18093f(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC15283n m16495i(AbstractC15275f abstractC15275f, long j10, Date date, C15447t replayId, int i10, int i11, int i12) {
        C15271b c15271b = abstractC15275f.f47721p;
        InterfaceC3776x[] interfaceC3776xArr = f47705r;
        EnumC15527z1 replayType = (EnumC15527z1) c15271b.getValue(abstractC15275f, interfaceC3776xArr[5]);
        C15294h c15294h = abstractC15275f.f47714i;
        int i13 = abstractC15275f.m16500l().f47817e;
        int i14 = abstractC15275f.m16500l().f47818f;
        String str = (String) abstractC15275f.f47718m.getValue(abstractC15275f, interfaceC3776xArr[2]);
        ConcurrentLinkedDeque events = abstractC15275f.f47722q;
        abstractC15275f.getClass();
        AbstractC16544l.m18094g(replayId, "replayId");
        AbstractC16544l.m18094g(replayType, "replayType");
        AbstractC16544l.m18094g(events, "events");
        return C15280k.m16510a(abstractC15275f.f47707b, abstractC15275f.f47706a, j10, date, replayId, i10, i11, i12, replayType, c15294h, i13, i14, str, null, events);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0180  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c2  */
    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: a */
    public void mo16496a(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List listM9974d;
        List list;
        int pointerId2;
        int iFindPointerIndex2;
        List listM9974d2;
        List listM9974d3;
        C15304r recorderConfig = m16500l();
        C1497j c1497j = this.f47712g;
        c1497j.getClass();
        AbstractC16544l.m18094g(recorderConfig, "recorderConfig");
        int actionMasked = motionEvent.getActionMasked();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1497j.f3973p0;
        int i10 = 10;
        int i11 = -1;
        C15481d c15481d = (C15481d) c1497j.f3972o0;
        float f10 = recorderConfig.f47816d;
        float f11 = recorderConfig.f47815c;
        if (actionMasked == 0) {
            pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex != -1) {
                list = null;
            } else {
                linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                C15466g c15466g = new C15466g();
                c15481d.getClass();
                c15466g.f48291Z = System.currentTimeMillis();
                c15466g.f48295r0 = motionEvent.getX(iFindPointerIndex) * f11;
                c15466g.f48296s0 = motionEvent.getY(iFindPointerIndex) * f10;
                c15466g.f48294q0 = 0;
                c15466g.f48298u0 = pointerId;
                c15466g.f48293p0 = EnumC15465f.TouchStart;
                listM9974d = AbstractC9393x3.m9974d(c15466g);
            }
        } else if (actionMasked == 1) {
            pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
            if (iFindPointerIndex2 != -1) {
                list = null;
            } else {
                linkedHashMap.remove(Integer.valueOf(pointerId2));
                C15466g c15466g2 = new C15466g();
                c15481d.getClass();
                c15466g2.f48291Z = System.currentTimeMillis();
                c15466g2.f48295r0 = motionEvent.getX(iFindPointerIndex2) * f11;
                c15466g2.f48296s0 = motionEvent.getY(iFindPointerIndex2) * f10;
                c15466g2.f48294q0 = 0;
                c15466g2.f48298u0 = pointerId2;
                c15466g2.f48293p0 = EnumC15465f.TouchEnd;
                listM9974d2 = AbstractC9393x3.m9974d(c15466g2);
            }
        } else if (actionMasked == 2) {
            c15481d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = c1497j.f3971Z;
            if (j10 == 0 || j10 + ((long) 50) <= jCurrentTimeMillis) {
                c1497j.f3971Z = jCurrentTimeMillis;
                Set setKeySet = linkedHashMap.keySet();
                AbstractC16544l.m18093f(setKeySet, "currentPositions.keys");
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    Integer pId = (Integer) it.next();
                    AbstractC16544l.m18093f(pId, "pId");
                    int iFindPointerIndex3 = motionEvent.findPointerIndex(pId.intValue());
                    if (iFindPointerIndex3 != i11) {
                        if (c1497j.f3970Y == 0) {
                            c1497j.f3970Y = jCurrentTimeMillis;
                        }
                        Object obj = linkedHashMap.get(pId);
                        AbstractC16544l.m18091d(obj);
                        C15467h c15467h = new C15467h();
                        c15467h.f48302Z = motionEvent.getX(iFindPointerIndex3) * f11;
                        c15467h.f48303o0 = motionEvent.getY(iFindPointerIndex3) * f10;
                        c15467h.f48301Y = 0;
                        c15467h.f48304p0 = jCurrentTimeMillis - c1497j.f3970Y;
                        ((Collection) obj).add(c15467h);
                    }
                    it = it;
                    i11 = -1;
                }
                long j11 = jCurrentTimeMillis - c1497j.f3970Y;
                if (j11 > 500) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        ArrayList arrayList2 = (ArrayList) entry.getValue();
                        if (!arrayList2.isEmpty()) {
                            C15468i c15468i = new C15468i();
                            c15468i.f48291Z = jCurrentTimeMillis;
                            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, i10));
                            for (Iterator it2 = arrayList2.iterator(); it2.hasNext(); it2 = it2) {
                                C15467h c15467h2 = (C15467h) it2.next();
                                c15467h2.f48304p0 -= j11;
                                arrayList3.add(c15467h2);
                            }
                            c15468i.f48307q0 = arrayList3;
                            c15468i.f48306p0 = iIntValue;
                            arrayList.add(c15468i);
                            Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                            AbstractC16544l.m18091d(obj2);
                            ((ArrayList) obj2).clear();
                            i10 = 10;
                        }
                    }
                    c1497j.f3970Y = 0L;
                    list = arrayList;
                } else {
                    list = null;
                }
            } else {
                list = null;
            }
        } else if (actionMasked != 3) {
            if (actionMasked == 5) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    C15466g c15466g3 = new C15466g();
                    c15481d.getClass();
                    c15466g3.f48291Z = System.currentTimeMillis();
                    c15466g3.f48295r0 = motionEvent.getX(iFindPointerIndex) * f11;
                    c15466g3.f48296s0 = motionEvent.getY(iFindPointerIndex) * f10;
                    c15466g3.f48294q0 = 0;
                    c15466g3.f48298u0 = pointerId;
                    c15466g3.f48293p0 = EnumC15465f.TouchStart;
                    listM9974d = AbstractC9393x3.m9974d(c15466g3);
                }
            } else if (actionMasked == 6) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    C15466g c15466g4 = new C15466g();
                    c15481d.getClass();
                    c15466g4.f48291Z = System.currentTimeMillis();
                    c15466g4.f48295r0 = motionEvent.getX(iFindPointerIndex2) * f11;
                    c15466g4.f48296s0 = motionEvent.getY(iFindPointerIndex2) * f10;
                    c15466g4.f48294q0 = 0;
                    c15466g4.f48298u0 = pointerId2;
                    c15466g4.f48293p0 = EnumC15465f.TouchEnd;
                    listM9974d2 = AbstractC9393x3.m9974d(c15466g4);
                }
            }
            list = null;
        } else {
            linkedHashMap.clear();
            C15466g c15466g5 = new C15466g();
            c15481d.getClass();
            c15466g5.f48291Z = System.currentTimeMillis();
            c15466g5.f48295r0 = motionEvent.getX() * f11;
            c15466g5.f48296s0 = motionEvent.getY() * f10;
            c15466g5.f48294q0 = 0;
            c15466g5.f48298u0 = 0;
            c15466g5.f48293p0 = EnumC15465f.TouchCancel;
            listM9974d3 = AbstractC9393x3.m9974d(c15466g5);
        }
        if (list == null) {
            list = listM9974d;
            list = listM9974d2;
            list = listM9974d3;
            return;
        } else {
            list = listM9974d;
            list = listM9974d2;
            list = listM9974d3;
            AbstractC17686t.m19398v(list, this.f47722q);
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    /* JADX INFO: renamed from: c */
    public void mo16497c(C15304r recorderConfig, int i10, C15447t replayId, EnumC15527z1 enumC15527z1) {
        C15294h c15294h;
        AbstractC16544l.m18094g(recorderConfig, "recorderConfig");
        AbstractC16544l.m18094g(replayId, "replayId");
        InterfaceC1436k interfaceC1436k = this.f47710e;
        if (interfaceC1436k == null || (c15294h = (C15294h) interfaceC1436k.invoke(replayId)) == null) {
            c15294h = new C15294h(this.f47706a, replayId);
        }
        this.f47714i = c15294h;
        InterfaceC3776x[] interfaceC3776xArr = f47705r;
        this.f47719n.setValue(this, interfaceC3776xArr[3], replayId);
        m16501m(i10);
        if (enumC15527z1 == null) {
            enumC15527z1 = this instanceof C15287r ? EnumC15527z1.SESSION : EnumC15527z1.BUFFER;
        }
        AbstractC16544l.m18094g(enumC15527z1, "<set-?>");
        this.f47721p.setValue(this, interfaceC3776xArr[5], enumC15527z1);
        m16502n(recorderConfig);
        m16503o(AbstractC8656j3.m9340h());
        AtomicLong atomicLong = this.f47717l;
        this.f47708c.getClass();
        atomicLong.set(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public final C15447t m16498j() {
        return (C15447t) this.f47719n.getValue(this, f47705r[3]);
    }

    /* JADX INFO: renamed from: k */
    public final int m16499k() {
        return ((Number) this.f47720o.getValue(this, f47705r[4])).intValue();
    }

    /* JADX INFO: renamed from: l */
    public final C15304r m16500l() {
        return (C15304r) this.f47715j.getValue(this, f47705r[0]);
    }

    /* JADX INFO: renamed from: m */
    public final void m16501m(int i10) {
        this.f47720o.setValue(this, f47705r[4], Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: n */
    public final void m16502n(C15304r c15304r) {
        AbstractC16544l.m18094g(c15304r, "<set-?>");
        this.f47715j.setValue(this, f47705r[0], c15304r);
    }

    /* JADX INFO: renamed from: o */
    public final void m16503o(Date date) {
        this.f47716k.setValue(this, f47705r[1], date);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC15284o
    public void stop() {
        C15294h c15294h = this.f47714i;
        if (c15294h != null) {
            c15294h.close();
        }
        m16501m(-1);
        this.f47717l.set(0L);
        m16503o(null);
        C15447t EMPTY_ID = C15447t.f48216Z;
        AbstractC16544l.m18093f(EMPTY_ID, "EMPTY_ID");
        this.f47719n.setValue(this, f47705r[3], EMPTY_ID);
    }
}
