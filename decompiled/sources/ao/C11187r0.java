package ao;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17318u;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11187r0 extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11187r0 f33838c = new C11187r0(C11189s0.f33841a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        byte[] collectionSize = ((C17318u) obj).f55150Y;
        AbstractC16544l.m18094g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11185q0 builder = (C11185q0) obj;
        AbstractC16544l.m18094g(builder, "builder");
        byte bMo5463A = interfaceC10428a.mo5474g(this.f33800b, i10).mo5463A();
        builder.mo12371b(builder.mo12372d() + 1);
        byte[] bArr = builder.f33835a;
        int i11 = builder.f33836b;
        builder.f33836b = i11 + 1;
        bArr[i11] = bMo5463A;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        byte[] toBuilder = ((C17318u) obj).f55150Y;
        AbstractC16544l.m18094g(toBuilder, "$this$toBuilder");
        C11185q0 c11185q0 = new C11185q0();
        c11185q0.f33835a = toBuilder;
        c11185q0.f33836b = toBuilder.length;
        c11185q0.mo12371b(10);
        return c11185q0;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new C17318u(new byte[0]);
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        byte[] bArr = ((C17318u) obj).f55150Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5581o(this.f33800b, i11).mo5576j(bArr[i11]);
        }
    }
}
