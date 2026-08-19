package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C11190t extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11190t f33843c = new C11190t(C11192u.f33846a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC16544l.m18094g(dArr, "<this>");
        return dArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11188s builder = (C11188s) obj;
        AbstractC16544l.m18094g(builder, "builder");
        double dMo5489x = interfaceC10428a.mo5489x(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        double[] dArr = builder.f33839a;
        int i11 = builder.f33840b;
        builder.f33840b = i11 + 1;
        dArr[i11] = dMo5489x;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC16544l.m18094g(dArr, "<this>");
        C11188s c11188s = new C11188s();
        c11188s.f33839a = dArr;
        c11188s.f33840b = dArr.length;
        c11188s.mo12371b(10);
        return c11188s;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new double[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        double[] content = (double[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5561B(this.f33800b, i11, content[i11]);
        }
    }
}
