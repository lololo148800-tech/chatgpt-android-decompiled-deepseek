package p406Qg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8231x5;

/* JADX INFO: renamed from: Qg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6714j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f21582Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6714j(long j10) {
        super(2);
        this.f21582Y = j10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3878A1.m4597b(AbstractC8231x5.m8868d(), AbstractC8142m4.m8676d(R.string.settings_memory_learn_more, c6021p), null, this.f21582Y, c6021p, 0, 4);
        }
        return C17296C.f55119a;
    }
}
