package p605Ym;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: Ym.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10087a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29866Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaAnnotationDescriptor f29867Z;

    public /* synthetic */ C10087a(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor, int i10) {
        this.f29866Y = i10;
        this.f29867Z = lazyJavaAnnotationDescriptor;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f29867Z;
        switch (this.f29866Y) {
            case 0:
                ClassId classId = lazyJavaAnnotationDescriptor.f51886b.getClassId();
                if (classId != null) {
                    return classId.asSingleFqName();
                }
                return null;
            case 1:
                InterfaceC3776x[] interfaceC3776xArr = LazyJavaAnnotationDescriptor.f51884i;
                FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
                JavaAnnotation javaAnnotation = lazyJavaAnnotationDescriptor.f51886b;
                if (fqName == null) {
                    return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation.toString());
                }
                JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotationDescriptor.f51885a;
                ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, lazyJavaResolverContext.getModule().getBuiltIns(), null, 4, null);
                if (classDescriptorMapJavaToKotlin$default == null) {
                    JavaClass javaClassResolve = javaAnnotation.resolve();
                    ClassDescriptor classDescriptorResolveClass = javaClassResolve != null ? lazyJavaResolverContext.getComponents().getModuleClassResolver().resolveClass(javaClassResolve) : null;
                    classDescriptorMapJavaToKotlin$default = classDescriptorResolveClass == null ? FindClassInModuleKt.findNonGenericClassAcrossDependencies(lazyJavaResolverContext.getModule(), ClassId.Companion.topLevel(fqName), lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses()) : classDescriptorResolveClass;
                }
                return classDescriptorMapJavaToKotlin$default.getDefaultType();
            default:
                Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.f51886b.getArguments();
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                    Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                    }
                    ConstantValue constantValueM18187a = lazyJavaAnnotationDescriptor.m18187a(javaAnnotationArgument);
                    C17309l c17309l = constantValueM18187a != null ? new C17309l(name, constantValueM18187a) : null;
                    if (c17309l != null) {
                        arrayList.add(c17309l);
                    }
                }
                return AbstractC17659D.m19253o(arrayList);
        }
    }
}
