package ao;

import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C11180o extends AbstractC11161e0 {

    /* JADX INFO: renamed from: c */
    public static final C11180o f33826c = new C11180o(C11182p.f33829a);

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC16544l.m18094g(cArr, "<this>");
        return cArr.length;
    }

    @Override // ao.AbstractC11186r, ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        C11178n builder = (C11178n) obj;
        AbstractC16544l.m18094g(builder, "builder");
        char cMo5485t = interfaceC10428a.mo5485t(this.f33800b, i10);
        builder.mo12371b(builder.mo12372d() + 1);
        char[] cArr = builder.f33822a;
        int i11 = builder.f33823b;
        builder.f33823b = i11 + 1;
        cArr[i11] = cMo5485t;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC16544l.m18094g(cArr, "<this>");
        C11178n c11178n = new C11178n();
        c11178n.f33822a = cArr;
        c11178n.f33823b = cArr.length;
        c11178n.mo12371b(10);
        return c11178n;
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: j */
    public final Object mo12364j() {
        return new char[0];
    }

    @Override // ao.AbstractC11161e0
    /* JADX INFO: renamed from: k */
    public final void mo12365k(InterfaceC10429b encoder, Object obj, int i10) {
        char[] cArr = (char[]) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(cArr, QzvfuIgrngtl.SROr);
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.mo5586t(this.f33800b, i11, cArr[i11]);
        }
    }
}
