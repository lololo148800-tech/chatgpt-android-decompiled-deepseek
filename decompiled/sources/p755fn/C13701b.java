package p755fn;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: fn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13701b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43246Y;

    /* JADX INFO: renamed from: Z */
    public final DescriptorRendererImpl f43247Z;

    public /* synthetic */ C13701b(DescriptorRendererImpl descriptorRendererImpl, int i10) {
        this.f43246Y = i10;
        this.f43247Z = descriptorRendererImpl;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        DescriptorRendererImpl descriptorRendererImpl = this.f43247Z;
        switch (this.f43246Y) {
            case 0:
                TypeProjection it = (TypeProjection) obj;
                int i10 = DescriptorRendererImpl.f52783c;
                AbstractC16544l.m18094g(it, "it");
                if (it.isStarProjection()) {
                    return Separators.STAR;
                }
                KotlinType type = it.getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                String strRenderType = descriptorRendererImpl.renderType(type);
                if (it.getProjectionKind() == Variance.INVARIANT) {
                    return strRenderType;
                }
                return it.getProjectionKind() + ' ' + strRenderType;
            default:
                KotlinType kotlinType = (KotlinType) obj;
                int i11 = DescriptorRendererImpl.f52783c;
                AbstractC16544l.m18091d(kotlinType);
                return descriptorRendererImpl.renderType(kotlinType);
        }
    }
}
