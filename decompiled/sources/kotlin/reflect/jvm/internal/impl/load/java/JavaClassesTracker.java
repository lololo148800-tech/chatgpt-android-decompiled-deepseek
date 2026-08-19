package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassesTracker {

    public static final class Default implements JavaClassesTracker {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(JavaClassDescriptor classDescriptor) {
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        }
    }

    void reportClass(JavaClassDescriptor javaClassDescriptor);
}
