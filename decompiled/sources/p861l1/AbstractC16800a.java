package p861l1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p774h1.AbstractC14348d;
import p774h1.InterfaceC14362r;

/* JADX INFO: renamed from: l1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16800a extends ViewGroup {
    /* JADX INFO: renamed from: a */
    public final void m18558a(InterfaceC14362r interfaceC14362r, View view, long j10) {
        super.drawChild(AbstractC14348d.m15725a(interfaceC14362r), view, j10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
