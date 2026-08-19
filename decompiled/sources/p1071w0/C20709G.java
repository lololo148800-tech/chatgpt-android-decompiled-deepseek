package p1071w0;

import androidx.compose.p650ui.focus.C10863b;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0190N0;
import p003A1.InterfaceC0300w1;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p156G1.C2963j;
import p204I1.C3581L;
import p204I1.C3590f;
import p349O0.C6018n0;
import p349O0.C6029t;
import p350O1.C6045C;
import p350O1.C6049G;
import p350O1.C6052a;
import p350O1.C6057f;
import p350O1.C6064m;
import p544W9.AbstractC8676n;
import p737f1.InterfaceC13515g;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: w0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C20709G extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65648Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20750g0 f65649Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20709G(C20750g0 c20750g0, int i10) {
        super(1);
        this.f65648Y = i10;
        this.f65649Z = c20750g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC1436k interfaceC1436k;
        C17296C c17296c;
        InterfaceC0300w1 interfaceC0300w1;
        boolean z6 = false;
        C17296C c17296c2 = null;
        C17296C c17296c3 = C17296C.f55119a;
        C20750g0 c20750g0 = this.f65649Z;
        switch (this.f65648Y) {
            case 0:
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) obj;
                C20710G0 c20710g0M21294d = c20750g0.m21294d();
                if (c20710g0M21294d != null) {
                    c20710g0M21294d.f65652c = interfaceC21098s;
                }
                return c17296c3;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c20750g0.f65826q.setValue(bool);
                return c17296c3;
            case 2:
                List list = (List) obj;
                if (c20750g0.m21294d() != null) {
                    C20710G0 c20710g0M21294d2 = c20750g0.m21294d();
                    AbstractC16544l.m18091d(c20710g0M21294d2);
                    list.add(c20710g0M21294d2.f65650a);
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 3:
                C3590f c3590f = (C3590f) obj;
                C6049G c6049g = c20750g0.f65814e;
                C20709G c20709g = c20750g0.f65829t;
                if (c6049g != null) {
                    C6045C c6045cM16144b = c20750g0.f65813d.m16144b(AbstractC17681o.m19382k(new C6057f(), new C6052a(c3590f, 1)));
                    c6049g.m6623a(null, c6045cM16144b);
                    c20709g.invoke(c6045cM16144b);
                    c17296c2 = c17296c3;
                }
                if (c17296c2 == null) {
                    String str = c3590f.f10934Y;
                    int length = str.length();
                    c20709g.invoke(new C6045C(AbstractC8676n.m9365b(length, length), str, 4));
                }
                return Boolean.TRUE;
            case 4:
                int i10 = ((C6064m) obj).f19754a;
                C20742c0 c20742c0 = c20750g0.f65827r;
                c20742c0.getClass();
                if (C6064m.m6639a(i10, 7)) {
                    interfaceC1436k = c20742c0.m21286a().f65773a;
                } else if (C6064m.m6639a(i10, 2)) {
                    interfaceC1436k = c20742c0.m21286a().f65774b;
                } else if (C6064m.m6639a(i10, 6)) {
                    interfaceC1436k = c20742c0.m21286a().f65775c;
                } else if (C6064m.m6639a(i10, 5)) {
                    interfaceC1436k = c20742c0.m21286a().f65776d;
                } else if (C6064m.m6639a(i10, 3)) {
                    interfaceC1436k = c20742c0.m21286a().f65777e;
                } else if (C6064m.m6639a(i10, 4)) {
                    interfaceC1436k = c20742c0.m21286a().f65778f;
                } else {
                    if (!(C6064m.m6639a(i10, 1) ? true : C6064m.m6639a(i10, 0))) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    interfaceC1436k = null;
                }
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(c20742c0);
                    c17296c = c17296c3;
                } else {
                    c17296c = null;
                }
                if (c17296c == null) {
                    if (C6064m.m6639a(i10, 6)) {
                        InterfaceC13515g interfaceC13515g = c20742c0.f65754c;
                        if (interfaceC13515g == null) {
                            AbstractC16544l.m18103p("focusManager");
                            throw null;
                        }
                        ((C10863b) interfaceC13515g).m11304d(1);
                    } else if (C6064m.m6639a(i10, 5)) {
                        InterfaceC13515g interfaceC13515g2 = c20742c0.f65754c;
                        if (interfaceC13515g2 == null) {
                            AbstractC16544l.m18103p("focusManager");
                            throw null;
                        }
                        ((C10863b) interfaceC13515g2).m11304d(2);
                    } else if (C6064m.m6639a(i10, 7) && (interfaceC0300w1 = c20742c0.f65752a) != null) {
                        ((C0190N0) interfaceC0300w1).m571a();
                    }
                }
                return c17296c3;
            default:
                C6045C c6045c = (C6045C) obj;
                String str2 = c6045c.f19682a.f10934Y;
                C3590f c3590f2 = c20750g0.f65819j;
                if (!AbstractC16544l.m18089b(str2, c3590f2 != null ? c3590f2.f10934Y : null)) {
                    c20750g0.f65820k.setValue(EnumC20730T.f65728Y);
                }
                long j10 = C3581L.f10906b;
                c20750g0.m21296f(j10);
                c20750g0.m21295e(j10);
                c20750g0.f65828s.invoke(c6045c);
                C6018n0 c6018n0 = c20750g0.f65811b;
                C6029t c6029t = c6018n0.f19534b;
                if (c6029t != null) {
                    c6029t.m6578o(c6018n0, null);
                }
                return c17296c3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20709G(C20750g0 c20750g0, C2963j c2963j) {
        super(1);
        this.f65648Y = 3;
        this.f65649Z = c20750g0;
    }
}
