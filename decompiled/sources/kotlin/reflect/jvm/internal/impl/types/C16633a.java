package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;
import p049Bm.InterfaceC1436k;
import pn.C18522i;
import pn.C18523j;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16633a extends SimpleType {

    /* JADX INFO: renamed from: Z */
    public final TypeConstructor f53221Z;

    /* JADX INFO: renamed from: o0 */
    public final List f53222o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f53223p0;

    /* JADX INFO: renamed from: q0 */
    public final MemberScope f53224q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC1436k f53225r0;

    public C16633a(TypeConstructor constructor, List arguments, boolean z6, MemberScope memberScope, InterfaceC1436k refinedTypeFactory) {
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(memberScope, "memberScope");
        AbstractC16544l.m18094g(refinedTypeFactory, "refinedTypeFactory");
        this.f53221Z = constructor;
        this.f53222o0 = arguments;
        this.f53223p0 = z6;
        this.f53224q0 = memberScope;
        this.f53225r0 = refinedTypeFactory;
        if (!(memberScope instanceof ErrorScope) || (memberScope instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List getArguments() {
        return this.f53222o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor getConstructor() {
        return this.f53221Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope getMemberScope() {
        return this.f53224q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.f53223p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final SimpleType makeNullableAsSpecified(boolean z6) {
        if (z6 == this.f53223p0) {
            return this;
        }
        return z6 ? new C18522i(this, 1) : new C18522i(this, 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleType = (SimpleType) this.f53225r0.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C18523j(this, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleType = (SimpleType) this.f53225r0.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }
}
