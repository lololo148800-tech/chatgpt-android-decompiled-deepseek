package p860l0;

import androidx.compose.foundation.gestures.DraggableElement;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p635a1.InterfaceC10459q;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: l0.v0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16786v0 {

    /* JADX INFO: renamed from: a */
    public static final C16783u0 f53881a;

    /* JADX INFO: renamed from: b */
    public static final C16783u0 f53882b;

    static {
        int i10 = 3;
        InterfaceC18770c interfaceC18770c = null;
        f53881a = new C16783u0(i10, interfaceC18770c, 0);
        f53882b = new C16783u0(i10, interfaceC18770c, 1);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m18554a(InterfaceC10459q interfaceC10459q, InterfaceC16658A0 interfaceC16658A0, boolean z6, InterfaceC17406l interfaceC17406l, boolean z10, InterfaceC1440o interfaceC1440o, InterfaceC1440o interfaceC1440o2, boolean z11, int i10) {
        return interfaceC10459q.mo428M(new DraggableElement(interfaceC16658A0, (i10 & 4) != 0 ? true : z6, (i10 & 8) != 0 ? null : interfaceC17406l, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? f53881a : interfaceC1440o, (i10 & 64) != 0 ? f53882b : interfaceC1440o2, (i10 & 128) != 0 ? false : z11));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC16658A0 m18555b(InterfaceC1436k interfaceC1436k, C6021p c6021p) {
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1436k, c6021p);
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            C16678H c16678h = new C16678H(new C6194i(interfaceC5985XM6435V, 14));
            c6021p.m6537c0(c16678h);
            objM6514H = c16678h;
        }
        return (InterfaceC16658A0) objM6514H;
    }
}
