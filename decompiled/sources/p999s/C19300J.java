package p999s;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.openai.chatgpt.R;
import p239Ja.C4318u;
import p976r.ViewTreeObserverOnGlobalLayoutListenerC18806d;

/* JADX INFO: renamed from: s.J */
/* JADX INFO: loaded from: classes.dex */
public final class C19300J extends C19285B0 implements InterfaceC19304L {

    /* JADX INFO: renamed from: P0 */
    public CharSequence f61145P0;

    /* JADX INFO: renamed from: Q0 */
    public C19296H f61146Q0;

    /* JADX INFO: renamed from: R0 */
    public final Rect f61147R0;

    /* JADX INFO: renamed from: S0 */
    public int f61148S0;

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ C19306M f61149T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19300J(C19306M c19306m, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f61149T0 = c19306m;
        this.f61147R0 = new Rect();
        this.f61095A0 = c19306m;
        this.f61105K0 = true;
        this.f61106L0.setFocusable(true);
        this.f61096B0 = new C4318u(this, 1);
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: d */
    public final CharSequence mo20367d() {
        return this.f61145P0;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: g */
    public final void mo20369g(CharSequence charSequence) {
        this.f61145P0 = charSequence;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: k */
    public final void mo20372k(int i10) {
        this.f61148S0 = i10;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: l */
    public final void mo20373l(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        C19386x c19386x = this.f61106L0;
        boolean zIsShowing = c19386x.isShowing();
        m20376q();
        this.f61106L0.setInputMethodMode(2);
        mo20083f();
        C19369o0 c19369o0 = this.f61109o0;
        c19369o0.setChoiceMode(1);
        c19369o0.setTextDirection(i10);
        c19369o0.setTextAlignment(i11);
        C19306M c19306m = this.f61149T0;
        int selectedItemPosition = c19306m.getSelectedItemPosition();
        C19369o0 c19369o1 = this.f61109o0;
        if (c19386x.isShowing() && c19369o1 != null) {
            c19369o1.setListSelectionHidden(false);
            c19369o1.setSelection(selectedItemPosition);
            if (c19369o1.getChoiceMode() != 0) {
                c19369o1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c19306m.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC18806d viewTreeObserverOnGlobalLayoutListenerC18806d = new ViewTreeObserverOnGlobalLayoutListenerC18806d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC18806d);
        this.f61106L0.setOnDismissListener(new C19298I(this, viewTreeObserverOnGlobalLayoutListenerC18806d));
    }

    @Override // p999s.C19285B0, p999s.InterfaceC19304L
    /* JADX INFO: renamed from: n */
    public final void mo20354n(ListAdapter listAdapter) {
        super.mo20354n(listAdapter);
        this.f61146Q0 = (C19296H) listAdapter;
    }

    /* JADX INFO: renamed from: q */
    public final void m20376q() {
        int i10;
        C19386x c19386x = this.f61106L0;
        Drawable background = c19386x.getBackground();
        C19306M c19306m = this.f61149T0;
        if (background != null) {
            background.getPadding(c19306m.f61177v0);
            boolean z6 = AbstractC19353g1.f61283a;
            int layoutDirection = c19306m.getLayoutDirection();
            Rect rect = c19306m.f61177v0;
            i10 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c19306m.f61177v0;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = c19306m.getPaddingLeft();
        int paddingRight = c19306m.getPaddingRight();
        int width = c19306m.getWidth();
        int i11 = c19306m.f61176u0;
        if (i11 == -2) {
            int iM20392a = c19306m.m20392a(this.f61146Q0, c19386x.getBackground());
            int i12 = c19306m.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c19306m.f61177v0;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (iM20392a > i13) {
                iM20392a = i13;
            }
            m20356p(Math.max(iM20392a, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            m20356p((width - paddingLeft) - paddingRight);
        } else {
            m20356p(i11);
        }
        boolean z10 = AbstractC19353g1.f61283a;
        this.f61112r0 = c19306m.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f61111q0) - this.f61148S0) + i10 : paddingLeft + this.f61148S0 + i10;
    }
}
