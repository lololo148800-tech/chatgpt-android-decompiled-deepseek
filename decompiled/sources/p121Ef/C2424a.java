package p121Ef;

import cd.C11709i;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p478Tc.C7299c;
import p492U1.C7543h;

/* JADX INFO: renamed from: Ef.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2424a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7537Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7299c f7538Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11709i f7539o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2424a(C7299c c7299c, C11709i c11709i, int i10) {
        super(0);
        this.f7537Y = i10;
        this.f7538Z = c7299c;
        this.f7539o0 = c11709i;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f7537Y) {
            case 0:
                C7543h c7543h = (C7543h) this.f7538Z.f23109b.getValue();
                this.f7539o0.m13032b(c7543h != null ? c7543h.f23897a : 0L);
                break;
            case 1:
                C7543h c7543h2 = (C7543h) this.f7538Z.f23109b.getValue();
                if (c7543h2 != null) {
                    this.f7539o0.m13032b(c7543h2.f23897a);
                }
                break;
            case 2:
                C7543h c7543h3 = (C7543h) this.f7538Z.f23109b.getValue();
                if (c7543h3 != null) {
                    this.f7539o0.m13032b(c7543h3.f23897a);
                }
                break;
            default:
                C7543h c7543h4 = (C7543h) this.f7538Z.f23109b.getValue();
                if (c7543h4 != null) {
                    this.f7539o0.m13032b(c7543h4.f23897a);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2424a(C11709i c11709i, C7299c c7299c) {
        super(0);
        this.f7537Y = 0;
        this.f7539o0 = c11709i;
        this.f7538Z = c7299c;
    }
}
