package p197Hj;

import android.graphics.Path;
import android.view.View;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8488H2;

/* JADX INFO: renamed from: Hj.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC3456b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10509Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ View f10510Z;

    public /* synthetic */ ViewOnLayoutChangeListenerC3456b(View view, int i10) {
        this.f10509Y = i10;
        this.f10510Z = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f10510Z;
        switch (this.f10509Y) {
            case 0:
                SpotlightView this$0 = (SpotlightView) view2;
                AbstractC16544l.m18094g(this$0, "this$0");
                int i18 = SpotlightView.f40653r0;
                Path path = new Path();
                float f10 = this$0.radius;
                path.addRoundRect(i10, i11, i12, i13, f10, f10, Path.Direction.CW);
                this$0.f40656q0 = path;
                this$0.invalidate();
                break;
            default:
                int i19 = PreviewView.f32346A0;
                PreviewView previewView = (PreviewView) view2;
                previewView.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    previewView.m11194a();
                    AbstractC8488H2.m9140a();
                    previewView.getViewPort();
                }
                break;
        }
    }
}
