package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor f52957a;

    /* JADX INFO: renamed from: b */
    public final ClassDescriptor f52958b;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor, ImplicitClassReceiver implicitClassReceiver) {
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        this.f52957a = classDescriptor;
        this.f52958b = classDescriptor;
    }

    public boolean equals(Object obj) {
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return AbstractC16544l.m18089b(this.f52957a, implicitClassReceiver != null ? implicitClassReceiver.f52957a : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor getClassDescriptor() {
        return this.f52957a;
    }

    public int hashCode() {
        return this.f52957a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public SimpleType getType() {
        SimpleType defaultType = this.f52957a.getDefaultType();
        AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
        return defaultType;
    }
}
