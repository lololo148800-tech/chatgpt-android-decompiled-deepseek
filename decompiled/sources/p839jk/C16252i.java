package p839jk;

import io.sentry.clientreport.C15333a;
import mk.C17282c;
import p092Dc.C1992i;
import p110E4.C2307e;
import p248Jk.InterfaceC4473d;

/* JADX INFO: renamed from: jk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C16252i implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50379a;

    /* JADX INFO: renamed from: b */
    public final C1992i f50380b;

    public /* synthetic */ C16252i(C1992i c1992i, int i10) {
        this.f50379a = i10;
        this.f50380b = c1992i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f50379a) {
            case 0:
                return new C16251h((C2307e) ((C15333a) this.f50380b.f5891b).f47885Y);
            default:
                return new C17282c((C2307e) ((C15333a) this.f50380b.f5891b).f47885Y);
        }
    }
}
