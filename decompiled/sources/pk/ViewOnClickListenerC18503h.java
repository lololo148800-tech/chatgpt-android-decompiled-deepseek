package pk;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: pk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC18503h implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58965Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BottomSheetBehavior f58966Z;

    public /* synthetic */ ViewOnClickListenerC18503h(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f58965Y = i10;
        this.f58966Z = bottomSheetBehavior;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f58965Y) {
            case 0:
                this.f58966Z.m13586A(5);
                break;
            default:
                this.f58966Z.m13586A(5);
                break;
        }
    }
}
