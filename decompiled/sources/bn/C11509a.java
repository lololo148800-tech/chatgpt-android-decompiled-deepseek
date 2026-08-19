package bn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: bn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C11509a implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C11509a f34827Z = new C11509a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C11509a f34828o0 = new C11509a(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34829Y;

    public /* synthetic */ C11509a(int i10) {
        this.f34829Y = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        AnnotationsContainerWithConstants loadConstantFromProperty = (AnnotationsContainerWithConstants) obj;
        MemberSignature it = (MemberSignature) obj2;
        switch (this.f34829Y) {
            case 0:
                int i10 = AbstractBinaryClassAnnotationAndConstantLoader.f52009c;
                AbstractC16544l.m18094g(loadConstantFromProperty, "$this$loadConstantFromProperty");
                AbstractC16544l.m18094g(it, "it");
                return loadConstantFromProperty.getAnnotationParametersDefaultValues().get(it);
            default:
                int i11 = AbstractBinaryClassAnnotationAndConstantLoader.f52009c;
                AbstractC16544l.m18094g(loadConstantFromProperty, "$this$loadConstantFromProperty");
                AbstractC16544l.m18094g(it, "it");
                return loadConstantFromProperty.getPropertyConstants().get(it);
        }
    }
}
