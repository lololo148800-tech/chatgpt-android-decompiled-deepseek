package p1013t0;

import android.graphics.Rect;
import android.view.View;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21704m;
import p759g1.C13801c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: t0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C19722j implements InterfaceC19713a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC21704m f62435Y;

    public C19722j(InterfaceC21704m interfaceC21704m) {
        this.f62435Y = interfaceC21704m;
    }

    @Override // p1013t0.InterfaceC19713a
    /* JADX INFO: renamed from: h0 */
    public final Object mo20664h0(AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a, AbstractC19687c abstractC19687c) {
        View viewM22219x = AbstractC21690f.m22219x(this.f62435Y);
        long jMo21517D = abstractC21678Y.mo21517D(0L);
        C13801c c13801c = (C13801c) interfaceC1426a.invoke();
        C13801c c13801cM15326m = c13801c != null ? c13801c.m15326m(jMo21517D) : null;
        if (c13801cM15326m != null) {
            viewM22219x.requestRectangleOnScreen(new Rect((int) c13801cM15326m.f43586a, (int) c13801cM15326m.f43587b, (int) c13801cM15326m.f43588c, (int) c13801cM15326m.f43589d), false);
        }
        return C17296C.f55119a;
    }
}
