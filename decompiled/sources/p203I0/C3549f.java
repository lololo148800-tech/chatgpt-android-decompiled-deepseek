package p203I0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.AbstractC12107L1;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p773h0.InterfaceC14267W;
import p773h0.InterfaceC14268X;
import p774h1.C14365u;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: I0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3549f implements InterfaceC14267W {

    /* JADX INFO: renamed from: a */
    public final boolean f10752a;

    /* JADX INFO: renamed from: b */
    public final float f10753b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5985X f10754c;

    public C3549f(boolean z6, float f10, InterfaceC5985X interfaceC5985X) {
        this.f10752a = z6;
        this.f10753b = f10;
        this.f10754c = interfaceC5985X;
    }

    @Override // p773h0.InterfaceC14267W
    /* JADX INFO: renamed from: b */
    public final InterfaceC14268X mo4232b(InterfaceC17406l interfaceC17406l, C6021p c6021p) {
        long jMo4230a;
        c6021p.m6524S(988743187);
        InterfaceC3566w interfaceC3566w = (InterfaceC3566w) c6021p.m6548k(AbstractC3568y.f10808a);
        InterfaceC5985X interfaceC5985X = this.f10754c;
        if (((C14365u) interfaceC5985X.getValue()).f45062a != 16) {
            c6021p.m6524S(-303571590);
            c6021p.m6553p(false);
            jMo4230a = ((C14365u) interfaceC5985X.getValue()).f45062a;
        } else {
            c6021p.m6524S(-303521246);
            jMo4230a = interfaceC3566w.mo4230a(c6021p);
            c6021p.m6553p(false);
        }
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(new C14365u(jMo4230a), c6021p);
        InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(interfaceC3566w.mo4231b(c6021p), c6021p);
        c6021p.m6524S(331259447);
        ViewGroup viewGroupM4242b = AbstractC3569z.m4242b((View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f));
        boolean zM6542f = c6021p.m6542f(interfaceC17406l) | c6021p.m6542f(this) | c6021p.m6542f(viewGroupM4242b);
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (zM6542f || objM6514H == obj) {
            objM6514H = new C3544a(this.f10752a, this.f10753b, interfaceC5985XM6435V, interfaceC5985XM6435V2, viewGroupM4242b);
            c6021p.m6537c0(objM6514H);
        }
        C3544a c3544a = (C3544a) objM6514H;
        c6021p.m6553p(false);
        boolean zM6542f2 = c6021p.m6542f(interfaceC17406l) | c6021p.m6545h(c3544a);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f2 || objM6514H2 == obj) {
            objM6514H2 = new C3550g(interfaceC17406l, c3544a, null);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6451g(c3544a, interfaceC17406l, (InterfaceC1439n) objM6514H2, c6021p);
        c6021p.m6553p(false);
        return c3544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3549f)) {
            return false;
        }
        C3549f c3549f = (C3549f) obj;
        return this.f10752a == c3549f.f10752a && C7540e.m7873a(this.f10753b, c3549f.f10753b) && this.f10754c.equals(c3549f.f10754c);
    }

    public final int hashCode() {
        return this.f10754c.hashCode() + AbstractC12107L1.m13819j(this.f10753b, (this.f10752a ? 1231 : 1237) * 31, 31);
    }
}
