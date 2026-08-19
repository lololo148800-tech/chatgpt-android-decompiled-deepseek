package p563X1;

import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p183H4.InterfaceC3232g;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: X1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9033m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C9033m f27574Z = new C9033m(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9033m f27575o0 = new C9033m(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C9033m f27576p0 = new C9033m(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C9033m f27577q0 = new C9033m(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C9033m f27578r0 = new C9033m(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C9033m f27579s0 = new C9033m(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C9033m f27580t0 = new C9033m(2, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27581Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9033m(int i10, int i11) {
        super(i10);
        this.f27581Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        switch (this.f27581Y) {
            case 0:
                AbstractC10869a.m11357c((C21658D) obj).setUpdateBlock((InterfaceC1436k) obj2);
                return C17296C.f55119a;
            case 1:
                AbstractC10869a.m11357c((C21658D) obj).setReleaseBlock((InterfaceC1436k) obj2);
                return C17296C.f55119a;
            case 2:
                AbstractC10869a.m11357c((C21658D) obj).setModifier((InterfaceC10459q) obj2);
                return C17296C.f55119a;
            case 3:
                AbstractC10869a.m11357c((C21658D) obj).setDensity((InterfaceC7537b) obj2);
                return C17296C.f55119a;
            case 4:
                AbstractC10869a.m11357c((C21658D) obj).setLifecycleOwner((InterfaceC11112u) obj2);
                return C17296C.f55119a;
            case 5:
                AbstractC10869a.m11357c((C21658D) obj).setSavedStateRegistryOwner((InterfaceC3232g) obj2);
                return C17296C.f55119a;
            default:
                C9037q c9037qM11357c = AbstractC10869a.m11357c((C21658D) obj);
                int iOrdinal = ((EnumC7546k) obj2).ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        throw new C0644w();
                    }
                } else {
                    i10 = 0;
                }
                c9037qM11357c.setLayoutDirection(i10);
                return C17296C.f55119a;
        }
    }
}
