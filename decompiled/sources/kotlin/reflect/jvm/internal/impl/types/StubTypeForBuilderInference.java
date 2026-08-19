package kotlin.reflect.jvm.internal.impl.types;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    /* JADX INFO: renamed from: q0 */
    public final TypeConstructor f53184q0;

    /* JADX INFO: renamed from: r0 */
    public final MemberScope f53185r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(NewTypeVariableConstructor originalTypeVariable, boolean z6, TypeConstructor constructor) {
        super(originalTypeVariable, z6);
        AbstractC16544l.m18094g(originalTypeVariable, "originalTypeVariable");
        AbstractC16544l.m18094g(constructor, "constructor");
        this.f53184q0 = constructor;
        this.f53185r0 = originalTypeVariable.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.f53184q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f53185r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    public AbstractStubType materialize(boolean z6) {
        return new StubTypeForBuilderInference(getOriginalTypeVariable(), z6, getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Stub (BI): ");
        sb2.append(getOriginalTypeVariable());
        sb2.append(isMarkedNullable() ? Separators.QUESTION : "");
        return sb2.toString();
    }
}
