package p544W9;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import mm.C17296C;
import mm.C17309l;
import p024Am.C0560a;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0625m0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p298Lm.AbstractC5147J0;
import p323Mm.C5493D;
import p323Mm.InterfaceC5500g;
import p349O0.C6029t;
import p349O0.C6032u0;
import p349O0.InterfaceC6023q;
import p482Tg.C7448e;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p637a3.C10485b;
import p672c3.C11617m;
import p672c3.C11628r0;
import p722e8.C13298H;
import p749fd.C13628m;
import p823j3.C16062A;
import p823j3.C16063B;
import p823j3.C16064C;
import p823j3.C16066E;
import p823j3.C16067F;
import p823j3.C16070I;
import p823j3.C16073L;
import p823j3.C16075N;
import p823j3.C16089k;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.L3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8513L3 {
    /* JADX WARN: Code duplicated, block: B:45:0x016e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [O0.q] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v5, types: [O0.u0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [O0.u0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [An.B0] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v5, types: [An.n0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [An.n0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j3.k] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: a */
    public static final Object m9173a(C16075N c16075n, Context context, C11617m c11617m, C16073L c16073l, C13298H c13298h, AbstractC19687c abstractC19687c) throws Throwable {
        C16063B c16063b;
        ?? r6;
        C16089k c16089k;
        EnumC19250a enumC19250a;
        C6029t c6029t;
        C16073L c16073l2;
        InterfaceC6023q interfaceC6023q;
        C16089k c16089k2;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        C7448e c7448e;
        C16089k c16089k3;
        int i10;
        C16075N c16075n2 = c16075n;
        Context context2 = context;
        C11617m c11617m2 = c11617m;
        if (abstractC19687c instanceof C16063B) {
            c16063b = (C16063B) abstractC19687c;
            i10 = c16063b.f49728v0;
            r11 = -2147483648;
            r10 = i10 & Integer.MIN_VALUE;
            if (r10 != 0) {
                int i11 = i10 - Integer.MIN_VALUE;
                c16063b.f49728v0 = i11;
                r6 = i11;
            } else {
                c16063b = new C16063B(abstractC19687c);
                r6 = i10;
            }
        } else {
            c16063b = new C16063B(abstractC19687c);
            r6 = i10;
        }
        C16063B c16063b2 = c16063b;
        Object obj = c16063b2.f49727u0;
        EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        ?? r14 = c16063b2.f49728v0;
        if (r14 != 0) {
            try {
                if (r14 == 1) {
                    C6029t c6029t2 = c16063b2.f49726t0;
                    C6032u0 c6032u0 = c16063b2.f49725s0;
                    C0564B0 c0564b0 = c16063b2.f49724r0;
                    C16089k c16089k4 = c16063b2.f49723q0;
                    C16073L c16073l3 = (C16073L) c16063b2.f49722p0;
                    C11617m c11617m3 = (C11617m) c16063b2.f49721o0;
                    Context context3 = (Context) c16063b2.f49720Z;
                    C16075N c16075n3 = (C16075N) c16063b2.f49719Y;
                    AbstractC9233X.m9807c(obj);
                    c16089k = c16089k4;
                    c11617m2 = c11617m3;
                    context2 = context3;
                    enumC19250a = enumC19250a2;
                    c6029t = c6029t2;
                    c16073l2 = c16073l3;
                    c16075n2 = c16075n3;
                    r6 = c6032u0;
                    r11 = c0564b0;
                    try {
                        c7448e = new C7448e(c16075n2, c16073l2, c16089k, 28);
                        c16063b2.f49719Y = c16089k;
                        c16063b2.f49720Z = r11;
                        c16063b2.f49721o0 = r6;
                        c16063b2.f49722p0 = c6029t;
                        c16063b2.f49723q0 = null;
                        c16063b2.f49724r0 = null;
                        c16063b2.f49725s0 = null;
                        c16063b2.f49726t0 = null;
                        c16063b2.f49728v0 = 2;
                        if (c11617m2.m12993d(context2, c7448e, c16063b2) != enumC19250a) {
                            interfaceC6023q = c6029t;
                            c16089k2 = c16089k;
                            r13 = r6;
                            r12 = r11;
                        }
                        return enumC19250a;
                    } catch (Throwable th2) {
                        th = th2;
                        r14 = c6029t;
                        r10 = c16089k;
                        r14.dispose();
                        r10.m17649c();
                        r11.mo1275e(null);
                        r6.m6607w();
                        throw th;
                    }
                }
                if (r14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6023q = (InterfaceC6023q) c16063b2.f49722p0;
                C6032u0 c6032u1 = (C6032u0) c16063b2.f49721o0;
                InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c16063b2.f49720Z;
                c16089k2 = (C16089k) c16063b2.f49719Y;
                AbstractC9233X.m9807c(obj);
                r13 = c6032u1;
                r12 = interfaceC0627n0;
                interfaceC6023q.dispose();
                c16089k2.m17649c();
                r12.mo1275e(null);
                r13.m6607w();
                return C17296C.f55119a;
            } catch (Throwable th3) {
                th = th3;
                r14.dispose();
                r10.m17649c();
                r11.mo1275e(null);
                r6.m6607w();
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        C16089k c16089k5 = new C16089k(c16075n2);
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(c16075n2, null, null, new C16070I(2, null), 3);
        c11617m.getClass();
        C11628r0 c11628r0 = new C11628r0(50);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(Boolean.FALSE);
        C16062A c16062a = new C16062A(c16075n2, c11617m2, context2);
        InterfaceC0627n0 interfaceC0627n1 = (InterfaceC0627n0) c13298h.invoke();
        InterfaceC0571F interfaceC0571F = c16075n2.f49777Y;
        InterfaceC0627n0 interfaceC0627n2 = (InterfaceC0627n0) interfaceC0571F.getCoroutineContext().get(C0625m0.f1875Y);
        if (interfaceC0627n2 != null) {
            interfaceC0627n2.mo1271H0(new C13628m(interfaceC0627n1, 23));
        }
        C6032u0 c6032u2 = new C6032u0(interfaceC0571F.getCoroutineContext().plus(interfaceC0627n1).plus(c16062a));
        C6029t c6029t3 = new C6029t(c6032u2, new C10485b(c11628r0));
        try {
            try {
                AbstractC0575H.m1156D(c16075n2, c16089k5, null, new C16064C(c6029t3, c11617m, context, c6032u2, c16075n, null), 2);
                try {
                    AbstractC0575H.m1156D(c16075n2, null, null, new C16066E(c6032u2, c11617m, c2153q0M3204c, context, c11628r0, c16075n, c16073l, null), 3);
                    C16067F c16067f = new C16067F(2, null);
                    c16063b2.f49719Y = c16075n2;
                    c16063b2.f49720Z = context2;
                    c16063b2.f49721o0 = c11617m2;
                    c16073l2 = c16073l;
                    c16063b2.f49722p0 = c16073l2;
                    c16089k3 = c16089k5;
                    try {
                        c16063b2.f49723q0 = c16089k3;
                        r11 = c0564b0M1156D;
                        try {
                            c16063b2.f49724r0 = r11;
                            c16063b2.f49725s0 = c6032u2;
                            c6029t = c6029t3;
                            try {
                                c16063b2.f49726t0 = c6029t;
                                c16063b2.f49728v0 = 1;
                                enumC19250a = enumC19250a2;
                                if (AbstractC2124C.m3220s(c2153q0M3204c, c16067f, c16063b2) != enumC19250a) {
                                    c16089k = c16089k3;
                                    r6 = c6032u2;
                                    r11 = r11;
                                    c7448e = new C7448e(c16075n2, c16073l2, c16089k, 28);
                                    c16063b2.f49719Y = c16089k;
                                    c16063b2.f49720Z = r11;
                                    c16063b2.f49721o0 = r6;
                                    c16063b2.f49722p0 = c6029t;
                                    c16063b2.f49723q0 = null;
                                    c16063b2.f49724r0 = null;
                                    c16063b2.f49725s0 = null;
                                    c16063b2.f49726t0 = null;
                                    c16063b2.f49728v0 = 2;
                                    if (c11617m2.m12993d(context2, c7448e, c16063b2) != enumC19250a) {
                                        interfaceC6023q = c6029t;
                                        c16089k2 = c16089k;
                                        r13 = r6;
                                        r12 = r11;
                                        interfaceC6023q.dispose();
                                        c16089k2.m17649c();
                                        r12.mo1275e(null);
                                        r13.m6607w();
                                        return C17296C.f55119a;
                                    }
                                }
                                return enumC19250a;
                            } catch (Throwable th4) {
                                th = th4;
                                r14 = c6029t;
                                r10 = c16089k3;
                                r6 = c6032u2;
                                r14.dispose();
                                r10.m17649c();
                                r11.mo1275e(null);
                                r6.m6607w();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c6029t = c6029t3;
                            r14 = c6029t;
                            r10 = c16089k3;
                            r6 = c6032u2;
                            r14.dispose();
                            r10.m17649c();
                            r11.mo1275e(null);
                            r6.m6607w();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r11 = c0564b0M1156D;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r11 = c0564b0M1156D;
                    c16089k3 = c16089k5;
                }
            } catch (Throwable th8) {
                th = th8;
                c6029t = c6029t3;
                c16089k3 = c16089k5;
                r11 = c0564b0M1156D;
            }
        } catch (Throwable th9) {
            th = th9;
            r11 = c0564b0M1156D;
            c16089k3 = c16089k5;
            c6029t = c6029t3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m9174b(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeM9176d;
        Class clsM9181i;
        return (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) callableMemberDescriptor)) || (kotlinTypeM9176d = m9176d(callableMemberDescriptor)) == null || (clsM9181i = m9181i(kotlinTypeM9176d)) == null) ? obj : m9177e(clsM9181i, callableMemberDescriptor).invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x0061->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC5500g m9175c(InterfaceC5500g interfaceC5500g, FunctionDescriptor descriptor, boolean z6) {
        List<ValueParameterDescriptor> list;
        Iterator<T> it;
        KotlinType type;
        KotlinType returnType;
        KotlinType kotlinTypeM9176d;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        if (!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
            AbstractC16544l.m18093f(contextReceiverParameters, "getContextReceiverParameters(...)");
            List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                list = valueParameters;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((ValueParameterDescriptor) it.next()).getType();
                        AbstractC16544l.m18093f(type, "getType(...)");
                        if (InlineClassesUtilsKt.isValueClassType(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    type = ((ValueParameterDescriptor) it.next()).getType();
                    AbstractC16544l.m18093f(type, "getType(...)");
                    if (InlineClassesUtilsKt.isValueClassType(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                KotlinType type2 = ((ReceiverParameterDescriptor) it2.next()).getType();
                AbstractC16544l.m18093f(type2, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type2)) {
                }
            }
            List<ValueParameterDescriptor> valueParameters2 = descriptor.getValueParameters();
            AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
            list = valueParameters2;
            if (!(list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? interfaceC5500g : interfaceC5500g;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((ValueParameterDescriptor) it.next()).getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.isInlineClassType(returnType)) && ((kotlinTypeM9176d = m9176d(descriptor)) == null || !InlineClassesUtilsKt.isValueClassType(kotlinTypeM9176d))) {
                return interfaceC5500g;
            }
        }
        return new C5493D(interfaceC5500g, descriptor, z6);
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m9176d(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter != null) {
            if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                return dispatchReceiverParameter.getType();
            }
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
            if (classDescriptor != null) {
                return classDescriptor.getDefaultType();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Method m9177e(Class cls, CallableMemberDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            AbstractC16544l.m18091d(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C0560a("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m9178f(SimpleType type) {
        AbstractC16544l.m18094g(type, "type");
        ArrayList arrayListM9179g = m9179g(TypeSubstitutionKt.asSimpleType(type));
        if (arrayListM9179g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM9179g, 10));
        Iterator it = arrayListM9179g.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor();
        AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsM5723k = AbstractC5147J0.m5723k((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
        AbstractC16544l.m18091d(clsM5723k);
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsM5723k.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public static final ArrayList m9179g(SimpleType simpleType) {
        ?? M9974d;
        if (!InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = simpleType.getConstructor().mo22589getDeclarationDescriptor();
        AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
        AbstractC16544l.m18091d(multiFieldValueClassRepresentation);
        List<C17309l> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList();
        for (C17309l c17309l : underlyingPropertyNamesToTypes) {
            Name name = (Name) c17309l.f55136Y;
            ArrayList arrayListM9179g = m9179g((SimpleType) c17309l.f55137Z);
            if (arrayListM9179g != null) {
                M9974d = new ArrayList(AbstractC17682p.m19389r(arrayListM9179g, 10));
                Iterator it = arrayListM9179g.iterator();
                while (it.hasNext()) {
                    M9974d.add(name.getIdentifier() + '-' + ((String) it.next()));
                }
            } else {
                M9974d = AbstractC9393x3.m9974d(name.getIdentifier());
            }
            AbstractC17686t.m19398v((Iterable) M9974d, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final Class m9180h(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class clsM5723k = AbstractC5147J0.m5723k(classDescriptor);
        if (clsM5723k != null) {
            return clsM5723k;
        }
        throw new C0560a("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + ')');
    }

    /* JADX INFO: renamed from: i */
    public static final Class m9181i(KotlinType kotlinType) {
        Class clsM9180h = m9180h(kotlinType.getConstructor().mo22589getDeclarationDescriptor());
        if (clsM9180h == null) {
            return null;
        }
        if (!TypeUtils.isNullableType(kotlinType)) {
            return clsM9180h;
        }
        KotlinType kotlinTypeUnsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType);
        if (kotlinTypeUnsubstitutedUnderlyingType == null || TypeUtils.isNullableType(kotlinTypeUnsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(kotlinTypeUnsubstitutedUnderlyingType)) {
            return null;
        }
        return clsM9180h;
    }
}
