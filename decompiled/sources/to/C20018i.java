package to;

import java.io.IOException;
import p775h2.AbstractC14376f;
import p950po.AbstractC18527a;

/* JADX INFO: renamed from: to.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C20018i extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f63358e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C20022m f63359f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f63360g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f63361h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20018i(String str, C20022m c20022m, int i10, int i11, int i12) {
        super(str, true);
        this.f63358e = i12;
        this.f63359f = c20022m;
        this.f63360g = i10;
        this.f63361h = i11;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        switch (this.f63358e) {
            case 0:
                int i10 = this.f63360g;
                int i11 = this.f63361h;
                C20022m c20022m = this.f63359f;
                c20022m.getClass();
                try {
                    c20022m.f63382I0.m20847P(i10, i11, true);
                    return -1L;
                } catch (IOException e10) {
                    c20022m.m20820a(2, 2, e10);
                    return -1L;
                }
            case 1:
                C20033x c20033x = this.f63359f.f63395w0;
                int i12 = this.f63361h;
                c20033x.getClass();
                AbstractC14376f.m15825D(i12, "errorCode");
                synchronized (this.f63359f) {
                    this.f63359f.f63384K0.remove(Integer.valueOf(this.f63360g));
                }
                return -1L;
            default:
                C20022m c20022m2 = this.f63359f;
                try {
                    int i13 = this.f63360g;
                    int i14 = this.f63361h;
                    c20022m2.getClass();
                    AbstractC14376f.m15825D(i14, "statusCode");
                    c20022m2.f63382I0.m20848S(i13, i14);
                    return -1L;
                } catch (IOException e11) {
                    c20022m2.m20820a(2, 2, e11);
                    return -1L;
                }
        }
    }
}
