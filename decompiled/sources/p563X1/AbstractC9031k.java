package p563X1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p650ui.focus.C10863b;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p1140z1.C21715t;
import p635a1.AbstractC10458p;
import p737f1.AbstractC13512d;
import p737f1.C13526r;
import p737f1.InterfaceC13515g;
import p759g1.C13800b;
import p759g1.C13801c;

/* JADX INFO: renamed from: X1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9031k {

    /* JADX INFO: renamed from: a */
    public static final C9030j f27567a = new C9030j();

    /* JADX INFO: renamed from: a */
    public static final boolean m9599a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final Rect m9600b(InterfaceC13515g interfaceC13515g, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C13526r c13526rM15046g = AbstractC13512d.m15046g(((C10863b) interfaceC13515g).f32698f);
        C13801c c13801cM15049j = c13526rM15046g != null ? AbstractC13512d.m15049j(c13526rM15046g) : null;
        if (c13801cM15049j == null) {
            return null;
        }
        int i10 = (int) c13801cM15049j.f43586a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) c13801cM15049j.f43587b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) c13801cM15049j.f43588c) + i11) - i12, (((int) c13801cM15049j.f43589d) + i14) - i15);
    }

    /* JADX INFO: renamed from: c */
    public static final View m9601c(AbstractC10458p abstractC10458p) {
        C9037q c9037q = AbstractC21690f.m22217v(abstractC10458p.f30960Y).f68659v0;
        View interopView = c9037q != null ? c9037q.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* JADX INFO: renamed from: d */
    public static final void m9602d(C9037q c9037q, C21658D c21658d) {
        long jMo21517D = ((C21715t) c21658d.f68638I0.f3468c).mo21517D(0L);
        int iRound = Math.round(C13800b.m15306g(jMo21517D));
        int iRound2 = Math.round(C13800b.m15307h(jMo21517D));
        c9037q.layout(iRound, iRound2, c9037q.getMeasuredWidth() + iRound, c9037q.getMeasuredHeight() + iRound2);
    }
}
