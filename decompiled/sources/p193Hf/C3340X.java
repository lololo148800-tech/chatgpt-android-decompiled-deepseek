package p193Hf;

import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p349O0.C5996c0;
import p894n0.C17398d;
import p894n0.C17399e;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17405k;
import p972qm.InterfaceC18770c;
import ye.C21514c;

/* JADX INFO: renamed from: Hf.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C3340X implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10199Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5996c0 f10200Z;

    public /* synthetic */ C3340X(C5996c0 c5996c0, int i10) {
        this.f10199Y = i10;
        this.f10200Z = c5996c0;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C17296C c17296c = C17296C.f55119a;
        C5996c0 c5996c0 = this.f10200Z;
        switch (this.f10199Y) {
            case 0:
                String str = ((C21514c) obj).f68131a;
                int i10 = AbstractC3356d0.f10249a;
                c5996c0.m6413h(c5996c0.m6412g() + 1);
                break;
            case 1:
                String str2 = ((C21514c) obj).f68131a;
                c5996c0.m6413h(c5996c0.m6412g() + 1);
                break;
            default:
                InterfaceC17405k interfaceC17405k = (InterfaceC17405k) obj;
                if (interfaceC17405k instanceof C17409o ? true : interfaceC17405k instanceof C17398d) {
                    c5996c0.m6413h(c5996c0.m6412g() + 1);
                } else if (interfaceC17405k instanceof C17410p ? true : interfaceC17405k instanceof C17399e ? true : interfaceC17405k instanceof C17408n) {
                    c5996c0.m6413h(c5996c0.m6412g() - 1);
                }
                break;
        }
        return c17296c;
    }
}
