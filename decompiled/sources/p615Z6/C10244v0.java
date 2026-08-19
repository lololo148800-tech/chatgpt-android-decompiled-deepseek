package p615Z6;

import android.graphics.Canvas;
import p938p2.AbstractC18290d;

/* JADX INFO: renamed from: Z6.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C10244v0 extends AbstractC18290d {

    /* JADX INFO: renamed from: c */
    public float f30420c;

    /* JADX INFO: renamed from: d */
    public float f30421d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10252z0 f30422e;

    public C10244v0(C10252z0 c10252z0, float f10, float f11) {
        this.f30422e = c10252z0;
        this.f30420c = f10;
        this.f30421d = f11;
    }

    @Override // p938p2.AbstractC18290d
    /* JADX INFO: renamed from: e */
    public void mo10800e(String str) {
        C10252z0 c10252z0 = this.f30422e;
        if (c10252z0.m10845e0()) {
            C10248x0 c10248x0 = (C10248x0) c10252z0.f30456o0;
            if (c10248x0.f30433b) {
                ((Canvas) c10252z0.f30454Y).drawText(str, this.f30420c, this.f30421d, c10248x0.f30435d);
            }
            C10248x0 c10248x1 = (C10248x0) c10252z0.f30456o0;
            if (c10248x1.f30434c) {
                ((Canvas) c10252z0.f30454Y).drawText(str, this.f30420c, this.f30421d, c10248x1.f30436e);
            }
        }
        this.f30420c = ((C10248x0) c10252z0.f30456o0).f30435d.measureText(str) + this.f30420c;
    }
}
