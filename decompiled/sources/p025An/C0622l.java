package p025An;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p077Cn.C1743k;
import p153Fn.AbstractC2923a;
import p153Fn.C2942t;
import p226In.C3785g;
import p226In.InterfaceC3786h;
import p275Kn.C4821h;

/* JADX INFO: renamed from: An.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0622l implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1866Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1867Z;

    public /* synthetic */ C0622l(Object obj, int i10) {
        this.f1866Y = i10;
        this.f1867Z = obj;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, final Object obj3) {
        switch (this.f1866Y) {
            case 0:
                ((InterfaceC1436k) this.f1867Z).invoke((Throwable) obj);
                return C17296C.f55119a;
            case 1:
                final InterfaceC3786h interfaceC3786h = (InterfaceC3786h) obj;
                final C1743k c1743k = (C1743k) this.f1867Z;
                return new InterfaceC1440o() { // from class: Cn.c
                    @Override // p049Bm.InterfaceC1440o
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        C2942t c2942t = AbstractC1745m.f5008l;
                        Object obj7 = obj3;
                        if (obj7 != c2942t) {
                            AbstractC2923a.m3727a(c1743k.f4994Z, obj7, ((C3785g) interfaceC3786h).f11437Y);
                        }
                        return C17296C.f55119a;
                    }
                };
            default:
                ((C4821h) this.f1867Z).m5454c();
                return C17296C.f55119a;
        }
    }
}
