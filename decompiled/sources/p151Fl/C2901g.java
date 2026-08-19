package p151Fl;

import p075Cl.C1718a;
import p248Jk.InterfaceC4473d;

/* JADX INFO: renamed from: Fl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2901g implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8717a;

    /* JADX INFO: renamed from: b */
    public final C2900f f8718b;

    public /* synthetic */ C2901g(C2900f c2900f, int i10) {
        this.f8717a = i10;
        this.f8718b = c2900f;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f8717a) {
            case 0:
                C1718a c1718a = this.f8718b.f8716a.f4947d;
                if (c1718a != null) {
                    return c1718a.f4929c;
                }
                return null;
            case 1:
                C1718a c1718a2 = this.f8718b.f8716a.f4947d;
                if (c1718a2 != null) {
                    return c1718a2.f4928b;
                }
                return null;
            case 2:
                C1718a c1718a3 = this.f8718b.f8716a.f4947d;
                if (c1718a3 != null) {
                    return c1718a3.f4927a;
                }
                return null;
            case 3:
                C1718a c1718a4 = this.f8718b.f8716a.f4947d;
                if (c1718a4 != null) {
                    return c1718a4.f4932f;
                }
                return null;
            case 4:
                C1718a c1718a5 = this.f8718b.f8716a.f4947d;
                return Boolean.valueOf(c1718a5 != null ? c1718a5.f4931e : false);
            case 5:
                return this.f8718b.f8716a.f4948e;
            case 6:
                return this.f8718b.f8716a.f4944a;
            case 7:
                return this.f8718b.f8716a.f4946c;
            default:
                return this.f8718b.f8716a.f4945b;
        }
    }
}
