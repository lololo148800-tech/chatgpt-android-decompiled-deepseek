package p247Jj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import mm.C17296C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p320Mj.C5461n;
import p342Nj.InterfaceC5816j;
import p603Yj.C10069b;
import p729ej.InterfaceC13427r;
import p814ik.C15033e;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Jj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4430g implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f14402b;

    /* JADX INFO: renamed from: c */
    public final String f14403c;

    /* JADX INFO: renamed from: d */
    public final EnumC4392K0 f14404d;

    /* JADX INFO: renamed from: e */
    public final C17062e f14405e;

    /* JADX INFO: renamed from: f */
    public final Context f14406f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5816j f14407g;

    /* JADX INFO: renamed from: h */
    public final C15033e f14408h;

    /* JADX INFO: renamed from: i */
    public final C10069b f14409i;

    /* JADX INFO: renamed from: j */
    public final C5461n f14410j;

    public C4430g(String str, String str2, EnumC4392K0 pollingMode, C17062e inquirySessionConfig, Context applicationContext, InterfaceC5816j service, C15033e deviceIdProvider, C10069b sandboxFlags, C5461n fallbackModeManager) {
        AbstractC16544l.m18094g(pollingMode, "pollingMode");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(deviceIdProvider, "deviceIdProvider");
        AbstractC16544l.m18094g(sandboxFlags, "sandboxFlags");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        this.f14402b = str;
        this.f14403c = str2;
        this.f14404d = pollingMode;
        this.f14405e = inquirySessionConfig;
        this.f14406f = applicationContext;
        this.f14407g = service;
        this.f14408h = deviceIdProvider;
        this.f14409i = sandboxFlags;
        this.f14410j = fallbackModeManager;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m5199b(C4430g c4430g, InterfaceC2186j interfaceC2186j, AbstractC4433h0 abstractC4433h0, C4428f c4428f) {
        Object objMo395a;
        c4430g.getClass();
        boolean z6 = abstractC4433h0 instanceof C4412V;
        C17296C c17296c = C17296C.f55119a;
        if (z6) {
            objMo395a = interfaceC2186j.mo395a(new C4418a((C4412V) abstractC4433h0), c4428f);
            if (objMo395a != EnumC19250a.f61036Y) {
                return c17296c;
            }
        } else {
            objMo395a = interfaceC2186j.mo395a(new C4422c(abstractC4433h0), c4428f);
            if (objMo395a != EnumC19250a.f61036Y) {
                return c17296c;
            }
        }
        return objMo395a;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C4430g) {
            C4430g c4430g = (C4430g) otherWorker;
            if (AbstractC16544l.m18089b(this.f14402b, c4430g.f14402b) && AbstractC16544l.m18089b(this.f14403c, c4430g.f14403c) && this.f14404d == c4430g.f14404d) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C4428f(this, null));
    }
}
