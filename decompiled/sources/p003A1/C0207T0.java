package p003A1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p774h1.AbstractC14348d;
import p774h1.InterfaceC14362r;

/* JADX INFO: renamed from: A1.T0 */
/* JADX INFO: loaded from: classes.dex */
public class C0207T0 extends ViewGroup {

    /* JADX INFO: renamed from: o0 */
    public boolean f794o0;

    public C0207T0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m652a(InterfaceC14362r interfaceC14362r, C0170G1 c0170g1, long j10) {
        super.drawChild(AbstractC14348d.m15725a(interfaceC14362r), c0170g1, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC16544l.m18092e(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((C0170G1) childAt).f665v0) {
                this.f794o0 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f794o0 = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f794o0) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
