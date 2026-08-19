package kotlin.reflect.jvm.internal.impl.utils;

import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16641a extends DFS.AbstractNodeHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1436k f53315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean[] f53316b;

    public C16641a(InterfaceC1436k interfaceC1436k, boolean[] zArr) {
        this.f53315a = interfaceC1436k;
        this.f53316b = zArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final boolean beforeChildren(Object obj) {
        boolean zBooleanValue = ((Boolean) this.f53315a.invoke(obj)).booleanValue();
        boolean[] zArr = this.f53316b;
        if (zBooleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final Object result() {
        return Boolean.valueOf(this.f53316b[0]);
    }
}
