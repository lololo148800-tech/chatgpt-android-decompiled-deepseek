package p003A1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.AbstractC16544l;
import p843k1.C16322p;

/* JADX INFO: renamed from: A1.E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0164E1 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f646a;

    public /* synthetic */ C0164E1(int i10) {
        this.f646a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f646a) {
            case 0:
                AbstractC16544l.m18092e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline outlineM820b = ((C0170G1) view).f662s0.m820b();
                AbstractC16544l.m18091d(outlineM820b);
                outline.set(outlineM820b);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                if ((view instanceof C16322p) && (outline2 = ((C16322p) view).f50630s0) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
        }
    }
}
