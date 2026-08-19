package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kn.C16479a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: a */
    public final NotNullLazyValue f52936a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(InterfaceC1426a getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        AbstractC16544l.m18094g(getScope, "getScope");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    /* JADX INFO: renamed from: a */
    public final MemberScope mo18363a() {
        return (MemberScope) this.f52936a.invoke();
    }

    public /* synthetic */ LazyScopeAdapter(StorageManager storageManager, InterfaceC1426a interfaceC1426a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? LockBasedStorageManager.NO_LOCKS : storageManager, interfaceC1426a);
    }

    public LazyScopeAdapter(StorageManager storageManager, InterfaceC1426a getScope) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(getScope, "getScope");
        this.f52936a = storageManager.createLazyValue(new C16479a(0, getScope));
    }
}
