package p388Pm;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: Pm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6507a implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: Y */
    public final TypeParameterDescriptor f21107Y;

    /* JADX INFO: renamed from: Z */
    public final ClassifierDescriptorWithTypeParameters f21108Z;

    /* JADX INFO: renamed from: o0 */
    public final int f21109o0;

    public C6507a(TypeParameterDescriptor typeParameterDescriptor, ClassifierDescriptorWithTypeParameters declarationDescriptor, int i10) {
        AbstractC16544l.m18094g(declarationDescriptor, "declarationDescriptor");
        this.f21107Y = typeParameterDescriptor;
        this.f21108Z = declarationDescriptor;
        this.f21109o0 = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return this.f21107Y.accept(declarationDescriptorVisitor, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.f21107Y.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.f21108Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType getDefaultType() {
        SimpleType defaultType = this.f21107Y.getDefaultType();
        AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int getIndex() {
        return this.f21107Y.getIndex() + this.f21109o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.f21107Y.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement getSource() {
        SourceElement source = this.f21107Y.getSource();
        AbstractC16544l.m18093f(source, "getSource(...)");
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager getStorageManager() {
        StorageManager storageManager = this.f21107Y.getStorageManager();
        AbstractC16544l.m18093f(storageManager, "getStorageManager(...)");
        return storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.f21107Y.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        List<KotlinType> upperBounds = this.f21107Y.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance getVariance() {
        Variance variance = this.f21107Y.getVariance();
        AbstractC16544l.m18093f(variance, "getVariance(...)");
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isReified() {
        return this.f21107Y.isReified();
    }

    public final String toString() {
        return this.f21107Y + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor original = this.f21107Y.getOriginal();
        AbstractC16544l.m18093f(original, "getOriginal(...)");
        return original;
    }
}
