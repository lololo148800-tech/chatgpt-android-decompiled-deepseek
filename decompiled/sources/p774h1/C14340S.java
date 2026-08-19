package p774h1;

import com.google.protobuf.AbstractC12107L1;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p635a1.AbstractC10458p;
import p749fd.C13628m;
import p758g0.C13775m0;
import p909nm.C17690x;

/* JADX INFO: renamed from: h1.S */
/* JADX INFO: loaded from: classes.dex */
public final class C14340S extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public float f45004A0;

    /* JADX INFO: renamed from: B0 */
    public float f45005B0;

    /* JADX INFO: renamed from: C0 */
    public float f45006C0;

    /* JADX INFO: renamed from: D0 */
    public float f45007D0;

    /* JADX INFO: renamed from: E0 */
    public float f45008E0;

    /* JADX INFO: renamed from: F0 */
    public float f45009F0;

    /* JADX INFO: renamed from: G0 */
    public float f45010G0;

    /* JADX INFO: renamed from: H0 */
    public float f45011H0;

    /* JADX INFO: renamed from: I0 */
    public float f45012I0;

    /* JADX INFO: renamed from: J0 */
    public long f45013J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC14339Q f45014K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f45015L0;

    /* JADX INFO: renamed from: M0 */
    public long f45016M0;

    /* JADX INFO: renamed from: N0 */
    public long f45017N0;

    /* JADX INFO: renamed from: O0 */
    public int f45018O0;

    /* JADX INFO: renamed from: P0 */
    public C13628m f45019P0;

    /* JADX INFO: renamed from: z0 */
    public float f45020z0;

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C13775m0(abstractC21069XMo21533p, 10, this));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21234e(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21242m(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21246q(this, abstractC21668N, interfaceC21056J, i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f45020z0);
        sb2.append(", scaleY=");
        sb2.append(this.f45004A0);
        sb2.append(", alpha = ");
        sb2.append(this.f45005B0);
        sb2.append(", translationX=");
        sb2.append(this.f45006C0);
        sb2.append(", translationY=");
        sb2.append(this.f45007D0);
        sb2.append(", shadowElevation=");
        sb2.append(this.f45008E0);
        sb2.append(", rotationX=");
        sb2.append(this.f45009F0);
        sb2.append(", rotationY=");
        sb2.append(this.f45010G0);
        sb2.append(", rotationZ=");
        sb2.append(this.f45011H0);
        sb2.append(", cameraDistance=");
        sb2.append(this.f45012I0);
        sb2.append(", transformOrigin=");
        sb2.append((Object) C14343V.m15670d(this.f45013J0));
        sb2.append(", shape=");
        sb2.append(this.f45014K0);
        sb2.append(", clip=");
        sb2.append(this.f45015L0);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        AbstractC12107L1.m13828s(this.f45016M0, ", spotShadowColor=", sb2);
        AbstractC12107L1.m13828s(this.f45017N0, ", compositingStrategy=", sb2);
        sb2.append((Object) ("CompositingStrategy(value=" + this.f45018O0 + ')'));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
