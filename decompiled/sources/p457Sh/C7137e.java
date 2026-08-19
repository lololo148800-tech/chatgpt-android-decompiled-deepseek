package p457Sh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p666bl.C11493i;
import p666bl.C11506v;
import p720e6.C13287b;

/* JADX INFO: renamed from: Sh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7137e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22703Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3430e f22704Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7137e(C3430e c3430e, int i10) {
        super(1);
        this.f22703Y = i10;
        this.f22704Z = c3430e;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f22703Y) {
            case 0:
                C11493i install = (C11493i) obj;
                AbstractC16544l.m18094g(install, "$this$install");
                install.f34786b.add(new C11506v("***"));
                install.f34787c = new C13287b(this.f22704Z, 24);
                break;
            default:
                AbstractC8160o6.m8726a(this.f22704Z, "OTP retriever started", null, 6);
                break;
        }
        return C17296C.f55119a;
    }
}
