package p965qf;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import bo.AbstractC11516d;
import bo.C11527o;
import gf.C14127l;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p1051v0.AbstractC20417e;
import p229J0.AbstractC4152w2;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p403Qd.AbstractC6601G;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8024X3;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: qf.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18702d {

    /* JADX INFO: renamed from: a */
    public static final C11527o f59527a = AbstractC8024X3.m8363a(AbstractC11516d.f34842d, C18701c.f59526Y);

    /* JADX INFO: renamed from: a */
    public static final void m20042a(InterfaceC1426a onDismissRequest, AbstractC6601G conversationItem, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(conversationItem, "conversationItem");
        c6021p.m6526U(595691455);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(onDismissRequest) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(conversationItem) : c6021p.m6545h(conversationItem) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            c6021p.m6524S(565928409);
            boolean zM6542f = c6021p.m6542f(context);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = (ClipboardManager) context.getSystemService(ClipboardManager.class);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            float f10 = AbstractC7313q.f23199d;
            AbstractC4152w2.m4780a(onDismissRequest, c10456n, null, 0.0f, AbstractC20417e.m21080b(f10, f10), 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-767873470, c6021p, new C14127l(conversationItem, 11, (ClipboardManager) objM6514H)), c6021p, (i12 & 14) | ((i12 >> 3) & 112), 384, 4076);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(onDismissRequest, conversationItem, interfaceC10459q2, i10, 27);
        }
    }
}
