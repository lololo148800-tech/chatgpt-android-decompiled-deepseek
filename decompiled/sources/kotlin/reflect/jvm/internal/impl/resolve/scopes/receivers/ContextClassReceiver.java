package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c */
    public final ClassDescriptor f52952c;

    /* JADX INFO: renamed from: d */
    public final Name f52953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(ClassDescriptor classDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        AbstractC16544l.m18094g(receiverType, "receiverType");
        this.f52952c = classDescriptor;
        this.f52953d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name getCustomLabelName() {
        return this.f52953d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f52952c + " }";
    }
}
