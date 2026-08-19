package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0159D extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f638Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AndroidComposeView f639Z;

    /* JADX INFO: renamed from: o0 */
    public int f640o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159D(AndroidComposeView androidComposeView, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f639Z = androidComposeView;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f638Y = obj;
        this.f640o0 |= Integer.MIN_VALUE;
        this.f639Z.m11337I(null, this);
        return EnumC19250a.f61036Y;
    }
}
