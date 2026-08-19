package p042Bf;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p006A4.C0339D;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p1139z0.C21585H;
import p117Eb.C2385o;
import p200Hm.C3507f;
import p204I1.C3578I;
import p229J0.AbstractC4099n3;
import p229J0.C3879A2;
import p229J0.C3892C3;
import p229J0.C4075j3;
import p254K0.C4526w;
import p316Mf.AbstractC5336c;
import p316Mf.AbstractC5340g;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p350O1.C6051I;
import p492U1.C7536a;
import p530Vi.AbstractC8301I;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;
import p909nm.C17690x;

/* JADX INFO: renamed from: Bf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1260b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3339Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f3340Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1260b(InterfaceC5985X interfaceC5985X, int i10) {
        super(3);
        this.f3339Y = i10;
        this.f3340Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        C17296C c17296c = C17296C.f55119a;
        C5975S c5975s = C6013l.f19514a;
        InterfaceC5985X interfaceC5985X = this.f3340Z;
        switch (this.f3339Y) {
            case 0:
                C3892C3 SingleChoiceSegmentedButtonRow = (C3892C3) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(SingleChoiceSegmentedButtonRow, "$this$SingleChoiceSegmentedButtonRow");
                if ((6 & iIntValue) == 0) {
                    iIntValue |= c6021p.m6542f(SingleChoiceSegmentedButtonRow) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C4075j3 c4075j3 = C4075j3.f12983a;
                    InterfaceC14339Q interfaceC14339QM4744c = C4075j3.m4744c(0, c6021p);
                    boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                    c6021p.m6524S(2098680146);
                    boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C0339D(interfaceC5985X, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    int i11 = iIntValue & 14;
                    AbstractC4099n3.m4757a(SingleChoiceSegmentedButtonRow, zBooleanValue, (InterfaceC1426a) objM6514H, interfaceC14339QM4744c, null, false, null, null, null, null, AbstractC1256B.f3326a, c6021p, i11, 6);
                    InterfaceC14339Q interfaceC14339QM4744c2 = C4075j3.m4744c(1, c6021p);
                    boolean z6 = !((Boolean) interfaceC5985X.getValue()).booleanValue();
                    c6021p.m6524S(2098690547);
                    boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C0339D(interfaceC5985X, 2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC4099n3.m4757a(SingleChoiceSegmentedButtonRow, z6, (InterfaceC1426a) objM6514H2, interfaceC14339QM4744c2, null, false, null, null, null, null, AbstractC1256B.f3327b, c6021p, i11, 6);
                }
                return c17296c;
            case 1:
                InterfaceC1439n innerTextField = (InterfaceC1439n) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(innerTextField, "innerTextField");
                if ((6 & iIntValue2) == 0) {
                    iIntValue2 |= c6021p2.m6545h(innerTextField) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C3879A2 c3879a2 = C3879A2.f11730a;
                    C21585H c21585h = AbstractC5340g.f17559a;
                    String str = (String) interfaceC5985X.getValue();
                    C2385o c2385o = C6051I.f19710a;
                    c6021p2.m6524S(1034581312);
                    Object objM6514H3 = c6021p2.m6514H();
                    if (objM6514H3 == c5975s) {
                        objM6514H3 = AbstractC0168G.m536y(c6021p2);
                    }
                    c6021p2.m6553p(false);
                    c3879a2.m4600b(str, innerTextField, true, false, c2385o, (InterfaceC17406l) objM6514H3, false, null, AbstractC5336c.f17552a, null, null, null, null, null, null, null, null, c6021p2, ((iIntValue2 << 3) & 112) | 100887936, 12582912, 130752);
                }
                return c17296c;
            default:
                InterfaceC21059M layout = (InterfaceC21059M) obj;
                InterfaceC21056J measurable = (InterfaceC21056J) obj2;
                long j10 = ((C7536a) obj3).f23888a;
                AbstractC16544l.m18094g(layout, "$this$layout");
                AbstractC16544l.m18094g(measurable, "measurable");
                AbstractC21069X abstractC21069XMo21533p = measurable.mo21533p(j10);
                C3578I c3578i = (C3578I) interfaceC5985X.getValue();
                C17690x c17690x = C17690x.f56481Y;
                if (c3578i == null || (i10 = c3578i.f10893b.f10963f) == 0) {
                    return layout.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, c17690x, new C1501n(abstractC21069XMo21533p, 16));
                }
                C3507f it = AbstractC8301I.m8929t(0, i10).iterator();
                if (!it.f10596o0) {
                    throw new NoSuchElementException();
                }
                float fM4258h = c3578i.m4258h(it.mo4199a());
                while (it.f10596o0) {
                    fM4258h = Math.min(fM4258h, c3578i.m4258h(it.mo4199a()));
                }
                C3507f it2 = AbstractC8301I.m8929t(0, i10).iterator();
                if (!it2.f10596o0) {
                    throw new NoSuchElementException();
                }
                float fM4259i = c3578i.m4259i(it2.mo4199a());
                while (it2.f10596o0) {
                    fM4259i = Math.max(fM4259i, c3578i.m4259i(it2.mo4199a()));
                }
                return layout.mo19936R((int) Math.ceil(fM4259i - fM4258h), abstractC21069XMo21533p.f66982Z, c17690x, new C4526w(abstractC21069XMo21533p, fM4258h, 6));
        }
    }
}
