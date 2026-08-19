package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13486d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C13486d f42694Z = new C13486d(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13486d f42695o0 = new C13486d(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42696Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13486d(int i10, int i11) {
        super(i10);
        this.f42696Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42696Y) {
            case 0:
                long j10 = ((C7545j) obj).f23903a;
                long j11 = ((C7545j) obj2).f23903a;
                Object obj3 = AbstractC13795w0.f43580a;
                return AbstractC13758e.m15254s(0.0f, 400.0f, new C7545j(AbstractC9113C4.m9643a(1, 1)), 1);
            default:
                EnumC13504v enumC13504v = (EnumC13504v) obj2;
                return Boolean.valueOf(((EnumC13504v) obj) == enumC13504v && enumC13504v == EnumC13504v.f42756o0);
        }
    }
}
