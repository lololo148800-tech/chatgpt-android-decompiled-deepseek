package p484Ti;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Ti.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7477f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7477f f23748Z = new C7477f(1, 0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23749Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7477f(int i10, int i11) {
        super(i10);
        this.f23749Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f23749Y) {
            case 0:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 1:
                return c17296c;
            case 2:
                return c17296c;
            case 3:
                return c17296c;
            case 4:
                return c17296c;
            case 5:
                return c17296c;
            case 6:
                return c17296c;
            default:
                return c17296c;
        }
    }
}
