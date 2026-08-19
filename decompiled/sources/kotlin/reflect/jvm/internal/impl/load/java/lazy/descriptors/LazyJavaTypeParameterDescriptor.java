package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: w0 */
    public final LazyJavaResolverContext f51959w0;

    /* JADX INFO: renamed from: x0 */
    public final JavaTypeParameter f51960x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext c9, JavaTypeParameter javaTypeParameter, int i10, DeclarationDescriptor containingDeclaration) {
        super(c9.getStorageManager(), containingDeclaration, new LazyJavaAnnotations(c9, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i10, SourceElement.NO_SOURCE, c9.getComponents().getSupertypeLoopChecker());
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(javaTypeParameter, "javaTypeParameter");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        this.f51959w0 = c9;
        this.f51960x0 = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: b */
    public final List mo18134b(List list) {
        LazyJavaResolverContext lazyJavaResolverContext = this.f51959w0;
        return lazyJavaResolverContext.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, list, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: c */
    public final List mo18135c() {
        Collection<JavaClassifierType> upperBounds = this.f51960x0.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.f51959w0;
        if (zIsEmpty) {
            SimpleType anyType = lazyJavaResolverContext.getModule().getBuiltIns().getAnyType();
            AbstractC16544l.m18093f(anyType, "getAnyType(...)");
            SimpleType nullableAnyType = lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType();
            AbstractC16544l.m18093f(nullableAnyType, "getNullableAnyType(...)");
            return AbstractC9393x3.m9974d(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaResolverContext.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void reportSupertypeLoopError(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
    }
}
