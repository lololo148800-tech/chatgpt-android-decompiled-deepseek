package p073Cj;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Cj.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC1713a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4898Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BottomSheetBehavior f4899Z;

    public /* synthetic */ RunnableC1713a(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f4898Y = i10;
        this.f4899Z = bottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4898Y) {
            case 0:
                BottomSheetBehavior behavior = this.f4899Z;
                AbstractC16544l.m18094g(behavior, "$behavior");
                behavior.m13586A(3);
                break;
            case 1:
                BottomSheetBehavior behavior2 = this.f4899Z;
                AbstractC16544l.m18094g(behavior2, "$behavior");
                behavior2.m13586A(3);
                break;
            case 2:
                BottomSheetBehavior behavior3 = this.f4899Z;
                AbstractC16544l.m18094g(behavior3, "$behavior");
                behavior3.m13586A(3);
                break;
            default:
                BottomSheetBehavior behavior4 = this.f4899Z;
                AbstractC16544l.m18094g(behavior4, "$behavior");
                behavior4.m13586A(5);
                break;
        }
    }
}
