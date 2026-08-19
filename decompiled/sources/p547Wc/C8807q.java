package p547Wc;

import af.AbstractC10569Z;
import androidx.compose.material3.AbstractC10859d;
import bf.C11349D;
import bf.EnumC11383k;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: Wc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8807q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26955Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f26956Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f26957o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f26958p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8807q(boolean z6, Object obj, boolean z10, int i10) {
        super(2);
        this.f26955Y = i10;
        this.f26956Z = z6;
        this.f26958p0 = obj;
        this.f26957o0 = z10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String strM8676d;
        String strM8677e;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f26958p0;
        switch (this.f26955Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC10859d.m11284a(this.f26956Z, (InterfaceC1436k) obj3, null, null, this.f26957o0, null, null, c6021p, 0, 108);
                }
                return c17296c;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(289883556);
                    C11349D gizmo = (C11349D) obj3;
                    if (this.f26956Z) {
                        String str = gizmo.f34320c;
                        if (str == null) {
                            str = "";
                        }
                        AbstractC4124r4.m4768b(str, null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12235q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 2, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p2, 0, 27696, 38906);
                    }
                    c6021p2.m6553p(false);
                    boolean z6 = this.f26957o0;
                    if (!z6) {
                        c6021p2.m6524S(289897864);
                        AbstractC16544l.m18094g(gizmo, "gizmo");
                        c6021p2.m6524S(287177663);
                        String strM8676d2 = gizmo.f34321d;
                        if (strM8676d2 == null) {
                            strM8676d2 = AbstractC8142m4.m8676d(R.string.gizmo_anonymous_author_name, c6021p2);
                        }
                        c6021p2.m6553p(false);
                        strM8676d = AbstractC8142m4.m8677e(R.string.gizmo_author_byline, new Object[]{strM8676d2}, c6021p2);
                        c6021p2.m6553p(false);
                    } else {
                        if (!z6) {
                            c6021p2.m6524S(289253508);
                            c6021p2.m6553p(false);
                            throw new C0644w();
                        }
                        c6021p2.m6524S(289902826);
                        EnumC11383k enumC11383k = gizmo.f34343z;
                        int i10 = enumC11383k == null ? -1 : AbstractC10569Z.f31375a[enumC11383k.ordinal()];
                        int i11 = R.string.gizmo_share_level_private;
                        if (i10 != -1 && i10 != 1) {
                            if (i10 == 2) {
                                i11 = R.string.gizmo_share_level_workspace;
                            } else if (i10 == 3) {
                                i11 = R.string.gizmo_share_level_public;
                            } else {
                                if (i10 != 4) {
                                    throw new C0644w();
                                }
                                i11 = R.string.gizmo_share_level_link;
                            }
                        }
                        strM8676d = AbstractC8142m4.m8676d(i11, c6021p2);
                        c6021p2.m6553p(false);
                    }
                    String str2 = gizmo.f34336s;
                    c6021p2.m6524S(289905642);
                    if (str2 == null) {
                        strM8677e = strM8676d;
                    } else {
                        String str3 = gizmo.f34336s;
                        strM8677e = AbstractC8142m4.m8677e(R.string.gizmo_list_item_details_separator, new Object[]{strM8676d, str3 != null ? str3 : ""}, c6021p2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4124r4.m4768b(strM8677e, null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p2, 0, 3120, 55290);
                }
                return c17296c;
        }
    }
}
