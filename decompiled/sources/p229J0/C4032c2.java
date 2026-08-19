package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0251g0;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: J0.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4032c2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12690Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DialogC4038d2 f12691Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4032c2(DialogC4038d2 dialogC4038d2, int i10) {
        super(1);
        this.f12690Y = i10;
        this.f12691Z = dialogC4038d2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f12690Y) {
            case 0:
                DialogC4038d2 dialogC4038d2 = this.f12691Z;
                dialogC4038d2.f12714q0.getClass();
                dialogC4038d2.f12713p0.invoke();
                return C17296C.f55119a;
            default:
                DialogC4038d2 dialogC4038d3 = this.f12691Z;
                dialogC4038d3.show();
                return new C0251g0(dialogC4038d3, 2);
        }
    }
}
