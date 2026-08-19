package p1110xk;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.ShadowedNestedScrollView;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1375d0;
import p074Ck.C1716a;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: xk.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC21290m implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67688Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f67689Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f67690o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f67691p0;

    public /* synthetic */ ViewOnLayoutChangeListenerC21290m(Object obj, Object obj2, Object obj3, int i10) {
        this.f67688Y = i10;
        this.f67689Z = obj;
        this.f67690o0 = obj2;
        this.f67691p0 = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f67688Y) {
            case 0:
                TextInputLayout this_style = (TextInputLayout) this.f67689Z;
                AbstractC16544l.m18094g(this_style, "$this_style");
                ColorStateList errorColorState = (ColorStateList) this.f67690o0;
                AbstractC16544l.m18094g(errorColorState, "$errorColorState");
                ColorStateList colorState = (ColorStateList) this.f67691p0;
                AbstractC16544l.m18094g(colorState, "$colorState");
                CharSequence error = this_style.getError();
                if (error != null && AbstractC21322p.m21716z(error)) {
                    this_style.setDefaultHintTextColor(errorColorState);
                } else {
                    this_style.setDefaultHintTextColor(colorState);
                }
                break;
            case 1:
                TextInputLayout this_style2 = (TextInputLayout) this.f67689Z;
                AbstractC16544l.m18094g(this_style2, "$this_style");
                ColorStateList errorColorState2 = (ColorStateList) this.f67690o0;
                AbstractC16544l.m18094g(errorColorState2, "$errorColorState");
                ColorStateList colorState2 = (ColorStateList) this.f67691p0;
                AbstractC16544l.m18094g(colorState2, "$colorState");
                CharSequence error2 = this_style2.getError();
                if (error2 != null && AbstractC21322p.m21716z(error2)) {
                    this_style2.setPlaceholderTextColor(errorColorState2);
                } else {
                    this_style2.setPlaceholderTextColor(colorState2);
                }
                break;
            default:
                C1375d0 this$0 = (C1375d0) this.f67689Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f67691p0;
                C1716a c1716a = this$0.f3648a;
                int bottom = c1716a.f4910e.getBottom();
                Rect rect = new Rect();
                View view2 = (View) this.f67690o0;
                view2.getDrawingRect(rect);
                c1716a.f4913h.offsetDescendantRectToMyCoords(view2, rect);
                int i18 = bottomSheetBehavior.f36448g ? -1 : bottomSheetBehavior.f36447f;
                bottomSheetBehavior.m13602z(rect.top);
                if (i18 != (bottomSheetBehavior.f36448g ? -1 : bottomSheetBehavior.f36447f)) {
                    ShadowedNestedScrollView shadowedNestedScrollView = c1716a.f4915j;
                    shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), shadowedNestedScrollView.getPaddingTop(), shadowedNestedScrollView.getPaddingRight(), bottomSheetBehavior.f36448g ? -1 : bottomSheetBehavior.f36447f);
                }
                bottomSheetBehavior.f36454m = bottom;
                break;
        }
    }
}
