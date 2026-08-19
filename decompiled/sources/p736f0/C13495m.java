package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p758g0.C13771k0;

/* JADX INFO: renamed from: f0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C13495m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42718Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13771k0 f42719Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13495m(C13771k0 c13771k0, int i10) {
        super(0);
        this.f42718Y = i10;
        this.f42719Z = c13771k0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f42718Y) {
            case 0:
                C13771k0 c13771k0 = this.f42719Z;
                Object objM15272c = c13771k0.m15272c();
                EnumC13504v enumC13504v = EnumC13504v.f42756o0;
                return Boolean.valueOf(objM15272c == enumC13504v && c13771k0.f43492d.getValue() == enumC13504v);
            default:
                return Long.valueOf(this.f42719Z.m15271b());
        }
    }
}
