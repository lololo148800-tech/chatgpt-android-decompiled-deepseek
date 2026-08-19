package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragment f52076a;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment packageFragment) {
        AbstractC16544l.m18094g(packageFragment, "packageFragment");
        this.f52076a = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        AbstractC16544l.m18093f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f52076a;
        sb2.append(lazyJavaPackageFragment);
        sb2.append(": ");
        sb2.append(lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().keySet());
        return sb2.toString();
    }
}
