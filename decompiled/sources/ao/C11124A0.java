package ao;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17295B;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.A0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11124A0 extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11124A0 f33743c = new C11124A0(C11126B0.f33746a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        short[] collectionSize = ((C17295B) obj).f55118Y;
        AbstractC16544l.m18094g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11203z0 builder = (C11203z0) obj;
        AbstractC16544l.m18094g(builder, "builder");
        short sMo5464B = interfaceC10428a.mo5474g(this.f33800b, i10).mo5464B();
        builder.mo12371b(builder.mo12372d() + 1);
        short[] sArr = builder.f33871a;
        int i11 = builder.f33872b;
        builder.f33872b = i11 + 1;
        sArr[i11] = sMo5464B;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        short[] toBuilder = ((C17295B) obj).f55118Y;
        AbstractC16544l.m18094g(toBuilder, "$this$toBuilder");
        C11203z0 c11203z0 = new C11203z0();
        c11203z0.f33871a = toBuilder;
        c11203z0.f33872b = toBuilder.length;
        c11203z0.mo12371b(10);
        return c11203z0;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new C17295B(new short[0]);
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        short[] sArr = ((C17295B) obj).f55118Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5581o(this.f33800b, i11).mo5574h(sArr[i11]);
        }
    }
}
