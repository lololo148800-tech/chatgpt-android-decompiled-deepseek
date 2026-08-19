package p878lo;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p544W9.AbstractC8753z4;
import p635a1.InterfaceC10446d;
import p759g1.C13801c;

/* JADX INFO: renamed from: lo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C17092a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10446d f54625Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13801c f54626Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f54627o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC7546k f54628p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17092a(InterfaceC10446d interfaceC10446d, C13801c c13801c, long j10, EnumC7546k enumC7546k) {
        super(0);
        this.f54625Y = interfaceC10446d;
        this.f54626Z = c13801c;
        this.f54627o0 = j10;
        this.f54628p0 = enumC7546k;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return new C7543h(this.f54625Y.mo10925a(AbstractC8753z4.m9516d(this.f54626Z.m15319f()), AbstractC8753z4.m9516d(this.f54627o0), this.f54628p0));
    }
}
