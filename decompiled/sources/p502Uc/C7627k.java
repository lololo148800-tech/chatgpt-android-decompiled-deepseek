package p502Uc;

import androidx.compose.p650ui.draw.AbstractC10861a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p349O0.C6013l;
import p349O0.C6021p;
import p594Y9.AbstractC9818V;
import p635a1.InterfaceC10459q;
import p774h1.C14327E;

/* JADX INFO: renamed from: Uc.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C7627k extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f24116Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f24117Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f24118o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f24119p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7627k(boolean z6, boolean z10, float f10, boolean z11) {
        super(3);
        this.f24116Y = z6;
        this.f24117Z = z10;
        this.f24118o0 = f10;
        this.f24119p0 = z11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC10459q composed = (InterfaceC10459q) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        AbstractC16544l.m18094g(composed, "$this$composed");
        c6021p.m6524S(2018128523);
        C14327E c14327eM10459c = AbstractC9818V.m10459c(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A, c6021p);
        c6021p.m6524S(-130610160);
        boolean zM6544g = c6021p.m6544g(this.f24116Y) | c6021p.m6542f(c14327eM10459c) | c6021p.m6544g(this.f24117Z) | c6021p.m6536c(this.f24118o0) | c6021p.m6544g(this.f24119p0);
        Object objM6514H = c6021p.m6514H();
        if (zM6544g || objM6514H == C6013l.f19514a) {
            objM6514H = new C7626j(this.f24116Y, c14327eM10459c, this.f24117Z, this.f24118o0, this.f24119p0);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        InterfaceC10459q interfaceC10459qM11297c = AbstractC10861a.m11297c(composed, (InterfaceC1436k) objM6514H);
        c6021p.m6553p(false);
        return interfaceC10459qM11297c;
    }
}
