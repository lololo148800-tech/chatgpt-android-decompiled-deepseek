package androidx.compose.p650ui.graphics;

import p049Bm.InterfaceC1436k;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14325C;
import p774h1.AbstractC14334L;
import p774h1.C14343V;
import p774h1.InterfaceC14339Q;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10864a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11305a(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new BlockGraphicsLayerElement(interfaceC1436k));
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10459q m11306b(InterfaceC10459q interfaceC10459q, float f10, float f11, float f12, float f13, float f14, float f15, float f16, InterfaceC14339Q interfaceC14339Q, boolean z6, int i10, int i11) {
        float f17 = (i11 & 1) != 0 ? 1.0f : f10;
        float f18 = (i11 & 2) != 0 ? 1.0f : f11;
        float f19 = (i11 & 4) != 0 ? 1.0f : f12;
        float f20 = (i11 & 32) != 0 ? 0.0f : f13;
        float f21 = (i11 & 64) != 0 ? 0.0f : f14;
        float f22 = (i11 & 128) != 0 ? 0.0f : f15;
        float f23 = (i11 & 256) != 0 ? 0.0f : f16;
        long j10 = C14343V.f45023b;
        InterfaceC14339Q interfaceC14339Q2 = (i11 & 2048) != 0 ? AbstractC14334L.f44973a : interfaceC14339Q;
        boolean z10 = (i11 & 4096) != 0 ? false : z6;
        long j11 = AbstractC14325C.f44961a;
        return interfaceC10459q.mo428M(new GraphicsLayerElement(f17, f18, f19, 0.0f, 0.0f, f20, f21, f22, f23, 8.0f, j10, interfaceC14339Q2, z10, j11, j11, (i11 & 65536) != 0 ? 0 : i10));
    }
}
