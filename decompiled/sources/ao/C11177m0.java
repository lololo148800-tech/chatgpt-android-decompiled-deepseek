package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.m0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11177m0 extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11177m0 f33821c = new C11177m0(C11179n0.f33824a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC16544l.m18094g(sArr, "<this>");
        return sArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11175l0 builder = (C11175l0) obj;
        AbstractC16544l.m18094g(builder, "builder");
        short sMo5488w = interfaceC10428a.mo5488w(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        short[] sArr = builder.f33818a;
        int i11 = builder.f33819b;
        builder.f33819b = i11 + 1;
        sArr[i11] = sMo5488w;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC16544l.m18094g(sArr, "<this>");
        C11175l0 c11175l0 = new C11175l0();
        c11175l0.f33818a = sArr;
        c11175l0.f33819b = sArr.length;
        c11175l0.mo12371b(10);
        return c11175l0;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new short[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        short[] content = (short[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5591z(this.f33800b, i11, content[i11]);
        }
    }
}
