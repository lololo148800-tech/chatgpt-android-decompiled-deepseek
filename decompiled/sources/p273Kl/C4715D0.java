package p273Kl;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p199Hl.AbstractC3488m;
import p199Hl.C3465A;
import p199Hl.C3468D;
import p199Hl.C3479d;
import p199Hl.C3481f;
import p199Hl.C3482g;
import p199Hl.C3483h;
import p199Hl.C3484i;
import p199Hl.C3485j;
import p199Hl.C3486k;
import p199Hl.C3487l;
import p199Hl.C3489n;
import p199Hl.C3495t;
import p344Nl.AbstractC5821C;
import p344Nl.C5823E;
import p344Nl.C5825G;
import p387Pl.AbstractC6470Q;
import p387Pl.EnumC6466M;
import p658b5.C11248s;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Kl.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4715D0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15336Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f15337Z;

    public /* synthetic */ C4715D0(C4727J0 c4727j0, int i10) {
        this.f15336Y = i10;
        this.f15337Z = c4727j0;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        switch (this.f15336Y) {
            case 0:
                AbstractC3488m abstractC3488m = (AbstractC3488m) obj;
                boolean z6 = abstractC3488m instanceof C3484i;
                C4727J0 c4727j0 = this.f15337Z;
                if (z6) {
                    if (c4727j0.m5412g() == EnumC4807x0.f15674Z) {
                        C3484i c3484i = (C3484i) abstractC3488m;
                        Object objM12670s = c4727j0.f15389n.m12670s(new C3465A(c4727j0, c3484i.f10566d, c3484i.f10565c), interfaceC18770c);
                        if (objM12670s == EnumC19250a.f61036Y) {
                            return objM12670s;
                        }
                    }
                } else if (abstractC3488m instanceof C3485j) {
                    C11248s c11248s = c4727j0.f15389n;
                    C3485j c3485j = (C3485j) abstractC3488m;
                    AbstractC6470Q abstractC6470Q = c3485j.f10567c;
                    EnumC6466M streamState = c3485j.f10568d;
                    AbstractC16544l.m18094g(streamState, "streamState");
                    Object objM12670s2 = c11248s.m12670s(new C3495t(c4727j0), interfaceC18770c);
                    if (objM12670s2 == EnumC19250a.f61036Y) {
                        return objM12670s2;
                    }
                } else if (abstractC3488m instanceof C3486k) {
                    C11248s c11248s2 = c4727j0.f15389n;
                    C5825G c5825g = ((C3486k) abstractC3488m).f10569c;
                    Object objM12670s3 = c11248s2.m12670s(new C3495t(c4727j0), interfaceC18770c);
                    if (objM12670s3 == EnumC19250a.f61036Y) {
                        return objM12670s3;
                    }
                } else if (abstractC3488m instanceof C3481f) {
                    AbstractC5821C abstractC5821C = abstractC3488m.f10572b;
                    String str = ((C3481f) abstractC3488m).f10561c;
                    Object objM5407b = C4727J0.m5407b(c4727j0, new C3495t(c4727j0, abstractC5821C, 1), interfaceC18770c);
                    if (objM5407b == EnumC19250a.f61036Y) {
                        return objM5407b;
                    }
                } else if (abstractC3488m instanceof C3479d) {
                    AbstractC5821C abstractC5821C2 = abstractC3488m.f10572b;
                    C3479d c3479d = (C3479d) abstractC3488m;
                    Object objM5407b2 = C4727J0.m5407b(c4727j0, new C3489n(c4727j0, abstractC5821C2, c3479d.f10559c, c3479d.f10560d), interfaceC18770c);
                    if (objM5407b2 == EnumC19250a.f61036Y) {
                        return objM5407b2;
                    }
                } else if (abstractC3488m instanceof C3482g) {
                    AbstractC5821C abstractC5821C3 = abstractC3488m.f10572b;
                    String str2 = ((C3482g) abstractC3488m).f10562c;
                    Object objM5407b3 = C4727J0.m5407b(c4727j0, new C3495t(c4727j0, abstractC5821C3, 2), interfaceC18770c);
                    if (objM5407b3 == EnumC19250a.f61036Y) {
                        return objM5407b3;
                    }
                } else if (abstractC3488m instanceof C3483h) {
                    C11248s c11248s3 = c4727j0.f15389n;
                    AbstractC5821C abstractC5821C4 = ((C3483h) abstractC3488m).f10563c;
                    C5823E c5823e = ((C3483h) abstractC3488m).f10564d;
                    Object objM12670s4 = c11248s3.m12670s(new C3495t(c4727j0), interfaceC18770c);
                    if (objM12670s4 == EnumC19250a.f61036Y) {
                        return objM12670s4;
                    }
                }
                return C17296C.f55119a;
            default:
                AbstractC3488m abstractC3488m2 = (AbstractC3488m) obj;
                boolean z10 = abstractC3488m2 instanceof C3484i;
                C4727J0 c4727j1 = this.f15337Z;
                if (z10) {
                    C3484i c3484i2 = (C3484i) abstractC3488m2;
                    Object objM5407b4 = C4727J0.m5407b(c4727j1, new C3465A(c4727j1, c3484i2.f10566d, c3484i2.f10565c), interfaceC18770c);
                    if (objM5407b4 == EnumC19250a.f61036Y) {
                        return objM5407b4;
                    }
                } else if (abstractC3488m2 instanceof C3487l) {
                    C3487l c3487l = (C3487l) abstractC3488m2;
                    Object objM5407b5 = C4727J0.m5407b(c4727j1, new C3468D(c4727j1, c3487l.f10571d, c3487l.f10570c), interfaceC18770c);
                    if (objM5407b5 == EnumC19250a.f61036Y) {
                        return objM5407b5;
                    }
                } else if (abstractC3488m2 instanceof C3483h) {
                    AbstractC5821C abstractC5821C5 = ((C3483h) abstractC3488m2).f10563c;
                    C5823E c5823e2 = ((C3483h) abstractC3488m2).f10564d;
                    Object objM5407b6 = C4727J0.m5407b(c4727j1, new C3495t(c4727j1), interfaceC18770c);
                    if (objM5407b6 == EnumC19250a.f61036Y) {
                        return objM5407b6;
                    }
                } else if (abstractC3488m2 instanceof C3481f) {
                    AbstractC5821C abstractC5821C6 = abstractC3488m2.f10572b;
                    String str3 = ((C3481f) abstractC3488m2).f10561c;
                    Object objM5407b7 = C4727J0.m5407b(c4727j1, new C3495t(c4727j1, abstractC5821C6, 1), interfaceC18770c);
                    if (objM5407b7 == EnumC19250a.f61036Y) {
                        return objM5407b7;
                    }
                } else if (abstractC3488m2 instanceof C3479d) {
                    AbstractC5821C abstractC5821C7 = abstractC3488m2.f10572b;
                    C3479d c3479d2 = (C3479d) abstractC3488m2;
                    Object objM5407b8 = C4727J0.m5407b(c4727j1, new C3489n(c4727j1, abstractC5821C7, c3479d2.f10559c, c3479d2.f10560d), interfaceC18770c);
                    if (objM5407b8 == EnumC19250a.f61036Y) {
                        return objM5407b8;
                    }
                } else if (abstractC3488m2 instanceof C3482g) {
                    AbstractC5821C abstractC5821C8 = abstractC3488m2.f10572b;
                    String str4 = ((C3482g) abstractC3488m2).f10562c;
                    Object objM5407b9 = C4727J0.m5407b(c4727j1, new C3495t(c4727j1, abstractC5821C8, 2), interfaceC18770c);
                    if (objM5407b9 == EnumC19250a.f61036Y) {
                        return objM5407b9;
                    }
                }
                return C17296C.f55119a;
        }
    }
}
