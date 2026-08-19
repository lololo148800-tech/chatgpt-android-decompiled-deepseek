package p046Bk;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.ShadowedNestedScrollView;
import kotlin.jvm.internal.AbstractC16546n;
import ma.AbstractC17201a;
import p049Bm.InterfaceC1426a;
import p074Ck.C1716a;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: Bk.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1366a0 extends AbstractC17201a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3625a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3626b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3627c;

    public C1366a0(C1375d0 c1375d0, BottomSheetBehavior bottomSheetBehavior) {
        this.f3626b = c1375d0;
        this.f3627c = bottomSheetBehavior;
    }

    @Override // ma.AbstractC17201a
    /* JADX INFO: renamed from: a */
    public final void mo2027a(View view, float f10) {
        switch (this.f3625a) {
            case 0:
                C1375d0 c1375d0 = (C1375d0) this.f3626b;
                int height = c1375d0.f3648a.f4913h.getHeight();
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3627c;
                float f11 = f10 * (height - (bottomSheetBehavior.f36448g ? -1 : bottomSheetBehavior.f36447f));
                C1716a c1716a = c1375d0.f3648a;
                ShadowedNestedScrollView shadowedNestedScrollView = c1716a.f4915j;
                shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), c1716a.f4915j.getPaddingTop(), c1716a.f4915j.getPaddingRight(), (bottomSheetBehavior.f36448g ? -1 : bottomSheetBehavior.f36447f) + ((int) f11));
                break;
            default:
                View view2 = (View) this.f3627c;
                if (f10 > 0.0f && view2 != null) {
                    view2.setVisibility(0);
                }
                if (view2 != null) {
                    view2.setAlpha(AbstractC8301I.m8915f(f10, 0.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // ma.AbstractC17201a
    /* JADX INFO: renamed from: b */
    public final void mo2028b(View view, int i10) {
        switch (this.f3625a) {
            case 0:
                break;
            default:
                if (i10 == 4 || i10 == 5) {
                    ((AbstractC16546n) this.f3626b).invoke();
                    View view2 = (View) this.f3627c;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1366a0(InterfaceC1426a interfaceC1426a, View view) {
        this.f3626b = (AbstractC16546n) interfaceC1426a;
        this.f3627c = view;
    }

    /* JADX INFO: renamed from: c */
    private final void m2036c(View view, int i10) {
    }
}
