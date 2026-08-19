package p822j2;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p760g2.C13810g;

/* JADX INFO: renamed from: j2.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16061r extends AbstractC16045b {

    /* JADX INFO: renamed from: v0 */
    public boolean f49714v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f49715w0;

    @Override // p822j2.AbstractC16045b
    /* JADX INFO: renamed from: e */
    public final void mo17614e(ConstraintLayout constraintLayout) {
        m17613d(constraintLayout);
    }

    @Override // p822j2.AbstractC16045b
    /* JADX INFO: renamed from: g */
    public void mo11358g(AttributeSet attributeSet) {
        super.mo11358g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC16059p.f49705b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f49714v0 = true;
                } else if (index == 22) {
                    this.f49715w0 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo11360j(C13810g c13810g, int i10, int i11);

    @Override // p822j2.AbstractC16045b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49714v0 || this.f49715w0) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f49496p0; i10++) {
                    View view = (View) constraintLayout.f32846o0.get(this.f49495o0[i10]);
                    if (view != null) {
                        if (this.f49714v0) {
                            view.setVisibility(visibility);
                        }
                        if (this.f49715w0 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m17613d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m17613d((ConstraintLayout) parent);
    }
}
