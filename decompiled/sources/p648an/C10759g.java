package p648an;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: an.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10759g implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C10759g f31967Z = new C10759g(0);

    /* JADX INFO: renamed from: o0 */
    public static final C10759g f31968o0 = new C10759g(1);

    /* JADX INFO: renamed from: p0 */
    public static final C10759g f31969p0 = new C10759g(2);

    /* JADX INFO: renamed from: q0 */
    public static final C10759g f31970q0 = new C10759g(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31971Y;

    public /* synthetic */ C10759g(int i10) {
        this.f31971Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31971Y) {
            case 0:
                CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
                AbstractC16544l.m18094g(it, "it");
                ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
                AbstractC16544l.m18091d(extensionReceiverParameter);
                KotlinType type = extensionReceiverParameter.getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                return type;
            case 1:
                CallableMemberDescriptor it2 = (CallableMemberDescriptor) obj;
                AbstractC16544l.m18094g(it2, "it");
                KotlinType returnType = it2.getReturnType();
                AbstractC16544l.m18091d(returnType);
                return returnType;
            case 2:
                UnwrappedType it3 = (UnwrappedType) obj;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(it3 instanceof RawType);
            default:
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((UnwrappedType) obj).getConstructor().mo22589getDeclarationDescriptor();
                if (classifierDescriptorMo22589getDeclarationDescriptor == null) {
                    return Boolean.FALSE;
                }
                Name name = classifierDescriptorMo22589getDeclarationDescriptor.getName();
                JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                return Boolean.valueOf(AbstractC16544l.m18089b(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && AbstractC16544l.m18089b(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo22589getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
        }
    }
}
