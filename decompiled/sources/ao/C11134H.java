package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C11134H extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11134H f33762c = new C11134H(C11135I.f33763a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC16544l.m18094g(iArr, "<this>");
        return iArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11133G builder = (C11133G) obj;
        AbstractC16544l.m18094g(builder, "builder");
        int iMo5478l = interfaceC10428a.mo5478l(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        int[] iArr = builder.f33760a;
        int i11 = builder.f33761b;
        builder.f33761b = i11 + 1;
        iArr[i11] = iMo5478l;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC16544l.m18094g(iArr, "<this>");
        C11133G c11133g = new C11133G();
        c11133g.f33760a = iArr;
        c11133g.f33761b = iArr.length;
        c11133g.mo12371b(10);
        return c11133g;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new int[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        int[] content = (int[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5579m(i11, content[i11], this.f33800b);
        }
    }
}
