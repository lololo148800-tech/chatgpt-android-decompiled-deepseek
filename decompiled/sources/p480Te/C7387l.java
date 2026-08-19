package p480Te;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1009s9.C19506i;
import p409Qk.C6754e;
import p666bl.AbstractC11497m;
import p666bl.C11493i;

/* JADX INFO: renamed from: Te.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C7387l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23408Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7392q f23409Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7387l(C7392q c7392q, int i10) {
        super(1);
        this.f23408Y = i10;
        this.f23409Z = c7392q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f23408Y) {
            case 0:
                C11493i install = (C11493i) obj;
                AbstractC16544l.m18094g(install, "$this$install");
                install.f34787c = new C19506i(this.f23409Z, 20);
                break;
            default:
                C6754e HttpClient = (C6754e) obj;
                AbstractC16544l.m18094g(HttpClient, "$this$HttpClient");
                HttpClient.m7190a(AbstractC11497m.f34802c, new C7387l(this.f23409Z, 0));
                HttpClient.f21687g = true;
                break;
        }
        return C17296C.f55119a;
    }
}
