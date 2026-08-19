package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p077Cn.C1756x;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f51868a;

    /* JADX INFO: renamed from: b */
    public final DeclarationDescriptor f51869b;

    /* JADX INFO: renamed from: c */
    public final int f51870c;

    /* JADX INFO: renamed from: d */
    public final Map f51871d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNullable f51872e;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c9, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i10) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(typeParameterOwner, "typeParameterOwner");
        this.f51868a = c9;
        this.f51869b = containingDeclaration;
        this.f51870c = i10;
        this.f51871d = CollectionsKt.mapToIndex(typeParameterOwner.getTypeParameters());
        this.f51872e = c9.getStorageManager().createMemoizedFunctionWithNullableValues(new C1756x(this, 13));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
        AbstractC16544l.m18094g(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) this.f51872e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptor != null ? lazyJavaTypeParameterDescriptor : this.f51868a.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
