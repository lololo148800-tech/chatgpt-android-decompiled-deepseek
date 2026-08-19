package pn;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: pn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C18515b implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59002Y;

    /* JADX INFO: renamed from: Z */
    public final Object f59003Z;

    public /* synthetic */ C18515b(Object obj, int i10) {
        this.f59002Y = i10;
        this.f59003Z = obj;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object obj = this.f59003Z;
        switch (this.f59002Y) {
            case 0:
                return new C18519f(((AbstractTypeConstructor) obj).mo7319b());
            case 1:
                return StarProjectionImplKt.starProjectionType(((StarProjectionImpl) obj).f53181a);
            case 2:
                TypeParameterUpperBoundEraser.Companion companion = TypeParameterUpperBoundEraser.Companion;
                return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, ((TypeParameterUpperBoundEraser) obj).toString());
            default:
                InterfaceC1426a interfaceC1426a = ((NewCapturedTypeConstructor) obj).f53236b;
                if (interfaceC1426a != null) {
                    return (List) interfaceC1426a.invoke();
                }
                return null;
        }
    }
}
