package p145Ff;

import com.openai.feature.messages.impl.listitem.content.spreadsheet.MessageSpreadsheetViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8167p5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ff.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2726d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8369Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f8370Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f8371o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f8372p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ MessageSpreadsheetViewModel f8373q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f8374r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2726d(String str, String str2, InterfaceC10459q interfaceC10459q, MessageSpreadsheetViewModel messageSpreadsheetViewModel, int i10, int i11) {
        super(2);
        this.f8369Y = i11;
        this.f8370Z = str;
        this.f8371o0 = str2;
        this.f8372p0 = interfaceC10459q;
        this.f8373q0 = messageSpreadsheetViewModel;
        this.f8374r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8369Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8167p5.m8742b(this.f8370Z, this.f8371o0, this.f8372p0, this.f8373q0, (C6021p) obj, C5997d.m6447d0(this.f8374r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8167p5.m8742b(this.f8370Z, this.f8371o0, this.f8372p0, this.f8373q0, (C6021p) obj, C5997d.m6447d0(this.f8374r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
