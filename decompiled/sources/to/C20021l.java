package to;

import java.io.IOException;
import p950po.AbstractC18527a;

/* JADX INFO: renamed from: to.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C20021l extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C20022m f63370e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f63371f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f63372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20021l(String str, C20022m c20022m, int i10, long j10) {
        super(str, true);
        this.f63370e = c20022m;
        this.f63371f = i10;
        this.f63372g = j10;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        C20022m c20022m = this.f63370e;
        try {
            c20022m.f63382I0.m20850W(this.f63371f, this.f63372g);
            return -1L;
        } catch (IOException e10) {
            c20022m.m20820a(2, 2, e10);
            return -1L;
        }
    }
}
