package p002A0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0251g0;
import p049Bm.InterfaceC1436k;
import p759g1.C13800b;

/* JADX INFO: renamed from: A0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0142s extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f591Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f592Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142s(C0120T c0120t, int i10) {
        super(1);
        this.f591Y = i10;
        this.f592Z = c0120t;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f591Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                C0120T c0120t = this.f592Z;
                EnumC0123W enumC0123WM413r = c0120t.m413r();
                EnumC0123W enumC0123W = EnumC0123W.f527Z;
                if (enumC0123WM413r == enumC0123W) {
                    enumC0123W = EnumC0123W.f526Y;
                }
                c0120t.m419x(enumC0123W);
                return C17296C.f55119a;
            default:
                return new C0251g0(this.f592Z, 14);
        }
    }
}
