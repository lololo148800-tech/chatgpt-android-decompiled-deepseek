package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import p100Dk.InterfaceC2094u;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;
import p814ik.C15033e;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Bk.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1376d1 implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final AbstractC16283c f3658b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2094u f3659c;

    /* JADX INFO: renamed from: d */
    public final String f3660d;

    /* JADX INFO: renamed from: e */
    public final String f3661e;

    /* JADX INFO: renamed from: f */
    public final String f3662f;

    /* JADX INFO: renamed from: g */
    public final String f3663g;

    public C1376d1(InterfaceC2094u uiService, C15033e deviceIdProvider, String sessionToken, String inquiryId, String str, String componentName, AbstractC16283c customTabsLauncher) {
        AbstractC16544l.m18094g(customTabsLauncher, "customTabsLauncher");
        AbstractC16544l.m18094g(uiService, "uiService");
        AbstractC16544l.m18094g(deviceIdProvider, "deviceIdProvider");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(componentName, "componentName");
        this.f3658b = customTabsLauncher;
        this.f3659c = uiService;
        this.f3660d = sessionToken;
        this.f3661e = inquiryId;
        this.f3662f = str;
        this.f3663g = componentName;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return AbstractC8191s5.m8780h(this, otherWorker) && AbstractC16544l.m18089b(((C1376d1) otherWorker).f3662f, this.f3662f);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C1373c1(this, null));
    }
}
