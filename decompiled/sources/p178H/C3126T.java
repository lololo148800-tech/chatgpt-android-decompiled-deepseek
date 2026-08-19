package p178H;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: renamed from: H.T */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3126T implements InterfaceC3181y {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9413Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3127U f9414Z;

    public /* synthetic */ C3126T(InterfaceC3127U interfaceC3127U, InterfaceC3127U interfaceC3127U2, int i10) {
        this.f9413Y = i10;
        this.f9414Z = interfaceC3127U2;
    }

    @Override // p178H.InterfaceC3181y
    /* JADX INFO: renamed from: a */
    public final void mo3953a(AbstractC3182z abstractC3182z) throws Exception {
        InterfaceC3127U interfaceC3127U = this.f9414Z;
        switch (this.f9413Y) {
            case 0:
                int i10 = ImageProcessingUtil.f32340a;
                if (interfaceC3127U != null) {
                    interfaceC3127U.close();
                }
                break;
            default:
                int i11 = ImageProcessingUtil.f32340a;
                interfaceC3127U.close();
                break;
        }
    }
}
