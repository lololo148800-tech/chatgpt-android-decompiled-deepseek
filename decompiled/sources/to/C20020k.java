package to;

import java.io.IOException;
import java.util.List;
import p950po.AbstractC18527a;

/* JADX INFO: renamed from: to.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C20020k extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f63366e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C20022m f63367f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f63368g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f63369h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20020k(String str, C20022m c20022m, int i10, List list) {
        super(str, true);
        this.f63367f = c20022m;
        this.f63368g = i10;
        this.f63369h = list;
    }

    /* JADX INFO: renamed from: b */
    private final long m20814b() {
        this.f63367f.f63395w0.getClass();
        try {
            this.f63367f.f63382I0.m20848S(this.f63368g, 9);
            synchronized (this.f63367f) {
                this.f63367f.f63384K0.remove(Integer.valueOf(this.f63368g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        switch (this.f63366e) {
            case 0:
                return m20814b();
            default:
                this.f63367f.f63395w0.getClass();
                try {
                    this.f63367f.f63382I0.m20848S(this.f63368g, 9);
                    synchronized (this.f63367f) {
                        this.f63367f.f63384K0.remove(Integer.valueOf(this.f63368g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20020k(String str, C20022m c20022m, int i10, List list, boolean z6) {
        super(str, true);
        this.f63367f = c20022m;
        this.f63368g = i10;
        this.f63369h = list;
    }
}
