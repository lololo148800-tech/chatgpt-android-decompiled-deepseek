package p298Lm;

import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import mm.C17296C;
import p024Am.C0560a;
import p025An.C0644w;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3776x;
import p225Im.InterfaceC3778z;
import p523V9.AbstractC8138m0;
import p544W9.AbstractC8716t3;

/* JADX INFO: renamed from: Lm.A0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5129A0 implements InterfaceC3778z, InterfaceC5136E {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ InterfaceC3776x[] f16763p0 = {AbstractC16526C.f51263a.mo5699h(new C16553u(C5129A0.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: Y */
    public final TypeParameterDescriptor f16764Y;

    /* JADX INFO: renamed from: Z */
    public final C5135D0 f16765Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC5131B0 f16766o0;

    public C5129A0(InterfaceC5131B0 interfaceC5131B0, TypeParameterDescriptor descriptor) {
        Class<?> klass;
        C5134D c5134dM5680b;
        Object objAccept;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f16764Y = descriptor;
        this.f16765Z = AbstractC8716t3.m9425b(null, new C5140G(this, 4));
        if (interfaceC5131B0 == null) {
            DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
            if (containingDeclaration instanceof ClassDescriptor) {
                objAccept = m5680b((ClassDescriptor) containingDeclaration);
            } else {
                if (!(containingDeclaration instanceof CallableMemberDescriptor)) {
                    throw new C0560a("Unknown type parameter container: " + containingDeclaration);
                }
                DeclarationDescriptor containingDeclaration2 = ((CallableMemberDescriptor) containingDeclaration).getContainingDeclaration();
                AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
                if (containingDeclaration2 instanceof ClassDescriptor) {
                    c5134dM5680b = m5680b((ClassDescriptor) containingDeclaration2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = containingDeclaration instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) containingDeclaration : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new C0560a("Non-class callable descriptor must be deserialized: " + containingDeclaration);
                    }
                    DeserializedContainerSource containerSource = deserializedMemberDescriptor.getContainerSource();
                    JvmPackagePartSource jvmPackagePartSource = containerSource instanceof JvmPackagePartSource ? (JvmPackagePartSource) containerSource : null;
                    KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource != null ? jvmPackagePartSource.getKnownJvmBinaryClass() : null;
                    ReflectKotlinClass reflectKotlinClass = knownJvmBinaryClass instanceof ReflectKotlinClass ? (ReflectKotlinClass) knownJvmBinaryClass : null;
                    if (reflectKotlinClass == null || (klass = reflectKotlinClass.getKlass()) == null) {
                        throw new C0560a("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
                    }
                    c5134dM5680b = (C5134D) AbstractC8138m0.m8670e(klass);
                }
                objAccept = containingDeclaration.accept(new C5170d(c5134dM5680b), C17296C.f55119a);
            }
            interfaceC5131B0 = (InterfaceC5131B0) objAccept;
        }
        this.f16766o0 = interfaceC5131B0;
    }

    /* JADX INFO: renamed from: b */
    public static C5134D m5680b(ClassDescriptor classDescriptor) {
        Class clsM5723k = AbstractC5147J0.m5723k(classDescriptor);
        C5134D c5134d = (C5134D) (clsM5723k != null ? AbstractC8138m0.m8670e(clsM5723k) : null);
        if (c5134d != null) {
            return c5134d;
        }
        throw new C0560a("Type parameter container is not resolved: " + classDescriptor.getContainingDeclaration());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5129A0) {
            C5129A0 c5129a0 = (C5129A0) obj;
            if (AbstractC16544l.m18089b(this.f16766o0, c5129a0.f16766o0) && getName().equals(c5129a0.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // p298Lm.InterfaceC5136E
    public final ClassifierDescriptor getDescriptor() {
        return this.f16764Y;
    }

    @Override // p225Im.InterfaceC3778z
    public final String getName() {
        String strAsString = this.f16764Y.getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // p225Im.InterfaceC3778z
    public final List getUpperBounds() {
        InterfaceC3776x interfaceC3776x = f16763p0[0];
        Object objInvoke = this.f16765Z.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f16766o0.hashCode() * 31);
    }

    public final String toString() {
        EnumC3744C enumC3744C;
        StringBuilder sb2 = new StringBuilder();
        int i10 = AbstractC5215z0.f16950a[this.f16764Y.getVariance().ordinal()];
        if (i10 == 1) {
            enumC3744C = EnumC3744C.f11394Y;
        } else if (i10 == 2) {
            enumC3744C = EnumC3744C.f11395Z;
        } else {
            if (i10 != 3) {
                throw new C0644w();
            }
            enumC3744C = EnumC3744C.f11396o0;
        }
        int iOrdinal = enumC3744C.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb2.append("in ");
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                sb2.append("out ");
            }
        }
        sb2.append(getName());
        return sb2.toString();
    }
}
