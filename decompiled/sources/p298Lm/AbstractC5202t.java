package p298Lm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import mm.EnumC17307j;
import p009A7.FlM.nkFZpTrMPpn;
import p024Am.C0560a;
import p109E3.C2292p;
import p225Im.EnumC3745D;
import p225Im.EnumC3766n;
import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3767o;
import p225Im.InterfaceC3777y;
import p323Mm.InterfaceC5500g;
import p523V9.AbstractC8138m0;
import p544W9.AbstractC8513L3;
import p544W9.AbstractC8565U2;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Lm.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5202t implements InterfaceC3755c, InterfaceC5131B0 {

    /* JADX INFO: renamed from: Y */
    public final C5135D0 f16903Y = AbstractC8716t3.m9425b(null, new C5196q(this, 0));

    /* JADX INFO: renamed from: Z */
    public final C5135D0 f16904Z = AbstractC8716t3.m9425b(null, new C5196q(this, 1));

    /* JADX INFO: renamed from: o0 */
    public final C5135D0 f16905o0 = AbstractC8716t3.m9425b(null, new C5196q(this, 2));

    /* JADX INFO: renamed from: p0 */
    public final C5135D0 f16906p0 = AbstractC8716t3.m9425b(null, new C5196q(this, 3));

    /* JADX INFO: renamed from: q0 */
    public final C5135D0 f16907q0 = AbstractC8716t3.m9425b(null, new C5196q(this, 4));

    /* JADX INFO: renamed from: r0 */
    public final Object f16908r0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5196q(this, 5));

    /* JADX INFO: renamed from: h */
    public static Object m5753h(C5213y0 c5213y0) {
        Class clsM8667b = AbstractC8138m0.m8667b(AbstractC8565U2.m9229d(c5213y0));
        if (clsM8667b.isArray()) {
            Object objNewInstance = Array.newInstance(clsM8667b.getComponentType(), 0);
            AbstractC16544l.m18093f(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new C0560a("Cannot instantiate the default empty array of type " + clsM8667b.getSimpleName() + ", because it is not an array type");
    }

    @Override // p225Im.InterfaceC3755c
    public final Object call(Object... args) {
        AbstractC16544l.m18094g(args, "args");
        try {
            return mo5735i().call(args);
        } catch (IllegalAccessException e10) {
            throw new C2292p(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3755c
    public final Object callBy(Map args) throws C2292p {
        int i10;
        Object objM5753h;
        int i11 = 1;
        AbstractC16544l.m18094g(args, "args");
        int i12 = 0;
        if (m5755o()) {
            List<InterfaceC3767o> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(parameters, 10));
            for (InterfaceC3767o interfaceC3767o : parameters) {
                if (args.containsKey(interfaceC3767o)) {
                    objM5753h = args.get(interfaceC3767o);
                    if (objM5753h == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC3767o + ')');
                    }
                } else {
                    C5171d0 c5171d0 = (C5171d0) interfaceC3767o;
                    if (c5171d0.m5747h()) {
                        objM5753h = null;
                    } else {
                        if (!c5171d0.m5748i()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + c5171d0);
                        }
                        objM5753h = m5753h(c5171d0.m5746f());
                    }
                }
                arrayList.add(objM5753h);
            }
            InterfaceC5500g interfaceC5500gMo5737l = mo5737l();
            if (interfaceC5500gMo5737l != null) {
                try {
                    return interfaceC5500gMo5737l.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e10) {
                    throw new C2292p(e10);
                }
            }
            throw new C0560a("This callable does not support a default call: " + mo5738m());
        }
        List<InterfaceC3767o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return mo5735i().call(isSuspend() ? new InterfaceC18770c[]{null} : new InterfaceC18770c[0]);
            } catch (IllegalAccessException e11) {
                throw new C2292p(e11);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f16907q0.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f16908r0.getValue()).booleanValue();
        int i13 = 0;
        for (InterfaceC3767o interfaceC3767o2 : parameters2) {
            int iM5754n = zBooleanValue ? m5754n(interfaceC3767o2) : i11;
            if (args.containsKey(interfaceC3767o2)) {
                objArr[((C5171d0) interfaceC3767o2).f16849Z] = args.get(interfaceC3767o2);
                i10 = i11;
            } else {
                C5171d0 c5171d1 = (C5171d0) interfaceC3767o2;
                if (c5171d1.m5747h()) {
                    if (zBooleanValue) {
                        int i14 = i13 + iM5754n;
                        int i15 = i13;
                        while (i15 < i14) {
                            int i16 = (i15 / 32) + size;
                            Object obj = objArr[i16];
                            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i16] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i15 % 32)));
                            i15++;
                            i11 = 1;
                        }
                        i10 = i11;
                    } else {
                        i10 = i11;
                        int i17 = (i13 / 32) + size;
                        Object obj2 = objArr[i17];
                        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i17] = Integer.valueOf(((Integer) obj2).intValue() | (i10 << (i13 % 32)));
                    }
                    i12 = i10;
                } else {
                    i10 = i11;
                    if (!c5171d1.m5748i()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + c5171d1);
                    }
                }
            }
            if (((C5171d0) interfaceC3767o2).f16850o0 == EnumC3766n.f11416o0) {
                i13 += iM5754n;
            }
            i11 = i10;
        }
        if (i12 == 0) {
            try {
                InterfaceC5500g interfaceC5500gMo5735i = mo5735i();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
                return interfaceC5500gMo5735i.call(objArrCopyOf);
            } catch (IllegalAccessException e12) {
                throw new C2292p(e12);
            }
        }
        InterfaceC5500g interfaceC5500gMo5737l2 = mo5737l();
        if (interfaceC5500gMo5737l2 != null) {
            try {
                return interfaceC5500gMo5737l2.call(objArr);
            } catch (IllegalAccessException e13) {
                throw new C2292p(e13);
            }
        }
        throw new C0560a("This callable does not support a default call: " + mo5738m());
    }

    @Override // p225Im.InterfaceC3754b
    public final List getAnnotations() {
        Object objInvoke = this.f16903Y.invoke();
        AbstractC16544l.m18093f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // p225Im.InterfaceC3755c
    public final List getParameters() {
        Object objInvoke = this.f16904Z.invoke();
        AbstractC16544l.m18093f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // p225Im.InterfaceC3755c
    public final InterfaceC3777y getReturnType() {
        Object objInvoke = this.f16905o0.invoke();
        AbstractC16544l.m18093f(objInvoke, "invoke(...)");
        return (InterfaceC3777y) objInvoke;
    }

    @Override // p225Im.InterfaceC3755c
    public final List getTypeParameters() {
        Object objInvoke = this.f16906p0.invoke();
        AbstractC16544l.m18093f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // p225Im.InterfaceC3755c
    public final EnumC3745D getVisibility() {
        DescriptorVisibility visibility = mo5738m().getVisibility();
        AbstractC16544l.m18093f(visibility, "getVisibility(...)");
        FqName fqName = AbstractC5147J0.f16786a;
        if (visibility.equals(DescriptorVisibilities.PUBLIC)) {
            return EnumC3745D.f11398Y;
        }
        if (visibility.equals(DescriptorVisibilities.PROTECTED)) {
            return EnumC3745D.f11399Z;
        }
        if (visibility.equals(DescriptorVisibilities.INTERNAL)) {
            return EnumC3745D.f11400o0;
        }
        if (visibility.equals(DescriptorVisibilities.PRIVATE) || visibility.equals(DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return EnumC3745D.f11401p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC5500g mo5735i();

    @Override // p225Im.InterfaceC3755c
    public final boolean isAbstract() {
        return mo5738m().getModality() == Modality.ABSTRACT;
    }

    @Override // p225Im.InterfaceC3755c
    public final boolean isFinal() {
        return mo5738m().getModality() == Modality.FINAL;
    }

    @Override // p225Im.InterfaceC3755c
    public final boolean isOpen() {
        return mo5738m().getModality() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: k */
    public abstract AbstractC5148K mo5736k();

    /* JADX INFO: renamed from: l */
    public abstract InterfaceC5500g mo5737l();

    /* JADX INFO: renamed from: m */
    public abstract CallableMemberDescriptor mo5738m();

    /* JADX INFO: renamed from: o */
    public final boolean m5755o() {
        return AbstractC16544l.m18089b(getName(), "<init>") && mo5736k().mo5684d().isAnnotation();
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo5739p();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: n */
    public final int m5754n(InterfaceC3767o interfaceC3767o) {
        if (!((Boolean) this.f16908r0.getValue()).booleanValue()) {
            throw new IllegalArgumentException(nkFZpTrMPpn.nlBF);
        }
        C5171d0 c5171d0 = (C5171d0) interfaceC3767o;
        if (!AbstractC5147J0.m5720h(c5171d0.m5746f())) {
            return 1;
        }
        ArrayList arrayListM9178f = AbstractC8513L3.m9178f(TypeSubstitutionKt.asSimpleType(c5171d0.m5746f().f16935Y));
        AbstractC16544l.m18091d(arrayListM9178f);
        return arrayListM9178f.size();
    }
}
