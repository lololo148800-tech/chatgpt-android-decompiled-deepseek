package p605Ym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ym.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C10098l implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29895Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaScope f29896Z;

    public /* synthetic */ C10098l(LazyJavaScope lazyJavaScope, int i10) {
        this.f29895Y = i10;
        this.f29896Z = lazyJavaScope;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        PropertyDescriptor propertyDescriptor = null;
        propertyDescriptor = null;
        int i10 = 0;
        LazyJavaScope lazyJavaScope = this.f29896Z;
        Name name = (Name) obj;
        switch (this.f29895Y) {
            case 0:
                InterfaceC3776x[] interfaceC3776xArr = LazyJavaScope.f51933l;
                AbstractC16544l.m18094g(name, "name");
                LazyJavaScope lazyJavaScope2 = lazyJavaScope.f51935b;
                if (lazyJavaScope2 != null) {
                    return (Collection) lazyJavaScope2.f51938e.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope.f51937d.invoke()).findMethodsByName(name)) {
                    JavaMethodDescriptor javaMethodDescriptorM18218j = lazyJavaScope.m18218j(javaMethod);
                    if (lazyJavaScope.mo18203h(javaMethodDescriptorM18218j)) {
                        lazyJavaScope.f51934a.getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorM18218j);
                        arrayList.add(javaMethodDescriptorM18218j);
                    }
                }
                lazyJavaScope.mo18198b(name, arrayList);
                return arrayList;
            case 1:
                InterfaceC3776x[] interfaceC3776xArr2 = LazyJavaScope.f51933l;
                AbstractC16544l.m18094g(name, "name");
                LazyJavaScope lazyJavaScope3 = lazyJavaScope.f51935b;
                if (lazyJavaScope3 != null) {
                    return (PropertyDescriptor) lazyJavaScope3.f51939f.invoke(name);
                }
                JavaField javaFieldFindFieldByName = ((DeclaredMemberIndex) lazyJavaScope.f51937d.invoke()).findFieldByName(name);
                if (javaFieldFindFieldByName != null && !javaFieldFindFieldByName.isEnumEntry()) {
                    C16525B c16525b = new C16525B();
                    boolean z6 = !javaFieldFindFieldByName.isFinal();
                    LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.f51934a;
                    JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(lazyJavaScope.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaFieldFindFieldByName), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaFieldFindFieldByName.getVisibility()), z6, javaFieldFindFieldByName.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaFieldFindFieldByName), javaFieldFindFieldByName.isFinal() && javaFieldFindFieldByName.isStatic());
                    AbstractC16544l.m18093f(javaPropertyDescriptorCreate, "create(...)");
                    c16525b.f51262Y = javaPropertyDescriptorCreate;
                    javaPropertyDescriptorCreate.initialize(null, null, null, null);
                    KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaFieldFindFieldByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                    if ((KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) || KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) && javaFieldFindFieldByName.isFinal() && javaFieldFindFieldByName.isStatic() && javaFieldFindFieldByName.getHasConstantNotNullInitializer()) {
                        kotlinTypeTransformJavaType = TypeUtils.makeNotNullable(kotlinTypeTransformJavaType);
                        AbstractC16544l.m18093f(kotlinTypeTransformJavaType, "makeNotNullable(...)");
                    }
                    PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) c16525b.f51262Y;
                    C17689w c17689w = C17689w.f56480Y;
                    propertyDescriptorImpl.setType(kotlinTypeTransformJavaType, c17689w, lazyJavaScope.mo18202g(), null, c17689w);
                    DeclarationDescriptor ownerDescriptor = lazyJavaScope.getOwnerDescriptor();
                    ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
                    if (classDescriptor != null) {
                        c16525b.f51262Y = lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) c16525b.f51262Y, lazyJavaResolverContext);
                    }
                    Object obj2 = c16525b.f51262Y;
                    if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj2, ((PropertyDescriptorImpl) obj2).getType())) {
                        ((PropertyDescriptorImpl) c16525b.f51262Y).setCompileTimeInitializerFactory(new C10097k(lazyJavaScope, javaFieldFindFieldByName, c16525b, i10));
                    }
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordField(javaFieldFindFieldByName, (PropertyDescriptor) c16525b.f51262Y);
                    propertyDescriptor = (PropertyDescriptor) c16525b.f51262Y;
                }
                return propertyDescriptor;
            case 2:
                InterfaceC3776x[] interfaceC3776xArr3 = LazyJavaScope.f51933l;
                AbstractC16544l.m18094g(name, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) lazyJavaScope.f51938e.invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : linkedHashSet) {
                    String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj3, false, false, 2, null);
                    Object arrayList2 = linkedHashMap.get(strComputeJvmDescriptor$default);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strComputeJvmDescriptor$default, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionSelectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, C10092f.f29878o0);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionSelectMostSpecificInEachOverridableGroup);
                    }
                }
                lazyJavaScope.mo18199d(linkedHashSet, name);
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope.f51934a;
                return AbstractC17680n.m19322C0(lazyJavaResolverContext2.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext2, linkedHashSet));
            default:
                InterfaceC3776x[] interfaceC3776xArr4 = LazyJavaScope.f51933l;
                AbstractC16544l.m18094g(name, "name");
                ArrayList arrayList3 = new ArrayList();
                CollectionsKt.addIfNotNull(arrayList3, lazyJavaScope.f51939f.invoke(name));
                lazyJavaScope.mo18200e(name, arrayList3);
                if (DescriptorUtils.isAnnotationClass(lazyJavaScope.getOwnerDescriptor())) {
                    return AbstractC17680n.m19322C0(arrayList3);
                }
                LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaScope.f51934a;
                return AbstractC17680n.m19322C0(lazyJavaResolverContext3.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext3, arrayList3));
        }
    }
}
