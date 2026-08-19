package p994rk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import p103Dn.C2153Q0;
import p1121y5.InterfaceC21389b;
import uk.C20383m;

/* JADX INFO: renamed from: rk.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C19065A implements InterfaceC21389b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20383m f60738Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20383m f60739Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ESignatureComponent f60740o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20383m f60741p0;

    public C19065A(C20383m c20383m, C20383m c20383m2, ESignatureComponent eSignatureComponent, C20383m c20383m3) {
        this.f60738Y = c20383m;
        this.f60739Z = c20383m2;
        this.f60740o0 = eSignatureComponent;
        this.f60741p0 = c20383m3;
    }

    @Override // p1121y5.InterfaceC21389b
    /* JADX INFO: renamed from: k */
    public final void mo10667k(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        ((C2153Q0) this.f60740o0.bitmapController.f62320Y).setValue(bitmap);
        C20383m c20383m = this.f60741p0;
        c20383m.f64468g.setVisibility(0);
        c20383m.f64464c.setVisibility(0);
    }

    @Override // p1121y5.InterfaceC21389b
    /* JADX INFO: renamed from: l */
    public final void mo10668l(Drawable drawable) {
        this.f60739Z.f64463b.setVisibility(0);
    }

    @Override // p1121y5.InterfaceC21389b
    /* JADX INFO: renamed from: n */
    public final void mo10669n(Drawable drawable) {
        C20383m c20383m = this.f60738Y;
        c20383m.f64463b.setVisibility(8);
        c20383m.f64464c.setVisibility(8);
        c20383m.f64468g.setVisibility(8);
    }
}
