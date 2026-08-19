package p615Z6;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: renamed from: Z6.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10242u0 extends C10244v0 {

    /* JADX INFO: renamed from: f */
    public final Path f30417f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C10252z0 f30418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10242u0(C10252z0 c10252z0, Path path, float f10) {
        super(c10252z0, f10, 0.0f);
        this.f30418g = c10252z0;
        this.f30417f = path;
    }

    @Override // p615Z6.C10244v0, p938p2.AbstractC18290d
    /* JADX INFO: renamed from: e */
    public final void mo10800e(String str) {
        C10252z0 c10252z0 = this.f30418g;
        if (c10252z0.m10845e0()) {
            C10248x0 c10248x0 = (C10248x0) c10252z0.f30456o0;
            if (c10248x0.f30433b) {
                ((Canvas) c10252z0.f30454Y).drawTextOnPath(str, this.f30417f, this.f30420c, this.f30421d, c10248x0.f30435d);
            }
            C10248x0 c10248x1 = (C10248x0) c10252z0.f30456o0;
            if (c10248x1.f30434c) {
                ((Canvas) c10252z0.f30454Y).drawTextOnPath(str, this.f30417f, this.f30420c, this.f30421d, c10248x1.f30436e);
            }
        }
        this.f30420c = ((C10248x0) c10252z0.f30456o0).f30435d.measureText(str) + this.f30420c;
    }
}
