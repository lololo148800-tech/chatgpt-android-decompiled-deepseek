package p059C5;

import coil3.compose.AsyncImagePainter;
import kotlin.jvm.internal.C16533a;
import kotlin.jvm.internal.InterfaceC16538f;
import mm.C17296C;
import mm.InterfaceC17302e;
import p103Dn.InterfaceC2186j;
import p882m1.AbstractC17140a;
import p886m5.AbstractC17167b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: C5.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1591i implements InterfaceC2186j, InterfaceC16538f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4461Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC17140a f4462Z;

    public /* synthetic */ C1591i(AbstractC17140a abstractC17140a, int i10) {
        this.f4461Y = i10;
        this.f4462Z = abstractC17140a;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C17296C c17296c = C17296C.f55119a;
        AbstractC17140a abstractC17140a = this.f4462Z;
        switch (this.f4461Y) {
            case 0:
                AsyncImagePainter.m13135k((AsyncImagePainter) abstractC17140a, (InterfaceC1589g) obj);
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                break;
            default:
                ((coil.compose.AsyncImagePainter) abstractC17140a).m13131k((AbstractC17167b) obj);
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                break;
        }
        return c17296c;
    }

    @Override // kotlin.jvm.internal.InterfaceC16538f
    /* JADX INFO: renamed from: b */
    public final InterfaceC17302e mo2443b() {
        switch (this.f4461Y) {
            case 0:
                return new C16533a(2, 4, AsyncImagePainter.class, (AsyncImagePainter) this.f4462Z, "updateState", "updateState(Lcoil3/compose/AsyncImagePainter$State;)V");
            default:
                return new C16533a(2, 4, coil.compose.AsyncImagePainter.class, (coil.compose.AsyncImagePainter) this.f4462Z, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f4461Y) {
            case 0:
                if ((obj instanceof InterfaceC2186j) && (obj instanceof InterfaceC16538f)) {
                    return mo2443b().equals(((InterfaceC16538f) obj).mo2443b());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC2186j) && (obj instanceof InterfaceC16538f)) {
                    return mo2443b().equals(((InterfaceC16538f) obj).mo2443b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f4461Y) {
            case 0:
                break;
        }
        return mo2443b().hashCode();
    }
}
