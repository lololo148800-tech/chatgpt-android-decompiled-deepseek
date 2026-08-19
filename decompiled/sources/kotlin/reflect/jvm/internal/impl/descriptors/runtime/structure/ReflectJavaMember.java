package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p487Tm.C7511a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final ArrayList m18162a(Type[] typeArr, Annotation[][] annotationArr, boolean z6) throws IllegalAccessException, InvocationTargetException {
        Method getName;
        ArrayList arrayList;
        String str;
        boolean z10;
        Java8ParameterNamesLoader$Cache java8ParameterNamesLoader$Cache;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C7511a c7511a = C7511a.f23827a;
        Object member = getMember();
        AbstractC16544l.m18094g(member, "member");
        Java8ParameterNamesLoader$Cache java8ParameterNamesLoader$Cache2 = C7511a.f23828b;
        final Method method = null;
        if (java8ParameterNamesLoader$Cache2 == null) {
            synchronized (c7511a) {
                Java8ParameterNamesLoader$Cache java8ParameterNamesLoader$Cache3 = C7511a.f23828b;
                java8ParameterNamesLoader$Cache2 = java8ParameterNamesLoader$Cache3;
                if (java8ParameterNamesLoader$Cache3 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        final Method method2 = cls.getMethod("getParameters", null);
                        final Method method3 = ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null);
                        java8ParameterNamesLoader$Cache = new Object(method2, method3) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader$Cache

                            /* JADX INFO: renamed from: a */
                            public final Method f51678a;

                            /* JADX INFO: renamed from: b */
                            public final Method f51679b;

                            {
                                this.f51678a = method2;
                                this.f51679b = method3;
                            }

                            public final Method getGetName() {
                                return this.f51679b;
                            }

                            public final Method getGetParameters() {
                                return this.f51678a;
                            }
                        };
                    } catch (NoSuchMethodException unused) {
                        java8ParameterNamesLoader$Cache = new Object(method, method) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader$Cache

                            /* JADX INFO: renamed from: a */
                            public final Method f51678a;

                            /* JADX INFO: renamed from: b */
                            public final Method f51679b;

                            {
                                this.f51678a = method;
                                this.f51679b = method;
                            }

                            public final Method getGetName() {
                                return this.f51679b;
                            }

                            public final Method getGetParameters() {
                                return this.f51678a;
                            }
                        };
                    }
                    C7511a.f23828b = java8ParameterNamesLoader$Cache;
                    java8ParameterNamesLoader$Cache2 = java8ParameterNamesLoader$Cache;
                }
            }
        }
        Method getParameters = java8ParameterNamesLoader$Cache2.getGetParameters();
        if (getParameters == null || (getName = java8ParameterNamesLoader$Cache2.getGetName()) == null) {
            arrayList = null;
        } else {
            Object objInvoke = getParameters.invoke(member, null);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = getName.invoke(obj, null);
                AbstractC16544l.m18092e(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            ReflectJavaType reflectJavaTypeCreate = ReflectJavaType.Factory.create(typeArr[i10]);
            if (arrayList != null) {
                str = (String) AbstractC17680n.m19344T(i10 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeCreate + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z6) {
                z10 = true;
                if (i10 != typeArr.length - 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            arrayList2.add(new ReflectJavaValueParameter(reflectJavaTypeCreate, annotationArr[i10], str, z10));
        }
        return arrayList2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && AbstractC16544l.m18089b(getMember(), ((ReflectJavaMember) obj).getMember());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public AnnotatedElement getElement() {
        Member member = getMember();
        AbstractC16544l.m18092e(member, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) member;
    }

    public abstract Member getMember();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Name nameIdentifier;
        String name = getMember().getName();
        return (name == null || (nameIdentifier = Name.identifier(name)) == null) ? SpecialNames.NO_NAME_PROVIDED : nameIdentifier;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.INSTANCE;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.INSTANCE;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return JavaVisibilities.PackageVisibility.INSTANCE;
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + getMember();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        AbstractC16544l.m18094g(fqName, "fqName");
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? C17689w.f56480Y : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    public ReflectJavaClass getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        AbstractC16544l.m18093f(declaringClass, "getDeclaringClass(...)");
        return new ReflectJavaClass(declaringClass);
    }
}
