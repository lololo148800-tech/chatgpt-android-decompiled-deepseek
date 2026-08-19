package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f51663a;

    public ReflectJavaClassFinder(ClassLoader classLoader) {
        AbstractC16544l.m18094g(classLoader, "classLoader");
        this.f51663a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaClass findClass(JavaClassFinder.Request request) {
        AbstractC16544l.m18094g(request, "request");
        ClassId classId = request.getClassId();
        FqName packageFqName = classId.getPackageFqName();
        String strM21730q = AbstractC21329w.m21730q(classId.getRelativeClassName().asString(), '.', '$');
        if (!packageFqName.isRoot()) {
            strM21730q = packageFqName.asString() + '.' + strM21730q;
        }
        Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f51663a, strM21730q);
        if (clsTryLoadClass != null) {
            return new ReflectJavaClass(clsTryLoadClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaPackage findPackage(FqName fqName, boolean z6) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return new ReflectJavaPackage(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public Set<String> knownClassNamesInPackage(FqName packageFqName) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        return null;
    }
}
