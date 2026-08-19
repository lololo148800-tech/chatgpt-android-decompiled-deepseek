package ao;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17320w;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11193u0 extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11193u0 f33848c = new C11193u0(C11195v0.f33851a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        int[] collectionSize = ((C17320w) obj).f55152Y;
        AbstractC16544l.m18094g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11191t0 builder = (C11191t0) obj;
        AbstractC16544l.m18094g(builder, "builder");
        int iMo5477k = interfaceC10428a.mo5474g(this.f33800b, i10).mo5477k();
        builder.mo12371b(builder.mo12372d() + 1);
        int[] iArr = builder.f33844a;
        int i11 = builder.f33845b;
        builder.f33845b = i11 + 1;
        iArr[i11] = iMo5477k;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        int[] toBuilder = ((C17320w) obj).f55152Y;
        AbstractC16544l.m18094g(toBuilder, "$this$toBuilder");
        C11191t0 c11191t0 = new C11191t0();
        c11191t0.f33844a = toBuilder;
        c11191t0.f33845b = toBuilder.length;
        c11191t0.mo12371b(10);
        return c11191t0;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new C17320w(new int[0]);
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        int[] iArr = ((C17320w) obj).f55152Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5581o(this.f33800b, i11).mo5589x(iArr[i11]);
        }
    }
}
