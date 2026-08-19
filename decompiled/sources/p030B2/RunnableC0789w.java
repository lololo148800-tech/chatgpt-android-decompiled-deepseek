package p030B2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: B2.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0789w implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2203Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ View f2204Z;

    public /* synthetic */ RunnableC0789w(View view, int i10) {
        this.f2203Y = i10;
        this.f2204Z = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View this_animateHide = this.f2204Z;
        switch (this.f2203Y) {
            case 0:
                ((InputMethodManager) this_animateHide.getContext().getSystemService("input_method")).showSoftInput(this_animateHide, 0);
                break;
            case 1:
                int i10 = SelfieOverlayView.f40876S0;
                AbstractC16544l.m18094g(this_animateHide, "$this_animateHide");
                this_animateHide.setVisibility(4);
                break;
            default:
                AbstractC16544l.m18094g(this_animateHide, "$it");
                InputMethodManager inputMethodManager = (InputMethodManager) this_animateHide.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this_animateHide, 1);
                }
                break;
        }
    }
}
