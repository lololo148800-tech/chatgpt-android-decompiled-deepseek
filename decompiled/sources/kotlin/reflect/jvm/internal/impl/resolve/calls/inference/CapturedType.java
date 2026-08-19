package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: Z */
    public final TypeProjection f52868Z;

    /* JADX INFO: renamed from: o0 */
    public final CapturedTypeConstructor f52869o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f52870p0;

    /* JADX INFO: renamed from: q0 */
    public final TypeAttributes f52871q0;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z6, TypeAttributes typeAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.f52871q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f52870p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f52868Z);
        sb2.append(')');
        sb2.append(isMarkedNullable() ? Separators.QUESTION : "");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedTypeConstructor getConstructor() {
        return this.f52869o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return new CapturedType(this.f52868Z, getConstructor(), isMarkedNullable(), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public CapturedType makeNullableAsSpecified(boolean z6) {
        if (z6 == isMarkedNullable()) {
            return this;
        }
        return new CapturedType(this.f52868Z, getConstructor(), z6, getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = this.f52868Z.refine(kotlinTypeRefiner);
        AbstractC16544l.m18093f(typeProjectionRefine, "refine(...)");
        return new CapturedType(typeProjectionRefine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructor constructor, boolean z6, TypeAttributes attributes) {
        AbstractC16544l.m18094g(typeProjection, "typeProjection");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(attributes, "attributes");
        this.f52868Z = typeProjection;
        this.f52869o0 = constructor;
        this.f52870p0 = z6;
        this.f52871q0 = attributes;
    }
}
