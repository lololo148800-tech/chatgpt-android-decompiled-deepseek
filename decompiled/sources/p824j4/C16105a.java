package p824j4;

import java.util.ArrayList;
import java.util.Arrays;
import p031B3.AbstractC0797a;

/* JADX INFO: renamed from: j4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16105a extends AbstractC0797a {

    /* JADX INFO: renamed from: o0 */
    public final long f49883o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f49884p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f49885q0;

    public C16105a(int i10, long j10) {
        super(i10, 2);
        this.f49883o0 = j10;
        this.f49884p0 = new ArrayList();
        this.f49885q0 = new ArrayList();
    }

    /* JADX INFO: renamed from: n */
    public final C16105a m17653n(int i10) {
        ArrayList arrayList = this.f49885q0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C16105a c16105a = (C16105a) arrayList.get(i11);
            if (c16105a.f2213Z == i10) {
                return c16105a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final C16106b m17654o(int i10) {
        ArrayList arrayList = this.f49884p0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C16106b c16106b = (C16106b) arrayList.get(i11);
            if (c16106b.f2213Z == i10) {
                return c16106b;
            }
        }
        return null;
    }

    @Override // p031B3.AbstractC0797a
    public final String toString() {
        return AbstractC0797a.m1821c(this.f2213Z) + " leaves: " + Arrays.toString(this.f49884p0.toArray()) + " containers: " + Arrays.toString(this.f49885q0.toArray());
    }
}
