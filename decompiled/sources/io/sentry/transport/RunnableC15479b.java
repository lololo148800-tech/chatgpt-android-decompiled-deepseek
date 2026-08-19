package io.sentry.transport;

import io.sentry.C15175X0;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.cache.InterfaceC15330d;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.hints.AbstractC15364c;
import io.sentry.hints.InterfaceC15368g;
import io.sentry.hints.InterfaceC15371j;
import java.io.IOException;
import p544W9.AbstractC8447A3;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8477F3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.transport.b */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15479b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C11241l f48354Y;

    /* JADX INFO: renamed from: Z */
    public final C15516w f48355Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC15330d f48356o0;

    /* JADX INFO: renamed from: p0 */
    public final C15491n f48357p0 = new C15491n(-1);

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15480c f48358q0;

    public RunnableC15479b(C15480c c15480c, C11241l c11241l, C15516w c15516w, InterfaceC15330d interfaceC15330d) {
        this.f48358q0 = c15480c;
        AbstractC8483G3.m9133c(c11241l, "Envelope is required.");
        this.f48354Y = c11241l;
        this.f48355Z = c15516w;
        AbstractC8483G3.m9133c(interfaceC15330d, "EnvelopeCache is required.");
        this.f48356o0 = interfaceC15330d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16669a(RunnableC15479b runnableC15479b, AbstractC8447A3 abstractC8447A3, InterfaceC15371j interfaceC15371j) {
        runnableC15479b.f48358q0.f48361o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC8447A3.mo9055d()));
        interfaceC15371j.mo16389b(abstractC8447A3.mo9055d());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC8447A3 m16670b() {
        C11241l c11241l = this.f48354Y;
        ((C15175X0) c11241l.f34016Y).f47242p0 = null;
        InterfaceC15330d interfaceC15330d = this.f48356o0;
        C15516w c15516w = this.f48355Z;
        interfaceC15330d.mo16422o(c11241l, c15516w);
        Object objM9088b = AbstractC8465D3.m9088b(c15516w);
        boolean zIsInstance = AbstractC15364c.class.isInstance(AbstractC8465D3.m9088b(c15516w));
        C15480c c15480c = this.f48358q0;
        if (zIsInstance && objM9088b != null) {
            AbstractC15364c abstractC15364c = (AbstractC15364c) objM9088b;
            if (abstractC15364c.mo16357f(((C15175X0) c11241l.f34016Y).f47239Y)) {
                abstractC15364c.f47949Y.countDown();
                c15480c.f48361o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                c15480c.f48361o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        boolean zMo16374a = c15480c.f48363q0.mo16374a();
        C15524y1 c15524y1 = c15480c.f48361o0;
        if (!zMo16374a) {
            Object objM9088b2 = AbstractC8465D3.m9088b(c15516w);
            if (!InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b2 == null) {
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b2, c15524y1.getLogger());
                c15524y1.getClientReportRecorder().mo7940G(EnumC15337e.NETWORK_ERROR, c11241l);
            } else {
                ((InterfaceC15368g) objM9088b2).mo16390c(true);
            }
            return this.f48357p0;
        }
        C11241l c11241lMo7943p = c15524y1.getClientReportRecorder().mo7943p(c11241l);
        try {
            ((C15175X0) c11241lMo7943p.f34016Y).f47242p0 = AbstractC8656j3.m9341i(Double.valueOf(c15524y1.getDateProvider().mo16338a().mo16356d() / 1000000.0d).longValue());
            AbstractC8447A3 abstractC8447A3M16679d = c15480c.f48364r0.m16679d(c11241lMo7943p);
            if (abstractC8447A3M16679d.mo9055d()) {
                interfaceC15330d.mo16542n(c11241l);
                return abstractC8447A3M16679d;
            }
            String str = "The transport failed to send the envelope with response code " + abstractC8447A3M16679d.mo9054a();
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, str, new Object[0]);
            if (abstractC8447A3M16679d.mo9054a() >= 400 && abstractC8447A3M16679d.mo9054a() != 429) {
                Object objM9088b3 = AbstractC8465D3.m9088b(c15516w);
                if (!InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b3 == null) {
                    c15524y1.getClientReportRecorder().mo7940G(EnumC15337e.NETWORK_ERROR, c11241lMo7943p);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e10) {
            Object objM9088b4 = AbstractC8465D3.m9088b(c15516w);
            if (!InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b4 == null) {
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b4, c15524y1.getLogger());
                c15524y1.getClientReportRecorder().mo7940G(EnumC15337e.NETWORK_ERROR, c11241lMo7943p);
            } else {
                ((InterfaceC15368g) objM9088b4).mo16390c(true);
            }
            throw new IllegalStateException("Sending the event failed.", e10);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48358q0.f48365s0 = this;
        AbstractC8447A3 abstractC8447A3M16670b = this.f48357p0;
        try {
            abstractC8447A3M16670b = m16670b();
            this.f48358q0.f48361o0.getLogger().mo16298o(EnumC15375i1.DEBUG, "Envelope flushed", new Object[0]);
            C15516w c15516w = this.f48355Z;
            Object objM9088b = AbstractC8465D3.m9088b(c15516w);
            if (InterfaceC15371j.class.isInstance(AbstractC8465D3.m9088b(c15516w)) && objM9088b != null) {
                m16669a(this, abstractC8447A3M16670b, (InterfaceC15371j) objM9088b);
            }
            this.f48358q0.f48365s0 = null;
        } catch (Throwable th2) {
            try {
                this.f48358q0.f48361o0.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Envelope submission failed", new Object[0]);
                throw th2;
            } catch (Throwable th3) {
                C15516w c15516w2 = this.f48355Z;
                Object objM9088b2 = AbstractC8465D3.m9088b(c15516w2);
                if (InterfaceC15371j.class.isInstance(AbstractC8465D3.m9088b(c15516w2)) && objM9088b2 != null) {
                    m16669a(this, abstractC8447A3M16670b, (InterfaceC15371j) objM9088b2);
                }
                this.f48358q0.f48365s0 = null;
                throw th3;
            }
        }
    }
}
