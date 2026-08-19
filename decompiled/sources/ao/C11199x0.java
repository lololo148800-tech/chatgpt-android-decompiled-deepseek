package ao;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17322y;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11199x0 extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11199x0 f33864c = new C11199x0(C11201y0.f33867a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        long[] collectionSize = ((C17322y) obj).f55154Y;
        AbstractC16544l.m18094g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11197w0 builder = (C11197w0) obj;
        AbstractC16544l.m18094g(builder, "builder");
        long jMo5480n = interfaceC10428a.mo5474g(this.f33800b, i10).mo5480n();
        builder.mo12371b(builder.mo12372d() + 1);
        long[] jArr = builder.f33858a;
        int i11 = builder.f33859b;
        builder.f33859b = i11 + 1;
        jArr[i11] = jMo5480n;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        long[] toBuilder = ((C17322y) obj).f55154Y;
        AbstractC16544l.m18094g(toBuilder, "$this$toBuilder");
        C11197w0 c11197w0 = new C11197w0();
        c11197w0.f33858a = toBuilder;
        c11197w0.f33859b = toBuilder.length;
        c11197w0.mo12371b(10);
        return c11197w0;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new C17322y(new long[0]);
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        long[] jArr = ((C17322y) obj).f55154Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5581o(this.f33800b, i11).mo5562C(jArr[i11]);
        }
    }
}
