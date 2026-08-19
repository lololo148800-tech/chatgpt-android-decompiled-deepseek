package p059C5;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import p025An.C0644w;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p033B5.InterfaceC0832p;
import p374P5.C6350c;
import p374P5.C6354g;
import p374P5.C6363p;
import p374P5.InterfaceC6357j;
import p523V9.AbstractC7897H0;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: C5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1596n {

    /* JADX INFO: renamed from: a */
    public static final C1596n f4474a = new C1596n();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m2444a(InterfaceC0832p interfaceC0832p, C6354g c6354g, AbstractC19687c abstractC19687c) {
        C1595m c1595m;
        if (abstractC19687c instanceof C1595m) {
            c1595m = (C1595m) abstractC19687c;
            int i10 = c1595m.f4473p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1595m.f4473p0 = i10 - Integer.MIN_VALUE;
            } else {
                c1595m = new C1595m(this, abstractC19687c);
            }
        } else {
            c1595m = new C1595m(this, abstractC19687c);
        }
        Object objM1898b = c1595m.f4471Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1595m.f4473p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1898b);
            c1595m.f4470Y = c6354g;
            c1595m.f4473p0 = 1;
            objM1898b = ((C0840x) interfaceC0832p).m1898b(c6354g, c1595m);
            if (objM1898b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6354g = c1595m.f4470Y;
            AbstractC9233X.m9807c(objM1898b);
        }
        InterfaceC6357j interfaceC6357j = (InterfaceC6357j) objM1898b;
        if (interfaceC6357j instanceof C6363p) {
            C6363p c6363p = (C6363p) interfaceC6357j;
            return new AsyncImagePainter$State$Success(AbstractC7897H0.m8193a(c6363p.f20707a, c6354g.f20661a, 1), c6363p);
        }
        if (!(interfaceC6357j instanceof C6350c)) {
            throw new C0644w();
        }
        C6350c c6350c = (C6350c) interfaceC6357j;
        InterfaceC0829m interfaceC0829m = c6350c.f20618a;
        return new AsyncImagePainter$State$Error(interfaceC0829m != null ? AbstractC7897H0.m8193a(interfaceC0829m, c6354g.f20661a, 1) : null, c6350c);
    }
}
