package p436Rm;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyClassReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p049Bm.InterfaceC1426a;
import p077Cn.C1756x;

/* JADX INFO: renamed from: Rm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6935a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22215Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractClassDescriptor f22216Z;

    public /* synthetic */ C6935a(AbstractClassDescriptor abstractClassDescriptor, int i10) {
        this.f22215Y = i10;
        this.f22216Z = abstractClassDescriptor;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f22215Y) {
            case 0:
                AbstractClassDescriptor abstractClassDescriptor = this.f22216Z;
                return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new C1756x(this, 1));
            case 1:
                return new InnerClassesScopeWrapper(this.f22216Z.getUnsubstitutedMemberScope());
            default:
                return new LazyClassReceiverParameterDescriptor(this.f22216Z);
        }
    }
}
