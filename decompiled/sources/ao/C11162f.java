package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C11162f extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11162f f33801c = new C11162f(C11164g.f33804a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC16544l.m18094g(zArr, "<this>");
        return zArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11160e builder = (C11160e) obj;
        AbstractC16544l.m18094g(builder, "builder");
        boolean zMo5481o = interfaceC10428a.mo5481o(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        boolean[] zArr = builder.f33798a;
        int i11 = builder.f33799b;
        builder.f33799b = i11 + 1;
        zArr[i11] = zMo5481o;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC16544l.m18094g(zArr, "<this>");
        C11160e c11160e = new C11160e();
        c11160e.f33798a = zArr;
        c11160e.f33799b = zArr.length;
        c11160e.mo12371b(10);
        return c11160e;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new boolean[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        boolean[] content = (boolean[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5583q(this.f33800b, i11, content[i11]);
        }
    }
}
