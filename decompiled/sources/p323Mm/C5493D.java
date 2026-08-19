package p323Mm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import om.C18235b;
import p024Am.C0560a;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p298Lm.AbstractC5147J0;
import p523V9.AbstractC8138m0;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8507K3;
import p544W9.AbstractC8513L3;
import p571X9.AbstractC9393x3;
import p658b5.C11242m;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Mm.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5493D implements InterfaceC5500g {

    /* JADX INFO: renamed from: a */
    public final boolean f17930a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5500g f17931b;

    /* JADX INFO: renamed from: c */
    public final Member f17932c;

    /* JADX INFO: renamed from: d */
    public final C11242m f17933d;

    /* JADX INFO: renamed from: e */
    public final C3508g[] f17934e;

    /* JADX INFO: renamed from: f */
    public final boolean f17935f;

    /* JADX WARN: Code duplicated, block: B:128:0x027f  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:1: B:25:0x0076->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v45, types: [Hm.e, Hm.g] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public C5493D(InterfaceC5500g interfaceC5500g, FunctionDescriptor descriptor, boolean z6) {
        Class clsM9181i;
        Method declaredMethod;
        ?? r11;
        C11242m c11242m;
        List listM9178f;
        KotlinType kotlinTypeSubstitutedUnderlyingType;
        ArrayList arrayList;
        Iterator it;
        boolean z10 = true;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f17930a = z6;
        if (interfaceC5500g instanceof C5513t) {
            ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            extensionReceiverParameter = extensionReceiverParameter == null ? descriptor.getDispatchReceiverParameter() : extensionReceiverParameter;
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null && InlineClassesUtilsKt.needsMfvcFlattening(type)) {
                if (z6) {
                    List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list = valueParameters;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                    ArrayList arrayListM9178f = AbstractC8513L3.m9178f(TypeSubstitutionKt.asSimpleType(type));
                                    AbstractC16544l.m18091d(arrayListM9178f);
                                    arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM9178f, 10));
                                    it = arrayListM9178f.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((C5513t) interfaceC5500g).f17965g, null));
                                    }
                                    interfaceC5500g = new C5514u((Method) ((AbstractC5516w) interfaceC5500g).f17969a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListM9178f2 = AbstractC8513L3.m9178f(TypeSubstitutionKt.asSimpleType(type));
                    AbstractC16544l.m18091d(arrayListM9178f2);
                    arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM9178f2, 10));
                    it = arrayListM9178f2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((C5513t) interfaceC5500g).f17965g, null));
                    }
                    interfaceC5500g = new C5514u((Method) ((AbstractC5516w) interfaceC5500g).f17969a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.f17931b = interfaceC5500g;
        this.f17932c = interfaceC5500g.mo5917b();
        KotlinType returnType = descriptor.getReturnType();
        AbstractC16544l.m18091d(returnType);
        if ((descriptor.isSuspend() && (kotlinTypeSubstitutedUnderlyingType = InlineClassesUtilsKt.substitutedUnderlyingType(returnType)) != null && KotlinBuiltIns.isPrimitiveType(kotlinTypeSubstitutedUnderlyingType)) || (clsM9181i = AbstractC8513L3.m9181i(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsM9181i.getDeclaredMethod("box-impl", AbstractC8513L3.m9177e(clsM9181i, descriptor).getReturnType());
                AbstractC16544l.m18091d(declaredMethod);
            } catch (NoSuchMethodException unused) {
                throw new C0560a("No box method found in inline class: " + clsM9181i + " (calling " + descriptor + ')');
            }
        }
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            c11242m = new C11242m(C3508g.f10598p0, new List[0], declaredMethod);
        } else {
            int i10 = -1;
            if ((!(interfaceC5500g instanceof C5513t) || ((C5513t) interfaceC5500g).f17964f) && !(interfaceC5500g instanceof C5514u)) {
                if (descriptor instanceof ConstructorDescriptor) {
                    if (!(interfaceC5500g instanceof InterfaceC5499f)) {
                        i10 = 0;
                    }
                } else if (descriptor.getDispatchReceiverParameter() == null || (interfaceC5500g instanceof InterfaceC5499f)) {
                    i10 = 0;
                } else {
                    DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                    AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
            }
            int i11 = interfaceC5500g instanceof C5514u ? -((C5514u) interfaceC5500g).f17966f.length : i10;
            Member memberMo5917b = interfaceC5500g.mo5917b();
            ArrayList arrayList2 = new ArrayList();
            ReceiverParameterDescriptor extensionReceiverParameter2 = descriptor.getExtensionReceiverParameter();
            KotlinType type2 = extensionReceiverParameter2 != null ? extensionReceiverParameter2.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (descriptor instanceof ConstructorDescriptor) {
                ClassDescriptor constructedClass = ((ConstructorDescriptor) descriptor).getConstructedClass();
                AbstractC16544l.m18093f(constructedClass, "getConstructedClass(...)");
                if (constructedClass.isInner()) {
                    DeclarationDescriptor containingDeclaration2 = constructedClass.getContainingDeclaration();
                    AbstractC16544l.m18092e(containingDeclaration2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList2.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
                }
            } else {
                DeclarationDescriptor containingDeclaration3 = descriptor.getContainingDeclaration();
                AbstractC16544l.m18093f(containingDeclaration3, "getContainingDeclaration(...)");
                if (containingDeclaration3 instanceof ClassDescriptor) {
                    ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration3;
                    if (InlineClassesUtilsKt.isValueClass(classDescriptor)) {
                        if (memberMo5917b == null) {
                            r11 = false;
                        } else {
                            Class<?> declaringClass = memberMo5917b.getDeclaringClass();
                            if (declaringClass == null ? false : !AbstractC8138m0.m8670e(declaringClass).isValue()) {
                                r11 = true;
                            } else {
                                r11 = false;
                            }
                        }
                        if (r11 == true) {
                            SimpleType defaultType = classDescriptor.getDefaultType();
                            AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
                            arrayList2.add(TypeUtilsKt.makeNullable(defaultType));
                        } else {
                            arrayList2.add(classDescriptor.getDefaultType());
                        }
                    }
                }
            }
            List<ValueParameterDescriptor> valueParameters2 = descriptor.getValueParameters();
            AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
            Iterator it3 = valueParameters2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it3.next()).getType());
            }
            Iterator it4 = arrayList2.iterator();
            int size = 0;
            while (it4.hasNext()) {
                ArrayList arrayListM9178f3 = AbstractC8513L3.m9178f(TypeSubstitutionKt.asSimpleType((KotlinType) it4.next()));
                size += arrayListM9178f3 != null ? arrayListM9178f3.size() : 1;
            }
            int i12 = size + i11 + (descriptor.isSuspend() ? 1 : 0) + (this.f17930a ? ((size + 31) / 32) + 1 : 0);
            boolean z11 = this.f17930a;
            if (AbstractC8507K3.m9168a(this) != i12) {
                throw new C0560a("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC8507K3.m9168a(this) + " != " + i12 + "\nCalling: " + descriptor + "\nParameter types: " + this.f17931b.mo5916a() + ")\nDefault: " + z11);
            }
            C3508g c3508gM8929t = AbstractC8301I.m8929t(Math.max(i10, 0), arrayList2.size() + i10);
            List[] listArr = new List[i12];
            int i13 = 0;
            while (i13 < i12) {
                if ((i13 <= c3508gM8929t.f10592Z && c3508gM8929t.f10591Y <= i13) == true) {
                    SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType((KotlinType) arrayList2.get(i13 - i10));
                    listM9178f = AbstractC8513L3.m9178f(simpleTypeAsSimpleType);
                    if (listM9178f == null) {
                        Class clsM9181i2 = AbstractC8513L3.m9181i(simpleTypeAsSimpleType);
                        if (clsM9181i2 != null) {
                            listM9178f = AbstractC9393x3.m9974d(AbstractC8513L3.m9177e(clsM9181i2, descriptor));
                        } else {
                            listM9178f = null;
                        }
                    }
                } else {
                    listM9178f = null;
                }
                listArr[i13] = listM9178f;
                i13++;
            }
            c11242m = new C11242m(c3508gM8929t, listArr, declaredMethod);
        }
        this.f17933d = c11242m;
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        InterfaceC5500g interfaceC5500g2 = this.f17931b;
        int length = interfaceC5500g2 instanceof C5514u ? ((C5514u) interfaceC5500g2).f17966f.length : interfaceC5500g2 instanceof C5513t ? 1 : 0;
        if (length > 0) {
            c18235bM9972b.add(AbstractC8301I.m8929t(0, length));
        }
        List[] listArr2 = (List[]) c11242m.f34019Z;
        int length2 = listArr2.length;
        int i14 = 0;
        while (i14 < length2) {
            List list2 = listArr2[i14];
            int size2 = (list2 != null ? list2.size() : 1) + length;
            c18235bM9972b.add(AbstractC8301I.m8929t(length, size2));
            i14++;
            length = size2;
        }
        this.f17934e = (C3508g[]) AbstractC9393x3.m9971a(c18235bM9972b).toArray(new C3508g[0]);
        ?? r12 = (C3508g) this.f17933d.f34018Y;
        if ((r12 instanceof Collection) && ((Collection) r12).isEmpty()) {
            z10 = false;
        } else {
            C3507f it5 = r12.iterator();
            while (it5.f10596o0) {
                List list3 = ((List[]) this.f17933d.f34019Z)[it5.mo4199a()];
                if ((list3 != null && list3.size() > 1) != false) {
                }
            }
            z10 = false;
        }
        this.f17935f = z10;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: a */
    public final List mo5916a() {
        return this.f17931b.mo5916a();
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: b */
    public final Member mo5917b() {
        return this.f17932c;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: c */
    public final boolean mo5918c() {
        return this.f17931b instanceof C5511r;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Method method;
        Object objInvoke;
        Object objM5717e;
        Object objM5717e2;
        AbstractC16544l.m18094g(args, "args");
        C11242m c11242m = this.f17933d;
        C3508g c3508g = (C3508g) c11242m.f34018Y;
        List[] listArr = (List[]) c11242m.f34019Z;
        if (!c3508g.isEmpty()) {
            boolean z6 = this.f17935f;
            int i10 = c3508g.f10592Z;
            int i11 = c3508g.f10591Y;
            if (z6) {
                C18235b c18235b = new C18235b(args.length);
                for (int i12 = 0; i12 < i11; i12++) {
                    c18235b.add(args[i12]);
                }
                if (i11 <= i10) {
                    while (true) {
                        List<Method> list = listArr[i11];
                        Object obj = args[i11];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objM5717e2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    AbstractC16544l.m18093f(returnType, "getReturnType(...)");
                                    objM5717e2 = AbstractC5147J0.m5717e(returnType);
                                }
                                c18235b.add(objM5717e2);
                            }
                        } else {
                            c18235b.add(obj);
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                int i13 = i10 + 1;
                int length = args.length - 1;
                if (i13 <= length) {
                    while (true) {
                        c18235b.add(args[i13]);
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                    }
                }
                args = AbstractC9393x3.m9971a(c18235b).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    if (i14 > i10 || i11 > i14) {
                        objM5717e = args[i14];
                    } else {
                        List list2 = listArr[i14];
                        Method method3 = list2 != null ? (Method) AbstractC17680n.m19365o0(list2) : null;
                        objM5717e = args[i14];
                        if (method3 != null) {
                            if (objM5717e != null) {
                                objM5717e = method3.invoke(objM5717e, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                AbstractC16544l.m18093f(returnType2, "getReturnType(...)");
                                objM5717e = AbstractC5147J0.m5717e(returnType2);
                            }
                        }
                    }
                    objArr[i14] = objM5717e;
                }
                args = objArr;
            }
        }
        Object objCall = this.f17931b.call(args);
        return (objCall == EnumC19250a.f61036Y || (method = (Method) c11242m.f34020o0) == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    /* JADX INFO: renamed from: d */
    public final C3508g m5919d(int i10) {
        C3508g[] c3508gArr = this.f17934e;
        if (i10 >= 0 && i10 < c3508gArr.length) {
            return c3508gArr[i10];
        }
        if (c3508gArr.length == 0) {
            return new C3508g(i10, i10, 1);
        }
        int length = ((C3508g) AbstractC17678l.m19284G(c3508gArr)).f10592Z + 1 + (i10 - c3508gArr.length);
        return new C3508g(length, length, 1);
    }

    @Override // p323Mm.InterfaceC5500g
    public final Type getReturnType() {
        return this.f17931b.getReturnType();
    }
}
