package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c */
    public final CallableDescriptor f52954c;

    /* JADX INFO: renamed from: d */
    public final Name f52955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(CallableDescriptor declarationDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        AbstractC16544l.m18094g(declarationDescriptor, "declarationDescriptor");
        AbstractC16544l.m18094g(receiverType, "receiverType");
        this.f52954c = declarationDescriptor;
        this.f52955d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name getCustomLabelName() {
        return this.f52955d;
    }

    public CallableDescriptor getDeclarationDescriptor() {
        return this.f52954c;
    }

    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
