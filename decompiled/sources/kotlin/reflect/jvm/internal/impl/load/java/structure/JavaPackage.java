package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaPackage extends JavaAnnotationOwner {
    Collection<JavaClass> getClasses(InterfaceC1436k interfaceC1436k);

    FqName getFqName();

    Collection<JavaPackage> getSubPackages();
}
