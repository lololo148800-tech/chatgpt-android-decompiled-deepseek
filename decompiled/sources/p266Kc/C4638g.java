package p266Kc;

import io.sentry.AbstractC15152P0;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0593T;
import p201Hn.C3516e;
import p317Mg.C5350a;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Kc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4638g implements InterfaceC19018a {

    /* JADX INFO: renamed from: Y */
    public final C5350a f15096Y;

    static {
        int i10 = C5350a.f17574h;
    }

    public C4638g(C5350a developerSettingsStore) {
        AbstractC16544l.m18094g(developerSettingsStore, "developerSettingsStore");
        this.f15096Y = developerSettingsStore;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        AbstractC15152P0.m16336j("buildType", "release");
        AbstractC15152P0.m16336j("flavor", "googlePlay");
        AbstractC15152P0.m16336j("debug", "false");
        AbstractC15152P0.m16336j("isInternal", "false");
        Object objMo3141d = this.f15096Y.f64176f.mo3141d(C4637f.f15095Y, interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        return AbstractC0593T.f1824a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final Object mo4160c(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }
}
