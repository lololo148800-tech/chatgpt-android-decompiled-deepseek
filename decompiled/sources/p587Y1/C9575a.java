package p587Y1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0251g0;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Y1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9575a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28818Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DialogC9590p f28819Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9575a(DialogC9590p dialogC9590p, int i10) {
        super(1);
        this.f28818Y = i10;
        this.f28819Z = dialogC9590p;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f28818Y) {
            case 0:
                DialogC9590p dialogC9590p = this.f28819Z;
                dialogC9590p.show();
                return new C0251g0(dialogC9590p, 6);
            default:
                DialogC9590p dialogC9590p2 = this.f28819Z;
                if (dialogC9590p2.f28855q0.f28849a) {
                    dialogC9590p2.f28854p0.invoke();
                }
                return C17296C.f55119a;
        }
    }
}
