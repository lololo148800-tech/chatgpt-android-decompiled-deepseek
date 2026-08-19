package gd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlinx.serialization.KSerializer;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3756d;
import p559Wn.C8974f;
import p909nm.C17690x;

/* JADX INFO: renamed from: gd.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13947i0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C13947i0 f43999Z = new C13947i0(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13947i0 f44000o0 = new C13947i0(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13947i0 f44001p0 = new C13947i0(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44002Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13947i0(int i10, int i11) {
        super(i10);
        this.f44002Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44002Y) {
            case 0:
                return new C8974f("com.openai.experiment.FeatureGateKey", AbstractC16526C.f51263a.mo5693b(AbstractC13881O1.class), new InterfaceC3756d[0], new KSerializer[0], new Annotation[0]);
            case 1:
                return C17690x.f56481Y;
            default:
                return C17690x.f56481Y;
        }
    }
}
