package p298Lm;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC16536d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import mm.C17296C;
import p024Am.C0560a;
import p030B2.C0742X;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p813ij.C15026j;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Lm.K */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5148K implements InterfaceC16536d {

    /* JADX INFO: renamed from: Y */
    public static final C21319m f16787Y = new C21319m("<v#(\\d+)>");

    /* JADX INFO: renamed from: f */
    public static void m5725f(ArrayList arrayList, ArrayList arrayList2, boolean z6) {
        boolean zM18089b = AbstractC16544l.m18089b(AbstractC17680n.m19353c0(arrayList2), DefaultConstructorMarker.class);
        List listSubList = arrayList2;
        if (zM18089b) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            AbstractC16544l.m18093f(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z6 ? DefaultConstructorMarker.class : Object.class);
    }

    /* JADX INFO: renamed from: p */
    public static Method m5726p(Class cls, String str, Class[] clsArr, Class cls2, boolean z6) {
        Class<?> clsTryLoadClass;
        Method methodM5726p;
        if (z6) {
            clsArr[0] = cls;
        }
        Method methodM5728t = m5728t(cls, str, clsArr, cls2);
        if (methodM5728t != null) {
            return methodM5728t;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM5726p = m5726p(superclass, str, clsArr, cls2, z6)) != null) {
            return methodM5726p;
        }
        C0742X c0742xM18098k = AbstractC16544l.m18098k(cls.getInterfaces());
        while (c0742xM18098k.hasNext()) {
            Class cls3 = (Class) c0742xM18098k.next();
            AbstractC16544l.m18091d(cls3);
            Method methodM5726p2 = m5726p(cls3, str, clsArr, cls2, z6);
            if (methodM5726p2 != null) {
                return methodM5726p2;
            }
            if (z6 && (clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodM5728t2 = m5728t(clsTryLoadClass, str, clsArr, cls2);
                if (methodM5728t2 != null) {
                    return methodM5728t2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static Constructor m5727s(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static Method m5728t(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC16544l.m18089b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC16544l.m18093f(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (AbstractC16544l.m18089b(method.getName(), str) && AbstractC16544l.m18089b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Method m5729h(String name, String desc, boolean z6) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z6) {
            arrayList.add(mo5684d());
        }
        C15026j c15026jM5733q = m5733q(desc, true);
        m5725f(arrayList, (ArrayList) c15026jM5733q.f46724Y, false);
        Class clsMo5732n = mo5732n();
        String strConcat = name.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) c15026jM5733q.f46725Z;
        AbstractC16544l.m18091d(cls);
        return m5726p(clsMo5732n, strConcat, clsArr, cls, z6);
    }

    /* JADX INFO: renamed from: i */
    public final Method m5730i(String name, String desc) {
        Method methodM5726p;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        C15026j c15026jM5733q = m5733q(desc, true);
        Class[] clsArr = (Class[]) ((ArrayList) c15026jM5733q.f46724Y).toArray(new Class[0]);
        Class cls = (Class) c15026jM5733q.f46725Z;
        AbstractC16544l.m18091d(cls);
        Method methodM5726p2 = m5726p(mo5732n(), name, clsArr, cls, false);
        if (methodM5726p2 != null) {
            return methodM5726p2;
        }
        if (!mo5732n().isInterface() || (methodM5726p = m5726p(Object.class, name, clsArr, cls, false)) == null) {
            return null;
        }
        return methodM5726p;
    }

    /* JADX INFO: renamed from: j */
    public abstract Collection mo5685j();

    /* JADX INFO: renamed from: k */
    public abstract Collection mo5686k(Name name);

    /* JADX INFO: renamed from: l */
    public abstract PropertyDescriptor mo5687l(int i10);

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX INFO: renamed from: m */
    public final Collection m5731m(MemberScope scope, EnumC5144I enumC5144I) {
        AbstractC5202t abstractC5202t;
        AbstractC16544l.m18094g(scope, "scope");
        C5146J c5146j = new C5146J(this);
        Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (AbstractC16544l.m18089b(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE)) {
                    abstractC5202t = null;
                } else if (callableMemberDescriptor.getKind().isReal() == (enumC5144I == EnumC5144I.f16782Y)) {
                    abstractC5202t = (AbstractC5202t) declarationDescriptor.accept(c5146j, C17296C.f55119a);
                } else {
                    abstractC5202t = null;
                }
            } else {
                abstractC5202t = null;
            }
            if (abstractC5202t != null) {
                arrayList.add(abstractC5202t);
            }
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public Class mo5732n() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(mo5684d());
        return wrapperByPrimitive == null ? mo5684d() : wrapperByPrimitive;
    }

    /* JADX INFO: renamed from: o */
    public abstract Collection mo5688o(Name name);

    /* JADX INFO: renamed from: q */
    public final C15026j m5733q(String str, boolean z6) {
        int iM21678L;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (AbstractC21322p.m21668B("VZCBSIFJD", cCharAt)) {
                iM21678L = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new C0560a("Unknown type prefix in the method signature: ".concat(str));
                }
                iM21678L = AbstractC21322p.m21678L(str, ';', i10, false, 4) + 1;
            }
            arrayList.add(m5734r(i10, iM21678L, str));
            i10 = iM21678L;
        }
        return new C15026j(arrayList, z6 ? m5734r(i10 + 1, str.length(), str) : null);
    }

    /* JADX INFO: renamed from: r */
    public final Class m5734r(int i10, int i11, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(mo5684d());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            Class<?> clsLoadClass = safeClassLoader.loadClass(AbstractC21329w.m21730q(strSubstring, '/', '.'));
            AbstractC16544l.m18093f(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            AbstractC16544l.m18093f(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsM5734r = m5734r(i10 + 1, i11, str);
            FqName fqName = AbstractC5147J0.f16786a;
            AbstractC16544l.m18094g(clsM5734r, "<this>");
            return Array.newInstance((Class<?>) clsM5734r, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new C0560a("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
