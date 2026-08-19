package p298Lm;

import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p024Am.C0560a;
import p049Bm.InterfaceC1426a;
import p436Rm.C6937c;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Lm.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C5208w implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16922Y = 1;

    /* JADX INFO: renamed from: Z */
    public final Object f16923Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16924o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f16925p0;

    public C5208w(KotlinType kotlinType, C5214z c5214z, C5134D c5134d) {
        this.f16923Z = kotlinType;
        this.f16924o0 = c5214z;
        this.f16925p0 = c5134d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16922Y) {
            case 0:
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((KotlinType) this.f16923Z).getConstructor().mo22589getDeclarationDescriptor();
                if (!(classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor)) {
                    throw new C0560a("Supertype not a class: " + classifierDescriptorMo22589getDeclarationDescriptor);
                }
                Class clsM5723k = AbstractC5147J0.m5723k((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
                C5214z c5214z = (C5214z) this.f16924o0;
                if (clsM5723k == null) {
                    throw new C0560a("Unsupported superclass of " + c5214z + ": " + classifierDescriptorMo22589getDeclarationDescriptor);
                }
                C5134D c5134d = (C5134D) this.f16925p0;
                boolean zM18089b = AbstractC16544l.m18089b(c5134d.f16770Z.getSuperclass(), clsM5723k);
                Class cls = c5134d.f16770Z;
                if (zM18089b) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    AbstractC16544l.m18091d(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                AbstractC16544l.m18093f(interfaces, "getInterfaces(...)");
                int iM19279B = AbstractC17678l.m19279B(clsM5723k, interfaces);
                if (iM19279B >= 0) {
                    Type type = cls.getGenericInterfaces()[iM19279B];
                    AbstractC16544l.m18091d(type);
                    return type;
                }
                throw new C0560a("No superclass of " + c5214z + " in Java reflection for " + classifierDescriptorMo22589getDeclarationDescriptor);
            default:
                return new C6937c((AbstractTypeParameterDescriptor) this.f16925p0, (StorageManager) this.f16923Z, (SupertypeLoopChecker) this.f16924o0);
        }
    }

    public C5208w(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
        this.f16925p0 = abstractTypeParameterDescriptor;
        this.f16923Z = storageManager;
        this.f16924o0 = supertypeLoopChecker;
    }
}
