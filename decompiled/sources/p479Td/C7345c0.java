package p479Td;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9280e4;
import p606Yn.C10100a;

/* JADX INFO: renamed from: Td.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7345c0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7345c0 f23256Z = new C7345c0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7345c0 f23257o0 = new C7345c0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7345c0 f23258p0 = new C7345c0(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C7345c0 f23259q0 = new C7345c0(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23260Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7345c0(int i10, int i11) {
        super(i10);
        this.f23260Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f23260Y) {
            case 0:
                AbstractC7343b0 it = (AbstractC7343b0) obj;
                AbstractC16544l.m18094g(it, "it");
                return AbstractC9280e4.m9852d(it);
            case 1:
                AbstractC7343b0 it2 = (AbstractC7343b0) obj;
                AbstractC16544l.m18094g(it2, "it");
                return AbstractC9280e4.m9853e(it2);
            case 2:
                C10100a buildClassSerialDescriptor = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                return C17296C.f55119a;
            default:
                C10100a buildClassSerialDescriptor2 = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor2, "$this$buildClassSerialDescriptor");
                return C17296C.f55119a;
        }
    }
}
