package p858ko;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.C6002f0;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8753z4;
import p594Y9.AbstractC9930m3;
import p758g0.C13770k;

/* JADX INFO: renamed from: ko.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C16516s extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16499b f51222Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16499b f51223Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16498a f51224o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16501d f51225p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16498a f51226q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16484C f51227r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f51228s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16516s(C16499b c16499b, C16499b c16499b2, C16498a c16498a, C16501d c16501d, C16498a c16498a2, C16484C c16484c, long j10) {
        super(1);
        this.f51222Y = c16499b;
        this.f51223Z = c16499b2;
        this.f51224o0 = c16498a;
        this.f51225p0 = c16501d;
        this.f51226q0 = c16498a2;
        this.f51227r0 = c16484c;
        this.f51228s0 = j10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13770k animateTo = (C13770k) obj;
        AbstractC16544l.m18094g(animateTo, "$this$animateTo");
        C16499b c16499b = this.f51222Y;
        C16499b c16499b2 = this.f51223Z;
        C6002f0 c6002f0 = animateTo.f43484e;
        final C16499b c16499b3 = new C16499b(AbstractC9930m3.m10589c(c16499b.f51182b, c16499b2.f51182b, ((Number) c6002f0.getValue()).floatValue()), c16499b.f51181a);
        final C16501d c16501d = this.f51225p0;
        final C16498a c16498a = new C16498a(this.f51224o0.f51179a, AbstractC8753z4.m9513a(AbstractC8088f6.m8540f(((Number) c6002f0.getValue()).floatValue(), AbstractC8753z4.m9517e(c16501d.f51184a ^ (-9223372034707292160L), c16499b.m18063a()), AbstractC8753z4.m9517e(this.f51226q0.f51180b ^ (-9223372034707292160L), c16499b2.m18063a())) ^ (-9223372034707292160L), c16499b3.m18063a()));
        final long j10 = this.f51228s0;
        this.f51227r0.f51144k.setValue(new InterfaceC16502e(c16501d, c16498a, c16499b3, j10) { // from class: ko.r

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C16498a f51219a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C16499b f51220b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f51221c;

            {
                this.f51219a = c16498a;
                this.f51220b = c16499b3;
                this.f51221c = j10;
            }

            @Override // p858ko.InterfaceC16502e
            /* JADX INFO: renamed from: a */
            public final C16501d mo18064a(C16503f c16503f) {
                C16498a c16498a2 = this.f51219a;
                C16499b c16499b4 = this.f51220b;
                return new C16501d(c16499b4.f51182b, c16498a2.f51180b, this.f51221c);
            }
        });
        return C17296C.f55119a;
    }
}
