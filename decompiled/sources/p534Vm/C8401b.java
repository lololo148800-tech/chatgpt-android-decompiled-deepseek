package p534Vm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Vm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8401b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C8401b f26129Y = new C8401b();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        KotlinType type;
        ModuleDescriptor module = (ModuleDescriptor) obj;
        JavaAnnotationTargetMapper javaAnnotationTargetMapper = JavaAnnotationTargetMapper.INSTANCE;
        AbstractC16544l.m18094g(module, "module");
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), module.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
        return (annotationParameterByName == null || (type = annotationParameterByName.getType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
