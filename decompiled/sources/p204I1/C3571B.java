package p204I1;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p562X0.C9008c;
import p562X0.InterfaceC9019n;

/* JADX INFO: renamed from: I1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C3571B implements InterfaceC9019n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC16546n f10835Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC16546n f10836Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C3571B(InterfaceC1439n interfaceC1439n, InterfaceC1436k interfaceC1436k) {
        this.f10835Y = (AbstractC16546n) interfaceC1439n;
        this.f10836Z = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: a */
    public final Object mo3664a(C9008c c9008c, Object obj) {
        return this.f10835Y.invoke(c9008c, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: b */
    public final Object mo3665b(Object obj) {
        return this.f10836Z.invoke(obj);
    }
}
