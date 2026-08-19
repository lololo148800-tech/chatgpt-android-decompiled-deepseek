package p003A1;

import android.view.ActionMode;
import androidx.compose.p650ui.platform.AndroidComposeView;
import p002A0.C0130g;
import p049Bm.InterfaceC1426a;
import p055C1.C1506a;
import p615Z6.C10252z0;
import p759g1.C13801c;

/* JADX INFO: renamed from: A1.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0278p0 implements InterfaceC0303x1 {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f1007a;

    /* JADX INFO: renamed from: b */
    public ActionMode f1008b;

    /* JADX INFO: renamed from: c */
    public final C10252z0 f1009c;

    /* JADX INFO: renamed from: d */
    public int f1010d;

    public C0278p0(AndroidComposeView androidComposeView) {
        this.f1007a = androidComposeView;
        C0130g c0130g = new C0130g(this, 2);
        C13801c c13801c = C13801c.f43585e;
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30454Y = c0130g;
        c10252z0.f30455Z = c13801c;
        c10252z0.f30456o0 = null;
        c10252z0.f30457p0 = null;
        c10252z0.f30458q0 = null;
        c10252z0.f30459r0 = null;
        this.f1009c = c10252z0;
        this.f1010d = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m863a(C13801c c13801c, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, InterfaceC1426a interfaceC1426a4) {
        C10252z0 c10252z0 = this.f1009c;
        c10252z0.f30455Z = c13801c;
        c10252z0.f30456o0 = interfaceC1426a;
        c10252z0.f30458q0 = interfaceC1426a3;
        c10252z0.f30457p0 = interfaceC1426a2;
        c10252z0.f30459r0 = interfaceC1426a4;
        ActionMode actionMode = this.f1008b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f1010d = 1;
        this.f1008b = C0306y1.f1078a.m909b(this.f1007a, new C1506a(c10252z0), 1);
    }
}
