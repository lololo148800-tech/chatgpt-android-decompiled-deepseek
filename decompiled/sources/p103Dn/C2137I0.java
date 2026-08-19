package p103Dn;

import p094De.C2025h;

/* JADX INFO: renamed from: Dn.I0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2137I0 implements InterfaceC2135H0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6546a;

    @Override // p103Dn.InterfaceC2135H0
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3248a(InterfaceC2149O0 interfaceC2149O0) {
        switch (this.f6546a) {
            case 0:
                return new C2025h(EnumC2131F0.f6526Y, 3);
            default:
                return new C2219z0(new C2141K0(interfaceC2149O0, null));
        }
    }

    public final String toString() {
        switch (this.f6546a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
