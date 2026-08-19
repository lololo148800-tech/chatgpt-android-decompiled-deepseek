package p511Um;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Um.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7722a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7722a f24338Z = new C7722a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C7722a f24339o0 = new C7722a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C7722a f24340p0 = new C7722a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C7722a f24341q0 = new C7722a(3);

    /* JADX INFO: renamed from: r0 */
    public static final C7722a f24342r0 = new C7722a(4);

    /* JADX INFO: renamed from: s0 */
    public static final C7722a f24343s0 = new C7722a(5);

    /* JADX INFO: renamed from: t0 */
    public static final C7722a f24344t0 = new C7722a(6);

    /* JADX INFO: renamed from: u0 */
    public static final C7722a f24345u0 = new C7722a(7);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24346Y;

    public /* synthetic */ C7722a(int i10) {
        this.f24346Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object extractNullability) {
        boolean z6 = false;
        switch (this.f24346Y) {
            case 0:
                LinkedHashMap linkedHashMap = AbstractAnnotationTypeQualifierResolver.f51716c;
                AbstractC16544l.m18094g(extractNullability, "$this$extractNullability");
                return Boolean.FALSE;
            case 1:
                CallableMemberDescriptor it = (CallableMemberDescriptor) extractNullability;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                AbstractC16544l.m18094g(it, "it");
                BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getClass();
                return Boolean.valueOf(AbstractC17680n.m19333J(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(it)));
            case 2:
                CallableMemberDescriptor it2 = (CallableMemberDescriptor) extractNullability;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature2 = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                AbstractC16544l.m18094g(it2, "it");
                if (it2 instanceof FunctionDescriptor) {
                    BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getClass();
                    if (AbstractC17680n.m19333J(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(it2))) {
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
            case 3:
                CallableMemberDescriptor it3 = (CallableMemberDescriptor) extractNullability;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(it3));
            case 4:
                return ((ValueParameterDescriptor) extractNullability).getType();
            case 5:
                CallableMemberDescriptor it4 = (CallableMemberDescriptor) extractNullability;
                AbstractC16544l.m18094g(it4, "it");
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(DescriptorUtilsKt.getPropertyIfAccessor(it4)));
            case 6:
                CallableMemberDescriptor it5 = (CallableMemberDescriptor) extractNullability;
                AbstractC16544l.m18094g(it5, "it");
                return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((SimpleFunctionDescriptor) it5));
            default:
                CallableMemberDescriptor it6 = (CallableMemberDescriptor) extractNullability;
                AbstractC16544l.m18094g(it6, "it");
                if (KotlinBuiltIns.isBuiltIn(it6) && BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(it6) != null) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
        }
    }
}
