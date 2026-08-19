package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: Z */
    public final CaptureStatus f53229Z;

    /* JADX INFO: renamed from: o0 */
    public final NewCapturedTypeConstructor f53230o0;

    /* JADX INFO: renamed from: p0 */
    public final UnwrappedType f53231p0;

    /* JADX INFO: renamed from: q0 */
    public final TypeAttributes f53232q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f53233r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f53234s0;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i10 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes, (i10 & 16) != 0 ? false : z6, (i10 & 32) != 0 ? false : z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.f53232q0;
    }

    public final CaptureStatus getCaptureStatus() {
        return this.f53229Z;
    }

    public final UnwrappedType getLowerType() {
        return this.f53231p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f53233r0;
    }

    public final boolean isProjectionNotNull() {
        return this.f53234s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedTypeConstructor getConstructor() {
        return this.f53230o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return new NewCapturedType(this.f53229Z, getConstructor(), this.f53231p0, newAttributes, isMarkedNullable(), this.f53234s0);
    }

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(captureStatus, "captureStatus");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(attributes, "attributes");
        this.f53229Z = captureStatus;
        this.f53230o0 = constructor;
        this.f53231p0 = unwrappedType;
        this.f53232q0 = attributes;
        this.f53233r0 = z6;
        this.f53234s0 = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public NewCapturedType makeNullableAsSpecified(boolean z6) {
        return new NewCapturedType(this.f53229Z, getConstructor(), this.f53231p0, getAttributes(), z6, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        NewCapturedTypeConstructor newCapturedTypeConstructorRefine = getConstructor().refine(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f53231p0;
        return new NewCapturedType(this.f53229Z, newCapturedTypeConstructorRefine, unwrappedType != null ? kotlinTypeRefiner.refineType((KotlinTypeMarker) unwrappedType).unwrap() : null, getAttributes(), isMarkedNullable(), false, 32, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NewCapturedType(CaptureStatus captureStatus, UnwrappedType unwrappedType, TypeProjection projection, TypeParameterDescriptor typeParameter) {
        AbstractC16544l.m18094g(captureStatus, "captureStatus");
        AbstractC16544l.m18094g(projection, "projection");
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        TypeAttributes typeAttributes = null;
        boolean z6 = false;
        boolean z10 = false;
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), unwrappedType, typeAttributes, z6, z10, 56, null);
    }
}
