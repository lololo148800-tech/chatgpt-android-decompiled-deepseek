package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p225Im.InterfaceC3776x;
import p298Lm.C5150L;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC3776x[] f51800f = {AbstractC16526C.f51263a.mo5699h(new C16553u(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    public final FqName f51801a;

    /* JADX INFO: renamed from: b */
    public final SourceElement f51802b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f51803c;

    /* JADX INFO: renamed from: d */
    public final JavaAnnotationArgument f51804d;

    /* JADX INFO: renamed from: e */
    public final boolean f51805e;

    public JavaAnnotationDescriptor(LazyJavaResolverContext c9, JavaAnnotation javaAnnotation, FqName fqName) {
        SourceElement NO_SOURCE;
        Collection<JavaAnnotationArgument> arguments;
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(fqName, "fqName");
        this.f51801a = fqName;
        if (javaAnnotation == null || (NO_SOURCE = c9.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            NO_SOURCE = SourceElement.NO_SOURCE;
            AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
        }
        this.f51802b = NO_SOURCE;
        this.f51803c = c9.getStorageManager().createLazyValue(new C5150L(c9, 10, this));
        this.f51804d = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (JavaAnnotationArgument) AbstractC17680n.m19342R(arguments);
        boolean z6 = false;
        if (javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation()) {
            z6 = true;
        }
        this.f51805e = z6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return C17690x.f56481Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.f51801a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        return this.f51802b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.f51805e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.f51803c, this, f51800f[0]);
    }
}
