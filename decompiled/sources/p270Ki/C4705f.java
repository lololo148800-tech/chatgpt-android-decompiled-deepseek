package p270Ki;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p387Pl.C6502v;
import p387Pl.EnumC6481b;

/* JADX INFO: renamed from: Ki.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4705f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C4705f f15298Y = new C4705f(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6502v it = (C6502v) obj;
        AbstractC16544l.m18094g(it, "it");
        return Boolean.valueOf(it.f21099c == EnumC6481b.f21034Y);
    }
}
