package kn;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: kn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16479a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51118Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1426a f51119Z;

    public /* synthetic */ C16479a(int i10, InterfaceC1426a interfaceC1426a) {
        this.f51118Y = i10;
        this.f51119Z = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC1426a interfaceC1426a = this.f51119Z;
        switch (this.f51118Y) {
            case 0:
                MemberScope memberScope = (MemberScope) interfaceC1426a.invoke();
                return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
            default:
                InterfaceC3776x[] interfaceC3776xArr = DeserializedMemberScope.f53092e;
                return AbstractC17680n.m19328G0((Iterable) interfaceC1426a.invoke());
        }
    }
}
