package p148Fi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8681n4;
import p556Wk.C8907V;
import p857kl.C16447N;

/* JADX INFO: renamed from: Fi.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2846p0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C2846p0 f8596Z = new C2846p0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2846p0 f8597o0 = new C2846p0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2846p0 f8598p0 = new C2846p0(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8599Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2846p0(int i10, int i11) {
        super(i10);
        this.f8599Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f8599Y) {
            case 0:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{"status"});
                return c17296c;
            case 1:
                C8907V timeout = (C8907V) obj;
                AbstractC16544l.m18094g(timeout, "$this$timeout");
                C8907V.m9563a(5000L);
                timeout.f27258a = 5000L;
                return c17296c;
            default:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        }
    }
}
