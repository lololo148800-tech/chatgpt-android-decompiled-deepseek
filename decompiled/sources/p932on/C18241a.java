package p932on;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p001A.C0095w0;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: on.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C18241a extends C18247g {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f58128p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18241a(LockBasedStorageManager lockBasedStorageManager, InterfaceC1426a interfaceC1426a, Object obj) {
        super(lockBasedStorageManager, interfaceC1426a);
        this.f58128p0 = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C16629c
    /* JADX INFO: renamed from: c */
    public final C0095w0 mo18396c(boolean z6) {
        return new C0095w0(this.f58128p0, false, 10);
    }
}
