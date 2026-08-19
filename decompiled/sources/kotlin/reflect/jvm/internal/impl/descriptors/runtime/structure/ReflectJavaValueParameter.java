package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* JADX INFO: renamed from: a */
    public final ReflectJavaType f51705a;

    /* JADX INFO: renamed from: b */
    public final Annotation[] f51706b;

    /* JADX INFO: renamed from: c */
    public final String f51707c;

    /* JADX INFO: renamed from: d */
    public final boolean f51708d;

    public ReflectJavaValueParameter(ReflectJavaType type, Annotation[] reflectAnnotations, String str, boolean z6) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(reflectAnnotations, "reflectAnnotations");
        this.f51705a = type;
        this.f51706b = reflectAnnotations;
        this.f51707c = str;
        this.f51708d = z6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public Name getName() {
        String str = this.f51707c;
        if (str != null) {
            return Name.guessByFirstCharacter(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public boolean isVararg() {
        return this.f51708d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ReflectJavaValueParameter.class.getName());
        sb2.append(": ");
        sb2.append(isVararg() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.findAnnotation(this.f51706b, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.getAnnotations(this.f51706b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public ReflectJavaType getType() {
        return this.f51705a;
    }
}
