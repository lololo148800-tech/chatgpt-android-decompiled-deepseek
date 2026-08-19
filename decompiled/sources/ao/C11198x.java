package ao;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p008A6.C0383c;
import p049Bm.InterfaceC1426a;
import p1113xn.C21319m;
import p606Yn.C10110k;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: ao.x */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C11198x implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f33860Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f33861Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f33862o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f33863p0;

    public /* synthetic */ C11198x(int i10, String str, C11200y c11200y) {
        this.f33862o0 = i10;
        this.f33861Z = str;
        this.f33863p0 = c11200y;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f33860Y) {
            case 0:
                int i10 = this.f33862o0;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    serialDescriptorArr[i11] = AbstractC11336c.m12774d(this.f33861Z + '.' + ((C11200y) this.f33863p0).f53322e[i11], C10110k.f29938e, new SerialDescriptor[0], new C0383c(24));
                }
                return serialDescriptorArr;
            default:
                return ((C21319m) this.f33863p0).m21662a(this.f33862o0, this.f33861Z);
        }
    }

    public /* synthetic */ C11198x(C21319m c21319m, String str, int i10) {
        this.f33863p0 = c21319m;
        this.f33861Z = str;
        this.f33862o0 = i10;
    }
}
