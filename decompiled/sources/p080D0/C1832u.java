package p080D0;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1007s7.C19467f;
import p1020t7.C19807e;
import p1139z0.C21640s0;
import p225Im.InterfaceC3759g;
import p254K0.C4518o;
import p613Z4.AbstractC10159f;
import p721e7.C13289a;
import p964qe.C18690c;

/* JADX INFO: renamed from: D0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1832u extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5291Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f5292Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f5293o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1832u(int i10, Object obj, int i11) {
        super(0);
        this.f5291Y = i11;
        this.f5292Z = i10;
        this.f5293o0 = obj;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int i10 = this.f5292Z;
        Object obj = this.f5293o0;
        switch (this.f5291Y) {
            case 0:
                return Integer.valueOf(((C1820o) obj).f5240f.m4257g(i10));
            case 1:
                return new C4518o(i10, 0.0f, (InterfaceC1426a) obj);
            case 2:
                return "Unexpected status code " + i10 + " on upload request: " + ((C13289a) obj).f42003b;
            case 3:
                ((InterfaceC1436k) ((InterfaceC3759g) obj)).invoke(new C18690c(Integer.valueOf(i10)));
                return C17296C.f55119a;
            case 4:
                return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Long.valueOf(((C19467f) obj).f61781c.f62839c)}, 2));
            case 5:
                return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Long.valueOf(((C19807e) ((AbstractC10159f) obj).f30093e).f62839c)}, 2));
            default:
                C21640s0.m21986O0((C21640s0) obj, i10);
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1832u(Object obj, int i10, int i11) {
        super(0);
        this.f5291Y = i11;
        this.f5293o0 = obj;
        this.f5292Z = i10;
    }
}
