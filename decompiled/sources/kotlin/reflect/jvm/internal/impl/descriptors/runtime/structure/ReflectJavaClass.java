package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p077Cn.C1756x;
import p1091wn.AbstractC21031l;
import p1091wn.C21026g;
import p1091wn.C21027h;
import p1091wn.InterfaceC21029j;
import p1113xn.AbstractC21322p;
import p487Tm.C7512b;
import p487Tm.C7513c;
import p487Tm.C7514d;
import p487Tm.C7515e;
import p487Tm.C7516f;
import p487Tm.C7517g;
import p571X9.AbstractC9376u4;
import p588Y2.C9642z;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* JADX INFO: renamed from: a */
    public final Class f51691a;

    public ReflectJavaClass(Class<?> klass) {
        AbstractC16544l.m18094g(klass, "klass");
        this.f51691a = klass;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReflectJavaClass) {
            if (AbstractC16544l.m18089b(this.f51691a, ((ReflectJavaClass) obj).f51691a)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public FqName getFqName() {
        return ReflectClassUtilKt.getClassId(this.f51691a).asSingleFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f51691a.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Class cls = this.f51691a;
        if (cls.isAnonymousClass()) {
            Name nameIdentifier = Name.identifier(AbstractC21322p.m21704l0(cls.getName(), Separators.DOT));
            AbstractC16544l.m18091d(nameIdentifier);
            return nameIdentifier;
        }
        Name nameIdentifier2 = Name.identifier(cls.getSimpleName());
        AbstractC16544l.m18091d(nameIdentifier2);
        return nameIdentifier2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public InterfaceC21029j getPermittedTypes() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f51691a;
        AbstractC16544l.m18094g(clazz, "clazz");
        Java16SealedRecordLoader$Cache java16SealedRecordLoader$Cache = AbstractC9376u4.f28245a;
        Class[] clsArr = null;
        if (java16SealedRecordLoader$Cache == null) {
            try {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(null, null, null, null);
            }
            AbstractC9376u4.f28245a = java16SealedRecordLoader$Cache;
        }
        Method getPermittedSubclasses = java16SealedRecordLoader$Cache.getGetPermittedSubclasses();
        if (getPermittedSubclasses != null) {
            Object objInvoke = getPermittedSubclasses.invoke(clazz, null);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr == null) {
            return C21026g.f66901a;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(new ReflectJavaClassifierType(cls));
        }
        return AbstractC17680n.m19329H(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaRecordComponent> getRecordComponents() {
        Class clazz = this.f51691a;
        AbstractC16544l.m18094g(clazz, "clazz");
        Java16SealedRecordLoader$Cache java16SealedRecordLoader$Cache = AbstractC9376u4.f28245a;
        if (java16SealedRecordLoader$Cache == null) {
            try {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(null, null, null, null);
            }
            AbstractC9376u4.f28245a = java16SealedRecordLoader$Cache;
        }
        Method getRecordComponents = java16SealedRecordLoader$Cache.getGetRecordComponents();
        Object[] objArr = getRecordComponents != null ? (Object[]) getRecordComponents.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaClassifierType> getSupertypes() {
        Class cls = this.f51691a;
        if (AbstractC16544l.m18089b(cls, Object.class)) {
            return C17689w.f56480Y;
        }
        C9642z c9642z = new C9642z(2);
        Type genericSuperclass = cls.getGenericSuperclass();
        c9642z.m10200L(genericSuperclass != null ? genericSuperclass : Object.class);
        c9642z.m10201M(cls.getGenericInterfaces());
        ArrayList arrayList = (ArrayList) c9642z.f29064Z;
        List listM19382k = AbstractC17681o.m19382k(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listM19382k, 10));
        Iterator it = listM19382k.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable[] typeParameters = this.f51691a.getTypeParameters();
        AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean hasDefaultConstructor() {
        return false;
    }

    public int hashCode() {
        return this.f51691a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.f51691a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.f51691a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.f51691a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isRecord() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f51691a;
        AbstractC16544l.m18094g(clazz, "clazz");
        Java16SealedRecordLoader$Cache java16SealedRecordLoader$Cache = AbstractC9376u4.f28245a;
        Boolean bool = null;
        if (java16SealedRecordLoader$Cache == null) {
            try {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(null, null, null, null);
            }
            AbstractC9376u4.f28245a = java16SealedRecordLoader$Cache;
        }
        Method methodIsRecord = java16SealedRecordLoader$Cache.isRecord();
        if (methodIsRecord != null) {
            Object objInvoke = methodIsRecord.invoke(clazz, null);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isSealed() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f51691a;
        AbstractC16544l.m18094g(clazz, "clazz");
        Java16SealedRecordLoader$Cache java16SealedRecordLoader$Cache = AbstractC9376u4.f28245a;
        Boolean bool = null;
        if (java16SealedRecordLoader$Cache == null) {
            try {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                java16SealedRecordLoader$Cache = new Java16SealedRecordLoader$Cache(null, null, null, null);
            }
            AbstractC9376u4.f28245a = java16SealedRecordLoader$Cache;
        }
        Method methodIsSealed = java16SealedRecordLoader$Cache.isSealed();
        if (methodIsSealed != null) {
            Object objInvoke = methodIsSealed.invoke(clazz, null);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f51691a;
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.f51691a.getDeclaredConstructors();
        AbstractC16544l.m18093f(declaredConstructors, "getDeclaredConstructors(...)");
        return AbstractC21031l.m21499w(AbstractC21031l.m21495s(new C21027h(AbstractC17678l.m19297d(declaredConstructors), false, C7513c.f23834Y), C7514d.f23835Y));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public Class<?> getElement() {
        return this.f51691a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.f51691a.getDeclaredFields();
        AbstractC16544l.m18093f(declaredFields, "getDeclaredFields(...)");
        return AbstractC21031l.m21499w(AbstractC21031l.m21495s(new C21027h(AbstractC17678l.m19297d(declaredFields), false, C7515e.f23836Y), C7516f.f23837Y));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<Name> getInnerClassNames() {
        Class<?>[] declaredClasses = this.f51691a.getDeclaredClasses();
        AbstractC16544l.m18093f(declaredClasses, "getDeclaredClasses(...)");
        return AbstractC21031l.m21499w(AbstractC21031l.m21496t(new C21027h(AbstractC17678l.m19297d(declaredClasses), false, C7512b.f23831p0), C7512b.f23832q0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.f51691a.getDeclaredMethods();
        AbstractC16544l.m18093f(declaredMethods, "getDeclaredMethods(...)");
        return AbstractC21031l.m21499w(AbstractC21031l.m21495s(AbstractC21031l.m21487k(AbstractC17678l.m19297d(declaredMethods), new C1756x(this, 8)), C7517g.f23838Y));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public ReflectJavaClass getOuterClass() {
        Class<?> declaringClass = this.f51691a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }
}
