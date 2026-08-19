package pn;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import mm.EnumC17307j;
import p298Lm.C5150L;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: pn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C18518e implements TypeConstructor {

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f59009a;

    /* JADX INFO: renamed from: b */
    public final Object f59010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractTypeConstructor f59011c;

    public C18518e(AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f59011c = abstractTypeConstructor;
        this.f59009a = kotlinTypeRefiner;
        this.f59010b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5150L(this, 17, abstractTypeConstructor));
    }

    public final boolean equals(Object obj) {
        return this.f59011c.equals(obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.f59011c.getBuiltIns();
        AbstractC16544l.m18093f(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return this.f59011c.mo22589getDeclarationDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List<TypeParameterDescriptor> parameters = this.f59011c.getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        return parameters;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection getSupertypes() {
        return (List) this.f59010b.getValue();
    }

    public final int hashCode() {
        return this.f59011c.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return this.f59011c.isDenotable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f59011c.refine(kotlinTypeRefiner);
    }

    public final String toString() {
        return this.f59011c.toString();
    }
}
