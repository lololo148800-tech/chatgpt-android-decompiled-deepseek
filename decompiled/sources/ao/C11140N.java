package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C11140N extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11140N f33772c = new C11140N(C11141O.f33773a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC16544l.m18094g(jArr, "<this>");
        return jArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11139M builder = (C11139M) obj;
        AbstractC16544l.m18094g(builder, "builder");
        long jMo5476i = interfaceC10428a.mo5476i(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        long[] jArr = builder.f33770a;
        int i11 = builder.f33771b;
        builder.f33771b = i11 + 1;
        jArr[i11] = jMo5476i;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC16544l.m18094g(jArr, "<this>");
        C11139M c11139m = new C11139M();
        c11139m.f33770a = jArr;
        c11139m.f33771b = jArr.length;
        c11139m.mo12371b(10);
        return c11139m;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new long[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        long[] content = (long[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5564E(this.f33800b, i11, content[i11]);
        }
    }
}
