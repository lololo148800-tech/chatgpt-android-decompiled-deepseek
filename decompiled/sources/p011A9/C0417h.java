package p011A9;

import java.util.Arrays;
import p1009s9.C19501d;
import p1022t9.AbstractC19821f;
import p1022t9.InterfaceC19825j;
import p1060v9.AbstractC20502t;
import p1147z9.C21815a;
import p166Ga.C3029c;
import p167Gb.C3032c;
import p377P9.AbstractC6376b;
import p523V9.AbstractC7854B5;
import p658b5.C11232c;
import p746fa.C13606o;
import p885m4.C17155e;

/* JADX INFO: renamed from: A9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0417h extends AbstractC19821f {

    /* JADX INFO: renamed from: k */
    public static final C11232c f1374k = new C11232c("ModuleInstall.API", new C0415f(0), new C17155e());

    /* JADX INFO: renamed from: c */
    public final C13606o m1029c(InterfaceC19825j... interfaceC19825jArr) {
        AbstractC20502t.m21150a("Please provide at least one OptionalModuleApi.", interfaceC19825jArr.length > 0);
        for (InterfaceC19825j interfaceC19825j : interfaceC19825jArr) {
            AbstractC20502t.m21158i(interfaceC19825j, "Requested API must not be null.");
        }
        C0410a c0410aM1022b = C0410a.m1022b(Arrays.asList(interfaceC19825jArr), false);
        if (c0410aM1022b.f1366Y.isEmpty()) {
            return AbstractC7854B5.m8117e(new C21815a(true, 0));
        }
        C3029c c3029cM3900d = C3029c.m3900d();
        c3029cM3900d.f9120e = new C19501d[]{AbstractC6376b.f20771c};
        c3029cM3900d.f9117b = 27301;
        c3029cM3900d.f9118c = false;
        c3029cM3900d.f9119d = new C3032c(this, c0410aM1022b, 2);
        return m20770b(0, c3029cM3900d.m3904c());
    }
}
