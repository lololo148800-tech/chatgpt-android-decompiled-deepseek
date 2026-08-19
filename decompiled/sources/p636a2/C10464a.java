package p636a2;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p716e2.C13265b;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10464a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C10464a f30981Z = new C10464a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10464a f30982o0 = new C10464a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10464a f30983p0 = new C10464a(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10464a f30984q0 = new C10464a(2, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30985Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10464a(int i10, int i11) {
        super(i10);
        this.f30985Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object other) {
        switch (this.f30985Y) {
            case 0:
                C13265b arrayOf = (C13265b) obj;
                AbstractC16544l.m18094g(arrayOf, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                arrayOf.f41884B = null;
                arrayOf.f41887E = null;
                arrayOf.f41897O = 9;
                arrayOf.f41883A = other;
                return arrayOf;
            case 1:
                C13265b arrayOf2 = (C13265b) obj;
                AbstractC16544l.m18094g(arrayOf2, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                arrayOf2.f41883A = null;
                arrayOf2.f41887E = null;
                arrayOf2.f41897O = 10;
                arrayOf2.f41884B = other;
                return arrayOf2;
            case 2:
                C13265b arrayOf3 = (C13265b) obj;
                AbstractC16544l.m18094g(arrayOf3, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                arrayOf3.f41886D = null;
                arrayOf3.f41887E = null;
                arrayOf3.f41897O = 11;
                arrayOf3.f41885C = other;
                return arrayOf3;
            default:
                C13265b arrayOf4 = (C13265b) obj;
                AbstractC16544l.m18094g(arrayOf4, "$this$arrayOf");
                AbstractC16544l.m18094g(other, "other");
                arrayOf4.f41885C = null;
                arrayOf4.f41887E = null;
                arrayOf4.f41897O = 12;
                arrayOf4.f41886D = other;
                return arrayOf4;
        }
    }
}
