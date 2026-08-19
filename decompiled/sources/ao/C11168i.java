package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C11168i extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11168i f33811c = new C11168i(C11170j.f33815a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC16544l.m18094g(bArr, "<this>");
        return bArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11166h builder = (C11166h) obj;
        AbstractC16544l.m18094g(builder, "builder");
        byte bMo5491z = interfaceC10428a.mo5491z(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        byte[] bArr = builder.f33807a;
        int i11 = builder.f33808b;
        builder.f33808b = i11 + 1;
        bArr[i11] = bMo5491z;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC16544l.m18094g(bArr, "<this>");
        C11166h c11166h = new C11166h();
        c11166h.f33807a = bArr;
        c11166h.f33808b = bArr.length;
        c11166h.mo12371b(10);
        return c11166h;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new byte[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        byte[] content = (byte[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5563D(this.f33800b, i11, content[i11]);
        }
    }
}
