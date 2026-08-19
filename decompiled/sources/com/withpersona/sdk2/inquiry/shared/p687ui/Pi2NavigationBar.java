package com.withpersona.sdk2.inquiry.shared.p687ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import fk.AbstractC13685f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p271Kj.C4706a;
import p571X9.AbstractC9123E2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "controlsColor", "Lmm/C;", "setControlsColor", "(I)V", "Landroid/view/View;", "getBackButton", "()Landroid/view/View;", "backButton", "shared_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Pi2NavigationBar extends ConstraintLayout {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ int f40892H0 = 0;

    /* JADX INFO: renamed from: G0 */
    public final C4706a f40893G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC16544l.m18094g(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.pi2_navigation_bar, this);
        int i10 = R.id.nav_bar_back_button;
        ImageView imageView = (ImageView) AbstractC9123E2.m9654b(this, R.id.nav_bar_back_button);
        if (imageView != null) {
            i10 = R.id.nav_bar_cancel_button;
            ImageView imageView2 = (ImageView) AbstractC9123E2.m9654b(this, R.id.nav_bar_cancel_button);
            if (imageView2 != null) {
                this.f40893G0 = new C4706a(this, imageView, imageView2, 1);
                if (attributeSet != null) {
                    TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC13685f.f43181a, 0, 0);
                    AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i11 = 0; i11 < indexCount; i11++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i11);
                        C4706a c4706a = this.f40893G0;
                        if (index == 0) {
                            ((ImageView) c4706a.f15301c).setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, R.drawable.pi2_shared_arrow_back_16));
                        } else if (index == 1) {
                            ((ImageView) c4706a.f15302d).setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, R.drawable.pi2_shared_close_icon));
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }

    public final View getBackButton() {
        ImageView navBarBackButton = (ImageView) this.f40893G0.f15301c;
        AbstractC16544l.m18093f(navBarBackButton, "navBarBackButton");
        return navBarBackButton;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.pi2_navigation_bar_padding);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final void setControlsColor(int controlsColor) {
        C4706a c4706a = this.f40893G0;
        ((ImageView) c4706a.f15301c).setColorFilter(controlsColor);
        ((ImageView) c4706a.f15302d).setColorFilter(controlsColor);
    }
}
