package p1149zc;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: zc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C21852n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69319Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21855q f69320Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21852n(C21855q c21855q, int i10) {
        super(2);
        this.f69319Y = i10;
        this.f69320Z = c21855q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        C17296C c17296c = C17296C.f55119a;
        C21855q c21855q = this.f69320Z;
        switch (this.f69319Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String strM8676d = c21855q.f69324b;
                    c6021p.m6524S(164041268);
                    if (strM8676d == null) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.auth_mismatch_dialog_workspace_generic_name, c6021p);
                    }
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.auth_mismatch_dialog_title, new Object[]{strM8676d}, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                return c17296c;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    int iOrdinal = c21855q.f69323a.ordinal();
                    if (iOrdinal == 0) {
                        i10 = R.string.auth_mismatch_dialog_sso_unexpected_description;
                    } else if (iOrdinal == 1) {
                        i10 = R.string.auth_mismatch_dialog_sso_mismatch_description;
                    } else {
                        if (iOrdinal != 2) {
                            throw new C0644w();
                        }
                        i10 = R.string.auth_mismatch_dialog_requires_sso_description;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                return c17296c;
        }
    }
}
