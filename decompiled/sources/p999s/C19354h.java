package p999s;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.openai.chatgpt.R;
import p523V9.AbstractC8194t0;
import p976r.C18804b;

/* JADX INFO: renamed from: s.h */
/* JADX INFO: loaded from: classes.dex */
public final class C19354h extends C19382v implements InterfaceC19358j {

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C19356i f61286r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19354h(C19356i c19356i, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f61286r0 = c19356i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC8194t0.m8797c(this, getContentDescription());
        setOnTouchListener(new C18804b(this, this));
    }

    @Override // p999s.InterfaceC19358j
    /* JADX INFO: renamed from: a */
    public final boolean mo11124a() {
        return false;
    }

    @Override // p999s.InterfaceC19358j
    /* JADX INFO: renamed from: b */
    public final boolean mo11125b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f61286r0.m20461l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
