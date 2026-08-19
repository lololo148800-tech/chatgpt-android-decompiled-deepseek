package p870le;

import com.openai.feature.conversations.impl.input.AbstractC12341a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p737f1.C13522n;

/* JADX INFO: renamed from: le.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C16907t extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54301Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f54302Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13522n f54303o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f54304p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f54305q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16907t(InterfaceC10459q interfaceC10459q, C13522n c13522n, int i10, int i11, int i12) {
        super(2);
        this.f54301Y = i12;
        this.f54302Z = interfaceC10459q;
        this.f54303o0 = c13522n;
        this.f54304p0 = i10;
        this.f54305q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f54301Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f54304p0 | 1);
                AbstractC12341a.m14264a(this.f54302Z, this.f54303o0, c6021p, iM6447d0, this.f54305q0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f54304p0 | 1);
                AbstractC12341a.m14266c(this.f54302Z, this.f54303o0, c6021p, iM6447d1, this.f54305q0);
                break;
        }
        return C17296C.f55119a;
    }
}
