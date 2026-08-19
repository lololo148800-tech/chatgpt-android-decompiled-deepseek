package p408Qj;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Qj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6736b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21629Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BottomSheetBehavior f21630Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6736b(BottomSheetBehavior bottomSheetBehavior, int i10) {
        super(0);
        this.f21629Y = i10;
        this.f21630Z = bottomSheetBehavior;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21629Y) {
            case 0:
                this.f21630Z.m13586A(5);
                break;
            case 1:
                this.f21630Z.m13586A(5);
                break;
            default:
                this.f21630Z.m13586A(3);
                break;
        }
        return C17296C.f55119a;
    }
}
