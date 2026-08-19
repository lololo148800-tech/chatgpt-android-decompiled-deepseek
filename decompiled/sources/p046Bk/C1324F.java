package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import p100Dk.InterfaceC2094u;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;
import p814ik.C15033e;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Bk.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1324F implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2094u f3490b;

    /* JADX INFO: renamed from: c */
    public final AbstractC16283c f3491c;

    /* JADX INFO: renamed from: d */
    public final String f3492d;

    /* JADX INFO: renamed from: e */
    public final String f3493e;

    /* JADX INFO: renamed from: f */
    public final String f3494f;

    /* JADX INFO: renamed from: g */
    public final String f3495g;

    public C1324F(InterfaceC2094u uiService, C15033e deviceIdProvider, String sessionToken, String inquiryId, String str, String componentName, AbstractC16283c customTabsLauncher) {
        AbstractC16544l.m18094g(uiService, "uiService");
        AbstractC16544l.m18094g(deviceIdProvider, "deviceIdProvider");
        AbstractC16544l.m18094g(customTabsLauncher, "customTabsLauncher");
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(componentName, "componentName");
        this.f3490b = uiService;
        this.f3491c = customTabsLauncher;
        this.f3492d = sessionToken;
        this.f3493e = inquiryId;
        this.f3494f = str;
        this.f3495g = componentName;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r interfaceC13427r) {
        return AbstractC8191s5.m8780h(this, interfaceC13427r);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C1322E(this, null));
    }
}
