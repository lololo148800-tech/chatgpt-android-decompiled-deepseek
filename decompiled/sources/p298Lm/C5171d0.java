package p298Lm;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p225Im.EnumC3766n;
import p225Im.InterfaceC3767o;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p544W9.AbstractC8716t3;

/* JADX INFO: renamed from: Lm.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5171d0 implements InterfaceC3767o {

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ InterfaceC3776x[] f16847q0;

    /* JADX INFO: renamed from: Y */
    public final AbstractC5202t f16848Y;

    /* JADX INFO: renamed from: Z */
    public final int f16849Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC3766n f16850o0;

    /* JADX INFO: renamed from: p0 */
    public final C5135D0 f16851p0;

    static {
        C16553u c16553u = new C16553u(C5171d0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f16847q0 = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(C5171d0.class, "annotations", "getAnnotations()Ljava/util/List;", 0, c16527d)};
    }

    public C5171d0(AbstractC5202t callable, int i10, EnumC3766n enumC3766n, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(callable, "callable");
        this.f16848Y = callable;
        this.f16849Z = i10;
        this.f16850o0 = enumC3766n;
        this.f16851p0 = AbstractC8716t3.m9425b(null, interfaceC1426a);
        AbstractC8716t3.m9425b(null, new C5167b0(this, 0));
    }

    /* JADX INFO: renamed from: d */
    public final ParameterDescriptor m5745d() {
        InterfaceC3776x interfaceC3776x = f16847q0[0];
        Object objInvoke = this.f16851p0.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (ParameterDescriptor) objInvoke;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5171d0) {
            C5171d0 c5171d0 = (C5171d0) obj;
            if (AbstractC16544l.m18089b(this.f16848Y, c5171d0.f16848Y)) {
                if (this.f16849Z == c5171d0.f16849Z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C5213y0 m5746f() {
        KotlinType type = m5745d().getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        return new C5213y0(type, new C5167b0(this, 1));
    }

    public final String getName() {
        ParameterDescriptor parameterDescriptorM5745d = m5745d();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorM5745d instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorM5745d : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        if (name.isSpecial()) {
            return null;
        }
        return name.asString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5747h() {
        ParameterDescriptor parameterDescriptorM5745d = m5745d();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorM5745d instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorM5745d : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16848Y.hashCode() * 31) + this.f16849Z;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5748i() {
        ParameterDescriptor parameterDescriptorM5745d = m5745d();
        return (parameterDescriptorM5745d instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorM5745d).getVarargElementType() != null;
    }

    public final String toString() {
        String strM5707b;
        DescriptorRenderer descriptorRenderer = AbstractC5141G0.f16778a;
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f16850o0.ordinal();
        if (iOrdinal == 0) {
            sb2.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb2.append("extension receiver parameter");
        } else {
            if (iOrdinal != 2) {
                throw new C0644w();
            }
            sb2.append("parameter #" + this.f16849Z + ' ' + getName());
        }
        sb2.append(" of ");
        CallableMemberDescriptor callableMemberDescriptorMo5738m = this.f16848Y.mo5738m();
        if (callableMemberDescriptorMo5738m instanceof PropertyDescriptor) {
            strM5707b = AbstractC5141G0.m5708c((PropertyDescriptor) callableMemberDescriptorMo5738m);
        } else {
            if (!(callableMemberDescriptorMo5738m instanceof FunctionDescriptor)) {
                throw new IllegalStateException(("Illegal callable: " + callableMemberDescriptorMo5738m).toString());
            }
            strM5707b = AbstractC5141G0.m5707b((FunctionDescriptor) callableMemberDescriptorMo5738m);
        }
        sb2.append(strM5707b);
        return sb2.toString();
    }
}
