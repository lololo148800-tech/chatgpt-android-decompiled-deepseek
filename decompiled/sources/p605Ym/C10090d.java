package p605Ym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Ym.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10090d implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29872Y = 1;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaResolverContext f29873Z;

    /* JADX INFO: renamed from: o0 */
    public final LazyJavaClassMemberScope f29874o0;

    public C10090d(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f29873Z = lazyJavaResolverContext;
        this.f29874o0 = lazyJavaClassMemberScope;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        JavaClassConstructorDescriptor javaClassConstructorDescriptor;
        List<ValueParameterDescriptor> listEmptyList;
        C17309l c17309l;
        LazyJavaResolverContext lazyJavaResolverContext = this.f29873Z;
        switch (this.f29872Y) {
            case 0:
                LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f29874o0;
                Collection<JavaConstructor> constructors = lazyJavaClassMemberScope.f51911n.getConstructors();
                ArrayList arrayList = new ArrayList(constructors.size());
                Iterator<JavaConstructor> it = constructors.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    boolean z6 = false;
                    LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaClassMemberScope.f51934a;
                    ClassDescriptor classDescriptor = lazyJavaClassMemberScope.f51910m;
                    if (!zHasNext) {
                        JavaClass javaClass = lazyJavaClassMemberScope.f51911n;
                        if (javaClass.isRecord()) {
                            JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass));
                            AbstractC16544l.m18093f(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
                            Collection<JavaRecordComponent> recordComponents = javaClass.getRecordComponents();
                            ArrayList arrayList2 = new ArrayList(recordComponents.size());
                            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
                            Iterator it2 = recordComponents.iterator();
                            int i10 = 0;
                            while (it2.hasNext()) {
                                int i11 = i10 + 1;
                                JavaRecordComponent javaRecordComponent = (JavaRecordComponent) it2.next();
                                KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
                                arrayList2.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptorCreateJavaConstructor, null, i10, Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), kotlinTypeTransformJavaType, false, false, false, javaRecordComponent.isVararg() ? lazyJavaResolverContext2.getComponents().getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformJavaType) : null, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaRecordComponent)));
                                i10 = i11;
                                it2 = it2;
                                z6 = false;
                            }
                            javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(z6);
                            DescriptorVisibility PROTECTED_AND_PACKAGE = classDescriptor.getVisibility();
                            AbstractC16544l.m18093f(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                            if (PROTECTED_AND_PACKAGE.equals(JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                                PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                                AbstractC16544l.m18093f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                            }
                            javaClassConstructorDescriptorCreateJavaConstructor.initialize(arrayList2, PROTECTED_AND_PACKAGE);
                            boolean z10 = false;
                            javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
                            javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(classDescriptor.getDefaultType());
                            Object obj = null;
                            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(javaClassConstructorDescriptorCreateJavaConstructor, false, false, 2, null);
                            if (arrayList.isEmpty()) {
                                arrayList.add(javaClassConstructorDescriptorCreateJavaConstructor);
                                lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(javaClass, javaClassConstructorDescriptorCreateJavaConstructor);
                            } else {
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        arrayList.add(javaClassConstructorDescriptorCreateJavaConstructor);
                                        lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(javaClass, javaClassConstructorDescriptorCreateJavaConstructor);
                                    } else if (!AbstractC16544l.m18089b(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it3.next(), z10, z10, 2, obj), strComputeJvmDescriptor$default)) {
                                        z10 = false;
                                        obj = null;
                                    }
                                }
                            }
                        }
                        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(classDescriptor, arrayList, lazyJavaResolverContext);
                        SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.getComponents().getSignatureEnhancement();
                        boolean zIsEmpty = arrayList.isEmpty();
                        List listM19383l = arrayList;
                        if (zIsEmpty) {
                            boolean zIsAnnotationType = javaClass.isAnnotationType();
                            if ((javaClass.isInterface() || !javaClass.hasDefaultConstructor()) && !zIsAnnotationType) {
                                javaClassConstructorDescriptor = null;
                            } else {
                                JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor2 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass));
                                AbstractC16544l.m18093f(javaClassConstructorDescriptorCreateJavaConstructor2, "createJavaConstructor(...)");
                                if (zIsAnnotationType) {
                                    Collection<JavaMethod> methods = javaClass.getMethods();
                                    ArrayList arrayList3 = new ArrayList(methods.size());
                                    JavaTypeAttributes attributes$default2 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList<JavaMethod> arrayList5 = new ArrayList();
                                    Iterator it4 = methods.iterator();
                                    while (it4.hasNext()) {
                                        Object next = it4.next();
                                        Iterator it5 = it4;
                                        if (AbstractC16544l.m18089b(((JavaMethod) next).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                                            arrayList4.add(next);
                                        } else {
                                            arrayList5.add(next);
                                        }
                                        it4 = it5;
                                    }
                                    arrayList4.size();
                                    JavaMethod javaMethod = (JavaMethod) AbstractC17680n.m19343S(arrayList4);
                                    if (javaMethod != null) {
                                        JavaType returnType = javaMethod.getReturnType();
                                        if (returnType instanceof JavaArrayType) {
                                            JavaArrayType javaArrayType = (JavaArrayType) returnType;
                                            c17309l = new C17309l(lazyJavaResolverContext2.getTypeResolver().transformArrayType(javaArrayType, attributes$default2, true), lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default2));
                                        } else {
                                            c17309l = new C17309l(lazyJavaResolverContext2.getTypeResolver().transformJavaType(returnType, attributes$default2), null);
                                        }
                                        lazyJavaClassMemberScope.m18205l(arrayList3, javaClassConstructorDescriptorCreateJavaConstructor2, 0, javaMethod, (KotlinType) c17309l.f55136Y, (KotlinType) c17309l.f55137Z);
                                    }
                                    int i12 = javaMethod != null ? 1 : 0;
                                    int i13 = 0;
                                    for (JavaMethod javaMethod2 : arrayList5) {
                                        JavaTypeAttributes javaTypeAttributes = attributes$default2;
                                        lazyJavaClassMemberScope.m18205l(arrayList3, javaClassConstructorDescriptorCreateJavaConstructor2, i13 + i12, javaMethod2, lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaMethod2.getReturnType(), javaTypeAttributes), null);
                                        i13++;
                                        attributes$default2 = javaTypeAttributes;
                                    }
                                    listEmptyList = arrayList3;
                                } else {
                                    listEmptyList = Collections.emptyList();
                                }
                                javaClassConstructorDescriptorCreateJavaConstructor2.setHasSynthesizedParameterNames(false);
                                DescriptorVisibility PROTECTED_AND_PACKAGE2 = classDescriptor.getVisibility();
                                AbstractC16544l.m18093f(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                                if (PROTECTED_AND_PACKAGE2.equals(JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                                    PROTECTED_AND_PACKAGE2 = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                                    AbstractC16544l.m18093f(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                                }
                                javaClassConstructorDescriptorCreateJavaConstructor2.initialize(listEmptyList, PROTECTED_AND_PACKAGE2);
                                javaClassConstructorDescriptorCreateJavaConstructor2.setHasStableParameterNames(true);
                                javaClassConstructorDescriptorCreateJavaConstructor2.setReturnType(classDescriptor.getDefaultType());
                                lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordConstructor(javaClass, javaClassConstructorDescriptorCreateJavaConstructor2);
                                javaClassConstructorDescriptor = javaClassConstructorDescriptorCreateJavaConstructor2;
                            }
                            listM19383l = AbstractC17681o.m19383l(javaClassConstructorDescriptor);
                        }
                        return AbstractC17680n.m19322C0(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, listM19383l));
                    }
                    JavaConstructor next2 = it.next();
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor3 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, next2), false, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(next2));
                    AbstractC16544l.m18093f(javaClassConstructorDescriptorCreateJavaConstructor3, "createJavaConstructor(...)");
                    LazyJavaResolverContext lazyJavaResolverContextChildForMethod = ContextKt.childForMethod(lazyJavaResolverContext2, javaClassConstructorDescriptorCreateJavaConstructor3, next2, classDescriptor.getDeclaredTypeParameters().size());
                    LazyJavaScope.ResolvedValueParameters resolvedValueParametersM18217k = LazyJavaScope.m18217k(lazyJavaResolverContextChildForMethod, javaClassConstructorDescriptorCreateJavaConstructor3, next2.getValueParameters());
                    List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
                    AbstractC16544l.m18093f(declaredTypeParameters, "getDeclaredTypeParameters(...)");
                    List<TypeParameterDescriptor> list = declaredTypeParameters;
                    List<JavaTypeParameter> typeParameters = next2.getTypeParameters();
                    ArrayList arrayList6 = new ArrayList(AbstractC17682p.m19389r(typeParameters, 10));
                    Iterator<T> it6 = typeParameters.iterator();
                    while (it6.hasNext()) {
                        TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it6.next());
                        AbstractC16544l.m18091d(typeParameterDescriptorResolveTypeParameter);
                        arrayList6.add(typeParameterDescriptorResolveTypeParameter);
                    }
                    javaClassConstructorDescriptorCreateJavaConstructor3.initialize(resolvedValueParametersM18217k.getDescriptors(), UtilsKt.toDescriptorVisibility(next2.getVisibility()), AbstractC17680n.m19361k0(arrayList6, list));
                    javaClassConstructorDescriptorCreateJavaConstructor3.setHasStableParameterNames(false);
                    javaClassConstructorDescriptorCreateJavaConstructor3.setHasSynthesizedParameterNames(resolvedValueParametersM18217k.getHasSynthesizedNames());
                    javaClassConstructorDescriptorCreateJavaConstructor3.setReturnType(classDescriptor.getDefaultType());
                    lazyJavaResolverContextChildForMethod.getComponents().getJavaResolverCache().recordConstructor(next2, javaClassConstructorDescriptorCreateJavaConstructor3);
                    arrayList.add(javaClassConstructorDescriptorCreateJavaConstructor3);
                }
                break;
            default:
                int i14 = LazyJavaClassMemberScope.f51909u;
                return AbstractC17680n.m19328G0(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(this.f29874o0.f51910m, lazyJavaResolverContext));
        }
    }

    public C10090d(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f29874o0 = lazyJavaClassMemberScope;
        this.f29873Z = lazyJavaResolverContext;
    }
}
