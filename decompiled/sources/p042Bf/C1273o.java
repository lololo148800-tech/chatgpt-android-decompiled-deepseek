package p042Bf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.InterfaceC0309z1;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Bf.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C1273o extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3382Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0309z1 f3383Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3384o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1273o(InterfaceC0309z1 interfaceC0309z1, String str, int i10) {
        super(0);
        this.f3382Y = i10;
        this.f3383Z = interfaceC0309z1;
        this.f3384o0 = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3382Y) {
            case 0:
                this.f3383Z.mo877a(this.f3384o0);
                break;
            case 1:
                this.f3383Z.mo877a("tel:" + this.f3384o0);
                break;
            case 2:
                StringBuilder sb2 = new StringBuilder("geo:");
                String str = this.f3384o0;
                sb2.append(str);
                sb2.append("?q=");
                sb2.append(str);
                this.f3383Z.mo877a(sb2.toString());
                break;
            case 3:
                this.f3383Z.mo877a(this.f3384o0);
                break;
            case 4:
                this.f3383Z.mo877a("tel:" + this.f3384o0);
                break;
            default:
                this.f3383Z.mo877a(this.f3384o0);
                break;
        }
        return C17296C.f55119a;
    }
}
