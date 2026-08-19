package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p605Ym.C10087a;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC3776x[] f51884i;

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f51885a;

    /* JADX INFO: renamed from: b */
    public final JavaAnnotation f51886b;

    /* JADX INFO: renamed from: c */
    public final NullableLazyValue f51887c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f51888d;

    /* JADX INFO: renamed from: e */
    public final JavaSourceElement f51889e;

    /* JADX INFO: renamed from: f */
    public final NotNullLazyValue f51890f;

    /* JADX INFO: renamed from: g */
    public final boolean f51891g;

    /* JADX INFO: renamed from: h */
    public final boolean f51892h;

    static {
        C16553u c16553u = new C16553u(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f51884i = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, c16527d), AbstractC3794B0.m4493r(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, c16527d)};
    }

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext c9, JavaAnnotation javaAnnotation, boolean z6) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(javaAnnotation, "javaAnnotation");
        this.f51885a = c9;
        this.f51886b = javaAnnotation;
        this.f51887c = c9.getStorageManager().createNullableLazyValue(new C10087a(this, 0));
        this.f51888d = c9.getStorageManager().createLazyValue(new C10087a(this, 1));
        this.f51889e = c9.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.f51890f = c9.getStorageManager().createLazyValue(new C10087a(this, 2));
        this.f51891g = javaAnnotation.isIdeExternalAnnotation();
        this.f51892h = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z6;
    }

    /* JADX INFO: renamed from: a */
    public final ConstantValue m18187a(JavaAnnotationArgument javaAnnotationArgument) {
        KotlinType arrayType;
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            ClassId enumClassId = javaEnumValueAnnotationArgument.getEnumClassId();
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            if (enumClassId == null || entryName == null) {
                return null;
            }
            return new EnumValue(enumClassId, entryName);
        }
        boolean z6 = javaAnnotationArgument instanceof JavaArrayAnnotationArgument;
        LazyJavaResolverContext lazyJavaResolverContext = this.f51885a;
        if (!z6) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f51885a, ((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation(), false, 4, null));
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return KClassValue.Companion.create(lazyJavaResolverContext.getTypeResolver().transformJavaType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
        }
        AbstractC16544l.m18091d(name);
        List<JavaAnnotationArgument> elements = javaArrayAnnotationArgument.getElements();
        if (KotlinTypeKt.isError(getType())) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        AbstractC16544l.m18091d(annotationClass);
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = lazyJavaResolverContext.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            AbstractC16544l.m18093f(arrayType, "getArrayType(...)");
        }
        List<JavaAnnotationArgument> list = elements;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueM18187a = m18187a((JavaAnnotationArgument) it.next());
            if (constantValueM18187a == null) {
                constantValueM18187a = new NullValue();
            }
            arrayList.add(constantValueM18187a);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f51890f, this, f51884i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.f51887c, this, f51884i[0]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.f51892h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.f51891g;
    }

    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public JavaSourceElement getSource() {
        return this.f51889e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.f51888d, this, f51884i[1]);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i10 & 4) != 0 ? false : z6);
    }
}
