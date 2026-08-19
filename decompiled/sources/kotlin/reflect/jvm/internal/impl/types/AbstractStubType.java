package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractStubType extends SimpleType {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: Z */
    public final NewTypeVariableConstructor f53141Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f53142o0;

    /* JADX INFO: renamed from: p0 */
    public final ErrorScope f53143p0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AbstractStubType(NewTypeVariableConstructor originalTypeVariable, boolean z6) {
        AbstractC16544l.m18094g(originalTypeVariable, "originalTypeVariable");
        this.f53141Z = originalTypeVariable;
        this.f53142o0 = z6;
        this.f53143p0 = ErrorUtils.createErrorScope(ErrorScopeKind.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f53143p0;
    }

    public final NewTypeVariableConstructor getOriginalTypeVariable() {
        return this.f53141Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f53142o0;
    }

    public abstract AbstractStubType materialize(boolean z6);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public AbstractStubType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z6) {
        return z6 == isMarkedNullable() ? this : materialize(z6);
    }
}
