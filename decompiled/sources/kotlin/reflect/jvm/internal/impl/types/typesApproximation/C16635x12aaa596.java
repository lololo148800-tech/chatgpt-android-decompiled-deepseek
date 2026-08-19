package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C16635x12aaa596 extends TypeConstructorSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    public TypeProjection get(TypeConstructor key) {
        AbstractC16544l.m18094g(key, "key");
        CapturedTypeConstructor capturedTypeConstructor = key instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) key : null;
        if (capturedTypeConstructor == null) {
            return null;
        }
        return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
    }
}
