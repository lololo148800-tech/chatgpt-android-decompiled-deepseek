package to;

import java.io.IOException;
import p026Ao.C0675i;
import p950po.AbstractC18527a;

/* JADX INFO: renamed from: to.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C20019j extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C20022m f63362e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f63363f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0675i f63364g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f63365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20019j(String str, C20022m c20022m, int i10, C0675i c0675i, int i11, boolean z6) {
        super(str, true);
        this.f63362e = c20022m;
        this.f63363f = i10;
        this.f63364g = c0675i;
        this.f63365h = i11;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        try {
            C20033x c20033x = this.f63362e.f63395w0;
            C0675i c0675i = this.f63364g;
            int i10 = this.f63365h;
            c20033x.getClass();
            c0675i.skip(i10);
            this.f63362e.f63382I0.m20848S(this.f63363f, 9);
            synchronized (this.f63362e) {
                this.f63362e.f63384K0.remove(Integer.valueOf(this.f63363f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
