package p124Ei;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16552t;
import p273Kl.C4727J0;
import p273Kl.C4805w0;
import p344Nl.AbstractC5821C;
import p344Nl.C5842n;
import p349O0.InterfaceC5982V0;
import p387Pl.C6487g;

/* JADX INFO: renamed from: Ei.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2502d1 extends AbstractC16552t {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7793Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2502d1(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f7793Y = i11;
    }

    @Override // p225Im.InterfaceC3771s
    public final Object get() {
        switch (this.f7793Y) {
            case 0:
                return ((C5842n) this.receiver).m6220d();
            case 1:
                return this.receiver.getClass().getSimpleName();
            case 2:
                return ((InterfaceC5982V0) this.receiver).getValue();
            case 3:
                return ((InterfaceC5982V0) this.receiver).getValue();
            case 4:
                return ((C4727J0) this.receiver).m5409d();
            case 5:
                C4727J0 c4727j0 = (C4727J0) this.receiver;
                c4727j0.getClass();
                C4805w0 c4805w0 = (C4805w0) c4727j0.f15391p.m8943c(C4727J0.f15367I[0]);
                String str = c4805w0 != null ? c4805w0.f15669a : null;
                if (str != null) {
                    return new C4805w0(str);
                }
                return null;
            case 6:
                C6487g c6487g = (C6487g) this.receiver;
                c6487g.getClass();
                return (Set) c6487g.f21051n.m8945c(C6487g.f21046o[0]);
            case 7:
                return ((AbstractC5821C) this.receiver).m6220d();
            case 8:
                return ((AbstractC5821C) this.receiver).m6220d();
            case 9:
                return ((InterfaceC5982V0) this.receiver).getValue();
            case 10:
                return ((InterfaceC5982V0) this.receiver).getValue();
            default:
                return ((InterfaceC5982V0) this.receiver).getValue();
        }
    }
}
