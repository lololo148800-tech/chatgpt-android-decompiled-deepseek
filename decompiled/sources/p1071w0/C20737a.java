package p1071w0;

import androidx.compose.p650ui.draw.AbstractC10861a;
import kotlin.jvm.internal.AbstractC16546n;
import p017Af.C0478i;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p080D0.AbstractC1770D0;
import p080D0.C1768C0;
import p349O0.C6013l;
import p349O0.C6021p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20737a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C20737a f65742Y = new C20737a(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC10459q interfaceC10459q = (InterfaceC10459q) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(-2126899193);
        long j10 = ((C1768C0) c6021p.m6548k(AbstractC1770D0.f5051a)).f5045a;
        C10456n c10456n = C10456n.f30959Y;
        boolean zM6540e = c6021p.m6540e(j10);
        Object objM6514H = c6021p.m6514H();
        if (zM6540e || objM6514H == C6013l.f19514a) {
            objM6514H = new C0478i(j10, 6);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(AbstractC10861a.m11296b(c10456n, (InterfaceC1436k) objM6514H));
        c6021p.m6553p(false);
        return interfaceC10459qMo428M;
    }
}
