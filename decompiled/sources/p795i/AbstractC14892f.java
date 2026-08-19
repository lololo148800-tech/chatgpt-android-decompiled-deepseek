package p795i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.AbstractC21031l;
import p349O0.C5975S;
import p349O0.C6021p;
import p349O0.C6037x;
import p772h.C14217H;
import p772h.InterfaceC14216G;

/* JADX INFO: renamed from: i.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14892f {

    /* JADX INFO: renamed from: a */
    public static final C6037x f46381a = new C6037x(C14888b.f46376p0, C5975S.f19448r0);

    /* JADX INFO: renamed from: a */
    public static InterfaceC14216G m16066a(C6021p c6021p) {
        c6021p.m6525T(-2068013981);
        InterfaceC14216G interfaceC14216G = (InterfaceC14216G) c6021p.m6548k(f46381a);
        c6021p.m6525T(1680121597);
        if (interfaceC14216G == null) {
            View view = (View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f);
            AbstractC16544l.m18094g(view, "<this>");
            interfaceC14216G = (InterfaceC14216G) AbstractC21031l.m21489m(AbstractC21031l.m21496t(AbstractC21031l.m21492p(C14217H.f44649o0, view), C14217H.f44650p0));
        }
        c6021p.m6553p(false);
        if (interfaceC14216G == null) {
            Object baseContext = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC14216G) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC14216G = (InterfaceC14216G) baseContext;
        }
        c6021p.m6553p(false);
        return interfaceC14216G;
    }
}
